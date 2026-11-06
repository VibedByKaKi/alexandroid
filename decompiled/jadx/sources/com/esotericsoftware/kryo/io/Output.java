package com.esotericsoftware.kryo.io;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.esotericsoftware.kryo.KryoException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Output extends OutputStream {
    protected byte[] buffer;
    protected int capacity;
    protected int maxCapacity;
    protected OutputStream outputStream;
    protected int position;
    protected long total;

    public Output(int i, int i2) {
        if (i2 < -1) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "maxBufferSize cannot be < -1: "));
            throw null;
        }
        this.capacity = i;
        this.maxCapacity = i2 == -1 ? Integer.MAX_VALUE : i2;
        this.buffer = new byte[i];
    }

    public static int intLength(int i, boolean z) {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        if ((i >>> 7) == 0) {
            return 1;
        }
        if ((i >>> 14) == 0) {
            return 2;
        }
        if ((i >>> 21) == 0) {
            return 3;
        }
        return (i >>> 28) == 0 ? 4 : 5;
    }

    public static int longLength(long j, boolean z) {
        if (!z) {
            j = (j >> 63) ^ (j << 1);
        }
        if ((j >>> 7) == 0) {
            return 1;
        }
        if ((j >>> 14) == 0) {
            return 2;
        }
        if ((j >>> 21) == 0) {
            return 3;
        }
        if ((j >>> 28) == 0) {
            return 4;
        }
        if ((j >>> 35) == 0) {
            return 5;
        }
        if ((j >>> 42) == 0) {
            return 6;
        }
        if ((j >>> 49) == 0) {
            return 7;
        }
        return (j >>> 56) == 0 ? 8 : 9;
    }

    private void writeAscii_slow(String str, int i) throws KryoException {
        byte[] bArr = this.buffer;
        int min = Math.min(i, this.capacity - this.position);
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + min;
            str.getBytes(i2, i3, bArr, this.position);
            this.position += min;
            min = Math.min(i - i3, this.capacity);
            if (require(min)) {
                bArr = this.buffer;
            }
            i2 = i3;
        }
    }

    private void writeString_slow(CharSequence charSequence, int i, int i2) {
        while (i2 < i) {
            int i3 = this.position;
            int i4 = this.capacity;
            if (i3 == i4) {
                require(Math.min(i4, i - i2));
            }
            char charAt = charSequence.charAt(i2);
            if (charAt <= 127) {
                byte[] bArr = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr[i5] = (byte) charAt;
            } else {
                byte[] bArr2 = this.buffer;
                if (charAt > 2047) {
                    int i6 = this.position;
                    this.position = i6 + 1;
                    bArr2[i6] = (byte) (((charAt >> '\f') & 15) | 224);
                    require(2);
                    byte[] bArr3 = this.buffer;
                    int i7 = this.position;
                    int i8 = i7 + 1;
                    this.position = i8;
                    bArr3[i7] = (byte) (((charAt >> 6) & 63) | 128);
                    this.position = i7 + 2;
                    bArr3[i8] = (byte) ((charAt & Constants.DEFAULT_IMAGE_CHAR) | 128);
                } else {
                    int i9 = this.position;
                    this.position = i9 + 1;
                    bArr2[i9] = (byte) (((charAt >> 6) & 31) | 192);
                    require(1);
                    byte[] bArr4 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr4[i10] = (byte) ((charAt & Constants.DEFAULT_IMAGE_CHAR) | 128);
                }
            }
            i2++;
        }
    }

    private void writeUtf8Length(int i) {
        int i2 = i >>> 6;
        if (i2 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr[i3] = (byte) (i | 128);
            return;
        }
        int i4 = i >>> 13;
        if (i4 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i5 = this.position;
            int i6 = i5 + 1;
            this.position = i6;
            bArr2[i5] = (byte) (i | 192);
            this.position = i5 + 2;
            bArr2[i6] = (byte) i2;
            return;
        }
        int i7 = i >>> 20;
        if (i7 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i8 = this.position;
            int i9 = i8 + 1;
            this.position = i9;
            bArr3[i8] = (byte) (i | 192);
            int i10 = i8 + 2;
            this.position = i10;
            bArr3[i9] = (byte) (i2 | 128);
            this.position = i8 + 3;
            bArr3[i10] = (byte) i4;
            return;
        }
        int i11 = i >>> 27;
        if (i11 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            bArr4[i12] = (byte) (i | 192);
            int i14 = i12 + 2;
            this.position = i14;
            bArr4[i13] = (byte) (i2 | 128);
            int i15 = i12 + 3;
            this.position = i15;
            bArr4[i14] = (byte) (i4 | 128);
            this.position = i12 + 4;
            bArr4[i15] = (byte) i7;
            return;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i16 = this.position;
        int i17 = i16 + 1;
        this.position = i17;
        bArr5[i16] = (byte) (i | 192);
        int i18 = i16 + 2;
        this.position = i18;
        bArr5[i17] = (byte) (i2 | 128);
        int i19 = i16 + 3;
        this.position = i19;
        bArr5[i18] = (byte) (i4 | 128);
        int i20 = i16 + 4;
        this.position = i20;
        bArr5[i19] = (byte) (i7 | 128);
        this.position = i16 + 5;
        bArr5[i20] = (byte) i11;
    }

    public void clear() {
        this.position = 0;
        this.total = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        flush();
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.write(this.buffer, 0, this.position);
            this.total += this.position;
            this.position = 0;
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public int position() {
        return this.position;
    }

    public boolean require(int i) throws KryoException {
        if (this.capacity - this.position >= i) {
            return false;
        }
        if (i > this.maxCapacity) {
            throw new KryoException(ParcelCompat$$ExternalSyntheticOutline0.m(", required: ", this.maxCapacity, i, new StringBuilder("Buffer overflow. Max capacity: ")));
        }
        flush();
        while (true) {
            int i2 = this.capacity;
            if (i2 - this.position >= i) {
                return true;
            }
            int i3 = this.maxCapacity;
            if (i2 == i3) {
                throw new KryoException("Buffer overflow. Available: " + (this.capacity - this.position) + ", required: " + i);
            }
            if (i2 == 0) {
                this.capacity = 1;
            }
            int min = Math.min(this.capacity * 2, i3);
            this.capacity = min;
            if (min < 0) {
                this.capacity = this.maxCapacity;
            }
            byte[] bArr = new byte[this.capacity];
            System.arraycopy(this.buffer, 0, bArr, 0, this.position);
            this.buffer = bArr;
        }
    }

    public void setBuffer(byte[] bArr, int i) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("buffer cannot be null.");
            return;
        }
        if (i < -1) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "maxBufferSize cannot be < -1: "));
            return;
        }
        this.buffer = bArr;
        if (i == -1) {
            i = Integer.MAX_VALUE;
        }
        this.maxCapacity = i;
        this.capacity = bArr.length;
        this.position = 0;
        this.total = 0L;
        this.outputStream = null;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.position = 0;
        this.total = 0L;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public byte[] toBytes() {
        int i = this.position;
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, 0, bArr, 0, i);
        return bArr;
    }

    public long total() {
        return this.total + this.position;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        if (length == 1) {
            writeByte(130);
            writeByte(str.charAt(0));
            return;
        }
        int i = this.capacity;
        int i2 = this.position;
        if (i - i2 < length) {
            writeAscii_slow(str, length);
        } else {
            str.getBytes(0, length, this.buffer, i2);
            this.position += length;
        }
        byte[] bArr = this.buffer;
        int i3 = this.position - 1;
        bArr[i3] = (byte) (128 | bArr[i3]);
    }

    public void writeBoolean(boolean z) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = z ? (byte) 1 : (byte) 0;
    }

    public void writeByte(int i) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeBytes(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return;
        }
        int min = Math.min(this.capacity - this.position, i2);
        while (true) {
            System.arraycopy(bArr, i, this.buffer, this.position, min);
            this.position += min;
            i2 -= min;
            if (i2 == 0) {
                return;
            }
            i += min;
            min = Math.min(this.capacity, i2);
            require(min);
        }
    }

    public void writeChar(char c) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        bArr[i] = (byte) (c >>> '\b');
        this.position = i + 2;
        bArr[i2] = (byte) c;
    }

    public void writeChars(char[] cArr) throws KryoException {
        for (char c : cArr) {
            writeChar(c);
        }
    }

    public void writeDouble(double d) throws KryoException {
        writeLong(Double.doubleToLongBits(d));
    }

    public void writeDoubles(double[] dArr) throws KryoException {
        for (double d : dArr) {
            writeDouble(d);
        }
    }

    public void writeFloat(float f) throws KryoException {
        writeInt(Float.floatToIntBits(f));
    }

    public void writeFloats(float[] fArr) throws KryoException {
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    public void writeInt(int i) throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i2 + 2;
        this.position = i4;
        bArr[i3] = (byte) (i >> 16);
        int i5 = i2 + 3;
        this.position = i5;
        bArr[i4] = (byte) (i >> 8);
        this.position = i2 + 4;
        bArr[i5] = (byte) i;
    }

    public void writeInts(int[] iArr, boolean z) throws KryoException {
        for (int i : iArr) {
            writeInt(i, z);
        }
    }

    public void writeLong(long j) throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        bArr[i] = (byte) (j >>> 56);
        int i3 = i + 2;
        this.position = i3;
        bArr[i2] = (byte) (j >>> 48);
        int i4 = i + 3;
        this.position = i4;
        bArr[i3] = (byte) (j >>> 40);
        int i5 = i + 4;
        this.position = i5;
        bArr[i4] = (byte) (j >>> 32);
        int i6 = i + 5;
        this.position = i6;
        bArr[i5] = (byte) (j >>> 24);
        int i7 = i + 6;
        this.position = i7;
        bArr[i6] = (byte) (j >>> 16);
        int i8 = i + 7;
        this.position = i8;
        bArr[i7] = (byte) (j >>> 8);
        this.position = i + 8;
        bArr[i8] = (byte) j;
    }

    public void writeLongs(long[] jArr, boolean z) throws KryoException {
        for (long j : jArr) {
            writeLong(j, z);
        }
    }

    public void writeShort(int i) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr[i2] = (byte) (i >>> 8);
        this.position = i2 + 2;
        bArr[i3] = (byte) i;
    }

    public void writeShorts(short[] sArr) throws KryoException {
        for (short s : sArr) {
            writeShort(s);
        }
    }

    public void writeString(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        int i = 0;
        if (length > 1 && length < 64) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) <= 127) {
                }
            }
            int i3 = this.capacity;
            int i4 = this.position;
            if (i3 - i4 < length) {
                writeAscii_slow(str, length);
            } else {
                str.getBytes(0, length, this.buffer, i4);
                this.position += length;
            }
            byte[] bArr = this.buffer;
            int i5 = this.position - 1;
            bArr[i5] = (byte) (128 | bArr[i5]);
            return;
        }
        writeUtf8Length(length + 1);
        int i6 = this.capacity;
        int i7 = this.position;
        if (i6 - i7 >= length) {
            byte[] bArr2 = this.buffer;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt > 127) {
                    break;
                }
                bArr2[i7] = (byte) charAt;
                i++;
                i7++;
            }
            this.position = i7;
        }
        if (i < length) {
            writeString_slow(str, length, i);
        }
    }

    public int writeVarInt(int i, boolean z) throws KryoException {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = i >>> 7;
        if (i2 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr[i3] = (byte) i;
            return 1;
        }
        int i4 = i >>> 14;
        if (i4 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i5 = this.position;
            int i6 = i5 + 1;
            this.position = i6;
            bArr2[i5] = (byte) ((i & 127) | 128);
            this.position = i5 + 2;
            bArr2[i6] = (byte) i2;
            return 2;
        }
        int i7 = i >>> 21;
        if (i7 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i8 = this.position;
            int i9 = i8 + 1;
            this.position = i9;
            bArr3[i8] = (byte) ((i & 127) | 128);
            int i10 = i8 + 2;
            this.position = i10;
            bArr3[i9] = (byte) (i2 | 128);
            this.position = i8 + 3;
            bArr3[i10] = (byte) i4;
            return 3;
        }
        int i11 = i >>> 28;
        if (i11 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            bArr4[i12] = (byte) ((i & 127) | 128);
            int i14 = i12 + 2;
            this.position = i14;
            bArr4[i13] = (byte) (i2 | 128);
            int i15 = i12 + 3;
            this.position = i15;
            bArr4[i14] = (byte) (i4 | 128);
            this.position = i12 + 4;
            bArr4[i15] = (byte) i7;
            return 4;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i16 = this.position;
        int i17 = i16 + 1;
        this.position = i17;
        bArr5[i16] = (byte) ((i & 127) | 128);
        int i18 = i16 + 2;
        this.position = i18;
        bArr5[i17] = (byte) (i2 | 128);
        int i19 = i16 + 3;
        this.position = i19;
        bArr5[i18] = (byte) (i4 | 128);
        int i20 = i16 + 4;
        this.position = i20;
        bArr5[i19] = (byte) (i7 | 128);
        this.position = i16 + 5;
        bArr5[i20] = (byte) i11;
        return 5;
    }

    public int writeVarLong(long j, boolean z) throws KryoException {
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) j2;
            return 1;
        }
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            int i3 = i2 + 1;
            this.position = i3;
            bArr2[i2] = (byte) ((j2 & 127) | 128);
            this.position = i2 + 2;
            bArr2[i3] = (byte) j3;
            return 2;
        }
        long j5 = j2 >>> 21;
        if (j5 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i4 = this.position;
            int i5 = i4 + 1;
            this.position = i5;
            bArr3[i4] = (byte) ((j2 & 127) | 128);
            int i6 = i4 + 2;
            this.position = i6;
            bArr3[i5] = (byte) (j3 | 128);
            this.position = i4 + 3;
            bArr3[i6] = (byte) j4;
            return 3;
        }
        long j6 = j2 >>> 28;
        if (j6 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            int i8 = i7 + 1;
            this.position = i8;
            bArr4[i7] = (byte) ((j2 & 127) | 128);
            int i9 = i7 + 2;
            this.position = i9;
            bArr4[i8] = (byte) (j3 | 128);
            int i10 = i7 + 3;
            this.position = i10;
            bArr4[i9] = (byte) (j4 | 128);
            this.position = i7 + 4;
            bArr4[i10] = (byte) j5;
            return 4;
        }
        long j7 = j2 >>> 35;
        if (j7 == 0) {
            require(5);
            byte[] bArr5 = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            this.position = i12;
            bArr5[i11] = (byte) ((j2 & 127) | 128);
            int i13 = i11 + 2;
            this.position = i13;
            bArr5[i12] = (byte) (j3 | 128);
            int i14 = i11 + 3;
            this.position = i14;
            bArr5[i13] = (byte) (j4 | 128);
            int i15 = i11 + 4;
            this.position = i15;
            bArr5[i14] = (byte) (j5 | 128);
            this.position = i11 + 5;
            bArr5[i15] = (byte) j6;
            return 5;
        }
        long j8 = j2 >>> 42;
        if (j8 == 0) {
            require(6);
            byte[] bArr6 = this.buffer;
            int i16 = this.position;
            int i17 = i16 + 1;
            this.position = i17;
            bArr6[i16] = (byte) ((j2 & 127) | 128);
            int i18 = i16 + 2;
            this.position = i18;
            bArr6[i17] = (byte) (j3 | 128);
            int i19 = i16 + 3;
            this.position = i19;
            bArr6[i18] = (byte) (j4 | 128);
            int i20 = i16 + 4;
            this.position = i20;
            bArr6[i19] = (byte) (j5 | 128);
            int i21 = i16 + 5;
            this.position = i21;
            bArr6[i20] = (byte) (j6 | 128);
            this.position = i16 + 6;
            bArr6[i21] = (byte) j7;
            return 6;
        }
        long j9 = j2;
        long j10 = j9 >>> 49;
        if (j10 == 0) {
            require(7);
            byte[] bArr7 = this.buffer;
            int i22 = this.position;
            int i23 = i22 + 1;
            this.position = i23;
            bArr7[i22] = (byte) ((j9 & 127) | 128);
            int i24 = i22 + 2;
            this.position = i24;
            bArr7[i23] = (byte) (j3 | 128);
            int i25 = i22 + 3;
            this.position = i25;
            bArr7[i24] = (byte) (j4 | 128);
            int i26 = i22 + 4;
            this.position = i26;
            bArr7[i25] = (byte) (j5 | 128);
            int i27 = i22 + 5;
            this.position = i27;
            bArr7[i26] = (byte) (j6 | 128);
            int i28 = i22 + 6;
            this.position = i28;
            bArr7[i27] = (byte) (j7 | 128);
            this.position = i22 + 7;
            bArr7[i28] = (byte) j8;
            return 7;
        }
        long j11 = j9 >>> 56;
        if (j11 == 0) {
            require(8);
            byte[] bArr8 = this.buffer;
            int i29 = this.position;
            int i30 = i29 + 1;
            this.position = i30;
            bArr8[i29] = (byte) ((j9 & 127) | 128);
            int i31 = i29 + 2;
            this.position = i31;
            bArr8[i30] = (byte) (j3 | 128);
            int i32 = i29 + 3;
            this.position = i32;
            bArr8[i31] = (byte) (j4 | 128);
            int i33 = i29 + 4;
            this.position = i33;
            bArr8[i32] = (byte) (j5 | 128);
            int i34 = i29 + 5;
            this.position = i34;
            bArr8[i33] = (byte) (j6 | 128);
            int i35 = i29 + 6;
            this.position = i35;
            bArr8[i34] = (byte) (j7 | 128);
            int i36 = i29 + 7;
            this.position = i36;
            bArr8[i35] = (byte) (j8 | 128);
            this.position = i29 + 8;
            bArr8[i36] = (byte) j10;
            return 8;
        }
        require(9);
        byte[] bArr9 = this.buffer;
        int i37 = this.position;
        int i38 = i37 + 1;
        this.position = i38;
        bArr9[i37] = (byte) ((j9 & 127) | 128);
        int i39 = i37 + 2;
        this.position = i39;
        bArr9[i38] = (byte) (j3 | 128);
        int i40 = i37 + 3;
        this.position = i40;
        bArr9[i39] = (byte) (j4 | 128);
        int i41 = i37 + 4;
        this.position = i41;
        bArr9[i40] = (byte) (j5 | 128);
        int i42 = i37 + 5;
        this.position = i42;
        bArr9[i41] = (byte) (j6 | 128);
        int i43 = i37 + 6;
        this.position = i43;
        bArr9[i42] = (byte) (j7 | 128);
        int i44 = i37 + 7;
        this.position = i44;
        bArr9[i43] = (byte) (j8 | 128);
        int i45 = i37 + 8;
        this.position = i45;
        bArr9[i44] = (byte) (j10 | 128);
        this.position = i37 + 9;
        bArr9[i45] = (byte) j11;
        return 9;
    }

    public int writeDouble(double d, double d2, boolean z) throws KryoException {
        return writeLong((long) (d * d2), z);
    }

    public int writeFloat(float f, float f2, boolean z) throws KryoException {
        return writeInt((int) (f * f2), z);
    }

    public void writeInts(int[] iArr) throws KryoException {
        for (int i : iArr) {
            writeInt(i);
        }
    }

    public void writeLongs(long[] jArr) throws KryoException {
        for (long j : jArr) {
            writeLong(j);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
        }
    }

    public void writeByte(byte b) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws KryoException {
        writeBytes(bArr, i, i2);
    }

    public Output(int i) {
        this(i, i);
    }

    public Output() {
    }

    public Output(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public Output(byte[] bArr, int i) {
        if (bArr != null) {
            setBuffer(bArr, i);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("buffer cannot be null.");
            throw null;
        }
    }

    public Output(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("outputStream cannot be null.");
            throw null;
        }
    }

    public Output(OutputStream outputStream, int i) {
        this(i, i);
        if (outputStream != null) {
            this.outputStream = outputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("outputStream cannot be null.");
            throw null;
        }
    }

    public int writeInt(int i, boolean z) throws KryoException {
        return writeVarInt(i, z);
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, bArr.length);
    }

    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
        }
    }

    public int writeLong(long j, boolean z) throws KryoException {
        return writeVarLong(j, z);
    }

    public void writeString(CharSequence charSequence) throws KryoException {
        if (charSequence == null) {
            writeByte(128);
            return;
        }
        int length = charSequence.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        writeUtf8Length(length + 1);
        int i = this.capacity;
        int i2 = this.position;
        int i3 = 0;
        if (i - i2 >= length) {
            byte[] bArr = this.buffer;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt > 127) {
                    break;
                }
                bArr[i2] = (byte) charAt;
                i3++;
                i2++;
            }
            this.position = i2;
        }
        if (i3 < length) {
            writeString_slow(charSequence, length, i3);
        }
    }
}
