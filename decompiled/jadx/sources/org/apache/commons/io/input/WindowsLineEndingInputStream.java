package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private boolean eofSeen;
    private boolean injectSlashN;
    private boolean slashNSeen;
    private boolean slashRSeen;
    private final InputStream target;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z;
    }

    private int eofGame() {
        if (!this.ensureLineFeedAtEndOfFile) {
            return -1;
        }
        boolean z = this.slashNSeen;
        if (!z && !this.slashRSeen) {
            this.slashRSeen = true;
            return 13;
        }
        if (z) {
            return -1;
        }
        this.slashRSeen = false;
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
        this.slashRSeen = read == 13;
        this.slashNSeen = read == 10;
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
        if (this.eofSeen) {
            return eofGame();
        }
        if (this.injectSlashN) {
            this.injectSlashN = false;
            return 10;
        }
        boolean z = this.slashRSeen;
        int readWithUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame();
        }
        if (readWithUpdate != 10 || z) {
            return readWithUpdate;
        }
        this.injectSlashN = true;
        return 13;
    }
}
