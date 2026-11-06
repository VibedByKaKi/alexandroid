package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.device.api.DeviceInformation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class DeviceInformationModule_ProvideDeviceInformationFactory implements Factory<DeviceInformation> {
    private final DeviceInformationModule module;

    public DeviceInformationModule_ProvideDeviceInformationFactory(DeviceInformationModule deviceInformationModule) {
        this.module = deviceInformationModule;
    }

    public static DeviceInformationModule_ProvideDeviceInformationFactory create(DeviceInformationModule deviceInformationModule) {
        return new DeviceInformationModule_ProvideDeviceInformationFactory(deviceInformationModule);
    }

    @Nullable
    public static DeviceInformation provideDeviceInformation(DeviceInformationModule deviceInformationModule) {
        return deviceInformationModule.provideDeviceInformation();
    }

    @Override // javax.inject.Provider
    @Nullable
    public DeviceInformation get() {
        return provideDeviceInformation(this.module);
    }
}
