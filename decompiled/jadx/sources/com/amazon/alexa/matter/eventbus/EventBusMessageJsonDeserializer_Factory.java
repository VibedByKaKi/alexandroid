package com.amazon.alexa.matter.eventbus;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class EventBusMessageJsonDeserializer_Factory implements Factory<EventBusMessageJsonDeserializer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final EventBusMessageJsonDeserializer_Factory INSTANCE = new EventBusMessageJsonDeserializer_Factory();

        private InstanceHolder() {
        }
    }

    public static EventBusMessageJsonDeserializer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventBusMessageJsonDeserializer newInstance() {
        return new EventBusMessageJsonDeserializer();
    }

    @Override // javax.inject.Provider
    public EventBusMessageJsonDeserializer get() {
        return newInstance();
    }
}
