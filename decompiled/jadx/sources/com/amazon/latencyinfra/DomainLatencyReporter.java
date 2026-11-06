package com.amazon.latencyinfra;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class DomainLatencyReporter implements LatencyReporter {
    private static final LatencyReporterType type = LatencyReporterType.NAMESPACE;
    private final String namespace;

    public DomainLatencyReporter(String str) {
        if (str == null || str.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("[Latency Infra]: namespace should not be empty for domain reporter.");
            throw null;
        }
        this.namespace = str;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.amazon.latencyinfra.LatencyReporter
    public LatencyReporterType getType() {
        return type;
    }
}
