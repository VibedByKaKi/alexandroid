package org.apache.commons.fileupload.util.mime;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class QuotedPrintableDecoder {
    private static final int UPPER_NIBBLE_SHIFT = 4;

    private QuotedPrintableDecoder() {
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            int i4 = bArr[i];
            if (i4 == 95) {
                outputStream.write(32);
            } else if (i4 == 61) {
                int i5 = i + 2;
                if (i5 >= length) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid quoted printable encoding; truncated escape sequence");
                    return 0;
                }
                byte b = bArr[i3];
                i += 3;
                byte b2 = bArr[i5];
                if (b != 13) {
                    outputStream.write((hexToBinary(b) << 4) | hexToBinary(b2));
                    i2++;
                } else if (b2 != 10) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid quoted printable encoding; CR must be followed by LF");
                    return 0;
                }
            } else {
                outputStream.write(i4);
                i2++;
            }
            i = i3;
        }
        return i2;
    }

    private static int hexToBinary(byte b) throws IOException {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(b, "Invalid quoted printable encoding: not a valid hex digit: "));
        return 0;
    }
}
