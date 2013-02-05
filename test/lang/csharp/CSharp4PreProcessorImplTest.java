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

package lang.csharp;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.junit.Test;

import util.unicode.ANTLRFileStreamWithBOM;

public class CSharp4PreProcessorImplTest {

    private CSharp4PreProcessorImpl loadFile(final String fileName,
            final String... macroDefinitions) throws IOException {
        CharStream input = new ANTLRFileStreamWithBOM(fileName);
        CSharp4PreProcessorImpl lexer = new CSharp4PreProcessorImpl(input,
                macroDefinitions);
        return lexer;
    }

    @Test
    public void testConsole() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Console.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());

        @SuppressWarnings("unchecked")
        List<Token> tokens = tokenStream.getTokens();
        System.out.println(tokens.size());

        Token t;
        t = tokens.get(0);
        assertEquals("//", t.getText());
        assertEquals(CSharp4PreProcessor.SINGLE_LINE_COMMENT, t.getType());

        t = tokens.get(1);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());

        t = tokens.get(2);
        assertEquals("// System.Console.cs", t.getText());
        assertEquals(CSharp4PreProcessor.SINGLE_LINE_COMMENT, t.getType());

        testWindowsConsoleIsIdentifier(tokens);
    }

    private void testWindowsConsoleIsIdentifier(final List<Token> tokens) {
        for (Object obj : tokens) {
            Token tok = (Token) obj;
            if (tok.getType() == CSharp4PreProcessor.IDENTIFIER) {
                if ("WindowsConsole".equals(tok.getText())) {
                    System.out.println("TEST: " + tok);
                }
            }
        }
    }

    @Test
    public void testMacroDefinitions() throws Exception {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Console.cs",
                "NET_2_1");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testArbitraryCodeInFalseSection() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/PP_Directive.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testCodeBeforeSection() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/PP_Directive2.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testIdentifiers() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Identifiers.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());

        @SuppressWarnings("unchecked")
        List<Token> tokens = tokenStream.getTokens();

        Token t;
        t = tokens.get(0);
        assertEquals("hello", t.getText());
        assertEquals(CSharp4PreProcessor.IDENTIFIER, t.getType());

        t = tokens.get(1);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());

        t = tokens.get(2);
        assertEquals("@world", t.getText());
        assertEquals(CSharp4PreProcessor.IDENTIFIER, t.getType());

        t = tokens.get(3);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());

        t = tokens.get(4);
        assertEquals("private", t.getText());
        assertEquals(CSharp4PreProcessor.PRIVATE, t.getType());

        t = tokens.get(5);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());

        t = tokens.get(6);
        assertEquals("@public", t.getText());
        assertEquals(CSharp4PreProcessor.IDENTIFIER, t.getType());

        t = tokens.get(7);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());
    }

    @Test
    public void testFilename() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Filename.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());

        @SuppressWarnings("unchecked")
        List<Token> tokens = tokenStream.getTokens();

        Token t;
        t = tokens.get(0);
        assertEquals("@\"Hello World!\"", t.getText());
        assertEquals(CSharp4PreProcessor.STRING_LITERAL, t.getType());

        t = tokens.get(1);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());

        t = tokens.get(2);
        assertEquals("@\"$(FxCopDir)\\rules\"", t.getText());
        assertEquals(CSharp4PreProcessor.STRING_LITERAL, t.getType());

        t = tokens.get(3);
        assertEquals(CSharp4PreProcessor.NEW_LINE, t.getType());
    }

    @Test
    public void testClass() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Generics.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());

        @SuppressWarnings("unchecked")
        List<Token> tokens = tokenStream.getTokens();

        Token t;
        t = tokens.get(0);
        assertEquals("class", t.getText());
        assertEquals(CSharp4PreProcessor.CLASS, t.getType());

        t = tokens.get(1);
        assertEquals(CSharp4PreProcessor.WHITESPACE, t.getType());

        t = tokens.get(2);
        assertEquals("Generics", t.getText());
        assertEquals(CSharp4PreProcessor.IDENTIFIER, t.getType());
    }

    @Test
    public void testMethodDefinition() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/TypeType.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testGlocalStatements() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/AssemblyInfo.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testPrimitives() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Primitives.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

    @Test
    public void testPP_Directive_Or() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/PP_Directive_Or.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }
    
    @Test
    public void testUnicode() throws IOException {
        CSharp4PreProcessorImpl lexer = loadFile("resource/Unicode.cs");
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        assertEquals(0, lexer.getErrors().size());
    }

}
