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

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUppercaserTest {

    private static Uppercaser uppercaser;

    @BeforeClass
    public static void beforeClass() {
        uppercaser = new Uppercaser();
    }

    @Test
    public void testWordToUppercase1() {
        String str = "//B.1.2 Comments\r\n" + "Comment:\r\n"
                + "  | Single_line_comment\r\n" + "  | Delimited_comment;\r\n"
                + "Single_line_comment:\r\n"
                + "  | '//' Input_characters?;\r\n" + "Input_characters:\r\n"
                + "  | Input_character+;";
        String uppercase = uppercaser.wordToUppercase(str,
                "Single_line_comment", "Delimited_comment");

        String expected = "//B.1.2 Comments\r\n" + "Comment:\r\n"
                + "  | SINGLE_LINE_COMMENT\r\n" + "  | DELIMITED_COMMENT;\r\n"
                + "SINGLE_LINE_COMMENT:\r\n"
                + "  | '//' Input_characters?;\r\n" + "Input_characters:\r\n" +

                "  | Input_character+;";
        assertEquals(expected, uppercase);
    }

    @Test
    public void testWordToUppercase2() {
        String str = "//B.1.5 Unicode Character Escape Sequences\r\n"
                + "Unicode_escape_sequence:\r\n"
                + "  | '\\\\u' Hex_digit Hex_digit HEX_DIGIT Hex_digit\r\n"
                + "  | '\\\\U' HEX_DIGIT Hex_digit HEX_DIGIT Hex_digit HEX_DIGIT Hex_digit HEX_DIGIT Hex_digit;\r\n";
        String uppercase = uppercaser.wordToUppercase(str, "Hex_digit");

        // uppercase = uppercaser.wordToUppercase(uppercase, "Hex_digit");

        String expected = "//B.1.5 Unicode Character Escape Sequences\r\n"
                + "Unicode_escape_sequence:\r\n"
                + "  | '\\\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT\r\n"
                + "  | '\\\\U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;\r\n";
        assertEquals(expected, uppercase);
    }

}
