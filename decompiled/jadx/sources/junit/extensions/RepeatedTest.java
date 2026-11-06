package junit.extensions;

import defpackage.a$$ExternalSyntheticOutline0;
import junit.framework.Test;
import junit.framework.TestResult;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class RepeatedTest extends TestDecorator {
    private int fTimesRepeat;

    public RepeatedTest(Test test, int i) {
        super(test);
        if (i >= 0) {
            this.fTimesRepeat = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Repetition count must be >= 0");
            throw null;
        }
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public int countTestCases() {
        return super.countTestCases() * this.fTimesRepeat;
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public void run(TestResult testResult) {
        for (int i = 0; i < this.fTimesRepeat && !testResult.shouldStop(); i++) {
            super.run(testResult);
        }
    }

    @Override // junit.extensions.TestDecorator
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), super.toString(), "(repeated)");
    }
}
