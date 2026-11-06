package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private final Provider<ComponentRegistry> componentRegistryProvider;
    private final AhfModule module;

    public AhfModule_ProvideFeatureServiceV2Factory(AhfModule ahfModule, Provider<ComponentRegistry> provider) {
        this.module = ahfModule;
        this.componentRegistryProvider = provider;
    }

    public static AhfModule_ProvideFeatureServiceV2Factory create(AhfModule ahfModule, Provider<ComponentRegistry> provider) {
        return new AhfModule_ProvideFeatureServiceV2Factory(ahfModule, provider);
    }

    public static FeatureServiceV2 provideFeatureServiceV2(AhfModule ahfModule, ComponentRegistry componentRegistry) {
        return (FeatureServiceV2) Preconditions.checkNotNull(ahfModule.provideFeatureServiceV2(componentRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return provideFeatureServiceV2(this.module, this.componentRegistryProvider.get());
    }
}
