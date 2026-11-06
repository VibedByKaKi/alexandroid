package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.handsfree.settings.providers.SettingsSetupFlowProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VoiceUiModule_ProvideSettingsSetupFlowProviderFactory implements Factory<SettingsSetupFlowProvider> {
    private final VoiceUiModule module;

    public VoiceUiModule_ProvideSettingsSetupFlowProviderFactory(VoiceUiModule voiceUiModule) {
        this.module = voiceUiModule;
    }

    public static VoiceUiModule_ProvideSettingsSetupFlowProviderFactory create(VoiceUiModule voiceUiModule) {
        return new VoiceUiModule_ProvideSettingsSetupFlowProviderFactory(voiceUiModule);
    }

    public static SettingsSetupFlowProvider provideSettingsSetupFlowProvider(VoiceUiModule voiceUiModule) {
        return (SettingsSetupFlowProvider) Preconditions.checkNotNullFromProvides(voiceUiModule.provideSettingsSetupFlowProvider());
    }

    @Override // javax.inject.Provider
    public SettingsSetupFlowProvider get() {
        return provideSettingsSetupFlowProvider(this.module);
    }
}
