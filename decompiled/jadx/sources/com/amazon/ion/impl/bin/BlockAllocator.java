package com.amazon.ion.impl.bin;

import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class BlockAllocator implements Closeable {
    public abstract Block allocateBlock();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract int getBlockSize();
}
