package com.amazon.ion.impl.bin;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class PooledBlockAllocatorProvider extends BlockAllocatorProvider {
    private static final PooledBlockAllocatorProvider INSTANCE = new PooledBlockAllocatorProvider();
    private final ConcurrentMap<Integer, BlockAllocator> allocators = new ConcurrentHashMap();

    private PooledBlockAllocatorProvider() {
    }

    public static PooledBlockAllocatorProvider getInstance() {
        return INSTANCE;
    }

    @Override // com.amazon.ion.impl.bin.BlockAllocatorProvider
    public BlockAllocator vendAllocator(int i) {
        BlockAllocator putIfAbsent;
        if (i > 0) {
            BlockAllocator blockAllocator = this.allocators.get(Integer.valueOf(i));
            return (blockAllocator != null || (putIfAbsent = this.allocators.putIfAbsent(Integer.valueOf(i), (blockAllocator = new PooledBlockAllocator(i)))) == null) ? blockAllocator : putIfAbsent;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid block size: "));
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PooledBlockAllocator extends BlockAllocator {
        static final int FREE_CAPACITY = 67108864;
        private final int blockLimit;
        private final int blockSize;
        private final AtomicInteger size = new AtomicInteger(0);
        private final ConcurrentLinkedQueue<Block> freeBlocks = new ConcurrentLinkedQueue<>();

        public PooledBlockAllocator(int i) {
            this.blockSize = i;
            this.blockLimit = 67108864 / i;
        }

        @Override // com.amazon.ion.impl.bin.BlockAllocator
        public Block allocateBlock() {
            Block poll = this.freeBlocks.poll();
            if (poll == null) {
                return new Block(new byte[this.blockSize]) { // from class: com.amazon.ion.impl.bin.PooledBlockAllocatorProvider.PooledBlockAllocator.1
                    @Override // com.amazon.ion.impl.bin.Block, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        if (PooledBlockAllocator.this.size.getAndIncrement() >= PooledBlockAllocator.this.blockLimit) {
                            PooledBlockAllocator.this.size.decrementAndGet();
                        } else {
                            reset();
                            PooledBlockAllocator.this.freeBlocks.add(this);
                        }
                    }
                };
            }
            this.size.decrementAndGet();
            return poll;
        }

        @Override // com.amazon.ion.impl.bin.BlockAllocator
        public int getBlockSize() {
            return this.blockSize;
        }

        @Override // com.amazon.ion.impl.bin.BlockAllocator, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
