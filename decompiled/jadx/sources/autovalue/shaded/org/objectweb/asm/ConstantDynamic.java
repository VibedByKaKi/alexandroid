package autovalue.shaded.org.objectweb.asm;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ConstantDynamic {
    private final Handle bootstrapMethod;
    private final Object[] bootstrapMethodArguments;
    private final String descriptor;
    private final String name;

    public ConstantDynamic(String str, String str2, Handle handle, Object... objArr) {
        this.name = str;
        this.descriptor = str2;
        this.bootstrapMethod = handle;
        this.bootstrapMethodArguments = objArr;
    }

    private static /* synthetic */ String stringConcat$0(String str, String str2, Handle handle, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        sb.append(" ");
        sb.append(handle);
        return a$$ExternalSyntheticOutline0.m(sb, " ", str3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConstantDynamic)) {
            return false;
        }
        ConstantDynamic constantDynamic = (ConstantDynamic) obj;
        return this.name.equals(constantDynamic.name) && this.descriptor.equals(constantDynamic.descriptor) && this.bootstrapMethod.equals(constantDynamic.bootstrapMethod) && Arrays.equals(this.bootstrapMethodArguments, constantDynamic.bootstrapMethodArguments);
    }

    public Handle getBootstrapMethod() {
        return this.bootstrapMethod;
    }

    public Object getBootstrapMethodArgument(int i) {
        return this.bootstrapMethodArguments[i];
    }

    public int getBootstrapMethodArgumentCount() {
        return this.bootstrapMethodArguments.length;
    }

    public Object[] getBootstrapMethodArgumentsUnsafe() {
        return this.bootstrapMethodArguments;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        char charAt = this.descriptor.charAt(0);
        return (charAt == 'J' || charAt == 'D') ? 2 : 1;
    }

    public int hashCode() {
        return Integer.rotateLeft(Arrays.hashCode(this.bootstrapMethodArguments), 24) ^ ((this.name.hashCode() ^ Integer.rotateLeft(this.descriptor.hashCode(), 8)) ^ Integer.rotateLeft(this.bootstrapMethod.hashCode(), 16));
    }

    public String toString() {
        return stringConcat$0(this.name, this.descriptor, this.bootstrapMethod, Arrays.toString(this.bootstrapMethodArguments));
    }
}
