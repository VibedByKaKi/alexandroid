package org.apache.commons.io.input;

import androidx.collection.SieveCacheKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NullInputStream extends InputStream {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream(long j, boolean z, boolean z2) {
        this.mark = -1L;
        this.size = j;
        this.markSupported = z;
        this.throwEofException = z2;
    }

    private int doEndOfFile() throws EOFException {
        this.eof = true;
        if (!this.throwEofException) {
            return -1;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3();
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        long j = this.size - this.position;
        if (j <= 0) {
            return 0;
        }
        if (j > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (!this.markSupported) {
            throw UnsupportedOperationExceptions.mark();
        }
        this.mark = this.position;
        this.readlimit = i;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.markSupported;
    }

    public int processByte() {
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.eof) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Read after end of file");
            return 0;
        }
        long j = this.position;
        long j2 = this.size;
        if (j == j2) {
            return doEndOfFile();
        }
        long j3 = j + i2;
        this.position = j3;
        if (j3 > j2) {
            i2 -= (int) (j3 - j2);
            this.position = j2;
        }
        processBytes(bArr, i, i2);
        return i2;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!this.markSupported) {
            throw UnsupportedOperationExceptions.reset();
        }
        long j = this.mark;
        if (j < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.position > this.readlimit + j) {
            throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + MarkdownConstants.RIGHT_BRACKET);
        }
        this.position = j;
        this.eof = false;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (this.eof) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Skip after end of file");
            return 0L;
        }
        long j2 = this.position;
        long j3 = this.size;
        if (j2 == j3) {
            return doEndOfFile();
        }
        long j4 = j2 + j;
        this.position = j4;
        if (j4 <= j3) {
            return j;
        }
        long j5 = j - (j4 - j3);
        this.position = j3;
        return j5;
    }

    public NullInputStream(long j) {
        this(j, true, false);
    }

    public NullInputStream() {
        this(0L, true, false);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.eof) {
            long j = this.position;
            if (j == this.size) {
                return doEndOfFile();
            }
            this.position = j + 1;
            return processByte();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Read after end of file");
        return 0;
    }

    public void processBytes(byte[] bArr, int i, int i2) {
    }
}
