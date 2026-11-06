package com.amazon.alexa.voice.handsfree.dependencies;

import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.settings.contract.SettingsContract;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapperProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FalcoSettingContractorModule_ProvideSettingsContractFactory implements Factory<SettingsContract> {
    private final FalcoSettingContractorModule module;
    private final Provider<VendorAPIWrapperProvider> vendorAPIWrapperProvider;

    public FalcoSettingContractorModule_ProvideSettingsContractFactory(FalcoSettingContractorModule falcoSettingContractorModule, Provider<VendorAPIWrapperProvider> provider) {
        this.module = falcoSettingContractorModule;
        this.vendorAPIWrapperProvider = provider;
    }

    public static FalcoSettingContractorModule_ProvideSettingsContractFactory create(FalcoSettingContractorModule falcoSettingContractorModule, Provider<VendorAPIWrapperProvider> provider) {
        return new FalcoSettingContractorModule_ProvideSettingsContractFactory(falcoSettingContractorModule, provider);
    }

    @Nullable
    public static SettingsContract provideSettingsContract(FalcoSettingContractorModule falcoSettingContractorModule, VendorAPIWrapperProvider vendorAPIWrapperProvider) {
        return falcoSettingContractorModule.provideSettingsContract(vendorAPIWrapperProvider);
    }

    @Override // javax.inject.Provider
    @Nullable
    public SettingsContract get() {
        return provideSettingsContract(this.module, this.vendorAPIWrapperProvider.get());
    }
}
