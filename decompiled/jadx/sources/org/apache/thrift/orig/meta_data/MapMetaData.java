package org.apache.thrift.orig.meta_data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MapMetaData extends FieldValueMetaData {
    public final FieldValueMetaData keyMetaData;
    public final FieldValueMetaData valueMetaData;

    public MapMetaData(byte b, FieldValueMetaData fieldValueMetaData, FieldValueMetaData fieldValueMetaData2) {
        super(b);
        this.keyMetaData = fieldValueMetaData;
        this.valueMetaData = fieldValueMetaData2;
    }
}
