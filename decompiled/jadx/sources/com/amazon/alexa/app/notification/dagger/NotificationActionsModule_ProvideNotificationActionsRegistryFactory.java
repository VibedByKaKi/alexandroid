package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import com.amazon.alexa.notification.api.actions.registry.NotificationActionsRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NotificationActionsModule_ProvideNotificationActionsRegistryFactory implements Factory<NotificationActionsRegistry> {
    private final Provider<Context> contextProvider;
    private final NotificationActionsModule module;

    public NotificationActionsModule_ProvideNotificationActionsRegistryFactory(NotificationActionsModule notificationActionsModule, Provider<Context> provider) {
        this.module = notificationActionsModule;
        this.contextProvider = provider;
    }

    public static NotificationActionsModule_ProvideNotificationActionsRegistryFactory create(NotificationActionsModule notificationActionsModule, Provider<Context> provider) {
        return new NotificationActionsModule_ProvideNotificationActionsRegistryFactory(notificationActionsModule, provider);
    }

    public static NotificationActionsRegistry provideNotificationActionsRegistry(NotificationActionsModule notificationActionsModule, Context context) {
        return (NotificationActionsRegistry) Preconditions.checkNotNullFromProvides(notificationActionsModule.provideNotificationActionsRegistry(context));
    }

    @Override // javax.inject.Provider
    public NotificationActionsRegistry get() {
        return provideNotificationActionsRegistry(this.module, this.contextProvider.get());
    }
}
