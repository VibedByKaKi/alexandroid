package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class PooledByteBufferInputStream extends InputStream {

    @VisibleForTesting
    int mMark;

    @VisibleForTesting
    int mOffset;

    @VisibleForTesting
    final PooledByteBuffer mPooledByteBuffer;

    public PooledByteBufferInputStream(PooledByteBuffer pooledByteBuffer) {
        Preconditions.checkArgument(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.mPooledByteBuffer = (PooledByteBuffer) Preconditions.checkNotNull(pooledByteBuffer);
        this.mOffset = 0;
        this.mMark = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mPooledByteBuffer.size() - this.mOffset;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.mMark = this.mOffset;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            TableInfo$$ExternalSyntheticOutline0.m(sb, bArr.length, "; regionStart=", i, "; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.mPooledByteBuffer.read(this.mOffset, bArr, i, min);
        this.mOffset += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.mOffset = this.mMark;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        Preconditions.checkArgument(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.mOffset += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.mPooledByteBuffer;
        int i = this.mOffset;
        this.mOffset = i + 1;
        return pooledByteBuffer.read(i) & 255;
    }
}
