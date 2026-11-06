package com.amazon.alexa.accessory.repositories.ambient;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AcousticEventType {
    UNKNOWN(0),
    EMERGENCY_VEHICLE(1),
    SMOKE_ALARM(2),
    CO_ALARM(3);

    private static final Map<Integer, AcousticEventType> VALUE_MAP = new HashMap();
    private final int value;

    static {
        for (AcousticEventType acousticEventType : values()) {
            VALUE_MAP.put(Integer.valueOf(acousticEventType.value), acousticEventType);
        }
    }

    AcousticEventType(int i) {
        this.value = i;
    }

    public static AcousticEventType fromValue(int i) {
        return VALUE_MAP.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
