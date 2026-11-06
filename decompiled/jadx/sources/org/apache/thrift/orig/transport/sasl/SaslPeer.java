package org.apache.thrift.orig.transport.sasl;

import org.apache.thrift.orig.transport.TTransportException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface SaslPeer {
    void dispose();

    byte[] evaluate(byte[] bArr) throws TSaslNegotiationException;

    boolean isAuthenticated();

    boolean isDataProtected();

    default byte[] unwrap(byte[] bArr) throws TTransportException {
        return unwrap(bArr, 0, bArr.length);
    }

    byte[] unwrap(byte[] bArr, int i, int i2) throws TTransportException;

    default byte[] wrap(byte[] bArr) throws TTransportException {
        return wrap(bArr, 0, bArr.length);
    }

    byte[] wrap(byte[] bArr, int i, int i2) throws TTransportException;
}
