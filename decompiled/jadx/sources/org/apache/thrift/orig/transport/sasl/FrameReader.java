package org.apache.thrift.orig.transport.sasl;

import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import org.apache.thrift.orig.transport.TEOFException;
import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.transport.sasl.FrameHeaderReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class FrameReader<T extends FrameHeaderReader> {
    private final T header;
    private ByteBuffer payload;

    public FrameReader(T t) {
        this.header = t;
    }

    public static int readAvailable(TTransport tTransport, ByteBuffer byteBuffer) throws TTransportException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Trying to fill a full recipient with " + byteBuffer.limit() + " bytes");
        }
        int position = byteBuffer.position();
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + position;
        int remaining = byteBuffer.remaining();
        int read = tTransport.read(array, arrayOffset, remaining);
        if (read < 0) {
            throw new TEOFException(a$$ExternalSyntheticOutline0.m(remaining, "Transport is closed, while trying to read ", " bytes"));
        }
        byteBuffer.position(position + read);
        return read;
    }

    private boolean readHeader(TTransport tTransport) throws TSaslNegotiationException, TTransportException {
        return this.header.read(tTransport);
    }

    private boolean readPayload(TTransport tTransport) throws TTransportException {
        readAvailable(tTransport, this.payload);
        return this.payload.hasRemaining();
    }

    public void clear() {
        this.header.clear();
        this.payload = null;
    }

    public T getHeader() {
        return this.header;
    }

    public int getHeaderSize() {
        return this.header.toBytes().length;
    }

    public byte[] getPayload() {
        return this.payload.array();
    }

    public int getPayloadSize() {
        return this.header.payloadSize();
    }

    public boolean isComplete() {
        ByteBuffer byteBuffer = this.payload;
        return (byteBuffer == null || byteBuffer.hasRemaining()) ? false : true;
    }

    public boolean read(TTransport tTransport) throws TSaslNegotiationException, TTransportException {
        if (!this.header.isComplete()) {
            if (!readHeader(tTransport)) {
                return false;
            }
            this.payload = ByteBuffer.allocate(this.header.payloadSize());
        }
        if (this.header.payloadSize() == 0) {
            return true;
        }
        return readPayload(tTransport);
    }
}
