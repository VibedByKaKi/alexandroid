package rx.exceptions;

import java.util.HashSet;
import rx.annotations.Experimental;
import rx.plugins.RxJavaHooks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Experimental
/* loaded from: classes12.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str) {
        super(str);
    }

    public static AssemblyStackTraceException find(Throwable th) {
        HashSet hashSet = new HashSet();
        while (!(th instanceof AssemblyStackTraceException)) {
            if (th != null && th.getCause() != null) {
                th = th.getCause();
                if (!hashSet.add(th)) {
                }
            }
            return null;
        }
        return (AssemblyStackTraceException) th;
    }

    public void attachTo(Throwable th) {
        HashSet hashSet = new HashSet();
        while (th.getCause() != null) {
            th = th.getCause();
            if (!hashSet.add(th)) {
                RxJavaHooks.onError(this);
                return;
            }
        }
        th.initCause(this);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
