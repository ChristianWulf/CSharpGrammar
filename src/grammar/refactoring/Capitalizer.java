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
import org.apache.commons.lang3.text.WordUtils;
import util.FileSystem;

public class Capitalizer {

    public static void main(String[] args) throws IOException {
        String fullPathFilename = "grammars/CSharp4Lexer.g";
        String str = FileSystem.readTextFile(fullPathFilename);
        String capitalize = WordUtils.capitalize(str);
        FileSystem.writeTextFile(capitalize, fullPathFilename);
    }
}
