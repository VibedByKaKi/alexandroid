package com.amazon.alexa.matter.eventbus;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class EventBusMessageJsonSerializer_Factory implements Factory<EventBusMessageJsonSerializer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final EventBusMessageJsonSerializer_Factory INSTANCE = new EventBusMessageJsonSerializer_Factory();

        private InstanceHolder() {
        }
    }

    public static EventBusMessageJsonSerializer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventBusMessageJsonSerializer newInstance() {
        return new EventBusMessageJsonSerializer();
    }

    @Override // javax.inject.Provider
    public EventBusMessageJsonSerializer get() {
        return newInstance();
    }
}
