package org.apache.thrift.orig.transport;

import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import org.apache.thrift.orig.TByteArrayOutputStream;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TMemoryTransport extends TEndpointTransport {
    private final ByteBuffer inputBuffer;
    private final TByteArrayOutputStream outputBuffer;

    public TMemoryTransport(byte[] bArr) throws TTransportException {
        super(new TConfiguration());
        this.inputBuffer = ByteBuffer.wrap(bArr);
        this.outputBuffer = new TByteArrayOutputStream(1024);
        updateKnownMessageSize(bArr.length);
    }

    public TByteArrayOutputStream getOutput() {
        return this.outputBuffer;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        checkReadBytesAvailable(i2);
        int remaining = this.inputBuffer.remaining();
        if (remaining < i2) {
            throw new TTransportException(4, a$$ExternalSyntheticOutline0.m("There's only ", remaining, "bytes, but it asks for ", i2));
        }
        this.inputBuffer.get(bArr, i, i2);
        return i2;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        this.outputBuffer.write(bArr, i, i2);
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() {
    }

    public TMemoryTransport(TConfiguration tConfiguration, byte[] bArr) throws TTransportException {
        super(tConfiguration);
        this.inputBuffer = ByteBuffer.wrap(bArr);
        this.outputBuffer = new TByteArrayOutputStream(1024);
        updateKnownMessageSize(bArr.length);
    }
}
