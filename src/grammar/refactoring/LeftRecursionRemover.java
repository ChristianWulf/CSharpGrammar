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

import grammar.antlr.ANTLRv3Parser;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import util.FileSystem;
import util.Matching;

public class LeftRecursionRemover extends AbstractAlternativeRefactor {

    private static final String REGEX       = "(~(;)*;\\s*)(~(:)*):(~(|)*)\\s*|\\s*(\\2\\s*\\3)\\s*;";
    private static final String REPLACEMENT = "$1$2:$3+;";
    private final Pattern       pattern;

    // Pp_or_expression:
    // | Pp_and_expression
    // | Pp_or_expression WHITESPACE? '||' WHITESPACE? Pp_and_expression;

    public LeftRecursionRemover() {
        pattern = Pattern.compile(REGEX);
    }

    private void execute() throws IOException {
        String fullPathFilename = "grammars/CSharp4Parser.g";
        String contents = FileSystem.readTextFile(fullPathFilename);
        String processedContents = Matching.matchAll(contents, pattern,
                REPLACEMENT);
        FileSystem.writeTextFile(processedContents, fullPathFilename);
    }

    public static void main(String[] args) throws IOException {
        LeftRecursionRemover remover = new LeftRecursionRemover();
        remover.execute();
    }

    // situation: left-recursion without any rewrite rules
    // rule left
    // : A
    // | left B
    // =>
    // rule left
    // : A B*
    @Override
    public void analyzeAlternatives(List<Tree> alts) {
        if (alts.size() != 2)
            return;

        for (int i = 0; i < alts.size(); i++) {
            // System.out.println("alternative '" + i + "' found.");
        }

        for (int i = 0; i < alts.size() - 1; i++) {
            for (int j = i + 1; j < alts.size(); j++) {
                processPair(alts.get(i), alts.get(j));
                return;
            }
        }
    }

    private void processPair(Tree alt1, Tree alt2) {
        if (alt1.getChildCount() > 0 && alt2.getChildCount() > 0) {
            Tree first1 = alt1.getChild(0);
            Tree first2 = alt2.getChild(0);

            // System.out.println("first1: " + print(alt1));
            // System.out.println("first2: " + print(alt2));
            Tree parent = alt1.getParent();
            for (int i = 0; i < parent.getChildCount(); i++) {
                // System.out.println("alt" + i + ": " +
                // print(parent.getChild(i)));
            }
            // if (element0.getType() == ANTLRv3Parser.RULE_REF) {
            // System.out.println("rule ref '" + element0.getText() +
            // "' found.");
            // }
            if (!first1.equals(first2)) {
                // System.out.println("first1 != first2");
                if (first1.getText().equals(ruleName)) {
                    // System.out.println("first1 == ruleName");
                    moveTo(alt1, alt2);
                }
                else if (first2.getText().equals(ruleName)) {
                    // System.out.println("first2 == ruleName");
                    moveTo(alt2, alt1);
                }
            }
        }
    }

    private void moveTo(Tree source, Tree target) {
        // save EOA token
        final Object eoa = target.deleteChild(target.getChildCount() - 1);

        // '*'=68
        Tree star = new CommonTree(new CommonToken(ANTLRv3Parser.T__68, "*"));
        // add below star (kleene closure)
        for (int i = 1; i < source.getChildCount() - 1; i++) {
            star.addChild(source.getChild(i));
        }

        target.addChild(star);

        target.addChild((Tree) eoa);

        Tree parent = source.getParent();
        parent.deleteChild(source.getChildIndex());

        // for (int i = 0; i < parent.getChildCount(); i++) {
        // System.out.println("alt" + i + ": " + print(parent.getChild(i)));
        // }

        System.out.println("moved rule '"
                + parent.getParent().getChild(0).getText() + "'");
    }

}
