package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.device.api.DeviceInformation;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideDeviceInformationFactory implements Factory<DeviceInformation> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideDeviceInformationFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideDeviceInformationFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideDeviceInformationFactory(applicationModule);
    }

    public static DeviceInformation provideDeviceInformation(ApplicationModule applicationModule) {
        return (DeviceInformation) Preconditions.checkNotNull(applicationModule.provideDeviceInformation(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public DeviceInformation get() {
        return provideDeviceInformation(this.module);
    }
}
