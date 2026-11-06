package com.amazon.alexa.mobilytics.connector;

import com.amazon.alexa.mobilytics.event.serializer.DefaultEventSerializer;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MinervaFullFidelityEmitter_Factory implements Factory<MinervaFullFidelityEmitter> {
    private final Provider<DefaultEventSerializer> eventSerializerProvider;

    public MinervaFullFidelityEmitter_Factory(Provider<DefaultEventSerializer> provider) {
        this.eventSerializerProvider = provider;
    }

    public static MinervaFullFidelityEmitter_Factory create(Provider<DefaultEventSerializer> provider) {
        return new MinervaFullFidelityEmitter_Factory(provider);
    }

    public static MinervaFullFidelityEmitter newInstance(DefaultEventSerializer defaultEventSerializer) {
        return new MinervaFullFidelityEmitter(defaultEventSerializer);
    }

    @Override // javax.inject.Provider
    public MinervaFullFidelityEmitter get() {
        return newInstance(this.eventSerializerProvider.get());
    }
}
