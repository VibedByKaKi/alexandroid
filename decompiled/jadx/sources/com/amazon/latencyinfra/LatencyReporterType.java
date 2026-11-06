package com.amazon.latencyinfra;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum LatencyReporterType {
    LOG("log"),
    NAMESPACE("namespace"),
    METRIC("metric");

    private final String type;

    LatencyReporterType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
