package com.amazon.alexa.presence.service.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_ScheduledExecutorFactory implements Factory<ScheduledExecutorService> {
    private final ForegroundServiceModule module;

    public ForegroundServiceModule_ScheduledExecutorFactory(ForegroundServiceModule foregroundServiceModule) {
        this.module = foregroundServiceModule;
    }

    public static ForegroundServiceModule_ScheduledExecutorFactory create(ForegroundServiceModule foregroundServiceModule) {
        return new ForegroundServiceModule_ScheduledExecutorFactory(foregroundServiceModule);
    }

    public static ScheduledExecutorService scheduledExecutor(ForegroundServiceModule foregroundServiceModule) {
        return (ScheduledExecutorService) Preconditions.checkNotNullFromProvides(foregroundServiceModule.scheduledExecutor());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return scheduledExecutor(this.module);
    }
}
