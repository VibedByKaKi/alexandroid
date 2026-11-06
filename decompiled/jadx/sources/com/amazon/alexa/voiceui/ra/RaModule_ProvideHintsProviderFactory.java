package com.amazon.alexa.voiceui.ra;

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
public final class RaModule_ProvideHintsProviderFactory implements Factory<HintsProvider> {
    private final RaModule module;

    public RaModule_ProvideHintsProviderFactory(RaModule raModule) {
        this.module = raModule;
    }

    public static RaModule_ProvideHintsProviderFactory create(RaModule raModule) {
        return new RaModule_ProvideHintsProviderFactory(raModule);
    }

    public static HintsProvider provideHintsProvider(RaModule raModule) {
        return (HintsProvider) Preconditions.checkNotNullFromProvides(raModule.provideHintsProvider());
    }

    @Override // javax.inject.Provider
    public HintsProvider get() {
        return provideHintsProvider(this.module);
    }
}
