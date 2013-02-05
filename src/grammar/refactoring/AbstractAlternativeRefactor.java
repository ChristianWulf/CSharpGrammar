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

import grammar.antlr.ANTLRv3Parser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.Tree;

public abstract class AbstractAlternativeRefactor {

    protected String ruleName;

    public void refactor(Tree t) {
        for (int i = 0; i < t.getChildCount(); i++) {
            Tree child = t.getChild(i);
            if (child.getType() == ANTLRv3Parser.RULE) {
                Tree id = child.getChild(0);
                ruleName = id.getText();
                // if (id.getType() == ANTLRv3Parser.ID) { // no need
                // System.out.println("rule '" + ruleName + "' found.");
                // }

                List<Tree> alts = new ArrayList<Tree>();
                Tree block = child.getChild(1);

                // for (int j = 0; j < block.getChildCount(); j++) {
                // System.out.println("alt" + j + ": " +
                // print(block.getChild(j)));
                // }

                // System.out.println("block: " + block);
                for (int j = 0; j < block.getChildCount(); j++) {
                    // System.out.println("block child: " + block.getText());
                    Tree child2 = block.getChild(j);
                    if (child2.getType() == ANTLRv3Parser.ALT
                            && child2.getChild(0).getType() != ANTLRv3Parser.EPSILON) {
                        alts.add(child2);
                    }
                }

                analyzeAlternatives(alts);
            }
        }
    }

    public abstract void analyzeAlternatives(List<Tree> alts);
}
