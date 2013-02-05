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

package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileSystem {

    private FileSystem() {
        // utility class
    }

    public static String readTextFile(String fullPathFilename)
            throws IOException {
        StringBuilder sb = new StringBuilder(1024);

        char[] chars = new char[1024];

        BufferedReader reader = new BufferedReader(new FileReader(
                fullPathFilename));
        try {
            int numRead = 0;
            while ((numRead = reader.read(chars)) > -1) {
                sb.append(chars, 0, numRead);
            }
        }
        finally {
            reader.close();
        }

        return sb.toString();
    }

    public static void writeTextFile(String contents, String fullPathFilename)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(
                fullPathFilename));
        try {
            writer.write(contents);
        }
        finally {
            writer.close();
        }
    }

    public static List<String> findAllFiles(final File dir) {
        List<String> allFiles = new LinkedList<String>();

        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                allFiles.addAll(findAllFiles(f));
            }
            if (f.isFile() && f.getName().endsWith(".cs")) {
                allFiles.add(f.getAbsolutePath());
            }
        }

        return allFiles;
    }
}
