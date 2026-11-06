package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.core.Scheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RxModule_ProvidesBackgroundWorkerSchedulerFactory implements Factory<Scheduler> {
    private final RxModule module;

    public RxModule_ProvidesBackgroundWorkerSchedulerFactory(RxModule rxModule) {
        this.module = rxModule;
    }

    public static RxModule_ProvidesBackgroundWorkerSchedulerFactory create(RxModule rxModule) {
        return new RxModule_ProvidesBackgroundWorkerSchedulerFactory(rxModule);
    }

    public static Scheduler providesBackgroundWorkerScheduler(RxModule rxModule) {
        return (Scheduler) Preconditions.checkNotNull(rxModule.providesBackgroundWorkerScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return providesBackgroundWorkerScheduler(this.module);
    }
}
