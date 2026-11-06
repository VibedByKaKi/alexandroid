package expo.modules.core.errors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class InvalidArgumentException extends CodedRuntimeException {
    public InvalidArgumentException(String str) {
        super(str);
    }

    @Override // expo.modules.core.errors.CodedRuntimeException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_INVALID_ARGUMENT";
    }

    public InvalidArgumentException(Throwable th) {
        super(th);
    }

    public InvalidArgumentException(String str, Throwable th) {
        super(str, th);
    }
}
