package org.junit.rules;

import java.util.Iterator;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RunRules extends Statement {
    private final Statement statement;

    public RunRules(Statement statement, Iterable<TestRule> iterable, Description description) {
        this.statement = applyAll(statement, iterable, description);
    }

    private static Statement applyAll(Statement statement, Iterable<TestRule> iterable, Description description) {
        Iterator<TestRule> it2 = iterable.iterator();
        while (it2.hasNext()) {
            statement = it2.next().apply(statement, description);
        }
        return statement;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.statement.evaluate();
    }
}
