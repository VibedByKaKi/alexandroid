package expo.modules.core.errors;

import expo.modules.core.interfaces.CodedThrowable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class CodedException extends Exception implements CodedThrowable {
    public CodedException(String str) {
        super(str);
    }

    @Override // expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_UNSPECIFIED_ANDROID_EXCEPTION";
    }

    public CodedException(Throwable th) {
        super(th);
    }

    public CodedException(String str, Throwable th) {
        super(str, th);
    }
}
