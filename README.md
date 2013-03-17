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
```java
String filename = ...
ANTLRFileStream stream = new ANTLRFileStream(filename);
Lexer lexer = new lang.csharp.CSharp4PreProcessorImpl(stream);
CommonTokenStream tokens = new CommonTokenStream(lexer);
CSharp4 parser = new CSharp4(tokens);
parser.compilation_unit();
```
