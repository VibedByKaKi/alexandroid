package com.amazon.maft.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface PreloadMetrics {
    PreloadMetrics addCount(String str, double d);

    PreloadMetrics addProperty(String str, String str2);

    PreloadMetrics addTime(String str, double d);

    void record();

    default PreloadMetrics addCustomerId() {
        return this;
    }

    default PreloadMetrics addDeviceId() {
        return this;
    }

    default PreloadMetrics addDeviceType() {
        return this;
    }
}
