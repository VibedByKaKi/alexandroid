package autovalue.shaded.org.objectweb.asm;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    public MethodTooLargeException(String str, String str2, String str3, int i) {
        super(stringConcat$0(str, str2, str3));
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i;
    }

    private static /* synthetic */ String stringConcat$0(String str, String str2, String str3) {
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Method too large: ", str, ".", str2, " ");
        m.append(str3);
        return m.toString();
    }

    public String getClassName() {
        return this.className;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
