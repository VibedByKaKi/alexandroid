package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import com.amazon.alexa.notification.actions.handler.NotificationActionHandlerFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NotificationActionsModule_ProvideNotificationActionHandlerFactoryFactory implements Factory<NotificationActionHandlerFactory> {
    private final Provider<Context> contextProvider;
    private final NotificationActionsModule module;

    public NotificationActionsModule_ProvideNotificationActionHandlerFactoryFactory(NotificationActionsModule notificationActionsModule, Provider<Context> provider) {
        this.module = notificationActionsModule;
        this.contextProvider = provider;
    }

    public static NotificationActionsModule_ProvideNotificationActionHandlerFactoryFactory create(NotificationActionsModule notificationActionsModule, Provider<Context> provider) {
        return new NotificationActionsModule_ProvideNotificationActionHandlerFactoryFactory(notificationActionsModule, provider);
    }

    public static NotificationActionHandlerFactory provideNotificationActionHandlerFactory(NotificationActionsModule notificationActionsModule, Context context) {
        return (NotificationActionHandlerFactory) Preconditions.checkNotNullFromProvides(notificationActionsModule.provideNotificationActionHandlerFactory(context));
    }

    @Override // javax.inject.Provider
    public NotificationActionHandlerFactory get() {
        return provideNotificationActionHandlerFactory(this.module, this.contextProvider.get());
    }
}
