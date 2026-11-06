package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.app.job.JobScheduler;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ContextModule_ProvidesJobSchedulerFactory implements Factory<JobScheduler> {
    private final Provider<Context> contextProvider;
    private final ContextModule module;

    public ContextModule_ProvidesJobSchedulerFactory(ContextModule contextModule, Provider<Context> provider) {
        this.module = contextModule;
        this.contextProvider = provider;
    }

    public static ContextModule_ProvidesJobSchedulerFactory create(ContextModule contextModule, Provider<Context> provider) {
        return new ContextModule_ProvidesJobSchedulerFactory(contextModule, provider);
    }

    public static JobScheduler providesJobScheduler(ContextModule contextModule, Context context) {
        return (JobScheduler) Preconditions.checkNotNull(contextModule.providesJobScheduler(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public JobScheduler get() {
        return providesJobScheduler(this.module, this.contextProvider.get());
    }
}
