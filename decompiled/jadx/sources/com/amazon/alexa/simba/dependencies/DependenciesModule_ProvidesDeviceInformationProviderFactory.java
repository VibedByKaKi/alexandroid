package com.amazon.alexa.simba.dependencies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class DependenciesModule_ProvidesDeviceInformationProviderFactory implements Factory<DeviceInformationProvider> {
    private final DependenciesModule module;

    public DependenciesModule_ProvidesDeviceInformationProviderFactory(DependenciesModule dependenciesModule) {
        this.module = dependenciesModule;
    }

    public static DependenciesModule_ProvidesDeviceInformationProviderFactory create(DependenciesModule dependenciesModule) {
        return new DependenciesModule_ProvidesDeviceInformationProviderFactory(dependenciesModule);
    }

    public static DeviceInformationProvider providesDeviceInformationProvider(DependenciesModule dependenciesModule) {
        return (DeviceInformationProvider) Preconditions.checkNotNullFromProvides(dependenciesModule.providesDeviceInformationProvider());
    }

    @Override // javax.inject.Provider
    public DeviceInformationProvider get() {
        return providesDeviceInformationProvider(this.module);
    }
}
