package com.amazon.ion.impl.bin;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class BlockAllocatorProviders {
    private static final BlockAllocatorProvider BASIC_PROVIDER = new BasicBlockAllocatorProvider();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BasicBlockAllocatorProvider extends BlockAllocatorProvider {
        private BasicBlockAllocatorProvider() {
        }

        @Override // com.amazon.ion.impl.bin.BlockAllocatorProvider
        public BlockAllocator vendAllocator(final int i) {
            return new BlockAllocator() { // from class: com.amazon.ion.impl.bin.BlockAllocatorProviders.BasicBlockAllocatorProvider.1
                @Override // com.amazon.ion.impl.bin.BlockAllocator
                public Block allocateBlock() {
                    return new Block(new byte[i]) { // from class: com.amazon.ion.impl.bin.BlockAllocatorProviders.BasicBlockAllocatorProvider.1.1
                        @Override // com.amazon.ion.impl.bin.Block, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                        }
                    };
                }

                @Override // com.amazon.ion.impl.bin.BlockAllocator
                public int getBlockSize() {
                    return i;
                }

                @Override // com.amazon.ion.impl.bin.BlockAllocator, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }
            };
        }
    }

    private BlockAllocatorProviders() {
    }

    public static BlockAllocatorProvider basicProvider() {
        return BASIC_PROVIDER;
    }
}
