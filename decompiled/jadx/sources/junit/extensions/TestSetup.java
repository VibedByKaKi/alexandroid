package junit.extensions;

import junit.framework.Protectable;
import junit.framework.Test;
import junit.framework.TestResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TestSetup extends TestDecorator {
    public TestSetup(Test test) {
        super(test);
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public void run(final TestResult testResult) {
        testResult.runProtected(this, new Protectable() { // from class: junit.extensions.TestSetup.1
            @Override // junit.framework.Protectable
            public void protect() throws Exception {
                TestSetup.this.setUp();
                TestSetup.this.basicRun(testResult);
                TestSetup.this.tearDown();
            }
        });
    }

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }
}
