package com.amazon.alexa.matter.eventbus;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ConcreteEventBusPublisher_Factory implements Factory<ConcreteEventBusPublisher> {
    private final Provider<EventBusMessageSerializer> eventBusMessageSerializerProvider;
    private final Provider<EventBus> eventBusProvider;
    private final Provider<MatterLogger> matterLoggerProvider;

    public ConcreteEventBusPublisher_Factory(Provider<EventBus> provider, Provider<EventBusMessageSerializer> provider2, Provider<MatterLogger> provider3) {
        this.eventBusProvider = provider;
        this.eventBusMessageSerializerProvider = provider2;
        this.matterLoggerProvider = provider3;
    }

    public static ConcreteEventBusPublisher_Factory create(Provider<EventBus> provider, Provider<EventBusMessageSerializer> provider2, Provider<MatterLogger> provider3) {
        return new ConcreteEventBusPublisher_Factory(provider, provider2, provider3);
    }

    public static ConcreteEventBusPublisher newInstance(EventBus eventBus, EventBusMessageSerializer eventBusMessageSerializer, MatterLogger matterLogger) {
        return new ConcreteEventBusPublisher(eventBus, eventBusMessageSerializer, matterLogger);
    }

    @Override // javax.inject.Provider
    public ConcreteEventBusPublisher get() {
        return newInstance(this.eventBusProvider.get(), this.eventBusMessageSerializerProvider.get(), this.matterLoggerProvider.get());
    }
}
