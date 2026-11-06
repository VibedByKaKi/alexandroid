package com.upokecenter.cbor;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import okio.Utf8;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class Base64 {
    private static final String Base64Classic = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final String Base64URL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    private Base64() {
    }

    private static void WriteBase64(StringOutput stringOutput, byte[] bArr, int i, int i2, boolean z, boolean z2) throws IOException {
        int i3 = i;
        if (stringOutput == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("writer");
            return;
        }
        if (i3 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i3, "offset(", ") is less than 0 "));
            return;
        }
        if (i3 > bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(bArr.length, a$$ExternalSyntheticOutline0.m0m(i3, "offset(", ") is more than "));
            return;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "count(", ") is less than 0 "));
            return;
        }
        if (i2 > bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(bArr.length, a$$ExternalSyntheticOutline0.m0m(i2, "count(", ") is more than "));
            return;
        }
        if (bArr.length - i3 < i2) {
            CodecsKt$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m0m(i3, "data's length minus ", MarkdownConstants.LEFT_PARENTHESIS), bArr.length - i3, ") is less than ", i2);
            return;
        }
        String str = z ? Base64Classic : Base64URL;
        int i4 = i3 + i2;
        byte[] bArr2 = new byte[32];
        int i5 = 0;
        while (i3 < i4 - 2) {
            if (i5 >= 32) {
                stringOutput.WriteAscii(bArr2, 0, i5);
                i5 = 0;
            }
            bArr2[i5] = (byte) str.charAt((bArr[i3] >> 2) & 63);
            int i6 = i3 + 1;
            bArr2[i5 + 1] = (byte) str.charAt(((bArr[i3] & 3) << 4) + ((bArr[i6] >> 4) & 15));
            int i7 = i5 + 3;
            int i8 = i3 + 2;
            bArr2[i5 + 2] = (byte) str.charAt(((bArr[i6] & 15) << 2) + ((bArr[i8] >> 6) & 3));
            i5 += 4;
            bArr2[i7] = (byte) str.charAt(bArr[i8] & Utf8.REPLACEMENT_BYTE);
            i3 += 3;
        }
        int i9 = i2 % 3;
        if (i9 != 0) {
            if (i5 >= 32) {
                stringOutput.WriteAscii(bArr2, 0, i5);
                i5 = 0;
            }
            int i10 = i4 - i9;
            int i11 = i5 + 1;
            bArr2[i5] = (byte) str.charAt((bArr[i10] >> 2) & 63);
            if (i9 == 2) {
                int i12 = (bArr[i10] & 3) << 4;
                int i13 = i10 + 1;
                bArr2[i11] = (byte) str.charAt(i12 + ((bArr[i13] >> 4) & 15));
                int i14 = i5 + 3;
                bArr2[i5 + 2] = (byte) str.charAt((bArr[i13] & 15) << 2);
                if (z2) {
                    i5 += 4;
                    bArr2[i14] = 61;
                } else {
                    i5 = i14;
                }
            } else {
                int i15 = i5 + 2;
                bArr2[i11] = (byte) str.charAt((bArr[i10] & 3) << 4);
                if (z2) {
                    int i16 = i5 + 3;
                    bArr2[i15] = 61;
                    i5 += 4;
                    bArr2[i16] = 61;
                } else {
                    i5 = i15;
                }
            }
        }
        if (i5 >= 0) {
            stringOutput.WriteAscii(bArr2, 0, i5);
        }
    }

    public static void WriteBase64URL(StringOutput stringOutput, byte[] bArr, int i, int i2, boolean z) throws IOException {
        WriteBase64(stringOutput, bArr, i, i2, false, z);
    }

    public static void WriteBase64(StringOutput stringOutput, byte[] bArr, int i, int i2, boolean z) throws IOException {
        WriteBase64(stringOutput, bArr, i, i2, true, z);
    }
}
