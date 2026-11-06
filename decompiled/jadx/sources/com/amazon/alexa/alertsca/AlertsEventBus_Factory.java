package com.amazon.alexa.alertsca;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsEventBus_Factory implements Factory<AlertsEventBus> {
    private final Provider<EventBus> eventBusProvider;

    public AlertsEventBus_Factory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static AlertsEventBus_Factory create(Provider<EventBus> provider) {
        return new AlertsEventBus_Factory(provider);
    }

    public static AlertsEventBus newInstance(EventBus eventBus) {
        return new AlertsEventBus(eventBus);
    }

    @Override // javax.inject.Provider
    public AlertsEventBus get() {
        return newInstance(this.eventBusProvider.get());
    }
}
