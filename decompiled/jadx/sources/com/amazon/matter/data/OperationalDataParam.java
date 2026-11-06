package com.amazon.matter.data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum OperationalDataParam {
    EXTENDED_PAN_ID((byte) 2, (byte) 8),
    PAN_ID((byte) 1, (byte) 2),
    NETWORK_KEY((byte) 5, (byte) 16),
    CHANNEL((byte) 0, (byte) 3),
    NETWORK_NAME((byte) 3, (byte) 16);

    private final byte length;
    private final byte type;

    OperationalDataParam(byte b, byte b2) {
        this.type = b;
        this.length = b2;
    }

    public byte getLength() {
        return this.length;
    }

    public byte getType() {
        return this.type;
    }
}
