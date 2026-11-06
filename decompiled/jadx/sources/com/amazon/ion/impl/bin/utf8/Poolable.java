package com.amazon.ion.impl.bin.utf8;

import com.amazon.ion.impl.bin.utf8.Poolable;
import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class Poolable<T extends Poolable<T>> implements Closeable {
    private final Pool<T> pool;

    public Poolable(Pool<T> pool) {
        this.pool = pool;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.pool.returnToPool(this);
    }
}
