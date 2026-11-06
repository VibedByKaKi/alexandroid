package com.amazon.commscore.commsbridge.dependencies;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.commscore.api.commsbridge.CommsBridgeService;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.commsbridge.CommsBridgeServiceImpl;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class CommsBridgeServiceModule {
    private Lazy<EventBus> eventBusLazy;
    private AlexaCommsCoreMetricsService metricsService;

    public CommsBridgeServiceModule(@NonNull Lazy<EventBus> lazy, AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        this.eventBusLazy = lazy;
        this.metricsService = alexaCommsCoreMetricsService;
    }

    @Provides
    @Singleton
    public CommsBridgeService providesCommsBridgeService() {
        return new CommsBridgeServiceImpl(this.eventBusLazy.get(), this.metricsService);
    }
}
