package com.esotericsoftware.kryo.io;

import androidx.collection.SieveCacheKt;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.esotericsoftware.kryo.util.Util;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openjdk.tools.javac.code.Flags;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class UnsafeMemoryOutput extends ByteBufferOutput {
    private static final boolean isLittleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private long bufaddress;

    public UnsafeMemoryOutput(int i, int i2) {
        super(i, i2);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    private void updateBufferAddress() {
        this.bufaddress = this.niobuffer.address();
    }

    private final void writeBytes(Object obj, long j, long j2, long j3) throws KryoException {
        int min = Math.min(this.capacity - this.position, (int) j3);
        long j4 = j3;
        long j5 = j2;
        while (true) {
            long j6 = min;
            UnsafeUtil.unsafe().copyMemory(obj, j + j5, (Object) null, this.bufaddress + this.position, j6);
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

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput
    public void setBuffer(ByteBuffer byteBuffer, int i) {
        super.setBuffer(byteBuffer, i);
        updateBufferAddress();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeBoolean(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeBoolean(z);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeByte(int i) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeByte(i);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeChar(char c) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putChar(this.bufaddress + this.position, c);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeChars(char[] cArr) throws KryoException {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, 0L, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeDouble(double d) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putDouble(this.bufaddress + this.position, d);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeDoubles(double[] dArr) throws KryoException {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, 0L, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeFloat(float f) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putFloat(this.bufaddress + this.position, f);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeFloats(float[] fArr) throws KryoException {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, 0L, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeInt(int i) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putInt(this.bufaddress + this.position, i);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            super.writeInts(iArr, z);
        } else {
            writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
        }
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeLong(long j) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putLong(this.bufaddress + this.position, j);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            super.writeLongs(jArr, z);
        } else {
            writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
        }
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeShort(int i) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putShort(this.bufaddress + this.position, (short) i);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeShorts(short[] sArr) throws KryoException {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, 0L, sArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final int writeVarInt(int i, boolean z) throws KryoException {
        long j = i;
        if (!z) {
            j = (j >> 31) ^ (j << 1);
        }
        long j2 = j & 127;
        long j3 = j >>> 7;
        if (j3 == 0) {
            writeByte((byte) j2);
            return 1;
        }
        long j4 = j2 | 128 | ((j3 & 127) << 8);
        long j5 = j >>> 14;
        if (j5 == 0) {
            writeLittleEndianInt((int) j4);
            this.position -= 2;
            return 2;
        }
        long j6 = j4 | 32768 | ((j5 & 127) << 16);
        long j7 = j >>> 21;
        if (j7 == 0) {
            writeLittleEndianInt((int) j6);
            this.position--;
            return 3;
        }
        long j8 = 8388608 | j6 | ((j7 & 127) << 24);
        long j9 = j >>> 28;
        if (j9 == 0) {
            writeLittleEndianInt((int) j8);
            this.position = this.position;
            return 4;
        }
        writeLittleEndianLong((j8 | SieveCacheKt.NodeMetaAndPreviousMask | ((j9 & 127) << 32)) & 4294967295L);
        this.position -= 3;
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final int writeVarLong(long j, boolean z) throws KryoException {
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        int i = (int) (j2 & 127);
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            write(i);
            return 1;
        }
        int i2 = (int) (((j3 & 127) << 8) | i | 128);
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            writeLittleEndianInt(i2);
            this.position -= 2;
            return 2;
        }
        int i3 = (int) (i2 | 32768 | ((j4 & 127) << 16));
        long j5 = j2 >>> 21;
        if (j5 == 0) {
            writeLittleEndianInt(i3);
            this.position--;
            return 3;
        }
        int i4 = (int) (i3 | 8388608 | ((j5 & 127) << 24));
        long j6 = j2 >>> 28;
        if (j6 == 0) {
            writeLittleEndianInt(i4);
            this.position = this.position;
            return 4;
        }
        long j7 = ((i4 | Integer.MIN_VALUE) & 4294967295L) | ((j6 & 127) << 32);
        long j8 = j2 >>> 35;
        if (j8 == 0) {
            writeLittleEndianLong(j7);
            this.position -= 3;
            return 5;
        }
        long j9 = j7 | Flags.UNION | ((j8 & 127) << 40);
        long j10 = j2 >>> 42;
        if (j10 == 0) {
            writeLittleEndianLong(j9);
            this.position -= 2;
            return 6;
        }
        long j11 = j9 | Flags.THROWS | ((j10 & 127) << 48);
        long j12 = j2 >>> 49;
        if (j12 == 0) {
            writeLittleEndianLong(j11);
            this.position--;
            return 7;
        }
        long j13 = j11 | Flags.DEPRECATED_REMOVAL | ((j12 & 127) << 56);
        if ((j2 >>> 56) == 0) {
            writeLittleEndianLong(j13);
            return 8;
        }
        writeLittleEndianLong(j13 | Long.MIN_VALUE);
        write((byte) (r1 & 127));
        return 9;
    }

    public UnsafeMemoryOutput(int i) {
        this(i, i);
    }

    public UnsafeMemoryOutput() {
        this.varIntsEnabled = false;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeByte(b);
    }

    public UnsafeMemoryOutput(OutputStream outputStream) {
        super(outputStream);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryOutput(long j, int i) {
        super(j, i);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final int writeInt(int i, boolean z) throws KryoException {
        if (!this.varIntsEnabled) {
            writeInt(i);
            return 4;
        }
        return writeVarInt(i, z);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr) throws KryoException {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final int writeLong(long j, boolean z) throws KryoException {
        if (!this.varIntsEnabled) {
            writeLong(j);
            return 8;
        }
        return writeVarLong(j, z);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr) throws KryoException {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
    }

    public final void writeBytes(Object obj, long j, long j2) throws KryoException {
        writeBytes(obj, UnsafeUtil.byteArrayBaseOffset, j, j2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0L, bArr.length);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bytes cannot be null.");
        }
    }
}
