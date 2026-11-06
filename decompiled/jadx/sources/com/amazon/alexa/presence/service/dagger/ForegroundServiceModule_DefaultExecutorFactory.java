package com.amazon.alexa.presence.service.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_DefaultExecutorFactory implements Factory<ExecutorService> {
    private final ForegroundServiceModule module;
    private final Provider<ScheduledExecutorService> scheduledExecutorProvider;

    public ForegroundServiceModule_DefaultExecutorFactory(ForegroundServiceModule foregroundServiceModule, Provider<ScheduledExecutorService> provider) {
        this.module = foregroundServiceModule;
        this.scheduledExecutorProvider = provider;
    }

    public static ForegroundServiceModule_DefaultExecutorFactory create(ForegroundServiceModule foregroundServiceModule, Provider<ScheduledExecutorService> provider) {
        return new ForegroundServiceModule_DefaultExecutorFactory(foregroundServiceModule, provider);
    }

    public static ExecutorService defaultExecutor(ForegroundServiceModule foregroundServiceModule, ScheduledExecutorService scheduledExecutorService) {
        return (ExecutorService) Preconditions.checkNotNullFromProvides(foregroundServiceModule.defaultExecutor(scheduledExecutorService));
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return defaultExecutor(this.module, this.scheduledExecutorProvider.get());
    }
}
