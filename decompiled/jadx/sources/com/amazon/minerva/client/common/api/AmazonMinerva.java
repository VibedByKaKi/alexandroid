package com.amazon.minerva.client.common.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface AmazonMinerva {
    void flush();

    void record(MetricEvent metricEvent);

    void shutdown();

    @Deprecated
    void shutdownWithUpload();
}
