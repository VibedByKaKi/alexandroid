package com.amazon.latencyinfra;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SingleLatencyAction {
    RECORD_DURATION_FROM_APP_START("record"),
    RECORD_DURATION_FROM_CACHED_TIMESTAMP("recordWithData");

    private final String type;

    SingleLatencyAction(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
