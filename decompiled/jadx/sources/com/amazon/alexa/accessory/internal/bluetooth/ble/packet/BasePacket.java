package com.amazon.alexa.accessory.internal.bluetooth.ble.packet;

import com.amazon.alexa.accessory.internal.util.ByteUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class BasePacket {
    private byte[] data;
    private int packetLength;

    public BasePacket(byte[] bArr, int i, int i2) {
        Preconditions.notNull(bArr, "packetData");
        Preconditions.notNegative(i, "offset");
        Preconditions.notNegative(i2, "packetLength");
        byte[] bArr2 = new byte[i2];
        this.data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.packetLength = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((BasePacket) obj).data);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPacketLength() {
        return this.packetLength;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return getClass().getSimpleName() + "{data=[" + ByteUtils.bytesToHex(this.data) + "]}";
    }
}
