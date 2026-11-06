package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.growthcore.service.configbasedexperiment.ConfigBasedExperimentService;
import com.amazon.alexa.growthcore.service.metrics.MobilyticsService;
import dagger.Component;
import dagger.Lazy;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {InternalModule.class, ExternalModule.class})
@Singleton
/* loaded from: classes17.dex */
public interface GrowthCoreComponent {
    Lazy<ConfigBasedExperimentService> configBasedExperimentService();

    Lazy<EventBus> eventBus();

    Lazy<MobilyticsService> mobilyticsService();
}
