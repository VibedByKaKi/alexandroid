package org.apache.commons.io.input;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class RandomAccessFileInputStream extends InputStream {
    private final boolean closeOnClose;
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, boolean z) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.randomAccessFile = randomAccessFile;
        this.closeOnClose = z;
    }

    private void seek(long j) throws IOException {
        this.randomAccessFile.seek(j);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long availableLong = availableLong();
        if (availableLong > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) availableLong;
    }

    public long availableLong() throws IOException {
        return this.randomAccessFile.length() - this.randomAccessFile.getFilePointer();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.closeOnClose) {
            this.randomAccessFile.close();
        }
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    public boolean isCloseOnClose() {
        return this.closeOnClose;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        long filePointer = this.randomAccessFile.getFilePointer();
        long length = this.randomAccessFile.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j2 = j + filePointer;
        if (j2 > length) {
            j2 = length - 1;
        }
        if (j2 > 0) {
            seek(j2);
        }
        return this.randomAccessFile.getFilePointer() - filePointer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.randomAccessFile.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.randomAccessFile.read(bArr, i, i2);
    }

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }
}
