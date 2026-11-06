package com.amazon.device.setup.thrift;

import org.apache.thrift.orig.TEnum;
import org.apache.thrift.orig.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AlexaConnectionState implements TEnum {
    DISCONNECTED(1),
    CONNECTED(2),
    UNKNOWN(3);

    private final int value;

    AlexaConnectionState(int i) {
        this.value = i;
    }

    @Nullable
    public static AlexaConnectionState findByValue(int i) {
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i != 3) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // org.apache.thrift.orig.TEnum
    public int getValue() {
        return this.value;
    }
}
