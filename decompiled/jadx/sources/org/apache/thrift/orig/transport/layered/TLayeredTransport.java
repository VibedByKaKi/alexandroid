package org.apache.thrift.orig.transport.layered;

import java.util.Objects;
import org.apache.thrift.orig.TConfiguration;
import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TLayeredTransport extends TTransport {
    private final TTransport innerTransport;

    public TLayeredTransport(TTransport tTransport) {
        Objects.requireNonNull(tTransport, "TTransport cannot be null.");
        this.innerTransport = tTransport;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void checkReadBytesAvailable(long j) throws TTransportException {
        this.innerTransport.checkReadBytesAvailable(j);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public TConfiguration getConfiguration() {
        return this.innerTransport.getConfiguration();
    }

    public TTransport getInnerTransport() {
        return this.innerTransport;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void updateKnownMessageSize(long j) throws TTransportException {
        this.innerTransport.updateKnownMessageSize(j);
    }
}
