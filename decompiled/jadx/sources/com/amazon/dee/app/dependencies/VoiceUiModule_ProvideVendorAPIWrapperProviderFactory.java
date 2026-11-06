package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapperProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VoiceUiModule_ProvideVendorAPIWrapperProviderFactory implements Factory<VendorAPIWrapperProvider> {
    private final Provider<Context> contextProvider;
    private final VoiceUiModule module;

    public VoiceUiModule_ProvideVendorAPIWrapperProviderFactory(VoiceUiModule voiceUiModule, Provider<Context> provider) {
        this.module = voiceUiModule;
        this.contextProvider = provider;
    }

    public static VoiceUiModule_ProvideVendorAPIWrapperProviderFactory create(VoiceUiModule voiceUiModule, Provider<Context> provider) {
        return new VoiceUiModule_ProvideVendorAPIWrapperProviderFactory(voiceUiModule, provider);
    }

    public static VendorAPIWrapperProvider provideVendorAPIWrapperProvider(VoiceUiModule voiceUiModule, Context context) {
        return (VendorAPIWrapperProvider) Preconditions.checkNotNullFromProvides(voiceUiModule.provideVendorAPIWrapperProvider(context));
    }

    @Override // javax.inject.Provider
    public VendorAPIWrapperProvider get() {
        return provideVendorAPIWrapperProvider(this.module, this.contextProvider.get());
    }
}
