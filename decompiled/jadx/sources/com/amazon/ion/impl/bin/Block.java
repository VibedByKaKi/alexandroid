package com.amazon.ion.impl.bin;

import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class Block implements Closeable {
    public final byte[] data;
    public int limit = 0;

    public Block(byte[] bArr) {
        this.data = bArr;
    }

    public final int capacity() {
        return this.data.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final int remaining() {
        return this.data.length - this.limit;
    }

    public final void reset() {
        this.limit = 0;
    }
}
