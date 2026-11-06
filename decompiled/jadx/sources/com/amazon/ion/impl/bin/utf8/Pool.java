package com.amazon.ion.impl.bin.utf8;

import com.amazon.ion.impl.bin.utf8.Poolable;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Pool<T extends Poolable<?>> {
    private static final int MAX_QUEUE_SIZE = 128;
    private final Allocator<T> allocator;
    private final ArrayBlockingQueue<T> bufferQueue = new ArrayBlockingQueue<>(128);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Allocator<T extends Poolable<?>> {
        T newInstance(Pool<T> pool);
    }

    public Pool(Allocator<T> allocator) {
        this.allocator = allocator;
    }

    public T getOrCreate() {
        T poll = this.bufferQueue.poll();
        return poll == null ? this.allocator.newInstance(this) : poll;
    }

    public void returnToPool(T t) {
        this.bufferQueue.offer(t);
    }
}
