package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class TTransportOutputStream extends OutputStream {
    private TTransport transport;

    public TTransportOutputStream(TTransport tTransport) {
        this.transport = tTransport;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.transport.flush();
        } catch (TTransportException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.transport.write(new byte[]{(byte) i});
        } catch (TTransportException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.transport.write(bArr, i, i2);
        } catch (TTransportException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
        }
    }
}
