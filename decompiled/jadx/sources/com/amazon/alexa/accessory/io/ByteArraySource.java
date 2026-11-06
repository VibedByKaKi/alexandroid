package com.amazon.alexa.accessory.io;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ByteArraySource implements SizedSource {
    private final byte[] bytes;
    private final int count;
    private final int offset;
    private volatile int position;

    public ByteArraySource(byte[] bArr, int i, int i2) {
        Preconditions.notNegative(i, "offset");
        Preconditions.notNegative(i2, "count");
        Preconditions.notNull(bArr, "bytes");
        Preconditions.precondition(i + i2 <= bArr.length, "offset+count can't be larger than array size.");
        this.bytes = bArr;
        this.offset = i;
        this.count = i2;
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(byte[] bArr, int i, int i2) {
        Preconditions.notNull(bArr, "buffer");
        Preconditions.notNegative(i, "bufferOffset");
        Preconditions.notNegative(i2, "bufferCount");
        Preconditions.precondition(Math.min(this.count - this.position, i2) + i <= bArr.length, "Supplied buffer shouldn't overflow.");
        int i3 = this.position;
        int i4 = this.count;
        if (i3 == i4) {
            return -1;
        }
        int min = Math.min(i4 - this.position, i2);
        System.arraycopy(this.bytes, this.offset + this.position, bArr, i, min);
        this.position += min;
        return min;
    }

    @Override // com.amazon.alexa.accessory.io.SizedSource
    public void reset() {
        this.position = 0;
    }

    @Override // com.amazon.alexa.accessory.io.SizedSource
    public int size() {
        return this.count;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public ByteArraySource(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
