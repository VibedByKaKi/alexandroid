package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.protocols.Initializer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideInitializerFactory implements Factory<Initializer> {
    private final AhfModule module;

    public AhfModule_ProvideInitializerFactory(AhfModule ahfModule) {
        this.module = ahfModule;
    }

    public static AhfModule_ProvideInitializerFactory create(AhfModule ahfModule) {
        return new AhfModule_ProvideInitializerFactory(ahfModule);
    }

    public static Initializer provideInitializer(AhfModule ahfModule) {
        return (Initializer) Preconditions.checkNotNull(ahfModule.provideInitializer(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Initializer get() {
        return provideInitializer(this.module);
    }
}
