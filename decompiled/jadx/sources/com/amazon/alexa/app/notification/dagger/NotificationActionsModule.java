package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import com.amazon.alexa.app.notification.actions.DefaultNotificationActionRenderer;
import com.amazon.alexa.app.notification.actions.NotificationActionRenderer;
import com.amazon.alexa.app.notification.actions.handlers.NotificationActionHandlerService;
import com.amazon.alexa.app.notification.deeplink.NotificationDeeplinkHandler;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.notification.actions.handler.DefaultNotificationActionHandlerFactory;
import com.amazon.alexa.notification.actions.handler.NotificationActionHandlerFactory;
import com.amazon.alexa.notification.api.actions.registry.DefaultNotificationActionsRegistry;
import com.amazon.alexa.notification.api.actions.registry.NotificationActionsRegistry;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes.dex */
public class NotificationActionsModule {
    private final ComponentRegistry componentRegistry;

    public NotificationActionsModule(ComponentRegistry componentRegistry) {
        this.componentRegistry = componentRegistry;
    }

    @Provides
    public NotificationActionHandlerFactory provideNotificationActionHandlerFactory(Context context) {
        return new DefaultNotificationActionHandlerFactory(context);
    }

    @Provides
    @Singleton
    public NotificationActionHandlerService provideNotificationActionHandlerService(Context context, Lazy<NotificationActionsRegistry> lazy) {
        return new NotificationActionHandlerService(context, lazy.get());
    }

    @Provides
    public NotificationActionRenderer provideNotificationActionRenderer(Context context, Lazy<NotificationDeeplinkHandler> lazy, Lazy<Mobilytics> lazy2, Lazy<FeatureServiceV2> lazy3, Lazy<NotificationActionsRegistry> lazy4, Lazy<EventBus> lazy5) {
        return new DefaultNotificationActionRenderer(context, lazy, lazy2, lazy3, lazy4, lazy5);
    }

    @Provides
    @Singleton
    public NotificationActionsRegistry provideNotificationActionsRegistry(Context context) {
        return new DefaultNotificationActionsRegistry(context);
    }
}
