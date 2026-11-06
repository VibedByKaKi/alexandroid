package junit.framework;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TestFailure {
    protected Test fFailedTest;
    protected Throwable fThrownException;

    public TestFailure(Test test, Throwable th) {
        this.fFailedTest = test;
        this.fThrownException = th;
    }

    public String exceptionMessage() {
        return thrownException().getMessage();
    }

    public Test failedTest() {
        return this.fFailedTest;
    }

    public boolean isFailure() {
        return thrownException() instanceof AssertionFailedError;
    }

    public Throwable thrownException() {
        return this.fThrownException;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.fFailedTest);
        sb.append(": ");
        return ParcelCompat$$ExternalSyntheticOutline0.m(this.fThrownException, sb);
    }

    public String trace() {
        StringWriter stringWriter = new StringWriter();
        thrownException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
