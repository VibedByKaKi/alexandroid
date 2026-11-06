package com.esotericsoftware.kryo.io;

import androidx.collection.SieveCacheKt;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.esotericsoftware.kryo.util.Util;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class UnsafeOutput extends Output {
    private static final boolean isLittleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private boolean supportVarInts;

    public UnsafeOutput() {
        this.supportVarInts = false;
    }

    private final void writeBytes(Object obj, long j, long j2, long j3) throws KryoException {
        int min = Math.min(this.capacity - this.position, (int) j3);
        long j4 = j3;
        long j5 = j2;
        while (true) {
            long j6 = min;
            UnsafeUtil.unsafe().copyMemory(obj, j + j5, this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, j6);
            this.position += min;
            j4 -= j6;
            if (j4 == 0) {
                return;
            }
            j5 += j6;
            min = Math.min(this.capacity, (int) j4);
            require(min);
        }
    }

    private final void writeLittleEndianInt(int i) {
        if (isLittleEndian) {
            writeInt(i);
        } else {
            writeInt(Util.swapInt(i));
        }
    }

    private final void writeLittleEndianLong(long j) {
        if (isLittleEndian) {
            writeLong(j);
        } else {
            writeLong(Util.swapLong(j));
        }
    }

    public boolean supportVarInts() {
        return this.supportVarInts;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeChar(char c) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, c);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeChars(char[] cArr) throws KryoException {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, 0L, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeDouble(double d) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, d);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeDoubles(double[] dArr) throws KryoException {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, 0L, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeFloat(float f) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, f);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeFloats(float[] fArr) throws KryoException {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, 0L, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInt(int i) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, i);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr, boolean z) throws KryoException {
        if (this.supportVarInts) {
            super.writeInts(iArr, z);
        } else {
            writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLong(long j) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, j);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr, boolean z) throws KryoException {
        if (this.supportVarInts) {
            super.writeLongs(jArr, z);
        } else {
            writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeShort(int i) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, (short) i);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeShorts(short[] sArr) throws KryoException {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, 0L, sArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeVarInt(int i, boolean z) throws KryoException {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = i & 127;
        int i3 = i >>> 7;
        if (i3 == 0) {
            write(i2);
            return 1;
        }
        int i4 = i2 | 128 | ((i3 & 127) << 8);
        int i5 = i >>> 14;
        if (i5 == 0) {
            writeLittleEndianInt(i4);
            this.position -= 2;
            return 2;
        }
        int i6 = i4 | 32768 | ((i5 & 127) << 16);
        int i7 = i >>> 21;
        if (i7 == 0) {
            writeLittleEndianInt(i6);
            this.position--;
            return 3;
        }
        int i8 = i6 | 8388608 | ((i7 & 127) << 24);
        if ((i >>> 28) == 0) {
            writeLittleEndianInt(i8);
            this.position = this.position;
            return 4;
        }
        writeLittleEndianLong(((r5 & 127) << 32) | i8 | Integer.MIN_VALUE);
        this.position -= 3;
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeVarLong(long j, boolean z) throws KryoException {
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        int i = (int) (127 & j2);
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            writeByte(i);
            return 1;
        }
        int i2 = (int) ((j3 << 8) | i | 128);
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            writeLittleEndianInt(i2);
            this.position -= 2;
            return 2;
        }
        int i3 = (int) (i2 | 32768 | (j4 << 16));
        long j5 = j2 >>> 21;
        if (j5 == 0) {
            writeLittleEndianInt(i3);
            this.position--;
            return 3;
        }
        int i4 = (int) (i3 | 8388608 | (j5 << 24));
        long j6 = j2 >>> 28;
        if (j6 == 0) {
            writeLittleEndianInt(i4);
            this.position = this.position;
            return 4;
        }
        long j7 = i4 | Integer.MIN_VALUE;
        long j8 = (j6 << 32) | j7;
        long j9 = j2 >>> 35;
        if (j9 == 0) {
            writeLittleEndianLong(j8);
            this.position -= 3;
            return 5;
        }
        long j10 = (j9 << 40) | j7;
        long j11 = j2 >>> 42;
        if (j11 == 0) {
            writeLittleEndianLong(j10);
            this.position -= 2;
            return 6;
        }
        long j12 = (j11 << 48) | j7;
        long j13 = j2 >>> 49;
        if (j13 == 0) {
            writeLittleEndianLong(j12);
            this.position--;
            return 7;
        }
        long j14 = j7 | (j13 << 56);
        if ((j2 >>> 56) == 0) {
            writeLittleEndianLong(j14);
            return 8;
        }
        writeLittleEndianLong(j14 | SieveCacheKt.NodeMetaAndPreviousMask);
        write((byte) (j2 >>> 63));
        return 9;
    }

    public void supportVarInts(boolean z) {
        this.supportVarInts = z;
    }

    public UnsafeOutput(int i) {
        this(i, i);
    }

    public UnsafeOutput(int i, int i2) {
        super(i, i2);
        this.supportVarInts = false;
    }

    public UnsafeOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public UnsafeOutput(byte[] bArr, int i) {
        super(bArr, i);
        this.supportVarInts = false;
    }

    public UnsafeOutput(OutputStream outputStream) {
        super(outputStream);
        this.supportVarInts = false;
    }

    public UnsafeOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
        this.supportVarInts = false;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr) throws KryoException {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr) throws KryoException {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeInt(int i, boolean z) throws KryoException {
        if (!this.supportVarInts) {
            writeInt(i);
            return 4;
        }
        return writeVarInt(i, z);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeLong(long j, boolean z) throws KryoException {
        if (!this.supportVarInts) {
            writeLong(j);
            return 8;
        }
        return writeVarLong(j, z);
    }

    public final void writeBytes(Object obj, long j, long j2) throws KryoException {
        writeBytes(obj, 0L, j, j2);
    }
}
