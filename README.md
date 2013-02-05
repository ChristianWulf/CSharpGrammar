CSharpGrammar
=============
C# 4.0 preprocessor, lexer, and parser in Java

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