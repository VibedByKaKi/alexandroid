package org.apache.thrift.orig.protocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TList {
    public final byte elemType;
    public final int size;

    public TList(byte b, int i) {
        this.elemType = b;
        this.size = i;
    }

    public byte getElemType() {
        return this.elemType;
    }

    public int getSize() {
        return this.size;
    }

    public TList() {
        this((byte) 0, 0);
    }
}
