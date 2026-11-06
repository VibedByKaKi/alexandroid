package org.apache.thrift.orig.protocol;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TMessage {
    public final String name;
    public final int seqid;
    public final byte type;

    public TMessage(String str, byte b, int i) {
        this.name = str;
        this.type = b;
        this.seqid = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TMessage.class != obj.getClass()) {
            return false;
        }
        TMessage tMessage = (TMessage) obj;
        String str = this.name;
        String str2 = tMessage.name;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return this.seqid == tMessage.seqid && this.type == tMessage.type;
    }

    public String getName() {
        return this.name;
    }

    public int getSeqid() {
        return this.seqid;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        return (((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.seqid) * 31) + this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TMessage name:'");
        sb.append(this.name);
        sb.append("' type: ");
        sb.append((int) this.type);
        sb.append(" seqid:");
        return a$$ExternalSyntheticOutline0.m(sb, this.seqid, ">");
    }

    public TMessage() {
        this("", (byte) 0, 0);
    }
}
