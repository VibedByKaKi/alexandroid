package org.objectweb.asm;

import com.amazon.deecomms.common.Constants;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class ByteVector {

    /* renamed from: a, reason: collision with root package name */
    byte[] f1175a;
    int b;

    public ByteVector() {
        this.f1175a = new byte[64];
    }

    public ByteVector a(int i, int i2) {
        int i3 = this.b;
        if (i3 + 2 > this.f1175a.length) {
            a(2);
        }
        byte[] bArr = this.f1175a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.b = i3 + 2;
        return this;
    }

    public ByteVector b(int i, int i2) {
        int i3 = this.b;
        if (i3 + 3 > this.f1175a.length) {
            a(3);
        }
        byte[] bArr = this.f1175a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.b = i3 + 3;
        return this;
    }

    public ByteVector encodeUTF8(String str, int i, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            i4 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            i3++;
        }
        if (i4 > i2) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i5 = this.b;
        int i6 = i5 - i;
        int i7 = i6 - 2;
        if (i7 >= 0) {
            byte[] bArr = this.f1175a;
            bArr[i7] = (byte) (i4 >>> 8);
            bArr[i6 - 1] = (byte) i4;
        }
        if ((i5 + i4) - i > this.f1175a.length) {
            a(i4 - i);
        }
        int i8 = this.b;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 1 || charAt2 > 127) {
                byte[] bArr2 = this.f1175a;
                int i9 = i8 + 1;
                if (charAt2 > 2047) {
                    bArr2[i8] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i10 = i8 + 2;
                    bArr2[i9] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i8 += 3;
                    bArr2[i10] = (byte) ((charAt2 & Constants.DEFAULT_IMAGE_CHAR) | 128);
                } else {
                    bArr2[i8] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i8 += 2;
                    bArr2[i9] = (byte) ((charAt2 & Constants.DEFAULT_IMAGE_CHAR) | 128);
                }
            } else {
                this.f1175a[i8] = (byte) charAt2;
                i8++;
            }
            i++;
        }
        this.b = i8;
        return this;
    }

    public ByteVector putByte(int i) {
        int i2 = this.b;
        int i3 = i2 + 1;
        if (i3 > this.f1175a.length) {
            a(1);
        }
        this.f1175a[i2] = (byte) i;
        this.b = i3;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i, int i2) {
        if (this.b + i2 > this.f1175a.length) {
            a(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f1175a, this.b, i2);
        }
        this.b += i2;
        return this;
    }

    public ByteVector putInt(int i) {
        int i2 = this.b;
        if (i2 + 4 > this.f1175a.length) {
            a(4);
        }
        byte[] bArr = this.f1175a;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.b = i2 + 4;
        return this;
    }

    public ByteVector putLong(long j) {
        int i = this.b;
        if (i + 8 > this.f1175a.length) {
            a(8);
        }
        byte[] bArr = this.f1175a;
        int i2 = (int) (j >>> 32);
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
        int i3 = (int) j;
        bArr[i + 4] = (byte) (i3 >>> 24);
        bArr[i + 5] = (byte) (i3 >>> 16);
        bArr[i + 6] = (byte) (i3 >>> 8);
        bArr[i + 7] = (byte) i3;
        this.b = i + 8;
        return this;
    }

    public ByteVector putShort(int i) {
        int i2 = this.b;
        if (i2 + 2 > this.f1175a.length) {
            a(2);
        }
        byte[] bArr = this.f1175a;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.b = i2 + 2;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.b;
        if (i + 2 + length > this.f1175a.length) {
            a(length + 2);
        }
        byte[] bArr = this.f1175a;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i + 2;
        bArr[i2] = (byte) length;
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt < 1 || charAt > 127) {
                this.b = i3;
                return encodeUTF8(str, i4, 65535);
            }
            bArr[i3] = (byte) charAt;
            i4++;
            i3++;
        }
        this.b = i3;
        return this;
    }

    public ByteVector(int i) {
        this.f1175a = new byte[i];
    }

    private void a(int i) {
        byte[] bArr = this.f1175a;
        int length = bArr.length * 2;
        int i2 = this.b;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f1175a = bArr2;
    }
}
