package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.alertsca.metrics.service.AlertsDefaultMetricsService;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public final class MetricsModule {
    @Provides
    @Singleton
    public MetricsService provideMetricsService(Mobilytics mobilytics) {
        return new AlertsDefaultMetricsService(mobilytics);
    }

    @Provides
    @Singleton
    public Mobilytics provideMobilytics() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(Mobilytics.class).get();
        return (Mobilytics) obj;
    }
}
