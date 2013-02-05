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

package grammar.refactoring;

public class CommonPatterns {

    private static final String PIPE_OPERATOR    = "\\|";
    public static final String  WHITESPACES      = "\\s*";
    public static final String  WHITESPACES_PLUS = "\\s+";
    public static final String  ANY_WORD         = "\\b\\w+\\b";
    /**
     * any rule without line comment, whitespace, pipe operator, and semicolon
     */
    private static final String FRAGMENT         = "fragment";
    public static final String  ANY_RULE         = "[^//\\s\\|';:]+";
    /** anything between ' with optional quantifiers */
    public static final String  ANY_LITERAL      = "~?'[^']*[^\\\\]'[+\\!\\?\\*]*";
    /** order is important: first literal, then rule */
    public static final String  ANY_TOKEN        = "((" + ANY_LITERAL + ")|("
                                                         + ANY_RULE + "))";
    public static final String  LINE_COMMENT     = "//.*";
    private static String       BRANCH;
    private static String       FULL_LINE_COMMENT;

    public String buildRulePattern() {
        String branch = getBranchPatternString();
        String lineComment = getLineCommentPatternString();

        String branch2 = getBranch2();

        StringBuilder builder = new StringBuilder();

        builder.append(optional(FRAGMENT, WHITESPACES_PLUS))
                .append(group(ANY_WORD)).append(WHITESPACES).append("(:)");

        // first branch
        builder.append(optional(WHITESPACES, PIPE_OPERATOR));
        // builder.append(branch).append(lineComment);
        builder.append(branch2);

        // rest branches
        // builder.append(zeroOrMore(WHITESPACES, PIPE_OPERATOR, branch,
        // lineComment));
        builder.append(zeroOrMore(WHITESPACES, PIPE_OPERATOR, branch2));

        builder.append(WHITESPACES);
        builder.append("(;)");

        return builder.toString();
    }

    private String getBranch2() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(CommonPatterns.WHITESPACES);

        sb.append("(");
        sb.append("(").append(CommonPatterns.ANY_LITERAL).append(")");
        sb.append("|");
        sb.append("(").append(CommonPatterns.ANY_RULE).append(")");
        sb.append("|");
        sb.append("(").append(CommonPatterns.LINE_COMMENT).append(")");
        sb.append(")");

        sb.append(CommonPatterns.WHITESPACES);
        sb.append(")*");
        // sb.append("[\\|;]");
        return sb.toString();
    }

    public static String getBranchPatternString() {
        if (BRANCH == null) { // lazy init
            StringBuilder builder = new StringBuilder();
            builder.append(WHITESPACES).append(ANY_TOKEN)
                    .append(zeroOrMore(WHITESPACES_PLUS, ANY_TOKEN));
            BRANCH = builder.toString();
        }
        return BRANCH;
    }

    public static String getLineCommentPatternString() {
        if (FULL_LINE_COMMENT == null) { // lazy init
            String restBranch = optional(WHITESPACES,
                    zeroOrMore(WHITESPACES, ANY_TOKEN));

            StringBuilder builder = new StringBuilder();
            builder.append(optional(WHITESPACES, LINE_COMMENT, restBranch));
            FULL_LINE_COMMENT = builder.toString();
        }
        return FULL_LINE_COMMENT;
    }

    public static String optional(String... patterns) {
        return _group("?", patterns);
    }

    private String group(String... patterns) {
        return _group("", patterns);
    }

    public static String oneOrMore(String... patterns) {
        return _group("+", patterns);
    }

    public static String zeroOrMore(String... patterns) {
        return _group("*", patterns);
    }

    static String word(String word) {
        return "\\b" + word + "\\b";
    }

    static String _group(String multiplicity, String... patterns) {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        for (String p : patterns) {
            builder.append(p);
        }
        builder.append(')');
        builder.append(multiplicity);
        return builder.toString();
    }

}
