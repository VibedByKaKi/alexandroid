package com.amazon.coral.google.common.hash;

import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
/* loaded from: classes19.dex */
abstract class AbstractByteHasher extends AbstractHasher {
    private final ByteBuffer scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        update(bArr, i, i2);
        return this;
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putChar(char c) {
        this.scratch.putChar(c);
        return update(2);
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putInt(int i) {
        this.scratch.putInt(i);
        return update(4);
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putLong(long j) {
        this.scratch.putLong(j);
        return update(8);
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
        this.scratch.putShort(s);
        return update(2);
    }

    public abstract void update(byte b);

    public void update(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            update(byteBuffer.get());
        }
    }

    @Override // com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        update(bArr);
        return this;
    }

    @Override // com.amazon.coral.google.common.hash.AbstractHasher, com.amazon.coral.google.common.hash.Hasher, com.amazon.coral.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
        update(byteBuffer);
        return this;
    }

    public void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            update(bArr[i3]);
        }
    }

    private Hasher update(int i) {
        try {
            update(this.scratch.array(), 0, i);
            return this;
        } finally {
            Java8Compatibility.clear(this.scratch);
        }
    }
}
