package org.junit.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RuleChain implements TestRule {
    private static final RuleChain EMPTY_CHAIN = new RuleChain(Collections.EMPTY_LIST);
    private List<TestRule> rulesStartingWithInnerMost;

    private RuleChain(List<TestRule> list) {
        this.rulesStartingWithInnerMost = list;
    }

    public static RuleChain emptyRuleChain() {
        return EMPTY_CHAIN;
    }

    public static RuleChain outerRule(TestRule testRule) {
        return emptyRuleChain().around(testRule);
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        Iterator<TestRule> it2 = this.rulesStartingWithInnerMost.iterator();
        while (it2.hasNext()) {
            statement = it2.next().apply(statement, description);
        }
        return statement;
    }

    public RuleChain around(TestRule testRule) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(testRule);
        arrayList.addAll(this.rulesStartingWithInnerMost);
        return new RuleChain(arrayList);
    }
}
