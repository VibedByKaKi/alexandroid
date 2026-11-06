package com.amazon.alexa.app.notification.dagger;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NotificationCenterModule_ProvideExecutorServiceFactory implements Factory<ExecutorService> {
    private final Provider<ComponentRegistry> componentRegistryProvider;
    private final NotificationCenterModule module;

    public NotificationCenterModule_ProvideExecutorServiceFactory(NotificationCenterModule notificationCenterModule, Provider<ComponentRegistry> provider) {
        this.module = notificationCenterModule;
        this.componentRegistryProvider = provider;
    }

    public static NotificationCenterModule_ProvideExecutorServiceFactory create(NotificationCenterModule notificationCenterModule, Provider<ComponentRegistry> provider) {
        return new NotificationCenterModule_ProvideExecutorServiceFactory(notificationCenterModule, provider);
    }

    public static ExecutorService provideExecutorService(NotificationCenterModule notificationCenterModule, Lazy<ComponentRegistry> lazy) {
        return (ExecutorService) Preconditions.checkNotNullFromProvides(notificationCenterModule.provideExecutorService(lazy));
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return provideExecutorService(this.module, DoubleCheck.lazy(this.componentRegistryProvider));
    }
}
