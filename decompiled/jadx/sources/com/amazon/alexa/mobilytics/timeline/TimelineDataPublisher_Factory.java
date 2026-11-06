package com.amazon.alexa.mobilytics.timeline;

import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class TimelineDataPublisher_Factory implements Factory<TimelineDataPublisher> {
    private final Provider<PersistentStorage.Factory> pStorageFactoryProvider;
    private final Provider<TimelineStorage> pTimelineStorageProvider;

    public TimelineDataPublisher_Factory(Provider<TimelineStorage> provider, Provider<PersistentStorage.Factory> provider2) {
        this.pTimelineStorageProvider = provider;
        this.pStorageFactoryProvider = provider2;
    }

    public static TimelineDataPublisher_Factory create(Provider<TimelineStorage> provider, Provider<PersistentStorage.Factory> provider2) {
        return new TimelineDataPublisher_Factory(provider, provider2);
    }

    public static TimelineDataPublisher newInstance(TimelineStorage timelineStorage, PersistentStorage.Factory factory) {
        return new TimelineDataPublisher(timelineStorage, factory);
    }

    @Override // javax.inject.Provider
    public TimelineDataPublisher get() {
        return newInstance(this.pTimelineStorageProvider.get(), this.pStorageFactoryProvider.get());
    }
}
