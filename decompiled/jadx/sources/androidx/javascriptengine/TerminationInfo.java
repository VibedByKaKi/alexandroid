package androidx.javascriptengine;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class TerminationInfo {
    public static final int STATUS_MEMORY_LIMIT_EXCEEDED = 3;
    public static final int STATUS_SANDBOX_DEAD = 2;
    public static final int STATUS_UNKNOWN_ERROR = 1;
    private final String mMessage;
    private final int mStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Status {
    }

    public TerminationInfo(int i, String str) {
        this.mStatus = i;
        this.mMessage = str;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStatusString() {
        int i = this.mStatus;
        if (i == 1) {
            return "unknown error";
        }
        if (i == 2) {
            return "sandbox dead";
        }
        if (i == 3) {
            return "memory limit exceeded";
        }
        return "unknown error code " + this.mStatus;
    }

    public IsolateTerminatedException toJavaScriptException() {
        int i = this.mStatus;
        return i != 2 ? i != 3 ? new IsolateTerminatedException(toString()) : new MemoryLimitExceededException(toString()) : new SandboxDeadException(toString());
    }

    public String toString() {
        return getStatusString() + ": " + getMessage();
    }
}
