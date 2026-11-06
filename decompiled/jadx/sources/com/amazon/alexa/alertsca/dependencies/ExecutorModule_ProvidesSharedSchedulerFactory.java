package com.amazon.alexa.alertsca.dependencies;

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
/* loaded from: classes16.dex */
public final class ExecutorModule_ProvidesSharedSchedulerFactory implements Factory<ScheduledExecutorService> {
    private final ExecutorModule module;

    public ExecutorModule_ProvidesSharedSchedulerFactory(ExecutorModule executorModule) {
        this.module = executorModule;
    }

    public static ExecutorModule_ProvidesSharedSchedulerFactory create(ExecutorModule executorModule) {
        return new ExecutorModule_ProvidesSharedSchedulerFactory(executorModule);
    }

    public static ScheduledExecutorService providesSharedScheduler(ExecutorModule executorModule) {
        return (ScheduledExecutorService) Preconditions.checkNotNullFromProvides(executorModule.providesSharedScheduler());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return providesSharedScheduler(this.module);
    }
}
