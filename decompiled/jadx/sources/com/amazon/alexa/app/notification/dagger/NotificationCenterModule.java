package com.amazon.alexa.app.notification.dagger;

import com.amazon.alexa.app.notification.deeplink.NotificationDeeplinkHandler;
import com.amazon.alexa.app.notification.nc.DefaultNotificationCenterFetchImpl;
import com.amazon.alexa.app.notification.nc.NotificationCenterLifecycleObserver;
import com.amazon.alexa.app.notification.nc.NotificationCenterService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes.dex */
public class NotificationCenterModule {
    @Provides
    @Singleton
    public DefaultNotificationCenterFetchImpl provideDefaultNotificationCenterFetchImpl() {
        return new DefaultNotificationCenterFetchImpl();
    }

    @Provides
    @Singleton
    public ExecutorService provideExecutorService(Lazy<ComponentRegistry> lazy) {
        ExecutorService executorService = (ExecutorService) lazy.get().get(ExecutorService.class).orNull();
        return executorService != null ? executorService : Executors.newCachedThreadPool();
    }

    @Provides
    @Singleton
    public NotificationCenterLifecycleObserver provideNotificationCenterLifecycleObserver(NotificationCenterService notificationCenterService, Lazy<ComponentRegistry> lazy) {
        NotificationCenterLifecycleObserver notificationCenterLifecycleObserver = new NotificationCenterLifecycleObserver(notificationCenterService);
        MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar = (MainActivityLifecycleObserverRegistrar) lazy.get().get(MainActivityLifecycleObserverRegistrar.class).orNull();
        if (mainActivityLifecycleObserverRegistrar != null) {
            mainActivityLifecycleObserverRegistrar.addObserver(notificationCenterLifecycleObserver);
        }
        return notificationCenterLifecycleObserver;
    }

    @Provides
    @Singleton
    public NotificationCenterService provideNotificationCenterService(Lazy<EventBus> lazy, Lazy<Mobilytics> lazy2, Lazy<NotificationDeeplinkHandler> lazy3, Lazy<DefaultNotificationCenterFetchImpl> lazy4, Lazy<IdentityService> lazy5, Lazy<ExecutorService> lazy6, Lazy<NotificationCenterLifecycleObserver> lazy7) {
        return new NotificationCenterService(lazy2, lazy, lazy3, lazy4, lazy5, lazy6, lazy7);
    }
}
