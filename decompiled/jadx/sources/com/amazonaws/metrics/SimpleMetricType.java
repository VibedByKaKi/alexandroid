package com.amazonaws.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (obj instanceof MetricType) {
            return name().equals(((MetricType) obj).name());
        }
        return false;
    }

    public final int hashCode() {
        return name().hashCode();
    }

    @Override // com.amazonaws.metrics.MetricType
    public abstract String name();

    public final String toString() {
        return name();
    }
}
