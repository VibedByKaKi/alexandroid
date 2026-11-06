package org.apache.thrift.orig.transport;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TTransport implements Closeable {
    public abstract void checkReadBytesAvailable(long j) throws TTransportException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public byte[] getBuffer() {
        return null;
    }

    public int getBufferPosition() {
        return 0;
    }

    public int getBytesRemainingInBuffer() {
        return -1;
    }

    public abstract TConfiguration getConfiguration();

    public abstract boolean isOpen();

    public abstract void open() throws TTransportException;

    public boolean peek() {
        return isOpen();
    }

    public int read(ByteBuffer byteBuffer) throws TTransportException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        int read = read(bArr, 0, remaining);
        byteBuffer.put(bArr, 0, read);
        return read;
    }

    public abstract int read(byte[] bArr, int i, int i2) throws TTransportException;

    public int readAll(byte[] bArr, int i, int i2) throws TTransportException {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                throw new TTransportException(ErrorUtils$$ExternalSyntheticOutline0.m(i2, i3, "Cannot read. Remote side has closed. Tried to read ", " bytes, but only got ", " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)"));
            }
            i3 += read;
        }
        return i3;
    }

    public abstract void updateKnownMessageSize(long j) throws TTransportException;

    public int write(ByteBuffer byteBuffer) throws TTransportException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        write(bArr, 0, remaining);
        return remaining;
    }

    public abstract void write(byte[] bArr, int i, int i2) throws TTransportException;

    public void write(byte[] bArr) throws TTransportException {
        write(bArr, 0, bArr.length);
    }

    public void flush() throws TTransportException {
    }

    public void consumeBuffer(int i) {
    }
}
