package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.util.JobInfoProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UtilModule_ProvidesJobInfoProviderFactory implements Factory<JobInfoProvider> {
    private final UtilModule module;

    public UtilModule_ProvidesJobInfoProviderFactory(UtilModule utilModule) {
        this.module = utilModule;
    }

    public static UtilModule_ProvidesJobInfoProviderFactory create(UtilModule utilModule) {
        return new UtilModule_ProvidesJobInfoProviderFactory(utilModule);
    }

    public static JobInfoProvider providesJobInfoProvider(UtilModule utilModule) {
        return (JobInfoProvider) Preconditions.checkNotNull(utilModule.providesJobInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public JobInfoProvider get() {
        return providesJobInfoProvider(this.module);
    }
}
