package org.junit.rules;

import org.junit.runner.Description;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TestName extends TestWatcher {
    private String name;

    public String getMethodName() {
        return this.name;
    }

    @Override // org.junit.rules.TestWatcher
    public void starting(Description description) {
        this.name = description.getMethodName();
    }
}
