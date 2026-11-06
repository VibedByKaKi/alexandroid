package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.handlers.ProgressListener;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class ProgressInputStream extends InputStream {
    private final InputStream mInputStream;
    private long mMaxProgress;
    private long mProgress;
    private final ProgressListener mProgressListener;

    public ProgressInputStream(InputStream inputStream, long j, ProgressListener progressListener) {
        this.mInputStream = inputStream;
        this.mMaxProgress = j;
        this.mProgressListener = progressListener;
    }

    private long updateProgress(long j) {
        ProgressListener progressListener = this.mProgressListener;
        if (progressListener != null && j > 0) {
            long j2 = this.mProgress + j;
            this.mProgress = j2;
            progressListener.onProgress(j2, this.mMaxProgress);
        }
        return j;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mInputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mInputStream.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.mInputStream.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.mInputStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return updateProgress(this.mInputStream.read());
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.mInputStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return updateProgress(this.mInputStream.skip(j));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return updateProgress(this.mInputStream.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return updateProgress(this.mInputStream.read(bArr, i, i2));
    }

    private int updateProgress(int i) {
        updateProgress(i);
        return i;
    }
}
