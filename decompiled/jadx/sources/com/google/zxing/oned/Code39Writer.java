package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Collections;
import kotlin.text.Typography;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void toIntArray(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    private static String tryToConvertToExtendedMode(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb.append("%V");
                    } else if (charAt == '`') {
                        sb.append("%W");
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb.append('$');
                            sb.append((char) (charAt + '@'));
                        } else if (charAt < ' ') {
                            sb.append('%');
                            sb.append((char) (charAt + Typography.amp));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            sb.append((char) (charAt + ' '));
                        } else if (charAt <= '9') {
                            sb.append(charAt);
                        } else if (charAt <= '?') {
                            sb.append('%');
                            sb.append((char) (charAt + 11));
                        } else if (charAt <= 'Z') {
                            sb.append(charAt);
                        } else if (charAt <= '_') {
                            sb.append('%');
                            sb.append((char) (charAt - 16));
                        } else if (charAt <= 'z') {
                            sb.append(SignatureVisitor.EXTENDS);
                            sb.append((char) (charAt - ' '));
                        } else {
                            if (charAt > 127) {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                            }
                            sb.append('%');
                            sb.append((char) (charAt - '+'));
                        }
                    }
                }
                sb.append(charAt);
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 80) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(length, "Requested contents should be less than 80 digits long, but got "));
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = tryToConvertToExtendedMode(str);
                length = str.length();
                if (length > 80) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                    return null;
                }
            } else {
                i++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        toIntArray(148, iArr);
        int appendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int appendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, appendPattern, iArr2, false) + appendPattern;
        for (int i2 = 0; i2 < length; i2++) {
            toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2))], iArr);
            int appendPattern3 = OneDimensionalCodeWriter.appendPattern(zArr, appendPattern2, iArr, true) + appendPattern2;
            appendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, appendPattern3, iArr2, false) + appendPattern3;
        }
        toIntArray(148, iArr);
        OneDimensionalCodeWriter.appendPattern(zArr, appendPattern2, iArr, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}
