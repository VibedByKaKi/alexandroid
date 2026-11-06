package org.apache.thrift.orig.meta_data;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FieldValueMetaData implements Serializable {
    private final boolean isBinary;
    private final boolean isTypedefType;
    public final byte type;
    private final String typedefName;

    public FieldValueMetaData(byte b, boolean z) {
        this.type = b;
        this.isTypedefType = false;
        this.typedefName = null;
        this.isBinary = z;
    }

    public String getTypedefName() {
        return this.typedefName;
    }

    public boolean isBinary() {
        return this.isBinary;
    }

    public boolean isContainer() {
        byte b = this.type;
        return b == 15 || b == 13 || b == 14;
    }

    public boolean isStruct() {
        return this.type == 12;
    }

    public boolean isTypedef() {
        return this.isTypedefType;
    }

    public FieldValueMetaData(byte b) {
        this(b, false);
    }

    public FieldValueMetaData(byte b, String str) {
        this.type = b;
        this.isTypedefType = true;
        this.typedefName = str;
        this.isBinary = false;
    }
}
