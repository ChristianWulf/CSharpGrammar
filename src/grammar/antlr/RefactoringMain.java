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

package grammar.antlr;

import grammar.refactoring.LeftRecursionRemover;
import grammar.refactoring.OptionalReducer;
import java.io.IOException;
import java.io.Writer;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 * Build either ASTs and, optionally, parse trees. To also build
 * parse trees, run antlr with -debug option on ANTLRv3.g
 * and then uncomment the middle code section and comment out the
 * first "build AST" only section.
 */
public class RefactoringMain {
    public static void main(String args[]) throws Exception {
        CharStream input = null;
        String inputName = "<stdin>";
        if (args.length == 1) {
            input = new ANTLRFileStream(args[0]);
            inputName = args[0];
        }
        else {
            input = new ANTLRInputStream(System.in);
        }

        // TokenStreamSelector selector = new TokenStreamSelector();
        // selector.addInputStream(arg0, arg1);
        // selector.addInputStream(arg0, arg1);
        //
        // TokenStreamBasicFilter filter = new TokenStreamBasicFilter(selector);
        // filter.discard(arg0);

        // BUILD AST
        ANTLRv3Lexer lex = new ANTLRv3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ANTLRv3Parser g = new ANTLRv3Parser(tokens);
        ANTLRv3Parser.grammarDef_return r = g.grammarDef();
        CommonTree t = (CommonTree) r.getTree();
        // System.out.println(t.toStringTree());

        LeftRecursionRemover leftRecursionRemover = new LeftRecursionRemover();
        leftRecursionRemover.refactor(t);

        OptionalReducer optionalReducer = new OptionalReducer();
        optionalReducer.refactor(t);

        /*
         * // BUILD AST + PARSE TREES (needs ANTLR -debug option)
         * ANTLRv3Lexer lex = new ANTLRv3Lexer(input);
         * CommonTokenStream tokens = new CommonTokenStream(lex);
         * ParseTreeBuilder builder = new ParseTreeBuilder(inputName);
         * ANTLRv3Parser g = new ANTLRv3Parser(tokens, builder);
         * ANTLRv3Parser.grammarDef_return r = g.grammarDef();
         * CommonTree t = (CommonTree)r.getTree(); // not used here
         * System.out.println("parse tree: "+builder.getTree().toStringTree());
         * System.out.print("input:\n"+builder.getTree().toInputString());
         */

        // WALK AST
        // CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        // ANTLRv3Tree walker = new ANTLRv3Tree(nodes);
        // walker.grammarDef();

        // BufferedWriter writer = new BufferedWriter(new
        // FileWriter("grammars/lexer.g"));
        // try {
        // save(t, writer);
        // } finally {
        // writer.close();
        // }
    }

    private static void save(Tree t, Writer writer) throws IOException {
        switch (t.getType()) {
            case ANTLRv3Lexer.RULE:
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                writer.write(";\n\n");
                break;
            case ANTLRv3Lexer.ALT:
                if (t.getChild(0).getType() != ANTLRv3Lexer.EPSILON) {
                    writer.write("\t | ");
                    for (int i = 0; i < t.getChildCount(); i++) {
                        save(t.getChild(i), writer);
                    }
                    writer.write("\n");
                }
                break;
            case ANTLRv3Lexer.OPTIONAL:
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                writer.write("?");
                break;
            case ANTLRv3Lexer.CLOSURE:
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                writer.write("*");
                break;
            case ANTLRv3Lexer.POSITIVE_CLOSURE:
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                writer.write("+");
                break;
            case ANTLRv3Lexer.BLOCK:
                if (t.getParent().getType() == ANTLRv3Lexer.RULE) {
                    writer.write(":\n");
                }
                else {
                    writer.write("(");
                }

                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }

                if (t.getParent().getType() == ANTLRv3Lexer.RULE) {
                    writer.write("\n;\n\n");
                }
                else {
                    writer.write(")");
                }
                break;
            case ANTLRv3Lexer.T__76:
                save(t.getChild(0), writer);
                writer.write(" = ");
                save(t.getChild(1), writer);
                writer.write(";\n");
                break;
            case ANTLRv3Lexer.OPTIONS:
                writer.write(t.getText());
                writer.write(" ");
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                writer.write("}\n\n");
                break;
            case ANTLRv3Lexer.EOA:
            case ANTLRv3Lexer.EOB:
            case ANTLRv3Lexer.EOF:
            case ANTLRv3Lexer.EOR:
            case ANTLRv3Lexer.EPSILON:
                break;
            default:
                writer.write(t.getText());
                writer.write(" ");
                for (int i = 0; i < t.getChildCount(); i++) {
                    save(t.getChild(i), writer);
                }
                break;
        }

    }

    private static String print(Tree alt) {
        StringBuilder builder = new StringBuilder(alt.getChildCount() * 20);

        for (int i = 0; i < alt.getChildCount(); i++) {
            builder.append("  ");
            String cs = print(alt.getChild(i));

            // builder.append("(");
            // builder.append(cs);
            // builder.append(")");

            builder.append(alt.getChild(i).getText());
        }

        return builder.toString();
    }
}
