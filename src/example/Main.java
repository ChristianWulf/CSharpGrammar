package example;

import java.io.IOException;
import lang.csharp.CSharp4;
import lang.csharp.CSharp4PreProcessorImpl;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;

import util.unicode.ANTLRFileStreamWithBOM;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws RecognitionException
     */
    public static void main(String[] args) throws IOException,
            RecognitionException {
        String filename = "resource/if_statement.cs";
        
        ANTLRFileStreamWithBOM charStream = new ANTLRFileStreamWithBOM(filename);
        Lexer lex = new CSharp4PreProcessorImpl(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CSharp4 parser = new CSharp4(tokens);
        parser.compilation_unit();
        
        System.out.println(tokens.getTokens());
    }

}
