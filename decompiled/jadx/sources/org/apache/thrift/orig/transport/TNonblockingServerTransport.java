package org.apache.thrift.orig.transport;

import java.nio.channels.Selector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TNonblockingServerTransport extends TServerTransport {
    @Override // org.apache.thrift.orig.transport.TServerTransport
    public abstract TNonblockingTransport accept() throws TTransportException;

    public abstract void registerSelector(Selector selector);
}
