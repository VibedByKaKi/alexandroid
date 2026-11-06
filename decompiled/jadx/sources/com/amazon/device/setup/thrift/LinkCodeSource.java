package com.amazon.device.setup.thrift;

import org.apache.thrift.orig.TEnum;
import org.apache.thrift.orig.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum LinkCodeSource implements TEnum {
    DMS(1),
    PANDA(2);

    private final int value;

    LinkCodeSource(int i) {
        this.value = i;
    }

    @Nullable
    public static LinkCodeSource findByValue(int i) {
        if (i == 1) {
            return DMS;
        }
        if (i != 2) {
            return null;
        }
        return PANDA;
    }

    @Override // org.apache.thrift.orig.TEnum
    public int getValue() {
        return this.value;
    }
}
