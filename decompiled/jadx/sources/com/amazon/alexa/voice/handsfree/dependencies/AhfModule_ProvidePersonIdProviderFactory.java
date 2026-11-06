package com.amazon.alexa.voice.handsfree.dependencies;

import androidx.annotation.Nullable;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvidePersonIdProviderFactory implements Factory<PersonIdProvider> {
    private final Provider<ComponentRegistry> componentRegistryProvider;
    private final AhfModule module;

    public AhfModule_ProvidePersonIdProviderFactory(AhfModule ahfModule, Provider<ComponentRegistry> provider) {
        this.module = ahfModule;
        this.componentRegistryProvider = provider;
    }

    public static AhfModule_ProvidePersonIdProviderFactory create(AhfModule ahfModule, Provider<ComponentRegistry> provider) {
        return new AhfModule_ProvidePersonIdProviderFactory(ahfModule, provider);
    }

    @Nullable
    public static PersonIdProvider providePersonIdProvider(AhfModule ahfModule, ComponentRegistry componentRegistry) {
        return ahfModule.providePersonIdProvider(componentRegistry);
    }

    @Override // javax.inject.Provider
    @Nullable
    public PersonIdProvider get() {
        return providePersonIdProvider(this.module, this.componentRegistryProvider.get());
    }
}
