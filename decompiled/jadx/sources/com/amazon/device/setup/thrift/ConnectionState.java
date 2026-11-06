package com.amazon.device.setup.thrift;

import org.apache.thrift.orig.TEnum;
import org.apache.thrift.orig.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum ConnectionState implements TEnum {
    NOT_CONNECTED(1),
    CONNECTED(2),
    OUTOFRANGE(3),
    UNKNOWN(4);

    private final int value;

    ConnectionState(int i) {
        this.value = i;
    }

    @Nullable
    public static ConnectionState findByValue(int i) {
        if (i == 1) {
            return NOT_CONNECTED;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return OUTOFRANGE;
        }
        if (i != 4) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // org.apache.thrift.orig.TEnum
    public int getValue() {
        return this.value;
    }
}
