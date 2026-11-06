package autovalue.shaded.org.objectweb.asm;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i) {
        super(stringConcat$0(str));
        this.className = str;
        this.constantPoolCount = i;
    }

    private static /* synthetic */ String stringConcat$0(String str) {
        return a$$ExternalSyntheticOutline0.m("Class too large: ", str);
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
