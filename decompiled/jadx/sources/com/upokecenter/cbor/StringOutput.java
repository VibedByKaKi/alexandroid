package com.upokecenter.cbor;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.upokecenter.util.DataUtilities;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class StringOutput {
    private final StringBuilder builder;
    private final OutputStream outputStream;

    public StringOutput(StringBuilder sb) {
        this.builder = sb;
        this.outputStream = null;
    }

    public void WriteAscii(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bytes");
            return;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "\"index\" (", ") is not greater or equal to 0"));
            return;
        }
        if (i > bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(bArr.length, a$$ExternalSyntheticOutline0.m0m(i, "\"index\" (", ") is not less or equal to "));
            return;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, " (", ") is not greater or equal to 0"));
            return;
        }
        if (i2 > bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m(bArr.length, a$$ExternalSyntheticOutline0.m0m(i2, " (", ") is not less or equal to "));
            return;
        }
        if (bArr.length - i < i2) {
            Gson$$ExternalSyntheticBUOutline0.m(") is not greater or equal to ", bArr.length - i, i2, "\"bytes\" + \"'s length minus \" + index (");
            return;
        }
        if (this.outputStream == null) {
            DataUtilities.ReadUtf8FromBytes(bArr, i, i2, this.builder, false);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3 + i];
            if ((b & Byte.MAX_VALUE) != b) {
                Single$$ExternalSyntheticBUOutline0.m$3("str is non-ASCII");
                return;
            }
        }
        this.outputStream.write(bArr, i, i2);
    }

    public void WriteCodePoint(int i) throws IOException {
        if ((i >> 7) == 0) {
            OutputStream outputStream = this.outputStream;
            if (outputStream == null) {
                this.builder.append((char) i);
                return;
            } else {
                outputStream.write((byte) i);
                return;
            }
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "codePoint(", ") is less than 0"));
            return;
        }
        if (i > 1114111) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "codePoint(", ") is more than 1114111"));
            return;
        }
        OutputStream outputStream2 = this.outputStream;
        if (outputStream2 == null) {
            if ((16775168 & i) == 55296) {
                Single$$ExternalSyntheticBUOutline0.m$3("ch is a surrogate");
                return;
            }
            if (i <= 65535) {
                this.builder.append((char) i);
                return;
            } else {
                if (i <= 1114111) {
                    int i2 = i - 65536;
                    this.builder.append((char) (((i2 >> 10) & 1023) | 55296));
                    this.builder.append((char) ((i2 & 1023) | 56320));
                    return;
                }
                return;
            }
        }
        if (i < 128) {
            outputStream2.write((byte) i);
            return;
        }
        if (i <= 2047) {
            outputStream2.write((byte) (((i >> 6) & 31) | 192));
            this.outputStream.write((byte) ((i & 63) | 128));
            return;
        }
        if (i > 65535) {
            outputStream2.write((byte) (((i >> 18) & 7) | 240));
            this.outputStream.write((byte) (((i >> 12) & 63) | 128));
            this.outputStream.write((byte) (((i >> 6) & 63) | 128));
            this.outputStream.write((byte) ((i & 63) | 128));
            return;
        }
        if ((63488 & i) == 55296) {
            Single$$ExternalSyntheticBUOutline0.m$3("ch is a surrogate");
            return;
        }
        outputStream2.write((byte) (((i >> 12) & 15) | 224));
        this.outputStream.write((byte) (((i >> 6) & 63) | 128));
        this.outputStream.write((byte) ((i & 63) | 128));
    }

    public void WriteString(String str) throws IOException {
        if (this.outputStream == null) {
            this.builder.append(str);
        } else if (str.length() == 1) {
            WriteCodePoint(str.charAt(0));
        } else {
            if (DataUtilities.WriteUtf8(str, 0, str.length(), this.outputStream, false) >= 0) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("str has an unpaired surrogate");
        }
    }

    public StringOutput(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.builder = null;
    }

    public void WriteString(String str, int i, int i2) throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            this.builder.append((CharSequence) str, i, i2 + i);
        } else if (i2 == 1) {
            WriteCodePoint(str.charAt(i));
        } else {
            if (DataUtilities.WriteUtf8(str, i, i2, outputStream, false) >= 0) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("str has an unpaired surrogate");
        }
    }
}
