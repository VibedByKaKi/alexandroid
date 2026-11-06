package com.amazon.alexa.accessory.repositories.ambient;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum SpeakingState {
    UNKNOWN(0),
    SILENT(1),
    SPEAKING(2);

    private static final Map<Integer, SpeakingState> VALUE_MAP = new HashMap();
    private final int value;

    static {
        for (SpeakingState speakingState : values()) {
            VALUE_MAP.put(Integer.valueOf(speakingState.value), speakingState);
        }
    }

    SpeakingState(int i) {
        this.value = i;
    }

    public static SpeakingState fromValue(int i) {
        return VALUE_MAP.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
