package org.apache.thrift.orig.async;

import org.apache.thrift.orig.protocol.TProtocolFactory;
import org.apache.thrift.orig.transport.TNonblockingTransport;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TAsyncClient {
    protected TAsyncMethodCall<?> ___currentMethod;
    private Exception ___error;
    protected final TAsyncClientManager ___manager;
    protected final TProtocolFactory ___protocolFactory;
    private long ___timeout;
    protected final TNonblockingTransport ___transport;

    public TAsyncClient(TProtocolFactory tProtocolFactory, TAsyncClientManager tAsyncClientManager, TNonblockingTransport tNonblockingTransport, long j) {
        this.___protocolFactory = tProtocolFactory;
        this.___manager = tAsyncClientManager;
        this.___transport = tNonblockingTransport;
        this.___timeout = j;
    }

    public void checkReady() {
        TAsyncMethodCall<?> tAsyncMethodCall = this.___currentMethod;
        if (tAsyncMethodCall != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Client is currently executing another method: ".concat(tAsyncMethodCall.getClass().getName()));
            return;
        }
        Exception exc = this.___error;
        if (exc == null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Client has an error!", exc);
    }

    public Exception getError() {
        return this.___error;
    }

    public TProtocolFactory getProtocolFactory() {
        return this.___protocolFactory;
    }

    public long getTimeout() {
        return this.___timeout;
    }

    public boolean hasError() {
        return this.___error != null;
    }

    public boolean hasTimeout() {
        return this.___timeout > 0;
    }

    public void onComplete() {
        this.___currentMethod = null;
    }

    public void onError(Exception exc) {
        this.___transport.close();
        this.___currentMethod = null;
        this.___error = exc;
    }

    public void setTimeout(long j) {
        this.___timeout = j;
    }

    public TAsyncClient(TProtocolFactory tProtocolFactory, TAsyncClientManager tAsyncClientManager, TNonblockingTransport tNonblockingTransport) {
        this(tProtocolFactory, tAsyncClientManager, tNonblockingTransport, 0L);
    }
}
