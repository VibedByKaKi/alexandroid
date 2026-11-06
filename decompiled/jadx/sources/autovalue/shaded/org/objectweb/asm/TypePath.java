package autovalue.shaded.org.objectweb.asm;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    public TypePath(byte[] bArr, int i) {
        this.typePathContainer = bArr;
        this.typePathOffset = i;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '[') {
                byteVector.put11(0, 0);
            } else if (charAt == '.') {
                byteVector.put11(1, 0);
            } else if (charAt == '*') {
                byteVector.put11(2, 0);
            } else {
                if (charAt < '0' || charAt > '9') {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                int i3 = charAt - '0';
                while (i2 < length) {
                    int i4 = i2 + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        i3 = ((i3 * 10) + charAt2) - 48;
                        i2 = i4;
                    } else {
                        if (charAt2 != ';') {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        i2 = i4;
                        byteVector.put11(3, i3);
                    }
                }
                byteVector.put11(3, i3);
            }
            i = i2;
        }
        byte[] bArr = byteVector.data;
        bArr[0] = (byte) (byteVector.length / 2);
        return new TypePath(bArr, 0);
    }

    public static void put(TypePath typePath, ByteVector byteVector) {
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.typePathContainer;
        int i = typePath.typePathOffset;
        byteVector.putByteArray(bArr, i, (bArr[i] * 2) + 1);
    }

    public int getLength() {
        return this.typePathContainer[this.typePathOffset];
    }

    public int getStep(int i) {
        return this.typePathContainer[BitVector$$ExternalSyntheticOutline0.m(i, 2, this.typePathOffset, 1)];
    }

    public int getStepArgument(int i) {
        return this.typePathContainer[BitVector$$ExternalSyntheticOutline0.m(i, 2, this.typePathOffset, 2)];
    }

    public String toString() {
        int length = getLength();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            int step = getStep(i);
            if (step == 0) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            } else if (step == 1) {
                sb.append('.');
            } else if (step == 2) {
                sb.append('*');
            } else {
                if (step != 3) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2();
                    return null;
                }
                sb.append(getStepArgument(i));
                sb.append(';');
            }
        }
        return sb.toString();
    }
}
