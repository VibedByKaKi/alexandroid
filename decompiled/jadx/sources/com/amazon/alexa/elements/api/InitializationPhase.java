package com.amazon.alexa.elements.api;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum InitializationPhase {
    UNKNOWN("unknown"),
    LOAD_ON_START("loadOnStart"),
    COMPLETE("complete");

    private final String phase;

    InitializationPhase(String str) {
        this.phase = str;
    }

    @NonNull
    public static InitializationPhase fromString(String str) {
        for (InitializationPhase initializationPhase : values()) {
            if (initializationPhase.phase.equals(str)) {
                return initializationPhase;
            }
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.phase;
    }
}
