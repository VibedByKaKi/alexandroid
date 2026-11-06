package com.amazon.alexa.alertsca.dependencies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsEventBusModule_ProvidesEventBusFactory implements Factory<EventBus> {
    private final AlertsEventBusModule module;

    public AlertsEventBusModule_ProvidesEventBusFactory(AlertsEventBusModule alertsEventBusModule) {
        this.module = alertsEventBusModule;
    }

    public static AlertsEventBusModule_ProvidesEventBusFactory create(AlertsEventBusModule alertsEventBusModule) {
        return new AlertsEventBusModule_ProvidesEventBusFactory(alertsEventBusModule);
    }

    public static EventBus providesEventBus(AlertsEventBusModule alertsEventBusModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(alertsEventBusModule.providesEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return providesEventBus(this.module);
    }
}
