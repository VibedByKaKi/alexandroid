package com.amazon.minerva.client.common.api;

import com.amazon.minerva.client.common.api.callback.MetricRecordCallback;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface AmazonMinervaV2 extends AmazonMinerva {
    void record(MetricEvent metricEvent, MetricRecordCallback metricRecordCallback);

    Future<Void> upload();
}
