package com.amazon.alexa.accessory.repositories.ambient;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AmbientContextSubscriptionStatus {
    UNKNOWN(0),
    SUCCESS(1),
    ALREADY_ACTIVE(2),
    UNSUPPORTED(3),
    UNAVAILABLE(4),
    DENIED(5);

    private static final Map<Integer, AmbientContextSubscriptionStatus> VALUE_MAP = new HashMap();
    private final int value;

    static {
        for (AmbientContextSubscriptionStatus ambientContextSubscriptionStatus : values()) {
            VALUE_MAP.put(Integer.valueOf(ambientContextSubscriptionStatus.value), ambientContextSubscriptionStatus);
        }
    }

    AmbientContextSubscriptionStatus(int i) {
        this.value = i;
    }

    public static AmbientContextSubscriptionStatus fromValue(int i) {
        return VALUE_MAP.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
