package org.apache.thrift.orig.meta_data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SetMetaData extends FieldValueMetaData {
    public final FieldValueMetaData elemMetaData;

    public SetMetaData(byte b, FieldValueMetaData fieldValueMetaData) {
        super(b);
        this.elemMetaData = fieldValueMetaData;
    }
}
