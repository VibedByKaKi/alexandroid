package com.amazon.alexa.mobilytics.timeline;

import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class TimelineStorage_Factory implements Factory<TimelineStorage> {
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public TimelineStorage_Factory(Provider<PersistentStorage.Factory> provider) {
        this.storageFactoryProvider = provider;
    }

    public static TimelineStorage_Factory create(Provider<PersistentStorage.Factory> provider) {
        return new TimelineStorage_Factory(provider);
    }

    public static TimelineStorage newInstance(PersistentStorage.Factory factory) {
        return new TimelineStorage(factory);
    }

    @Override // javax.inject.Provider
    public TimelineStorage get() {
        return newInstance(this.storageFactoryProvider.get());
    }
}
