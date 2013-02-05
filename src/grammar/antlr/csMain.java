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

import java.io.IOException;
import lang.csharp.CSharp4;
import lang.csharp.CSharp4PreProcessorImpl;
import lang.csharp.csLexer;
import lang.csharp.csParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;

public class csMain {

    /**
     * @param args
     * @throws IOException
     * @throws RecognitionException
     */
    public static void main(String[] args) throws IOException,
            RecognitionException {
        String filename = "resource/Identifiers.cs";
        // CommonTokenStream tokenStream = parseWithcs(filename);
        CommonTokenStream tokenStream = parseWithCSharp4(filename);
        System.out.println(tokenStream.getTokens());
    }

    private static CommonTokenStream parseWithcs(String filename)
            throws IOException, RecognitionException {
        Lexer lex = new csLexer(new ANTLRFileStream(filename));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        csParser parser = new csParser(tokens);
        parser.compilation_unit();

        return tokens;
    }

    private static CommonTokenStream parseWithCSharp4(String filename)
            throws IOException, RecognitionException {
        Lexer lex = new CSharp4PreProcessorImpl(new ANTLRFileStream(filename));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CSharp4 parser = new CSharp4(tokens);
        parser.compilation_unit();

        return tokens;
    }

}
