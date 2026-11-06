package org.junit.internal.runners.statements;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InvokeMethod extends Statement {
    private final Object target;
    private final FrameworkMethod testMethod;

    public InvokeMethod(FrameworkMethod frameworkMethod, Object obj) {
        this.testMethod = frameworkMethod;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.testMethod.invokeExplosively(this.target, new Object[0]);
    }
}
