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
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import util.FileSystem;
import util.unicode.ANTLRFileStreamWithBOM;

public class CSharp4ParserTest {

    private CSharp4 parser;

    private CSharp4 loadFile(final String fileName) throws IOException {
        CharStream input = new ANTLRFileStreamWithBOM(fileName);
        CSharp4PreProcessorImpl preProcessor = new CSharp4PreProcessorImpl(
                input, "NET_2_1");
        CommonTokenStream tokens = new CommonTokenStream(preProcessor);
        parser = new CSharp4(tokens);
        return parser;
    }

    @After
    public void after() {
        for (String errMsg : parser.getErrors()) {
            System.out.println(errMsg);
        }
    }

    @Test
    // @Ignore
    public void testConsole() throws IOException, RecognitionException {
        CSharp4 parser = loadFile("resource/Console.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testGeneric() throws Exception {
        CSharp4 parser = loadFile("resource/Generics.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testFilenames() throws Exception {
        CSharp4 parser = loadFile("resource/Filenames.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testTypeType() throws Exception {
        CSharp4 parser = loadFile("resource/TypeType.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testField() throws Exception {
        CSharp4 parser = loadFile("resource/Field.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testPrimitives() throws Exception {
        CSharp4 parser = loadFile("resource/Primitives.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testTypeConstruction() throws Exception {
        CSharp4 parser = loadFile("resource/TypeConstruction.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testCast() throws Exception {
        CSharp4 parser = loadFile("resource/Cast.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    @Ignore
    public void testSharpDevelop() throws IOException, RecognitionException {
        String dir = "resource/SharpDevelop_4.1.0.8000_Source/src";
        File root = new File(dir);
        List<String> filenames = FileSystem.findAllFiles(root);

        System.out.println("#files: " + filenames.size());

        filenames = filenames.subList(0, filenames.size());
        // 100 => 1108 ms
        // 1000 => 6624 ms
        // 2000 => 10874 ms
        // 6571 => 20929 ms

        long start = System.currentTimeMillis();
        for (int i = 0; i < filenames.size(); i++) {
            String fn = filenames.get(i);
            System.out.println(i + ".) Parsing => " + fn);
            // wait before proceeding
            // System.in.read();
            CSharp4 parser = loadFile(fn);
            parser.compilation_unit();
            assertEquals("Failt at File: " + i, 0, parser.getErrors().size());
        }
        long end = System.currentTimeMillis();
        System.out.println("dur: " + (end - start) + " ms");
    }

    @Test
    public void testDelegate() throws Exception {
        CSharp4 parser = loadFile("resource/Converter.cs");
        parser.compilation_unit();
        assertEquals(0, parser.getErrors().size());
    }

}
