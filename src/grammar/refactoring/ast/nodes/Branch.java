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

package grammar.refactoring.ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private final List<Rule> standardRules = new ArrayList<Rule>();

    private int              indentLevel;

    public List<Rule> getRules() {
        return standardRules;
    }

    public String toPrettyString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < standardRules.size(); i++) {
            Rule r = standardRules.get(i);
            r.setIndentLevel(indentLevel);

            builder.append(r.toPrettyString());
            if (i < standardRules.size() - 1)
                builder.append(' ');
        }
        builder.append("\n");
        return builder.toString();
    }

    public int getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(int indentLevel) {
        this.indentLevel = indentLevel;
    }
}
