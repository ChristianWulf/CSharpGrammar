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

import java.util.List;

public class ComposingRule implements Rule {

    private final List<Rule> childRules;
    private final String     infix;
    private final String     suffix;
    private final boolean    parantheses;
    private int              indentLevel;

    public ComposingRule(List<Rule> rules, String infix, String suffix,
            boolean parantheses) {
        this.childRules = rules;
        this.infix = infix;
        this.suffix = suffix;
        this.parantheses = parantheses;
    }

    @Override
    public String toPrettyString() {
        StringBuilder builder = new StringBuilder(childRules.size() * 20); // estimated
                                                                           // size
        if (parantheses)
            builder.append("( ");
        for (int i = 0; i < childRules.size(); i++) {
            builder.append(childRules.get(i).toPrettyString());
            if (i < childRules.size() - 1) { // do not apply to the last element
                builder.append(' ').append(infix).append(' ');
            }
        }
        if (parantheses)
            builder.append(" )");
        builder.append(suffix);
        return builder.toString();
    }

    @Override
    public String toString() {
        return toPrettyString();
    }

    public int getIndentLevel() {
        return indentLevel;
    }

    @Override
    public void setIndentLevel(int indentLevel) {
        this.indentLevel = indentLevel;
    }
}
