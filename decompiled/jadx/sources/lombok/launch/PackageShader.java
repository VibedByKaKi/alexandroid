package lombok.launch;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class PackageShader {
    private static final byte CONSTANTPOOLTYPE_UTF8 = 1;
    private final byte[][] froms;
    private final byte[][] tos;

    public PackageShader(String... strArr) {
        if (strArr.length % 2 != 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Provide pairs: real package name to shaded package name (you provided an odd number of strings; even number required)");
            throw null;
        }
        Charset forName = Charset.forName("US-ASCII");
        int length = strArr.length / 2;
        this.froms = new byte[length][];
        this.tos = new byte[length][];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            String str = strArr[i2];
            String str2 = strArr[i2 | 1];
            if (str.contains(".") || str2.contains(".")) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Binary name prefixes are required (use slashes and dollars instead of dots to separate type name elements); they look like e.g. 'java/util/'. Violating entry: ", str, " -> ", str2));
                throw null;
            }
            this.froms[i] = str.getBytes(forName);
            this.tos[i] = str2.getBytes(forName);
            if (this.froms[i].length != this.tos[i].length) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Pair [", str, " -> ", str2, "] is invalid: Both strings must be the same length"));
                throw null;
            }
        }
    }

    private static int readValue(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public boolean apply(byte[] bArr) {
        int i;
        int[] iArr = new int[260];
        int i2 = 1;
        int i3 = 0;
        boolean z = false;
        for (int i4 : new ClassFileMetaData(bArr).getOffsets((byte) 1)) {
            int readValue = readValue(bArr, i4);
            int i5 = i4 + 2;
            iArr[i3] = i5;
            int i6 = i5 + readValue;
            int i7 = i2;
            int i8 = i5;
            while (i8 < i6) {
                int i9 = i3;
                if (bArr[i8] == 76) {
                    iArr[i7] = i8 + 1;
                    i7++;
                }
                i8++;
                i3 = i9;
                i2 = 1;
            }
            int i10 = i3;
            while (i10 < this.froms.length) {
                boolean z2 = z;
                int i11 = i3;
                while (i11 < i7) {
                    int i12 = iArr[i11];
                    if (readValue - (i12 - i5) < this.froms[i10].length) {
                        i = i3;
                    } else {
                        int i13 = i3;
                        while (true) {
                            byte[] bArr2 = this.froms[i10];
                            if (i13 >= bArr2.length) {
                                byte[] bArr3 = this.tos[i10];
                                System.arraycopy(bArr3, 0, bArr, i12, bArr3.length);
                                i = 0;
                                z2 = true;
                                break;
                            }
                            i = 0;
                            if (bArr[i12 + i13] != bArr2[i13]) {
                                break;
                            }
                            i13++;
                        }
                    }
                    i11++;
                    i3 = i;
                    i2 = 1;
                }
                i10++;
                z = z2;
            }
        }
        return z;
    }

    public String reverseResourceName(String str) {
        int i = 0;
        while (true) {
            byte[][] bArr = this.tos;
            if (i >= bArr.length) {
                return str;
            }
            int length = bArr[i].length;
            if (str.length() >= length) {
                for (int i2 = 0; i2 < length; i2++) {
                    if (str.charAt(i2) != this.tos[i][i2]) {
                        break;
                    }
                }
                try {
                    byte[] bArr2 = this.froms[i];
                    return new String(bArr2, 0, bArr2.length, "US-ASCII") + str.substring(length);
                } catch (UnsupportedEncodingException unused) {
                    return str;
                }
            }
            i++;
        }
    }
}
