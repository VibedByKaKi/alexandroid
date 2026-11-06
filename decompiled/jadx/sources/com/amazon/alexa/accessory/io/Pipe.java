package com.amazon.alexa.accessory.io;

import com.amazon.alexa.accessory.internal.util.IOUtils;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Pipe implements Source, Sink {
    private final byte[] buffer;
    private final int capacity;
    private volatile boolean closed;
    private volatile int size;
    private final long timeoutMillis;

    public Pipe(int i, long j) {
        this.capacity = i;
        this.timeoutMillis = j;
        this.buffer = new byte[i];
    }

    private void checkClosed() throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Pipe is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        synchronized (this.buffer) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                this.buffer.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.accessory.io.Sink
    public void flush() throws IOException {
        synchronized (this.buffer) {
            while (this.size > 0) {
                try {
                    checkClosed();
                    IOUtils.waitUntilNotified(this.buffer, this.timeoutMillis);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this.buffer) {
            while (this.size == 0) {
                try {
                    if (this.closed) {
                        return -1;
                    }
                    IOUtils.waitUntilNotified(this.buffer, this.timeoutMillis);
                } catch (Throwable th) {
                    throw th;
                }
            }
            int min = Math.min(i2, this.size);
            System.arraycopy(this.buffer, 0, bArr, i, min);
            if (this.size > min) {
                byte[] bArr2 = this.buffer;
                System.arraycopy(bArr2, min, bArr2, 0, this.size - min);
            }
            this.size -= min;
            this.buffer.notifyAll();
            return min;
        }
    }

    @Override // com.amazon.alexa.accessory.io.Sink
    public void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this.buffer) {
            int i3 = 0;
            while (true) {
                int i4 = i2 - i3;
                if (i4 > 0) {
                    try {
                        checkClosed();
                        int i5 = this.capacity - this.size;
                        if (i5 == 0) {
                            IOUtils.waitUntilNotified(this.buffer, this.timeoutMillis);
                        } else {
                            int min = Math.min(i5, i4);
                            System.arraycopy(bArr, i + i3, this.buffer, this.size, min);
                            i3 += min;
                            this.size += min;
                            this.buffer.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }
}
