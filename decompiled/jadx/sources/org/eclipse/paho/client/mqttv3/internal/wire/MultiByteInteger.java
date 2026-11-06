package org.eclipse.paho.client.mqttv3.internal.wire;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MultiByteInteger {
    private int length;
    private int value;

    public MultiByteInteger(int i, int i2) {
        this.value = i;
        this.length = i2;
    }

    public int getEncodedLength() {
        return this.length;
    }

    public int getValue() {
        return this.value;
    }

    public MultiByteInteger(int i) {
        this(i, -1);
    }
}
