package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class PooledByteStreams {
    private static final int DEFAULT_TEMP_BUF_SIZE = 16384;
    private final ByteArrayPool mByteArrayPool;
    private final int mTempBufSize;

    @VisibleForTesting
    public PooledByteStreams(ByteArrayPool byteArrayPool, int i) {
        Preconditions.checkArgument(Boolean.valueOf(i > 0));
        this.mTempBufSize = i;
        this.mByteArrayPool = byteArrayPool;
    }

    public long copy(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        long j2 = 0;
        Preconditions.checkState(j > 0);
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        while (j2 < j) {
            try {
                int read = inputStream.read(bArr, 0, (int) Math.min(this.mTempBufSize, j - j2));
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                j2 += read;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
        return j2;
    }

    public PooledByteStreams(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 16384);
    }

    public long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.mTempBufSize);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
    }
}
