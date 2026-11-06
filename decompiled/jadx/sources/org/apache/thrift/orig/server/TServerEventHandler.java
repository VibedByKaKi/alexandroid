package org.apache.thrift.orig.server;

import org.apache.thrift.orig.protocol.TProtocol;
import org.apache.thrift.orig.transport.TTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TServerEventHandler {
    ServerContext createContext(TProtocol tProtocol, TProtocol tProtocol2);

    void deleteContext(ServerContext serverContext, TProtocol tProtocol, TProtocol tProtocol2);

    void preServe();

    void processContext(ServerContext serverContext, TTransport tTransport, TTransport tTransport2);
}
