package com.amazon.alexa.hho.navigation.dependency;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvideSharedSchedulerFactory implements Factory<ScheduledExecutorService> {
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvideSharedSchedulerFactory(SharedNavigationModule sharedNavigationModule) {
        this.module = sharedNavigationModule;
    }

    public static SharedNavigationModule_ProvideSharedSchedulerFactory create(SharedNavigationModule sharedNavigationModule) {
        return new SharedNavigationModule_ProvideSharedSchedulerFactory(sharedNavigationModule);
    }

    public static ScheduledExecutorService provideSharedScheduler(SharedNavigationModule sharedNavigationModule) {
        return (ScheduledExecutorService) Preconditions.checkNotNullFromProvides(sharedNavigationModule.provideSharedScheduler());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return provideSharedScheduler(this.module);
    }
}
