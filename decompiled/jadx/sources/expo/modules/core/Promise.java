package expo.modules.core;

import expo.modules.core.interfaces.CodedThrowable;
import kotlin.Deprecated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "AsyncFunction will crash when called. Use expo.modules.kotlin.Promise instead")
/* loaded from: classes9.dex */
public interface Promise {
    public static final String UNKNOWN_ERROR = "E_UNKNOWN_ERROR";

    void reject(String str, String str2, Throwable th);

    /* JADX WARN: Multi-variable type inference failed */
    default void reject(Throwable th) {
        if (!(th instanceof CodedThrowable)) {
            reject(UNKNOWN_ERROR, th);
        } else {
            CodedThrowable codedThrowable = (CodedThrowable) th;
            reject(codedThrowable.getCode(), codedThrowable.getMessage(), th);
        }
    }

    void resolve(Object obj);

    default void reject(String str, String str2) {
        reject(str, str2, null);
    }

    default void reject(String str, Throwable th) {
        reject(str, th.getMessage(), th);
    }
}
