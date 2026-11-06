package com.amazon.alexa.presence.service.jobs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceJobScheduler_Factory implements Factory<ForegroundServiceJobScheduler> {
    private final Provider<ScheduledExecutorService> executorProvider;

    public ForegroundServiceJobScheduler_Factory(Provider<ScheduledExecutorService> provider) {
        this.executorProvider = provider;
    }

    public static ForegroundServiceJobScheduler_Factory create(Provider<ScheduledExecutorService> provider) {
        return new ForegroundServiceJobScheduler_Factory(provider);
    }

    public static ForegroundServiceJobScheduler newInstance(ScheduledExecutorService scheduledExecutorService) {
        return new ForegroundServiceJobScheduler(scheduledExecutorService);
    }

    @Override // javax.inject.Provider
    public ForegroundServiceJobScheduler get() {
        return newInstance(this.executorProvider.get());
    }
}
