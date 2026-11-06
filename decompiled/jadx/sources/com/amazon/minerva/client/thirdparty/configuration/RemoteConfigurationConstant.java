package com.amazon.minerva.client.thirdparty.configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RemoteConfigurationConstant {
    THROTTLE_SWITCH(0),
    MAX_THROTTLE_CREDIT(1),
    DEFAULT_THROTTLE_CREDIT_HOUR(2),
    DEFAULT_SAMPLING_RATE(3),
    MAX_KEY_VALUE_PAIR_COUNT(4),
    MAX_KEY_SIZE(5),
    MAX_VALUE_SIZE(6),
    MAX_METRIC_EVENT_SIZE(7);

    private final int index;

    RemoteConfigurationConstant(int i) {
        this.index = i;
    }

    public int getIndex() {
        return this.index;
    }
}
