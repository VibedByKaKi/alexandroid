package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class UnixLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private boolean eofSeen;
    private boolean slashNSeen;
    private boolean slashRSeen;
    private final InputStream target;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z;
    }

    private int eofGame(boolean z) {
        if (z || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() throws IOException {
        int read = this.target.read();
        boolean z = read == -1;
        this.eofSeen = z;
        if (z) {
            return read;
        }
        this.slashNSeen = read == 10;
        this.slashRSeen = read == 13;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw UnsupportedOperationExceptions.mark();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z);
        }
        int readWithUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z && this.slashNSeen) ? read() : readWithUpdate;
    }
}
