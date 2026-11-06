package com.amazon.alexa.matter.eventbus;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class EventBusResponder_Factory implements Factory<EventBusResponder> {
    private final Provider<EventBusPublisher> eventBusPublisherProvider;

    public EventBusResponder_Factory(Provider<EventBusPublisher> provider) {
        this.eventBusPublisherProvider = provider;
    }

    public static EventBusResponder_Factory create(Provider<EventBusPublisher> provider) {
        return new EventBusResponder_Factory(provider);
    }

    public static EventBusResponder newInstance(EventBusPublisher eventBusPublisher) {
        return new EventBusResponder(eventBusPublisher);
    }

    @Override // javax.inject.Provider
    public EventBusResponder get() {
        return newInstance(this.eventBusPublisherProvider.get());
    }
}
