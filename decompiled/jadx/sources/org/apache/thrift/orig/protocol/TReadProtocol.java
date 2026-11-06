package org.apache.thrift.orig.protocol;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.apache.thrift.orig.TException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TReadProtocol {
    ByteBuffer readBinary() throws TException;

    boolean readBool() throws TException;

    byte readByte() throws TException;

    double readDouble() throws TException;

    TField readFieldBegin() throws TException;

    void readFieldEnd() throws TException;

    short readI16() throws TException;

    int readI32() throws TException;

    long readI64() throws TException;

    TList readListBegin() throws TException;

    void readListEnd() throws TException;

    TMap readMapBegin() throws TException;

    void readMapEnd() throws TException;

    TMessage readMessageBegin() throws TException;

    void readMessageEnd() throws TException;

    TSet readSetBegin() throws TException;

    void readSetEnd() throws TException;

    String readString() throws TException;

    TStruct readStructBegin() throws TException;

    void readStructEnd() throws TException;

    UUID readUuid() throws TException;
}
