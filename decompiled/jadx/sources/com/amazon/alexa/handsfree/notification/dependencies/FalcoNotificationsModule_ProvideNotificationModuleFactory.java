package com.amazon.alexa.handsfree.notification.dependencies;

import com.amazon.alexa.handsfree.notification.NotificationModule;
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
public final class FalcoNotificationsModule_ProvideNotificationModuleFactory implements Factory<NotificationModule> {
    private final FalcoNotificationsModule module;

    public FalcoNotificationsModule_ProvideNotificationModuleFactory(FalcoNotificationsModule falcoNotificationsModule) {
        this.module = falcoNotificationsModule;
    }

    public static FalcoNotificationsModule_ProvideNotificationModuleFactory create(FalcoNotificationsModule falcoNotificationsModule) {
        return new FalcoNotificationsModule_ProvideNotificationModuleFactory(falcoNotificationsModule);
    }

    public static NotificationModule provideNotificationModule(FalcoNotificationsModule falcoNotificationsModule) {
        return (NotificationModule) Preconditions.checkNotNullFromProvides(falcoNotificationsModule.provideNotificationModule());
    }

    @Override // javax.inject.Provider
    public NotificationModule get() {
        return provideNotificationModule(this.module);
    }
}
