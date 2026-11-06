package com.amazon.alexa.mobilytics.event.cache;

import com.amazon.alexa.mobilytics.event.adapters.EventAdapter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MobilyticsAppInitEventsCache_Factory implements Factory<MobilyticsAppInitEventsCache> {
    private final Provider<EventAdapter> eventAdapterProvider;

    public MobilyticsAppInitEventsCache_Factory(Provider<EventAdapter> provider) {
        this.eventAdapterProvider = provider;
    }

    public static MobilyticsAppInitEventsCache_Factory create(Provider<EventAdapter> provider) {
        return new MobilyticsAppInitEventsCache_Factory(provider);
    }

    public static MobilyticsAppInitEventsCache newInstance(EventAdapter eventAdapter) {
        return new MobilyticsAppInitEventsCache(eventAdapter);
    }

    @Override // javax.inject.Provider
    public MobilyticsAppInitEventsCache get() {
        return newInstance(this.eventAdapterProvider.get());
    }
}
