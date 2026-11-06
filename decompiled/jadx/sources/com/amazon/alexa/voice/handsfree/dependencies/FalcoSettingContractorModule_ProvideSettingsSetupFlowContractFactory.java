package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FalcoSettingContractorModule_ProvideSettingsSetupFlowContractFactory implements Factory<SettingsSetupFlowContract> {
    private final FalcoSettingContractorModule module;

    public FalcoSettingContractorModule_ProvideSettingsSetupFlowContractFactory(FalcoSettingContractorModule falcoSettingContractorModule) {
        this.module = falcoSettingContractorModule;
    }

    public static FalcoSettingContractorModule_ProvideSettingsSetupFlowContractFactory create(FalcoSettingContractorModule falcoSettingContractorModule) {
        return new FalcoSettingContractorModule_ProvideSettingsSetupFlowContractFactory(falcoSettingContractorModule);
    }

    public static SettingsSetupFlowContract provideSettingsSetupFlowContract(FalcoSettingContractorModule falcoSettingContractorModule) {
        return (SettingsSetupFlowContract) Preconditions.checkNotNull(falcoSettingContractorModule.provideSettingsSetupFlowContract(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SettingsSetupFlowContract get() {
        return provideSettingsSetupFlowContract(this.module);
    }
}
