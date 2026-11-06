package com.amazon.alexa.client.alexaservice.features.iocomponent;

import com.amazon.alexa.client.alexaservice.base.device.Device;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class IOComponentModule_ProvidesDeviceFactory implements Factory<Device> {
    private final IOComponentModule module;

    public IOComponentModule_ProvidesDeviceFactory(IOComponentModule iOComponentModule) {
        this.module = iOComponentModule;
    }

    public static IOComponentModule_ProvidesDeviceFactory create(IOComponentModule iOComponentModule) {
        return new IOComponentModule_ProvidesDeviceFactory(iOComponentModule);
    }

    public static Device providesDevice(IOComponentModule iOComponentModule) {
        return (Device) Preconditions.checkNotNullFromProvides(iOComponentModule.providesDevice());
    }

    @Override // javax.inject.Provider
    public Device get() {
        return providesDevice(this.module);
    }
}
