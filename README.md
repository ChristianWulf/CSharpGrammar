CSharpGrammar
=============
C# 4.0 preprocessor, lexer, and parser in Java

I have built this C# grammar to develop and perform a C# to KDM transformation, see https://github.com/ChristianWulf/CSharpKDMDiscoverer.

License
---
Eclipse Public License - v 1.0 (http://www.eclipse.org/legal/epl-v10.html)

Compilation
---

### Requirements
- ANTLR: To compile the grammar files to your favorite language (here: Java)
- (Optional) Eclipse with ANTLR Plug-In

### Hints
Do not compile CSharp4Lexer.g because this would result in the error: error(144): CSharp4Lexer.g:18:9: redefinition of header action.
Instead, compile CSharp4PreProcessor.g which triggers the compilation of the CSharp4Lexer.g due to the import.

Example
---
In the near future, I will add a code example to the src folder. For now, the following code example shall be sufficient:
<code>
String filename = ...<br>
ANTLRFileStream stream = new ANTLRFileStream(filename);<br>
Lexer lexer = new CSharp4PreProcessorImpl(stream);<br>
CommonTokenStream tokens = new CommonTokenStream(lexer);<br>
CSharp4 parser = new CSharp4(tokens);<br>
parser.compilation_unit();<br>
</code>
