package com.amazon.dee.app.dependencies;

import android.app.NotificationManager;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NotificationManagerModule_ProvideNotificationManagerFactory implements Factory<NotificationManager> {
    private final Provider<Context> contextProvider;
    private final NotificationManagerModule module;

    public NotificationManagerModule_ProvideNotificationManagerFactory(NotificationManagerModule notificationManagerModule, Provider<Context> provider) {
        this.module = notificationManagerModule;
        this.contextProvider = provider;
    }

    public static NotificationManagerModule_ProvideNotificationManagerFactory create(NotificationManagerModule notificationManagerModule, Provider<Context> provider) {
        return new NotificationManagerModule_ProvideNotificationManagerFactory(notificationManagerModule, provider);
    }

    public static NotificationManager provideNotificationManager(NotificationManagerModule notificationManagerModule, Context context) {
        return (NotificationManager) Preconditions.checkNotNullFromProvides(notificationManagerModule.provideNotificationManager(context));
    }

    @Override // javax.inject.Provider
    public NotificationManager get() {
        return provideNotificationManager(this.module, this.contextProvider.get());
    }
}
