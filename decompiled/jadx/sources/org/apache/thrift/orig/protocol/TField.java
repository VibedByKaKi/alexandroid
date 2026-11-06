package org.apache.thrift.orig.protocol;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TField {
    public final short id;
    public final String name;
    public final byte type;

    public TField(String str, byte b, short s) {
        this.name = str;
        this.type = b;
        this.id = s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TField tField = (TField) obj;
        return this.type == tField.type && this.id == tField.id;
    }

    public int hashCode() {
        return ((this.id + 31) * 31) + this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TField name:'");
        sb.append(this.name);
        sb.append("' type:");
        sb.append((int) this.type);
        sb.append(" field-id:");
        return a$$ExternalSyntheticOutline0.m(sb, this.id, ">");
    }

    public TField() {
        this("", (byte) 0, (short) 0);
    }
}
