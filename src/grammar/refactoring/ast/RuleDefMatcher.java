/***************************************************************************
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 * + Department of Computer Science
 * + Software Engineering Group
 * and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

package grammar.refactoring.ast;

import grammar.refactoring.CommonPatterns;
import grammar.refactoring.ast.nodes.Branch;
import grammar.refactoring.ast.nodes.RuleDef;
import grammar.refactoring.ast.nodes.StandardRule;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.FileSystem;

public class RuleDefMatcher {

    // TODO optimize matching by replacing capturing groups by non-capturing
    // groups
    private static final String     BRANCH;             // =
                                                        // "([^\\|;]+)+[\\|;]";
    private static final String     RULE = "(" + CommonPatterns.ANY_TOKEN
                                                 + ")|("
                                                 + CommonPatterns.LINE_COMMENT
                                                 + ")";

    static {
        StringBuilder sb = new StringBuilder();

        sb.append("(");

        sb.append("(");
        sb.append("(").append(CommonPatterns.ANY_LITERAL).append(")");
        sb.append("|");
        sb.append("(").append(CommonPatterns.ANY_RULE).append(")");
        sb.append("|");
        sb.append("(").append(CommonPatterns.LINE_COMMENT).append(")");
        sb.append(")");

        sb.append(CommonPatterns.WHITESPACES);
        sb.append(")*");
        sb.append("[\\|;]");
        BRANCH = sb.toString();
        System.out.println("BRANCH: " + BRANCH);
    }

    private final Pattern           ruleDefPattern;
    private final Pattern           branchPattern;
    private final Pattern           rulePattern;
    private final RuleDefRefactorer refactorer;

    public static void main(String[] args) throws IOException {
        String fullPathFilename;
        // fullPathFilename = "grammars/CSharp4Lexer.g.bak";
        // fullPathFilename = "grammars/test.txt";
        fullPathFilename = "grammars/CSharp4Parser.g.bak";
        String contents = FileSystem.readTextFile(fullPathFilename);

        // contents = "left :   \n   | A  B \n | left C  \n;";

        RuleDefMatcher ruleDefMatcher = new RuleDefMatcher();
        StringBuffer sb = ruleDefMatcher.match(contents);

        // System.out.println("replacement(all):\n" + sb.toString());

        String newFilename = fullPathFilename.substring(0,
                fullPathFilename.length() - 6)
                + ".g";
        FileSystem.writeTextFile(sb.toString(), newFilename);
    }

    // -----------------------------------------------------------

    public RuleDefMatcher() {
        String regex;
        regex = new CommonPatterns().buildRulePattern();
        // regex = "(fragment)?\\s+" + "(" + CommonPatterns.ANY_WORD + ")" +
        // CommonPatterns.WHITESPACES
        // + "(:)\\s*(\\|)?" + "[^;]*(;)";
        ruleDefPattern = Pattern.compile(regex);
        branchPattern = Pattern.compile(BRANCH);
        rulePattern = Pattern.compile(RULE);

        refactorer = new LeftRecursionRemover(new RuleDefNullComponent());
    }

    public StringBuffer match(CharSequence input) {
        System.out.println("Pattern: " + ruleDefPattern.pattern());
        Matcher matcher = ruleDefPattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            printGroups(matcher);

            String fragment = matcher.group(1);
            // System.out.println("fragment: " + fragment);

            String ruleDefName = matcher.group(2);
            // System.out.println("rule: " + ruleDefName);

            // String doublePoint = matcher.group(2);
            int start;
            start = matcher.end(4);
            // if there is no initial empty rule from ':' to '|' (e.g.
            // expression: first_rule |
            // second_rule)
            if (start == -1) {
                start = matcher.end(3);
            }
            int end = matcher.end(16); // 32
            // System.out.println("start=" + start + ",end=" + end);
            CharSequence branches = input.subSequence(start, end);

            RuleDef ruleDef = new RuleDef(ruleDefName, fragment != null);
            matchBranches(branches, ruleDef);

            // System.out.print("Refactoring...");
            refactorer.refactor(ruleDef);
            // System.out.println("done.");

            // System.out.println("replacement:\n" + ruleDef.toPrettyString());

            // System.out.print("appendReplacement...");
            matcher.appendReplacement(sb, ruleDef.toPrettyString());
            // System.out.println("done.");
        }
        matcher.appendTail(sb);

        return sb;
    }

    private void matchBranches(CharSequence branches, RuleDef ruleDef) {
        Matcher matcher = branchPattern.matcher(branches);

        while (matcher.find()) {
            String group = matcher.group();
            System.out.println("MATCH2: " + group);

            Branch branch = new Branch();
            matchRules(group, branch);
            ruleDef.getBranches().add(branch);
        }
    }

    private void matchRules(CharSequence group, Branch branch) {
        Matcher matcher2 = rulePattern.matcher(group);

        while (matcher2.find()) {
            String ruleText = matcher2.group();
            // skip line comments
            // if (ruleText.startsWith("//")) continue;
            System.out.println("MATCH3: " + ruleText);

            // removes backslashes if not quoted that way
            ruleText = Matcher.quoteReplacement(ruleText);

            StandardRule standardRule = new StandardRule(ruleText);
            branch.getRules().add(standardRule);
        }
    }

    private void printGroups(Matcher matcher) {
        for (int i = 0; i < matcher.groupCount() + 1; i++) {
            System.out.println("group " + i + ": " + matcher.group(i));
        }
    }
}
