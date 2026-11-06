package com.amazon.commscore.metrics.dependencies;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.metrics.DefaultAlexaCommsCoreMetricsService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class MetricServiceModule {
    private Lazy<Mobilytics> mobilyticsLazy;

    public MetricServiceModule(Lazy<Mobilytics> lazy) {
        this.mobilyticsLazy = lazy;
    }

    @Provides
    @Singleton
    public AlexaCommsCoreMetricsService providesMetricsService() {
        return new DefaultAlexaCommsCoreMetricsService(this.mobilyticsLazy);
    }
}
