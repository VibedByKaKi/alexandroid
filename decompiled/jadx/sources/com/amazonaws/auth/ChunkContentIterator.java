package com.amazonaws.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class ChunkContentIterator {
    private int pos;
    private final byte[] signedChunk;

    public ChunkContentIterator(byte[] bArr) {
        this.signedChunk = bArr;
    }

    public boolean hasNext() {
        return this.pos < this.signedChunk.length;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (!hasNext()) {
            return -1;
        }
        int min = Math.min(this.signedChunk.length - this.pos, i2);
        System.arraycopy(this.signedChunk, this.pos, bArr, i, min);
        this.pos += min;
        return min;
    }
}
