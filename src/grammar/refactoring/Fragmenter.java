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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.FileSystem;

public class Fragmenter {

    public static void main(String[] args) throws IOException {
        String fullPathFilename = "grammars/CSharp4Lexer.g";
        String str = FileSystem.readTextFile(fullPathFilename);
        String capitalize = new Fragmenter().addFragmentToWords(str,
                "Hex_digit");
        FileSystem.writeTextFile(capitalize, fullPathFilename);
    }

    // inefficient, but enough to work with
    public String addFragmentToWords(String str, String... words) {
        String result = str;

        for (String word : words) {
            // match a rule
            String regex = "\\b(" + word + ")(\\s*:)";
            // keep surrounding characters/ws
            String replacement = "fragment $1$2";

            Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
                    .matcher(result);
            result = matcher.replaceAll(replacement);
        }

        return result;
    }
}
