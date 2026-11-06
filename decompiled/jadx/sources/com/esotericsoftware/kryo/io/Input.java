package com.esotericsoftware.kryo.io;

import androidx.collection.SieveCacheKt;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.esotericsoftware.kryo.KryoException;
import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Input extends InputStream {
    protected byte[] buffer;
    protected int capacity;
    protected char[] chars;
    protected InputStream inputStream;
    protected int limit;
    protected int position;
    protected long total;

    public Input(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("inputStream cannot be null.");
            throw null;
        }
    }

    private int optional(int i) throws KryoException {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        int min = Math.min(i, this.capacity);
        byte[] bArr = this.buffer;
        int i3 = this.limit;
        int fill = fill(bArr, i3, this.capacity - i3);
        if (fill == -1) {
            if (i2 == 0) {
                return -1;
            }
            return Math.min(i2, min);
        }
        int i4 = i2 + fill;
        if (i4 >= min) {
            this.limit += fill;
            return min;
        }
        byte[] bArr2 = this.buffer;
        System.arraycopy(bArr2, this.position, bArr2, 0, i4);
        this.total += this.position;
        this.position = 0;
        do {
            int fill2 = fill(this.buffer, i4, this.capacity - i4);
            if (fill2 == -1) {
                break;
            }
            i4 += fill2;
        } while (i4 < min);
        this.limit = i4;
        if (i4 == 0) {
            return -1;
        }
        return Math.min(i4, min);
    }

    private String readAscii() {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i - 1;
        int i3 = this.limit;
        while (i != i3) {
            int i4 = i + 1;
            if ((bArr[i] & 128) != 0) {
                bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
                String str = new String(bArr, 0, i2, i4 - i2);
                bArr[i] = (byte) (bArr[i] | 128);
                this.position = i4;
                return str;
            }
            i = i4;
        }
        return readAscii_slow();
    }

    private String readAscii_slow() {
        int i = this.position - 1;
        this.position = i;
        int i2 = this.limit;
        int i3 = i2 - i;
        if (i3 > this.chars.length) {
            this.chars = new char[i3 * 2];
        }
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        int i4 = 0;
        while (i < i2) {
            cArr[i4] = (char) bArr[i];
            i++;
            i4++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            int i5 = this.position;
            this.position = i5 + 1;
            byte b = bArr[i5];
            if (i3 == cArr.length) {
                char[] cArr2 = new char[i3 * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i3);
                this.chars = cArr2;
                cArr = cArr2;
            }
            if ((b & 128) == 128) {
                cArr[i3] = (char) (b & Byte.MAX_VALUE);
                return new String(cArr, 0, i3 + 1);
            }
            cArr[i3] = (char) b;
            i3++;
        }
    }

    private int readInt_slow(boolean z) {
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        int i2 = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            require(1);
            byte[] bArr2 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            byte b2 = bArr2[i3];
            i2 |= (b2 & Byte.MAX_VALUE) << 7;
            if ((b2 & 128) != 0) {
                require(1);
                int i4 = this.position;
                this.position = i4 + 1;
                byte b3 = bArr2[i4];
                i2 |= (b3 & Byte.MAX_VALUE) << 14;
                if ((b3 & 128) != 0) {
                    require(1);
                    int i5 = this.position;
                    this.position = i5 + 1;
                    byte b4 = bArr2[i5];
                    i2 |= (b4 & Byte.MAX_VALUE) << 21;
                    if ((b4 & 128) != 0) {
                        require(1);
                        int i6 = this.position;
                        this.position = i6 + 1;
                        i2 |= (bArr2[i6] & Byte.MAX_VALUE) << 28;
                    }
                }
            }
        }
        return z ? i2 : (i2 >>> 1) ^ (-(i2 & 1));
    }

    private long readLong_slow(boolean z) {
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        long j = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            require(1);
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            j |= (r4 & Byte.MAX_VALUE) << 7;
            if ((bArr2[i2] & 128) != 0) {
                require(1);
                int i3 = this.position;
                this.position = i3 + 1;
                j |= (r4 & Byte.MAX_VALUE) << 14;
                if ((bArr2[i3] & 128) != 0) {
                    require(1);
                    int i4 = this.position;
                    this.position = i4 + 1;
                    j |= (r4 & Byte.MAX_VALUE) << 21;
                    if ((bArr2[i4] & 128) != 0) {
                        require(1);
                        int i5 = this.position;
                        this.position = i5 + 1;
                        j |= (r4 & Byte.MAX_VALUE) << 28;
                        if ((bArr2[i5] & 128) != 0) {
                            require(1);
                            int i6 = this.position;
                            this.position = i6 + 1;
                            j |= (r4 & Byte.MAX_VALUE) << 35;
                            if ((bArr2[i6] & 128) != 0) {
                                require(1);
                                int i7 = this.position;
                                this.position = i7 + 1;
                                j |= (r4 & Byte.MAX_VALUE) << 42;
                                if ((bArr2[i7] & 128) != 0) {
                                    require(1);
                                    int i8 = this.position;
                                    this.position = i8 + 1;
                                    j |= (r4 & Byte.MAX_VALUE) << 49;
                                    if ((bArr2[i8] & 128) != 0) {
                                        require(1);
                                        this.position = this.position + 1;
                                        j |= bArr2[r4] << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return !z ? (j >>> 1) ^ (-(j & 1)) : j;
    }

    private void readUtf8(int i) {
        byte[] bArr = this.buffer;
        char[] cArr = this.chars;
        int min = Math.min(require(1), i);
        int i2 = this.position;
        int i3 = 0;
        while (i3 < min) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            cArr[i3] = (char) b;
            i3++;
            i2 = i4;
        }
        this.position = i2;
        if (i3 < i) {
            readUtf8_slow(i, i3);
        }
    }

    private int readUtf8Length(int i) {
        int i2 = i & 63;
        if ((i & 64) != 0) {
            byte[] bArr = this.buffer;
            int i3 = this.position;
            int i4 = i3 + 1;
            this.position = i4;
            byte b = bArr[i3];
            i2 |= (b & Byte.MAX_VALUE) << 6;
            if ((b & 128) != 0) {
                int i5 = i3 + 2;
                this.position = i5;
                byte b2 = bArr[i4];
                i2 |= (b2 & Byte.MAX_VALUE) << 13;
                if ((b2 & 128) != 0) {
                    int i6 = i3 + 3;
                    this.position = i6;
                    byte b3 = bArr[i5];
                    i2 |= (b3 & Byte.MAX_VALUE) << 20;
                    if ((b3 & 128) != 0) {
                        this.position = i3 + 4;
                        return ((bArr[i6] & Byte.MAX_VALUE) << 27) | i2;
                    }
                }
            }
        }
        return i2;
    }

    private int readUtf8Length_slow(int i) {
        int i2 = i & 63;
        if ((i & 64) != 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            byte b = bArr[i3];
            i2 |= (b & Byte.MAX_VALUE) << 6;
            if ((b & 128) != 0) {
                require(1);
                int i4 = this.position;
                this.position = i4 + 1;
                byte b2 = bArr[i4];
                i2 |= (b2 & Byte.MAX_VALUE) << 13;
                if ((b2 & 128) != 0) {
                    require(1);
                    int i5 = this.position;
                    this.position = i5 + 1;
                    byte b3 = bArr[i5];
                    i2 |= (b3 & Byte.MAX_VALUE) << 20;
                    if ((b3 & 128) != 0) {
                        require(1);
                        int i6 = this.position;
                        this.position = i6 + 1;
                        return ((bArr[i6] & Byte.MAX_VALUE) << 27) | i2;
                    }
                }
            }
        }
        return i2;
    }

    private void readUtf8_slow(int i, int i2) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            int i3 = this.position;
            int i4 = i3 + 1;
            this.position = i4;
            byte b = bArr[i3];
            int i5 = b & 255;
            switch (i5 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i5;
                    break;
                case 12:
                case 13:
                    if (i4 == this.limit) {
                        require(1);
                    }
                    int i6 = this.position;
                    this.position = i6 + 1;
                    cArr[i2] = (char) (((b & 31) << 6) | (bArr[i6] & Utf8.REPLACEMENT_BYTE));
                    break;
                case 14:
                    require(2);
                    int i7 = this.position;
                    int i8 = i7 + 1;
                    this.position = i8;
                    int i9 = ((b & 15) << 12) | ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 6);
                    this.position = i7 + 2;
                    cArr[i2] = (char) (i9 | (bArr[i8] & Utf8.REPLACEMENT_BYTE));
                    break;
            }
            i2++;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i = this.limit - this.position;
        InputStream inputStream = this.inputStream;
        return i + (inputStream != null ? inputStream.available() : 0);
    }

    public boolean canReadInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        byte[] bArr = this.buffer;
        int i2 = i + 1;
        if ((bArr[i] & 128) == 0) {
            return true;
        }
        int i3 = this.limit;
        if (i2 == i3) {
            return false;
        }
        int i4 = i + 2;
        if ((bArr[i2] & 128) == 0) {
            return true;
        }
        if (i4 == i3) {
            return false;
        }
        int i5 = i + 3;
        if ((bArr[i4] & 128) == 0) {
            return true;
        }
        if (i5 == i3) {
            return false;
        }
        return (bArr[i5] & 128) == 0 || i + 4 != i3;
    }

    public boolean canReadLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        byte[] bArr = this.buffer;
        int i2 = i + 1;
        if ((bArr[i] & 128) == 0) {
            return true;
        }
        int i3 = this.limit;
        if (i2 == i3) {
            return false;
        }
        int i4 = i + 2;
        if ((bArr[i2] & 128) == 0) {
            return true;
        }
        if (i4 == i3) {
            return false;
        }
        int i5 = i + 3;
        if ((bArr[i4] & 128) == 0) {
            return true;
        }
        if (i5 == i3) {
            return false;
        }
        int i6 = i + 4;
        if ((bArr[i5] & 128) == 0) {
            return true;
        }
        if (i6 == i3) {
            return false;
        }
        int i7 = i + 5;
        if ((bArr[i6] & 128) == 0) {
            return true;
        }
        if (i7 == i3) {
            return false;
        }
        int i8 = i + 6;
        if ((bArr[i7] & 128) == 0) {
            return true;
        }
        if (i8 == i3) {
            return false;
        }
        int i9 = i + 7;
        if ((bArr[i8] & 128) == 0) {
            return true;
        }
        if (i9 == i3) {
            return false;
        }
        return (bArr[i9] & 128) == 0 || i + 8 != i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public boolean eof() {
        return optional(1) <= 0;
    }

    public int fill(byte[] bArr, int i, int i2) throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public int limit() {
        return this.limit;
    }

    public int position() {
        return this.position;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return 0;
        }
        int min = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        while (true) {
            System.arraycopy(this.buffer, this.position, bArr, i, min);
            this.position += min;
            i3 -= min;
            if (i3 == 0) {
                break;
            }
            i += min;
            min = optional(i3);
            if (min == -1) {
                if (i2 == i3) {
                    return -1;
                }
            } else if (this.position == this.limit) {
                break;
            }
        }
        return i2 - i3;
    }

    public boolean readBoolean() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] == 1;
    }

    public byte readByte() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }

    public int readByteUnsigned() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public void readBytes(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return;
        }
        int min = Math.min(this.limit - this.position, i2);
        while (true) {
            System.arraycopy(this.buffer, this.position, bArr, i, min);
            this.position += min;
            i2 -= min;
            if (i2 == 0) {
                return;
            }
            i += min;
            min = Math.min(i2, this.capacity);
            require(min);
        }
    }

    public char readChar() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (char) ((bArr[i2] & 255) | i3);
    }

    public char[] readChars(int i) throws KryoException {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = readChar();
        }
        return cArr;
    }

    public double readDouble() throws KryoException {
        return Double.longBitsToDouble(readLong());
    }

    public double[] readDoubles(int i) throws KryoException {
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }

    public float readFloat() throws KryoException {
        return Float.intBitsToFloat(readInt());
    }

    public float[] readFloats(int i) throws KryoException {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public int readInt() throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 4;
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public int[] readInts(int i, boolean z) throws KryoException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt(z);
        }
        return iArr;
    }

    public long readLong() throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        this.position = i + 3;
        long j = (bArr[i] << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r6] & 255) << 40);
        this.position = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 32);
        this.position = i + 5;
        long j3 = j2 | ((bArr[r6] & 255) << 24);
        this.position = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 16);
        this.position = i + 7;
        long j5 = j4 | ((bArr[r6] & 255) << 8);
        this.position = i + 8;
        return (bArr[r5] & 255) | j5;
    }

    public long[] readLongs(int i, boolean z) throws KryoException {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong(z);
        }
        return jArr;
    }

    public short readShort() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public int readShortUnsigned() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public short[] readShorts(int i) throws KryoException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = readShort();
        }
        return sArr;
    }

    public String readString() {
        int require = require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        if ((b & 128) == 0) {
            return readAscii();
        }
        int readUtf8Length = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        if (readUtf8Length == 0) {
            return null;
        }
        if (readUtf8Length == 1) {
            return "";
        }
        int i2 = readUtf8Length - 1;
        if (this.chars.length < i2) {
            this.chars = new char[i2];
        }
        readUtf8(i2);
        return new String(this.chars, 0, i2);
    }

    public StringBuilder readStringBuilder() {
        int require = require(1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        byte b = bArr[i];
        if ((b & 128) == 0) {
            return new StringBuilder(readAscii());
        }
        int readUtf8Length = require >= 5 ? readUtf8Length(b) : readUtf8Length_slow(b);
        if (readUtf8Length == 0) {
            return null;
        }
        if (readUtf8Length == 1) {
            return new StringBuilder("");
        }
        int i2 = readUtf8Length - 1;
        if (this.chars.length < i2) {
            this.chars = new char[i2];
        }
        readUtf8(i2);
        StringBuilder sb = new StringBuilder(i2);
        sb.append(this.chars, 0, i2);
        return sb;
    }

    public int readVarInt(boolean z) throws KryoException {
        if (require(1) < 5) {
            return readInt_slow(z);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        int i3 = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            int i4 = i + 2;
            this.position = i4;
            byte b2 = bArr[i2];
            i3 |= (b2 & Byte.MAX_VALUE) << 7;
            if ((b2 & 128) != 0) {
                int i5 = i + 3;
                this.position = i5;
                byte b3 = bArr[i4];
                i3 |= (b3 & Byte.MAX_VALUE) << 14;
                if ((b3 & 128) != 0) {
                    int i6 = i + 4;
                    this.position = i6;
                    byte b4 = bArr[i5];
                    i3 |= (b4 & Byte.MAX_VALUE) << 21;
                    if ((b4 & 128) != 0) {
                        this.position = i + 5;
                        i3 |= (bArr[i6] & Byte.MAX_VALUE) << 28;
                    }
                }
            }
        }
        return z ? i3 : (i3 >>> 1) ^ (-(i3 & 1));
    }

    public long readVarLong(boolean z) throws KryoException {
        if (require(1) < 9) {
            return readLong_slow(z);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        long j = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            int i3 = i + 2;
            this.position = i3;
            j |= (r4 & Byte.MAX_VALUE) << 7;
            if ((bArr[i2] & 128) != 0) {
                int i4 = i + 3;
                this.position = i4;
                j |= (r5 & Byte.MAX_VALUE) << 14;
                if ((bArr[i3] & 128) != 0) {
                    int i5 = i + 4;
                    this.position = i5;
                    j |= (r4 & Byte.MAX_VALUE) << 21;
                    if ((bArr[i4] & 128) != 0) {
                        int i6 = i + 5;
                        this.position = i6;
                        j |= (r5 & Byte.MAX_VALUE) << 28;
                        if ((bArr[i5] & 128) != 0) {
                            int i7 = i + 6;
                            this.position = i7;
                            j |= (r4 & Byte.MAX_VALUE) << 35;
                            if ((bArr[i6] & 128) != 0) {
                                int i8 = i + 7;
                                this.position = i8;
                                j |= (r5 & Byte.MAX_VALUE) << 42;
                                if ((bArr[i7] & 128) != 0) {
                                    this.position = i + 8;
                                    j |= (r4 & Byte.MAX_VALUE) << 49;
                                    if ((bArr[i8] & 128) != 0) {
                                        this.position = i + 9;
                                        j |= bArr[r5] << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return !z ? (j >>> 1) ^ (-(1 & j)) : j;
    }

    public int require(int i) throws KryoException {
        int i2 = this.limit;
        int i3 = i2 - this.position;
        if (i3 >= i) {
            return i3;
        }
        int i4 = this.capacity;
        if (i > i4) {
            throw new KryoException(ParcelCompat$$ExternalSyntheticOutline0.m(", required: ", this.capacity, i, new StringBuilder("Buffer too small: capacity: ")));
        }
        if (i3 > 0) {
            int fill = fill(this.buffer, i2, i4 - i2);
            if (fill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            i3 += fill;
            if (i3 >= i) {
                this.limit += fill;
                return i3;
            }
        }
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, this.position, bArr, 0, i3);
        this.total += this.position;
        this.position = 0;
        while (true) {
            int fill2 = fill(this.buffer, i3, this.capacity - i3);
            if (fill2 != -1) {
                i3 += fill2;
                if (i3 >= i) {
                    break;
                }
            } else if (i3 < i) {
                throw new KryoException("Buffer underflow.");
            }
        }
        this.limit = i3;
        return i3;
    }

    public void rewind() {
        this.position = 0;
        this.total = 0L;
    }

    public void setBuffer(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return;
        }
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
        this.capacity = bArr.length;
        this.total = 0L;
        this.inputStream = null;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        rewind();
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setTotal(long j) {
        this.total = j;
    }

    public void skip(int i) throws KryoException {
        int min = Math.min(this.limit - this.position, i);
        while (true) {
            this.position += min;
            i -= min;
            if (i == 0) {
                return;
            }
            min = Math.min(i, this.capacity);
            require(min);
        }
    }

    public long total() {
        return this.total + this.position;
    }

    public double readDouble(double d, boolean z) throws KryoException {
        return readLong(z) / d;
    }

    public float readFloat(float f, boolean z) throws KryoException {
        return readInt(z) / f;
    }

    public int[] readInts(int i) throws KryoException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public long[] readLongs(int i) throws KryoException {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public Input(int i) {
        this.chars = new char[32];
        this.capacity = i;
        this.buffer = new byte[i];
    }

    public Input(byte[] bArr) {
        this.chars = new char[32];
        setBuffer(bArr, 0, bArr.length);
    }

    public Input(byte[] bArr, int i, int i2) {
        this.chars = new char[32];
        setBuffer(bArr, i, i2);
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, 0, bArr.length);
    }

    public Input() {
        this.chars = new char[32];
    }

    @Override // java.io.InputStream
    public long skip(long j) throws KryoException {
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(SieveCacheKt.NodeLinkMask, j2);
            skip(min);
            j2 -= min;
        }
        return j;
    }

    public Input(InputStream inputStream, int i) {
        this(i);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("inputStream cannot be null.");
            throw null;
        }
    }

    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    public int readInt(boolean z) throws KryoException {
        return readVarInt(z);
    }

    public byte[] readBytes(int i) throws KryoException {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return bArr;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public long readLong(boolean z) throws KryoException {
        return readVarLong(z);
    }
}
