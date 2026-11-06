package org.apache.thrift.orig.async;

import org.apache.thrift.orig.async.TAsyncClient;
import org.apache.thrift.orig.transport.TNonblockingTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TAsyncClientFactory<T extends TAsyncClient> {
    T getAsyncClient(TNonblockingTransport tNonblockingTransport);
}
