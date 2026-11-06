package com.amazon.alexa.mobilytics.event.adapters;

import com.amazon.alexa.mobilytics.internal.JsonConverter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class EventAdapter_Factory implements Factory<EventAdapter> {
    private final Provider<JsonConverter> jsonConverterProvider;

    public EventAdapter_Factory(Provider<JsonConverter> provider) {
        this.jsonConverterProvider = provider;
    }

    public static EventAdapter_Factory create(Provider<JsonConverter> provider) {
        return new EventAdapter_Factory(provider);
    }

    public static EventAdapter newInstance(JsonConverter jsonConverter) {
        return new EventAdapter(jsonConverter);
    }

    @Override // javax.inject.Provider
    public EventAdapter get() {
        return newInstance(this.jsonConverterProvider.get());
    }
}
