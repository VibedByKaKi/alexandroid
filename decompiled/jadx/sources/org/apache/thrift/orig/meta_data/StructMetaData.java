package org.apache.thrift.orig.meta_data;

import org.apache.thrift.orig.TBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StructMetaData extends FieldValueMetaData {
    public final Class<? extends TBase> structClass;

    public StructMetaData(byte b, Class<? extends TBase> cls) {
        super(b);
        this.structClass = cls;
    }
}
