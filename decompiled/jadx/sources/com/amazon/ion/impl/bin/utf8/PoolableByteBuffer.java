package com.amazon.ion.impl.bin.utf8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PoolableByteBuffer extends Poolable<PoolableByteBuffer> {
    static final int BUFFER_SIZE_IN_BYTES = 4096;
    private final ByteBuffer buffer;

    public PoolableByteBuffer(Pool<PoolableByteBuffer> pool) {
        super(pool);
        this.buffer = ByteBuffer.allocate(4096);
    }

    @Override // com.amazon.ion.impl.bin.utf8.Poolable, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ByteBuffer getBuffer() {
        return this.buffer;
    }
}
