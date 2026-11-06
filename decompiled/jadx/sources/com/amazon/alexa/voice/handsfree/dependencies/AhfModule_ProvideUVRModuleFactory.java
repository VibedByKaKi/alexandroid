package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.protocols.uservoicerecognition.UVRModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideUVRModuleFactory implements Factory<UVRModule> {
    private final AhfModule module;

    public AhfModule_ProvideUVRModuleFactory(AhfModule ahfModule) {
        this.module = ahfModule;
    }

    public static AhfModule_ProvideUVRModuleFactory create(AhfModule ahfModule) {
        return new AhfModule_ProvideUVRModuleFactory(ahfModule);
    }

    public static UVRModule provideUVRModule(AhfModule ahfModule) {
        return (UVRModule) Preconditions.checkNotNull(ahfModule.provideUVRModule(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public UVRModule get() {
        return provideUVRModule(this.module);
    }
}
