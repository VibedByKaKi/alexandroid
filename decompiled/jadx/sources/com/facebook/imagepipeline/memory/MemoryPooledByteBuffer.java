package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class MemoryPooledByteBuffer implements PooledByteBuffer {

    @GuardedBy("this")
    @Nullable
    @VisibleForTesting
    CloseableReference<MemoryChunk> mBufRef;
    private final int mSize;

    public MemoryPooledByteBuffer(CloseableReference<MemoryChunk> closeableReference, int i) {
        Preconditions.checkNotNull(closeableReference);
        Preconditions.checkArgument(Boolean.valueOf(i >= 0 && i <= closeableReference.get().getSize()));
        this.mBufRef = closeableReference.mo23973clone();
        this.mSize = i;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
    }

    public synchronized void ensureValid() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    @Nullable
    public synchronized ByteBuffer getByteBuffer() {
        Preconditions.checkNotNull(this.mBufRef);
        return this.mBufRef.get().getByteBuffer();
    }

    @GuardedBy("this")
    @Nullable
    @VisibleForTesting
    public CloseableReference<MemoryChunk> getCloseableReference() {
        return this.mBufRef;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long getNativePtr() throws UnsupportedOperationException {
        ensureValid();
        Preconditions.checkNotNull(this.mBufRef);
        return this.mBufRef.get().getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !CloseableReference.isValid(this.mBufRef);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte read(int i) {
        ensureValid();
        Preconditions.checkArgument(Boolean.valueOf(i >= 0));
        Preconditions.checkArgument(Boolean.valueOf(i < this.mSize));
        Preconditions.checkNotNull(this.mBufRef);
        return this.mBufRef.get().read(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        ensureValid();
        return this.mSize;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        ensureValid();
        Preconditions.checkArgument(Boolean.valueOf(i + i3 <= this.mSize));
        Preconditions.checkNotNull(this.mBufRef);
        return this.mBufRef.get().read(i, bArr, i2, i3);
    }
}
