package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideComponentRegistryFactory implements Factory<ComponentRegistry> {
    private final AhfModule module;

    public AhfModule_ProvideComponentRegistryFactory(AhfModule ahfModule) {
        this.module = ahfModule;
    }

    public static AhfModule_ProvideComponentRegistryFactory create(AhfModule ahfModule) {
        return new AhfModule_ProvideComponentRegistryFactory(ahfModule);
    }

    public static ComponentRegistry provideComponentRegistry(AhfModule ahfModule) {
        return (ComponentRegistry) Preconditions.checkNotNull(ahfModule.provideComponentRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ComponentRegistry get() {
        return provideComponentRegistry(this.module);
    }
}
