package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class TTransportInputStream extends InputStream {
    private TTransport transport;

    public TTransportInputStream(TTransport tTransport) {
        this.transport = tTransport;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            byte[] bArr = new byte[1];
            this.transport.read(bArr, 0, 1);
            return bArr[0];
        } catch (TTransportException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
            return 0;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.transport.read(bArr, i, i2);
        } catch (TTransportException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
            return 0;
        }
    }
}
