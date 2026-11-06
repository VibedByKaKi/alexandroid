package org.apache.thrift.orig.partial;

import java.nio.ByteBuffer;
import org.apache.thrift.orig.TEnum;
import org.apache.thrift.orig.TFieldIdEnum;
import org.apache.thrift.orig.partial.ThriftMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ThriftFieldValueProcessor<V> {
    Object createNewList(int i);

    Object createNewMap(int i);

    Object createNewSet(int i);

    Object createNewStruct(ThriftMetadata.ThriftStruct thriftStruct);

    Object prepareBinary(ByteBuffer byteBuffer);

    Object prepareEnum(Class<? extends TEnum> cls, int i);

    Object prepareList(Object obj);

    Object prepareMap(Object obj);

    Object prepareSet(Object obj);

    Object prepareString(ByteBuffer byteBuffer);

    V prepareStruct(Object obj);

    void setBinary(V v, TFieldIdEnum tFieldIdEnum, ByteBuffer byteBuffer);

    void setBool(V v, TFieldIdEnum tFieldIdEnum, boolean z);

    void setByte(V v, TFieldIdEnum tFieldIdEnum, byte b);

    void setDouble(V v, TFieldIdEnum tFieldIdEnum, double d);

    void setEnumField(V v, TFieldIdEnum tFieldIdEnum, Object obj);

    void setInt16(V v, TFieldIdEnum tFieldIdEnum, short s);

    void setInt32(V v, TFieldIdEnum tFieldIdEnum, int i);

    void setInt64(V v, TFieldIdEnum tFieldIdEnum, long j);

    void setListElement(Object obj, int i, Object obj2);

    void setListField(V v, TFieldIdEnum tFieldIdEnum, Object obj);

    void setMapElement(Object obj, int i, Object obj2, Object obj3);

    void setMapField(V v, TFieldIdEnum tFieldIdEnum, Object obj);

    void setSetElement(Object obj, int i, Object obj2);

    void setSetField(V v, TFieldIdEnum tFieldIdEnum, Object obj);

    void setString(V v, TFieldIdEnum tFieldIdEnum, ByteBuffer byteBuffer);

    void setStructField(V v, TFieldIdEnum tFieldIdEnum, Object obj);
}
