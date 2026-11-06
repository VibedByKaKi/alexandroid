package com.amazon.alexa.voice.enablement;

import com.amazon.alexa.device.api.DeviceInformation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class EnablementModule_ProvideVoiceEnablementFactory implements Factory<VoiceEnablement> {
    private final Provider<DeviceInformation> deviceInformationProvider;

    public EnablementModule_ProvideVoiceEnablementFactory(Provider<DeviceInformation> provider) {
        this.deviceInformationProvider = provider;
    }

    public static EnablementModule_ProvideVoiceEnablementFactory create(Provider<DeviceInformation> provider) {
        return new EnablementModule_ProvideVoiceEnablementFactory(provider);
    }

    public static VoiceEnablement provideVoiceEnablement(DeviceInformation deviceInformation) {
        return (VoiceEnablement) Preconditions.checkNotNullFromProvides(EnablementModule.provideVoiceEnablement(deviceInformation));
    }

    @Override // javax.inject.Provider
    public VoiceEnablement get() {
        return provideVoiceEnablement(this.deviceInformationProvider.get());
    }
}
