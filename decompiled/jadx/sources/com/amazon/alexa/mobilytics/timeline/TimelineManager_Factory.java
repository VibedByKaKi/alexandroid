package com.amazon.alexa.mobilytics.timeline;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class TimelineManager_Factory implements Factory<TimelineManager> {
    private final Provider<TimelineStorage> pTimelineStorageProvider;

    public TimelineManager_Factory(Provider<TimelineStorage> provider) {
        this.pTimelineStorageProvider = provider;
    }

    public static TimelineManager_Factory create(Provider<TimelineStorage> provider) {
        return new TimelineManager_Factory(provider);
    }

    public static TimelineManager newInstance(TimelineStorage timelineStorage) {
        return new TimelineManager(timelineStorage);
    }

    @Override // javax.inject.Provider
    public TimelineManager get() {
        return newInstance(this.pTimelineStorageProvider.get());
    }
}
