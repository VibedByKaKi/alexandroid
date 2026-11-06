package com.amazon.latencyinfra;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LatencyOutputObject {
    private final LatencyReporterArgument argument;
    private final LatencyRecorderOption options;

    public LatencyOutputObject(LatencyReporterArgument latencyReporterArgument, LatencyRecorderOption latencyRecorderOption) {
        this.argument = latencyReporterArgument;
        this.options = latencyRecorderOption;
    }

    public LatencyReporterArgument getArgument() {
        return this.argument;
    }

    public LatencyRecorderOption getOptions() {
        return this.options;
    }
}
