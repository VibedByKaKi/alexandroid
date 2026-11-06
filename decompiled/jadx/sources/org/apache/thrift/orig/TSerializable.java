package org.apache.thrift.orig;

import org.apache.thrift.orig.protocol.TProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TSerializable {
    void read(TProtocol tProtocol) throws TException;

    void write(TProtocol tProtocol) throws TException;
}
