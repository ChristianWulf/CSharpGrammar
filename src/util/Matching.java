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

import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching {

    public static String matchAll(final String content, Pattern pattern,
            String REPLACEMENT) {
        // realizes String.replaceAll and prints out each replacement
        Matcher matcher = pattern.matcher(content);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++)
                System.out.println("group " + i + " : " + matcher.group(i));
            // System.out.println("part:\t"+content.substring(matcher.start(),
            // matcher.end()));
            System.out.println("------------");
            matcher.appendReplacement(sb, REPLACEMENT);
        }
        matcher.appendTail(sb);

        return sb.toString();
    }

    public static String matchAll(final String content, Pattern pattern,
            Callable<String> task) {
        // realizes String.replaceAll and prints out each replacement
        Matcher matcher = pattern.matcher(content);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            String replacement;
            try {
                replacement = task.call();
            }
            catch (Exception e) {
                replacement = matcher.group(0);
            }
            matcher.appendReplacement(sb, replacement);
        }
        matcher.appendTail(sb);

        return sb.toString();
    }

}
