package org.apache.thrift.orig.protocol;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.apache.thrift.orig.TException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TWriteProtocol {
    void writeBinary(ByteBuffer byteBuffer) throws TException;

    void writeBool(boolean z) throws TException;

    void writeByte(byte b) throws TException;

    void writeDouble(double d) throws TException;

    void writeFieldBegin(TField tField) throws TException;

    void writeFieldEnd() throws TException;

    void writeFieldStop() throws TException;

    void writeI16(short s) throws TException;

    void writeI32(int i) throws TException;

    void writeI64(long j) throws TException;

    void writeListBegin(TList tList) throws TException;

    void writeListEnd() throws TException;

    void writeMapBegin(TMap tMap) throws TException;

    void writeMapEnd() throws TException;

    void writeMessageBegin(TMessage tMessage) throws TException;

    void writeMessageEnd() throws TException;

    void writeSetBegin(TSet tSet) throws TException;

    void writeSetEnd() throws TException;

    void writeString(String str) throws TException;

    void writeStructBegin(TStruct tStruct) throws TException;

    void writeStructEnd() throws TException;

    void writeUuid(UUID uuid) throws TException;
}
