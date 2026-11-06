package com.amazon.alexa.voice.apl;

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
public final class AplModule_ProvideAplFeatureEnablerFactory implements Factory<AplFeatureEnabler> {
    private final Provider<DeviceInformation> deviceInformationProvider;

    public AplModule_ProvideAplFeatureEnablerFactory(Provider<DeviceInformation> provider) {
        this.deviceInformationProvider = provider;
    }

    public static AplModule_ProvideAplFeatureEnablerFactory create(Provider<DeviceInformation> provider) {
        return new AplModule_ProvideAplFeatureEnablerFactory(provider);
    }

    public static AplFeatureEnabler provideAplFeatureEnabler(DeviceInformation deviceInformation) {
        return (AplFeatureEnabler) Preconditions.checkNotNullFromProvides(AplModule.provideAplFeatureEnabler(deviceInformation));
    }

    @Override // javax.inject.Provider
    public AplFeatureEnabler get() {
        return provideAplFeatureEnabler(this.deviceInformationProvider.get());
    }
}
