package com.amazon.alexa.handsfree.notification.dependencies;

import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FalcoNotificationsModule_ProvideNotificationOccurrenceCounterFactory implements Factory<NotificationOccurrenceCounter> {
    private final FalcoNotificationsModule module;

    public FalcoNotificationsModule_ProvideNotificationOccurrenceCounterFactory(FalcoNotificationsModule falcoNotificationsModule) {
        this.module = falcoNotificationsModule;
    }

    public static FalcoNotificationsModule_ProvideNotificationOccurrenceCounterFactory create(FalcoNotificationsModule falcoNotificationsModule) {
        return new FalcoNotificationsModule_ProvideNotificationOccurrenceCounterFactory(falcoNotificationsModule);
    }

    public static NotificationOccurrenceCounter provideNotificationOccurrenceCounter(FalcoNotificationsModule falcoNotificationsModule) {
        return (NotificationOccurrenceCounter) Preconditions.checkNotNullFromProvides(falcoNotificationsModule.provideNotificationOccurrenceCounter());
    }

    @Override // javax.inject.Provider
    public NotificationOccurrenceCounter get() {
        return provideNotificationOccurrenceCounter(this.module);
    }
}
