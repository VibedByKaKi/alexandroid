package com.amazon.maft.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface PmetMetrics {
    PmetMetrics addCount(String str, double d);

    PmetMetrics addProperty(String str, String str2);

    PmetMetrics addTime(String str, double d);

    void record();

    default PmetMetrics addCustomerId() {
        return this;
    }

    default PmetMetrics addDeviceId() {
        return this;
    }

    default PmetMetrics addDeviceType() {
        return this;
    }
}
