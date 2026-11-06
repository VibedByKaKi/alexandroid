package org.apache.thrift.orig.transport.sasl;

import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FrameHeaderReader {
    void clear();

    boolean isComplete();

    int payloadSize();

    boolean read(TTransport tTransport) throws TSaslNegotiationException, TTransportException;

    byte[] toBytes();
}
