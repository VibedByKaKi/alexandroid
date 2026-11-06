package com.amazon.comms.calling.dependency.modules;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvideComponentRegistryFactory implements Factory<ComponentRegistry> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideComponentRegistryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideComponentRegistryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideComponentRegistryFactory(applicationModule);
    }

    public static ComponentRegistry provideComponentRegistry(ApplicationModule applicationModule) {
        return (ComponentRegistry) Preconditions.checkNotNullFromProvides(applicationModule.provideComponentRegistry());
    }

    @Override // javax.inject.Provider
    public ComponentRegistry get() {
        return provideComponentRegistry(this.module);
    }
}
