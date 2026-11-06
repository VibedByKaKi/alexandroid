package com.amazon.alexa.accessory.transport.gatt;

import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.io.Buffer;
import com.amazon.alexa.accessory.io.Source;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class GattSource implements Source {
    private final Buffer buffer;
    private volatile boolean closed;
    private final Object monitor = new Object();
    private final long timeoutMillis;

    public GattSource(int i, long j) {
        this.timeoutMillis = j;
        this.buffer = new Buffer(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        synchronized (this.monitor) {
            this.monitor.notifyAll();
        }
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            return -1;
        }
        synchronized (this.monitor) {
            try {
                if (this.buffer.size() == 0) {
                    IOUtils.waitUntilNotified(this.monitor, this.timeoutMillis);
                    if (this.closed) {
                        return -1;
                    }
                }
                return this.buffer.read(bArr, i, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void write(Buffer buffer) {
        synchronized (this.monitor) {
            this.buffer.write(buffer.data(), 0, buffer.size());
            this.monitor.notifyAll();
        }
    }
}
