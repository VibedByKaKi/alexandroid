package com.amazon.alexa.handsfree.storage.dependencies;

import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentProtocol;
import com.amazon.alexa.handsfree.storage.metrics.CacheMetricsService;
import com.amazon.alexa.handsfree.storage.metrics.EnableMetricsBroadcastReceiver;
import com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService;
import dagger.Subcomponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Subcomponent
/* loaded from: classes17.dex */
public interface FalcoStorageComponent extends AhfComponentProtocol {
    void inject(CacheMetricsService cacheMetricsService);

    void inject(EnableMetricsBroadcastReceiver enableMetricsBroadcastReceiver);

    void inject(ProcessMetricsCacheService processMetricsCacheService);
}
