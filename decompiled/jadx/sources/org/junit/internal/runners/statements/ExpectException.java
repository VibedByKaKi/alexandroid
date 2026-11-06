package org.junit.internal.runners.statements;

import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ExpectException extends Statement {
    private final Class<? extends Throwable> expected;
    private final Statement next;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.next = statement;
        this.expected = cls;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        try {
            this.next.evaluate();
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "Expected exception: ".concat(this.expected.getName()));
        } catch (AssumptionViolatedException e) {
            throw e;
        } catch (Throwable th) {
            if (this.expected.isAssignableFrom(th.getClass())) {
                return;
            }
            throw new Exception("Unexpected exception, expected<" + this.expected.getName() + "> but was<" + th.getClass().getName() + ">", th);
        }
    }
}
