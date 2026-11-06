package com.amazon.alexa.hho.navigation.transit.event;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.alexa.hho.navigation.dependency.TransitScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class TransitNavigationEventSubscriber_Factory implements Factory<TransitNavigationEventSubscriber> {
    private final Provider<EventBus> eventBusProvider;

    public TransitNavigationEventSubscriber_Factory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static TransitNavigationEventSubscriber_Factory create(Provider<EventBus> provider) {
        return new TransitNavigationEventSubscriber_Factory(provider);
    }

    public static TransitNavigationEventSubscriber newInstance(EventBus eventBus) {
        return new TransitNavigationEventSubscriber(eventBus);
    }

    @Override // javax.inject.Provider
    public TransitNavigationEventSubscriber get() {
        return newInstance(this.eventBusProvider.get());
    }
}
