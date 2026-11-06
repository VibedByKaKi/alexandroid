package com.amazon.dee.app.services.metrics;

import com.amazon.dee.app.dependencies.ApplicationScope;
import com.dee.app.metrics.MetricsService;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class ElementsMetricsModule {
    @Provides
    @ApplicationScope
    public static MetricsServiceV2 provideElementsMetricsService(MetricsService metricsService) {
        return new ElementsMetricsService(metricsService);
    }
}
