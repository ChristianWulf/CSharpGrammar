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

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.FileSystem;

public class Literal2TokenReplacer {

    private static final String LITERAL_PATTERN = "(\\s*)'([^\\s]+)'(\\s*)";
    private static final String TOKENS_PATTERN  = "(tokens \\{.*)(\\}//tokens end)";
    private Map<String, String> map             = new HashMap<String, String>();
    private Set<String>         literals        = new HashSet<String>();

    // tokens that are only defined in the parser
    // tokens {REPLACE_ME}

    public static void main(String[] args) throws IOException {
        String fullPathFilename = "grammars/CSharp4.g";
        String contents = FileSystem.readTextFile(fullPathFilename);

        Literal2TokenReplacer replacer = new Literal2TokenReplacer();
        StringBuffer sb = replacer.replace(contents);

        sb = replacer.renewTokensKeyword(sb.toString());

        String newFilename = "grammars/CSharp4.g";
        FileSystem.writeTextFile(sb.toString(), newFilename);
    }

    private StringBuffer renewTokensKeyword(String contents) {
        StringBuilder sb = new StringBuilder();

        for (String literal : literals) {
            String token = map.get(literal);
            sb.append("\t");
            sb.append(token == null ? literal.toUpperCase() : token);
            sb.append(" = ");
            sb.append("'");
            sb.append(literal);
            sb.append("';");
            sb.append("\n");
        }

        StringBuffer sbuf = new StringBuffer();

        Pattern pattern = Pattern.compile(TOKENS_PATTERN, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(contents);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            String replacement = matcher.group(1) + sb.toString()
                    + matcher.group(2);
            matcher.appendReplacement(sbuf, replacement);
        }
        matcher.appendTail(sbuf);

        return sbuf;
    }

    public StringBuffer replace(String contents) {
        StringBuffer sb = new StringBuffer();

        Pattern pattern = Pattern.compile(LITERAL_PATTERN);
        Matcher matcher = pattern.matcher(contents);

        int startIndex = contents.indexOf("@header");
        System.out.println(startIndex);

        if (matcher.find(startIndex))
            do {
                String literal = matcher.group(2);
                // System.out.println("Recognize " + literal);

                String replacement = getReplacement(literal);
                replacement = matcher.group(1) + replacement + matcher.group(3);
                matcher.appendReplacement(sb, replacement);

                System.out.println("Replaced " + matcher.group() + " with "
                        + replacement);
            } while (matcher.find());
        matcher.appendTail(sb);

        return sb;
    }

    private String getReplacement(String literal) {
        String token;
        token = map.get(literal);
        if (token == null) {
            token = literal.toUpperCase();
            literals.add(literal);
        }
        return token;
    }

    public Literal2TokenReplacer() {
        map.put("?", "INTERR");
        map.put(";", "SEMICOLON");
        map.put(":", "COLON");
        map.put("[", "OPEN_BRACKET");
        map.put("]", "CLOSE_BRACKET");
        map.put("(", "OPEN_PARENS");
        map.put(")", "CLOSE_PARENS");
        map.put("{", "OPEN_BRACE");
        map.put("}", "CLOSE_BRACE");
        map.put(".", "DOT");
        map.put(",", "COMMA");
        map.put("+", "PLUS");
        map.put("-", "MINUS");
        map.put("*", "STAR");
        map.put("/", "DIV");
        map.put("%", "PERCENT");
        map.put("&", "AMP");
        map.put("|", "BITWISE_OR");
        map.put("^", "CARET");
        map.put("!", "BANG");
        map.put("~", "TILDE");
        map.put("=", "ASSIGNMENT");
        map.put("<", "LT");
        map.put(">", "GT");
        map.put("::", "DOUBLE_COLON");
        map.put("??", "OP_COALESCING");
        map.put("++", "OP_INC");
        map.put("--", "OP_DEC");
        map.put("&&", "OP_AND");
        map.put("||", "OP_OR");
        map.put("->", "OP_PTR");
        map.put("==", "OP_EQ");
        map.put("!=", "OP_NE");
        map.put("<=", "OP_LE");
        map.put(">=", "OP_GE");
        map.put("+=", "OP_ADD_ASSIGNMENT");
        map.put("-=", "OP_SUB_ASSIGNMENT");
        map.put("*=", "OP_MULT_ASSIGNMENT");
        map.put("/=", "OP_DIV_ASSIGNMENT");
        map.put("%=", "OP_MOD_ASSIGNMENT");
        map.put("&=", "OP_AND_ASSIGNMENT");
        map.put("|=", "OP_OR_ASSIGNMENT");
        map.put("^=", "OP_XOR_ASSIGNMENT");
        map.put("<<", "OP_LEFT_SHIFT");
        map.put("<<=", "OP_LEFT_SHIFT_ASSIGNMENT");
        map.put(">>", "RIGHT_SHIFT");
        map.put(">>=", "RIGHT_SHIFT_ASSIGNMENT");
        map.put("=>", "RIGHT_ARROW");
    }
}
