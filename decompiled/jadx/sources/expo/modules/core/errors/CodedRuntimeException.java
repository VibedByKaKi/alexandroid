package expo.modules.core.errors;

import expo.modules.core.interfaces.CodedThrowable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class CodedRuntimeException extends RuntimeException implements CodedThrowable {
    public CodedRuntimeException(String str) {
        super(str);
    }

    @Override // expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_UNSPECIFIED_ANDROID_EXCEPTION";
    }

    public CodedRuntimeException(Throwable th) {
        super(th);
    }

    public CodedRuntimeException(String str, Throwable th) {
        super(str, th);
    }
}
