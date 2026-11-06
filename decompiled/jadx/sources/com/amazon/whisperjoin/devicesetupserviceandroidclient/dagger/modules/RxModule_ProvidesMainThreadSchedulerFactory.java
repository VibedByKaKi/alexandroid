package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.core.Scheduler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RxModule_ProvidesMainThreadSchedulerFactory implements Factory<Scheduler> {
    private final RxModule module;

    public RxModule_ProvidesMainThreadSchedulerFactory(RxModule rxModule) {
        this.module = rxModule;
    }

    public static RxModule_ProvidesMainThreadSchedulerFactory create(RxModule rxModule) {
        return new RxModule_ProvidesMainThreadSchedulerFactory(rxModule);
    }

    public static Scheduler providesMainThreadScheduler(RxModule rxModule) {
        return (Scheduler) Preconditions.checkNotNull(rxModule.providesMainThreadScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return providesMainThreadScheduler(this.module);
    }
}
