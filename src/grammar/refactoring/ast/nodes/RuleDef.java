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

public class RuleDef {

    private static final char  INDENT   = '\t';
    private final String       name;
    private final List<Branch> branches = new ArrayList<Branch>();
    private final boolean      fragment;

    public RuleDef(String name, boolean fragment) {
        this.name = name;
        this.fragment = fragment;
    }

    public String getName() {
        return name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public String toPrettyString() {
        StringBuilder builder = new StringBuilder();
        if (fragment)
            builder.append("fragment ");
        builder.append(name).append(' ').append('\n');
        builder.append(INDENT).append(':');
        for (int i = 0; i < branches.size(); i++) {
            // format without empty branch
            if (i > 0)
                builder.append(INDENT).append("|");
            Branch b = branches.get(i);
            b.setIndentLevel(1);
            builder.append(" ").append(b.toPrettyString());
        }
        builder.append(INDENT).append(';');
        return builder.toString();
    }
}
