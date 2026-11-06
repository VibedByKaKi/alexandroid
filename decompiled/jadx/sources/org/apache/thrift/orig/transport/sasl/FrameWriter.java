package org.apache.thrift.orig.transport.sasl;

import java.nio.ByteBuffer;
import org.apache.thrift.orig.transport.TNonblockingTransport;
import org.apache.thrift.orig.transport.TTransportException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class FrameWriter {
    protected ByteBuffer frameBytes;

    public abstract ByteBuffer buildFrame(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public void clear() {
        this.frameBytes = null;
    }

    public boolean isComplete() {
        ByteBuffer byteBuffer = this.frameBytes;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public void withHeaderAndPayload(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (isComplete()) {
            this.frameBytes = buildFrame(bArr, i, i2, bArr2, i3, i4);
            return;
        }
        throw new IllegalStateException("Previsous write is not yet complete, with " + this.frameBytes.remaining() + " bytes left.");
    }

    public void withOnlyPayload(byte[] bArr) {
        withOnlyPayload(bArr, 0, bArr.length);
    }

    public abstract void withOnlyPayload(byte[] bArr, int i, int i2);

    public void write(TNonblockingTransport tNonblockingTransport) throws TTransportException {
        tNonblockingTransport.write(this.frameBytes);
    }

    public void withHeaderAndPayload(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        if (bArr == null) {
            withOnlyPayload(bArr3);
        } else {
            withHeaderAndPayload(bArr, 0, bArr.length, bArr3, 0, bArr3.length);
        }
    }
}
