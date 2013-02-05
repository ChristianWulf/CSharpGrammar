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
import java.util.List;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class OptionalReducer extends AbstractAlternativeRefactor {

    @Override
    public void analyzeAlternatives(List<Tree> alts) {
        for (int i = 0; i < alts.size() - 1; i++) {
            for (int j = i + 1; j < alts.size(); j++) {
                processPair(alts.get(i), alts.get(j));
                return; // for now, handle one pair per rule only
            }
        }
    }

    private void processPair(Tree alt1, Tree alt2) {
        if (alt1.getChildCount() > 0 && alt2.getChildCount() > 0) {
            if (alt1.getChildCount() > alt2.getChildCount()) {
                if (isFullSubsetOf(alt2, alt1)) {
                    reduce(alt2, alt1);
                }
            }
            else if (alt1.getChildCount() < alt2.getChildCount()) {
                if (isFullSubsetOf(alt1, alt2)) {
                    reduce(alt1, alt2);
                }
            }
        }
    }

    private boolean isFullSubsetOf(Tree subset, Tree set) {
        for (int i = 0; i < subset.getChildCount() - 1; i++) {
            String subsetText = subset.getChild(i).getText();
            String setText = set.getChild(i).getText();
            if (!subsetText.equals(setText)) {
                return false;
            }
        }

        return true;
    }

    private void reduce(Tree subset, Tree set) {
        // '?'=78
        Tree qmark = new CommonTree(new CommonToken(ANTLRv3Parser.T__78, "?"));
        // add rest as children of ?
        for (int i = 0; i < subset.getChildCount() - 1; i++) {
            qmark.addChild(subset.getChild(i));
        }

        // replace rest of alt1 with ?
        set.replaceChildren(subset.getChildCount(), set.getChildCount() - 1,
                qmark);

        // delete alt2
        subset.getParent().deleteChild(subset.getChildIndex());

        System.out.println("reduced rule '" + ruleName + "'");
    }

}
