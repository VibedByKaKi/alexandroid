package org.apache.thrift.orig.protocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TMap {
    public final byte keyType;
    public final int size;
    public final byte valueType;

    public TMap(byte b, byte b2, int i) {
        this.keyType = b;
        this.valueType = b2;
        this.size = i;
    }

    public byte getKeyType() {
        return this.keyType;
    }

    public int getSize() {
        return this.size;
    }

    public byte getValueType() {
        return this.valueType;
    }

    public TMap() {
        this((byte) 0, (byte) 0, 0);
    }
}
