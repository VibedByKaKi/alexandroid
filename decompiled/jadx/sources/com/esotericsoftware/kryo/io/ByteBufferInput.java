package com.esotericsoftware.kryo.io;

import androidx.collection.SieveCacheKt;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Utf8;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ByteBufferInput extends Input {
    protected static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    ByteOrder byteOrder;
    protected ByteBuffer niobuffer;
    protected boolean varIntsEnabled;

    public ByteBufferInput(int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        this.capacity = i;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.niobuffer = allocateDirect;
        allocateDirect.order(this.byteOrder);
    }

    private boolean isNativeOrder() {
        return this.byteOrder == nativeOrder;
    }

    private int optional(int i) throws KryoException {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        int min = Math.min(i, this.capacity);
        ByteBuffer byteBuffer = this.niobuffer;
        int i3 = this.limit;
        int fill = fill(byteBuffer, i3, this.capacity - i3);
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
        this.niobuffer.compact();
        this.total += this.position;
        this.position = 0;
        do {
            int fill2 = fill(this.niobuffer, i4, this.capacity - i4);
            if (fill2 == -1) {
                break;
            }
            i4 += fill2;
        } while (i4 < min);
        this.limit = i4;
        this.niobuffer.position(this.position);
        if (i4 == 0) {
            return -1;
        }
        return Math.min(i4, min);
    }

    private String readAscii() {
        int i = this.position;
        int i2 = i - 1;
        int i3 = this.limit;
        while (i != i3) {
            int i4 = i + 1;
            if ((this.niobuffer.get() & 128) != 0) {
                ByteBuffer byteBuffer = this.niobuffer;
                byteBuffer.put(i, (byte) (byteBuffer.get(i) & Byte.MAX_VALUE));
                int i5 = i4 - i2;
                byte[] bArr = new byte[i5];
                this.niobuffer.position(i2);
                this.niobuffer.get(bArr);
                String str = new String(bArr, 0, 0, i5);
                ByteBuffer byteBuffer2 = this.niobuffer;
                byteBuffer2.put(i, (byte) (byteBuffer2.get(i) | 128));
                this.position = i4;
                this.niobuffer.position(i4);
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
        int i4 = 0;
        while (i < i2) {
            cArr[i4] = (char) this.niobuffer.get(i);
            i++;
            i4++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            this.position++;
            byte b = this.niobuffer.get();
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
        this.position++;
        byte b = this.niobuffer.get();
        int i = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            require(1);
            this.position++;
            byte b2 = this.niobuffer.get();
            i |= (b2 & Byte.MAX_VALUE) << 7;
            if ((b2 & 128) != 0) {
                require(1);
                this.position++;
                byte b3 = this.niobuffer.get();
                i |= (b3 & Byte.MAX_VALUE) << 14;
                if ((b3 & 128) != 0) {
                    require(1);
                    this.position++;
                    byte b4 = this.niobuffer.get();
                    i |= (b4 & Byte.MAX_VALUE) << 21;
                    if ((b4 & 128) != 0) {
                        require(1);
                        this.position++;
                        i |= (this.niobuffer.get() & Byte.MAX_VALUE) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    private long readLong_slow(boolean z) {
        this.position++;
        byte b = this.niobuffer.get();
        long j = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            require(1);
            this.position++;
            j |= (r0 & Byte.MAX_VALUE) << 7;
            if ((this.niobuffer.get() & 128) != 0) {
                require(1);
                this.position++;
                j |= (r0 & Byte.MAX_VALUE) << 14;
                if ((this.niobuffer.get() & 128) != 0) {
                    require(1);
                    this.position++;
                    j |= (r0 & Byte.MAX_VALUE) << 21;
                    if ((this.niobuffer.get() & 128) != 0) {
                        require(1);
                        this.position++;
                        j |= (r0 & Byte.MAX_VALUE) << 28;
                        if ((this.niobuffer.get() & 128) != 0) {
                            require(1);
                            this.position++;
                            j |= (r0 & Byte.MAX_VALUE) << 35;
                            if ((this.niobuffer.get() & 128) != 0) {
                                require(1);
                                this.position++;
                                j |= (r0 & Byte.MAX_VALUE) << 42;
                                if ((this.niobuffer.get() & 128) != 0) {
                                    require(1);
                                    this.position++;
                                    j |= (r0 & Byte.MAX_VALUE) << 49;
                                    if ((this.niobuffer.get() & 128) != 0) {
                                        require(1);
                                        this.position++;
                                        j |= this.niobuffer.get() << 56;
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

    private void readUtf8(int i) {
        char[] cArr = this.chars;
        int min = Math.min(require(1), i);
        int i2 = this.position;
        int i3 = 0;
        while (i3 < min) {
            int i4 = i2 + 1;
            byte b = this.niobuffer.get();
            if (b < 0) {
                break;
            }
            cArr[i3] = (char) b;
            i3++;
            i2 = i4;
        }
        this.position = i2;
        if (i3 < i) {
            this.niobuffer.position(i2);
            readUtf8_slow(i, i3);
        }
    }

    private int readUtf8Length(int i) {
        int i2 = i & 63;
        if ((i & 64) != 0) {
            this.position++;
            byte b = this.niobuffer.get();
            i2 |= (b & Byte.MAX_VALUE) << 6;
            if ((b & 128) != 0) {
                this.position++;
                byte b2 = this.niobuffer.get();
                i2 |= (b2 & Byte.MAX_VALUE) << 13;
                if ((b2 & 128) != 0) {
                    this.position++;
                    byte b3 = this.niobuffer.get();
                    i2 |= (b3 & Byte.MAX_VALUE) << 20;
                    if ((b3 & 128) != 0) {
                        this.position++;
                        return ((this.niobuffer.get() & Byte.MAX_VALUE) << 27) | i2;
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
            this.position++;
            byte b = this.niobuffer.get();
            i2 |= (b & Byte.MAX_VALUE) << 6;
            if ((b & 128) != 0) {
                require(1);
                this.position++;
                byte b2 = this.niobuffer.get();
                i2 |= (b2 & Byte.MAX_VALUE) << 13;
                if ((b2 & 128) != 0) {
                    require(1);
                    this.position++;
                    byte b3 = this.niobuffer.get();
                    i2 |= (b3 & Byte.MAX_VALUE) << 20;
                    if ((b3 & 128) != 0) {
                        require(1);
                        this.position++;
                        return ((this.niobuffer.get() & Byte.MAX_VALUE) << 27) | i2;
                    }
                }
            }
        }
        return i2;
    }

    private void readUtf8_slow(int i, int i2) {
        char[] cArr = this.chars;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            byte b = this.niobuffer.get();
            int i3 = b & 255;
            switch (i3 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i3;
                    break;
                case 12:
                case 13:
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    cArr[i2] = (char) (((b & 31) << 6) | (this.niobuffer.get() & Utf8.REPLACEMENT_BYTE));
                    break;
                case 14:
                    require(2);
                    this.position += 2;
                    cArr[i2] = (char) (((b & 15) << 12) | ((this.niobuffer.get() & Utf8.REPLACEMENT_BYTE) << 6) | (this.niobuffer.get() & Utf8.REPLACEMENT_BYTE));
                    break;
            }
            i2++;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = i + 1;
        if ((this.niobuffer.get(i) & 128) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i + 2;
        if ((this.niobuffer.get(i2) & 128) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        int i4 = i + 3;
        if ((this.niobuffer.get(i3) & 128) == 0) {
            return true;
        }
        if (i4 == this.limit) {
            return false;
        }
        return (this.niobuffer.get(i4) & 128) == 0 || i + 4 != this.limit;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = i + 1;
        if ((this.niobuffer.get(i) & 128) == 0) {
            return true;
        }
        if (i2 == this.limit) {
            return false;
        }
        int i3 = i + 2;
        if ((this.niobuffer.get(i2) & 128) == 0) {
            return true;
        }
        if (i3 == this.limit) {
            return false;
        }
        int i4 = i + 3;
        if ((this.niobuffer.get(i3) & 128) == 0) {
            return true;
        }
        if (i4 == this.limit) {
            return false;
        }
        int i5 = i + 4;
        if ((this.niobuffer.get(i4) & 128) == 0) {
            return true;
        }
        if (i5 == this.limit) {
            return false;
        }
        int i6 = i + 5;
        if ((this.niobuffer.get(i5) & 128) == 0) {
            return true;
        }
        if (i6 == this.limit) {
            return false;
        }
        int i7 = i + 6;
        if ((this.niobuffer.get(i6) & 128) == 0) {
            return true;
        }
        if (i7 == this.limit) {
            return false;
        }
        int i8 = i + 7;
        if ((this.niobuffer.get(i7) & 128) == 0) {
            return true;
        }
        if (i8 == this.limit) {
            return false;
        }
        return (this.niobuffer.get(i8) & 128) == 0 || i + 8 != this.limit;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public int fill(ByteBuffer byteBuffer, int i, int i2) throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            byte[] bArr = new byte[i2];
            int read = inputStream.read(bArr, 0, i2);
            byteBuffer.position(i);
            if (read >= 0) {
                byteBuffer.put(bArr, 0, read);
                byteBuffer.position(i);
            }
            return read;
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    public ByteBuffer getByteBuffer() {
        return this.niobuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public InputStream getInputStream() {
        return this.inputStream;
    }

    public boolean getVarIntsEnabled() {
        return this.varIntsEnabled;
    }

    public ByteOrder order() {
        return this.byteOrder;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws KryoException {
        this.niobuffer.position(this.position);
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return 0;
        }
        int min = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        while (true) {
            this.niobuffer.get(bArr, i, min);
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

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        require(1);
        this.position++;
        return this.niobuffer.get() == 1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        this.niobuffer.position(this.position);
        require(1);
        this.position++;
        return this.niobuffer.get();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() throws KryoException {
        require(1);
        this.position++;
        return this.niobuffer.get() & 255;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i, int i2) throws KryoException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
            return;
        }
        int min = Math.min(this.limit - this.position, i2);
        while (true) {
            this.niobuffer.get(bArr, i, min);
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

    @Override // com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getChar();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i) throws KryoException {
        int i2 = i * 2;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readChars(i);
        }
        char[] cArr = new char[i];
        this.niobuffer.asCharBuffer().get(cArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getDouble();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i) throws KryoException {
        int i2 = i * 8;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readDoubles(i);
        }
        double[] dArr = new double[i];
        this.niobuffer.asDoubleBuffer().get(dArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getFloat();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i) throws KryoException {
        int i2 = i * 4;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readFloats(i);
        }
        float[] fArr = new float[i];
        this.niobuffer.asFloatBuffer().get(fArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i) throws KryoException {
        int i2 = i * 4;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readInts(i);
        }
        int[] iArr = new int[i];
        this.niobuffer.asIntBuffer().get(iArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getLong();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i) throws KryoException {
        int i2 = i * 8;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readLongs(i);
        }
        long[] jArr = new long[i];
        this.niobuffer.asLongBuffer().get(jArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readShortUnsigned() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i) throws KryoException {
        int i2 = i * 2;
        if (this.capacity - this.position < i2 || !isNativeOrder()) {
            return super.readShorts(i);
        }
        short[] sArr = new short[i];
        this.niobuffer.asShortBuffer().get(sArr);
        int i3 = this.position + i2;
        this.position = i3;
        this.niobuffer.position(i3);
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public String readString() {
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b = this.niobuffer.get();
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
        int i = readUtf8Length - 1;
        if (this.chars.length < i) {
            this.chars = new char[i];
        }
        readUtf8(i);
        return new String(this.chars, 0, i);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public StringBuilder readStringBuilder() {
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b = this.niobuffer.get();
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
        int i = readUtf8Length - 1;
        if (this.chars.length < i) {
            this.chars = new char[i];
        }
        readUtf8(i);
        StringBuilder sb = new StringBuilder(i);
        sb.append(this.chars, 0, i);
        return sb;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readVarInt(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 5) {
            return readInt_slow(z);
        }
        this.position++;
        byte b = this.niobuffer.get();
        int i = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            this.position++;
            byte b2 = this.niobuffer.get();
            i |= (b2 & Byte.MAX_VALUE) << 7;
            if ((b2 & 128) != 0) {
                this.position++;
                byte b3 = this.niobuffer.get();
                i |= (b3 & Byte.MAX_VALUE) << 14;
                if ((b3 & 128) != 0) {
                    this.position++;
                    byte b4 = this.niobuffer.get();
                    i |= (b4 & Byte.MAX_VALUE) << 21;
                    if ((b4 & 128) != 0) {
                        this.position++;
                        i |= (this.niobuffer.get() & Byte.MAX_VALUE) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readVarLong(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 9) {
            return readLong_slow(z);
        }
        this.position++;
        byte b = this.niobuffer.get();
        long j = b & Byte.MAX_VALUE;
        if ((b & 128) != 0) {
            this.position++;
            j |= (r1 & Byte.MAX_VALUE) << 7;
            if ((this.niobuffer.get() & 128) != 0) {
                this.position++;
                j |= (r1 & Byte.MAX_VALUE) << 14;
                if ((this.niobuffer.get() & 128) != 0) {
                    this.position++;
                    j |= (r1 & Byte.MAX_VALUE) << 21;
                    if ((this.niobuffer.get() & 128) != 0) {
                        this.position++;
                        j |= (r1 & Byte.MAX_VALUE) << 28;
                        if ((this.niobuffer.get() & 128) != 0) {
                            this.position++;
                            j |= (r1 & Byte.MAX_VALUE) << 35;
                            if ((this.niobuffer.get() & 128) != 0) {
                                this.position++;
                                j |= (r1 & Byte.MAX_VALUE) << 42;
                                if ((this.niobuffer.get() & 128) != 0) {
                                    this.position++;
                                    j |= (r1 & Byte.MAX_VALUE) << 49;
                                    if ((this.niobuffer.get() & 128) != 0) {
                                        this.position++;
                                        j |= this.niobuffer.get() << 56;
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

    public void release() {
        close();
        UnsafeUtil.releaseBuffer(this.niobuffer);
        this.niobuffer = null;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public final int require(int i) throws KryoException {
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
            int fill = fill(this.niobuffer, i2, i4 - i2);
            if (fill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            i3 += fill;
            if (i3 >= i) {
                this.limit += fill;
                return i3;
            }
        }
        this.niobuffer.position(this.position);
        this.niobuffer.compact();
        this.total += this.position;
        this.position = 0;
        while (true) {
            int fill2 = fill(this.niobuffer, i3, this.capacity - i3);
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
        this.niobuffer.position(0);
        return i3;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void rewind() {
        super.rewind();
        this.niobuffer.position(0);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("buffer cannot be null.");
            return;
        }
        this.niobuffer = byteBuffer;
        this.position = byteBuffer.position();
        this.limit = byteBuffer.limit();
        this.capacity = byteBuffer.capacity();
        this.total = 0L;
        this.inputStream = null;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        rewind();
    }

    public void setVarIntsEnabled(boolean z) {
        this.varIntsEnabled = z;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public long skip(long j) throws KryoException {
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(SieveCacheKt.NodeLinkMask, j2);
            skip(min);
            j2 -= min;
        }
        return j;
    }

    public void order(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat(float f, boolean z) throws KryoException {
        return readInt(z) / f;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarInt(z);
        }
        return readInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble(double d, boolean z) throws KryoException {
        return readLong(z) / d;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarLong(z);
        }
        return readLong();
    }

    public ByteBufferInput() {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public ByteBufferInput(byte[] bArr) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(bArr);
    }

    public ByteBufferInput(ByteBuffer byteBuffer) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer);
    }

    public ByteBufferInput(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("inputStream cannot be null.");
            throw null;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        allocateDirect.limit(bArr.length);
        allocateDirect.order(this.byteOrder);
        setBuffer(allocateDirect);
    }

    public ByteBufferInput(InputStream inputStream, int i) {
        this(i);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("inputStream cannot be null.");
            throw null;
        }
    }

    public ByteBufferInput(long j, int i) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(UnsafeUtil.getDirectBufferAt(j, i));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte[] readBytes(int i) throws KryoException {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        this.niobuffer.position(this.position);
        return read(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        this.niobuffer.position(this.position);
        this.position++;
        return this.niobuffer.get() & 255;
    }
}
