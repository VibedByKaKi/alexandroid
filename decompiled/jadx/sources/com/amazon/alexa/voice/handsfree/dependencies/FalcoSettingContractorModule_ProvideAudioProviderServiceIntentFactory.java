package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapperProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FalcoSettingContractorModule_ProvideAudioProviderServiceIntentFactory implements Factory<Intent> {
    private final Provider<Context> contextProvider;
    private final FalcoSettingContractorModule module;
    private final Provider<VendorAPIWrapperProvider> vendorAPIWrapperProvider;

    public FalcoSettingContractorModule_ProvideAudioProviderServiceIntentFactory(FalcoSettingContractorModule falcoSettingContractorModule, Provider<Context> provider, Provider<VendorAPIWrapperProvider> provider2) {
        this.module = falcoSettingContractorModule;
        this.contextProvider = provider;
        this.vendorAPIWrapperProvider = provider2;
    }

    public static FalcoSettingContractorModule_ProvideAudioProviderServiceIntentFactory create(FalcoSettingContractorModule falcoSettingContractorModule, Provider<Context> provider, Provider<VendorAPIWrapperProvider> provider2) {
        return new FalcoSettingContractorModule_ProvideAudioProviderServiceIntentFactory(falcoSettingContractorModule, provider, provider2);
    }

    @Nullable
    public static Intent provideAudioProviderServiceIntent(FalcoSettingContractorModule falcoSettingContractorModule, Context context, VendorAPIWrapperProvider vendorAPIWrapperProvider) {
        return falcoSettingContractorModule.provideAudioProviderServiceIntent(context, vendorAPIWrapperProvider);
    }

    @Override // javax.inject.Provider
    @Nullable
    public Intent get() {
        return provideAudioProviderServiceIntent(this.module, this.contextProvider.get(), this.vendorAPIWrapperProvider.get());
    }
}
