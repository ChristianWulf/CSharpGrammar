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

package grammar.refactoring.ast;

import grammar.refactoring.ast.nodes.Branch;
import grammar.refactoring.ast.nodes.CombiningGroup;
import grammar.refactoring.ast.nodes.ComposingRule;
import grammar.refactoring.ast.nodes.GroupRule;
import grammar.refactoring.ast.nodes.Rule;
import grammar.refactoring.ast.nodes.RuleDef;
import grammar.refactoring.ast.nodes.StandardRule;
import grammar.refactoring.ast.nodes.ZeroOrMoreRule;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeftRecursionRemover extends RuleDefDecorator {

    public LeftRecursionRemover(RuleDefRefactorer refactorer) {
        super(refactorer);
    }

    // query_body_clauses:
    // | query_body_clause
    // | query_body_clauses query_body_clause
    // ;

    // multiplicative_expression:
    // | unary_expression
    // | multiplicative_expression '*' unary_expression
    // | multiplicative_expression '/' unary_expression
    // | multiplicative_expression '%' unary_expression
    // ;

    // define rests
    // multiplicative_expression:
    // | unary_expression
    // | multiplicative_expression ('*' unary_expression)
    // | multiplicative_expression ('/' unary_expression)
    // | multiplicative_expression ('%' unary_expression)
    // ;

    // 1. combine rests with '|'
    // 2. append quantifier 'zero or more' to the combination
    // 3. append combination to single remaining rule
    // multiplicative_expression:
    // | unary_expression ( ('*' unary_expression)
    // | ('/' unary_expression)
    // | ('%' unary_expression)
    // )*
    // ;

    // optimization
    // multiplicative_expression:
    // | unary_expression ( ('*'
    // |'/'
    // |'%'
    // ) unary_expression
    // )*
    // ;

    @Override
    public void refactor(RuleDef ruleDef) {
        List<Branch> branches = ruleDef.getBranches();

        List<Branch> lrBranches = new LinkedList<Branch>();
        List<Rule> singleBranch = null;
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            List<Rule> rules = branch.getRules();
            if (firstRuleIsLR(rules, ruleDef.getName())
                    && containsExactlyOneRuleWithRuleDefName(rules,
                            ruleDef.getName())) {
                lrBranches.add(branch);
            }
            else {
                singleBranch = rules;
            }
        }

        if (lrBranches.size() == 0)
            return;
        // limited support
        if (branches.size() - lrBranches.size() != 1)
            return;
        System.out
                .println("Found left-recursion that can be refactored in rule '"
                        + ruleDef.getName() + "'.");

        // 0. for each LR-branch: put the rest rules into a group
        List<Rule> restsGroups = new LinkedList<Rule>();
        for (Branch branch : lrBranches) {
            List<Rule> restRules = branch.getRules().subList(1,
                    branch.getRules().size());
            GroupRule groupRule = new GroupRule(restRules);
            restsGroups.add(groupRule);
        }

        // 1. concatenate the rest groups with '|'
        // 2. append quantifier 'zero or more' to the combination
        // System.out.println("combiningGroup: " + combiningGroup);
        Rule combiningGroup;
        if (restsGroups.size() == 1) {
            combiningGroup = new ComposingRule(restsGroups, "", "*", false);
        }
        else {
            combiningGroup = new CombiningGroup(restsGroups, "|", "*");
        }

        // 3. append combination to single remaining rule
        singleBranch.add(combiningGroup);

        // 4. remove LR-branches
        // System.out.println("branches: " + branches);
        // System.out.println("lrBranches: " + lrBranches);
        if (branches.removeAll(lrBranches)) {
            System.out.println("Found left-recursion. Refactored to:\n"
                    + ruleDef.toPrettyString());
        }

        this.delegate.refactor(ruleDef);
    }

    private boolean firstRuleIsLR(List<Rule> rules, String ruleDefName) {
        return ruleDefName.equals(rules.get(0).toPrettyString());
    }

    private void move(List<Branch> branches, int toRemove, int toAppend) {
        List<Rule> standardRules = branches.remove(toRemove).getRules();
        List<Rule> rest = standardRules.subList(1, standardRules.size());

        ZeroOrMoreRule zeroOrMoreRule = new ZeroOrMoreRule(rest);
        branches.get(toAppend).getRules().add(zeroOrMoreRule);
    }

    private int getRuleCountWithRuleDefName(List<Rule> rules, String ruleDefName) {
        // rule element to rule list
        List<StandardRule> ruleDefNameList = Arrays.asList(new StandardRule(
                ruleDefName));

        List<Rule> list = new LinkedList<Rule>(rules);
        list.retainAll(ruleDefNameList);
        return list.size();
    }

    private boolean containsAtMostOneRuleWithRuleDefName(List<Rule> rules,
            String ruleDefName) {
        return getRuleCountWithRuleDefName(rules, ruleDefName) <= 1;
    }

    private boolean containsExactlyOneRuleWithRuleDefName(List<Rule> rules,
            String ruleDefName) {
        return getRuleCountWithRuleDefName(rules, ruleDefName) == 1;
    }
}
