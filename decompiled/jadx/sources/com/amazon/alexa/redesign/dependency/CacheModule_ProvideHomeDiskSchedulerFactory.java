package com.amazon.alexa.redesign.dependency;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import rx.Scheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class CacheModule_ProvideHomeDiskSchedulerFactory implements Factory<Scheduler> {
    private final CacheModule module;

    public CacheModule_ProvideHomeDiskSchedulerFactory(CacheModule cacheModule) {
        this.module = cacheModule;
    }

    public static CacheModule_ProvideHomeDiskSchedulerFactory create(CacheModule cacheModule) {
        return new CacheModule_ProvideHomeDiskSchedulerFactory(cacheModule);
    }

    public static Scheduler provideHomeDiskScheduler(CacheModule cacheModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(cacheModule.provideHomeDiskScheduler());
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return provideHomeDiskScheduler(this.module);
    }
}
