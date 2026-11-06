package org.apache.thrift.orig;

import java.io.Serializable;
import org.apache.thrift.orig.TBase;
import org.apache.thrift.orig.TFieldIdEnum;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TBase<T extends TBase<T, F>, F extends TFieldIdEnum> extends Comparable<T>, TSerializable, Serializable {
    void clear();

    T deepCopy();

    F fieldForId(int i);

    Object getFieldValue(F f);

    boolean isSet(F f);

    void setFieldValue(F f, Object obj);
}
