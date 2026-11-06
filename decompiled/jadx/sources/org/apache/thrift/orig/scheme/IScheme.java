package org.apache.thrift.orig.scheme;

import org.apache.thrift.orig.TBase;
import org.apache.thrift.orig.TException;
import org.apache.thrift.orig.protocol.TProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface IScheme<T extends TBase> {
    void read(TProtocol tProtocol, T t) throws TException;

    void write(TProtocol tProtocol, T t) throws TException;
}
