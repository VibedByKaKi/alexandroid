package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.growthcore.service.sessionid.ExperimentSessionIDProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class InternalModule_ProvidesExperimentSessionIDProviderFactory implements Factory<ExperimentSessionIDProvider> {
    private final InternalModule module;

    public InternalModule_ProvidesExperimentSessionIDProviderFactory(InternalModule internalModule) {
        this.module = internalModule;
    }

    public static InternalModule_ProvidesExperimentSessionIDProviderFactory create(InternalModule internalModule) {
        return new InternalModule_ProvidesExperimentSessionIDProviderFactory(internalModule);
    }

    public static ExperimentSessionIDProvider providesExperimentSessionIDProvider(InternalModule internalModule) {
        return (ExperimentSessionIDProvider) Preconditions.checkNotNullFromProvides(internalModule.providesExperimentSessionIDProvider());
    }

    @Override // javax.inject.Provider
    public ExperimentSessionIDProvider get() {
        return providesExperimentSessionIDProvider(this.module);
    }
}
