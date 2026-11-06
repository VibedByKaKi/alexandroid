package com.amazon.ion.impl.bin.utf8;

import com.amazon.ion.impl.bin.utf8.Pool;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ByteBufferPool extends Pool<PoolableByteBuffer> {
    private static final ByteBufferPool INSTANCE = new ByteBufferPool();

    private ByteBufferPool() {
        super(new Pool.Allocator<PoolableByteBuffer>() { // from class: com.amazon.ion.impl.bin.utf8.ByteBufferPool.1
            @Override // com.amazon.ion.impl.bin.utf8.Pool.Allocator
            public PoolableByteBuffer newInstance(Pool<PoolableByteBuffer> pool) {
                return new PoolableByteBuffer(pool);
            }
        });
    }

    public static ByteBufferPool getInstance() {
        return INSTANCE;
    }
}
