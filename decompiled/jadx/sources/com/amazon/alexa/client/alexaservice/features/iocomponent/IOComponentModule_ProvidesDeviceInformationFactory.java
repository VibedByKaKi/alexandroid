package com.amazon.alexa.client.alexaservice.features.iocomponent;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class IOComponentModule_ProvidesDeviceInformationFactory implements Factory<DeviceInformation> {
    private final Provider<Context> contextProvider;
    private final IOComponentModule module;

    public IOComponentModule_ProvidesDeviceInformationFactory(IOComponentModule iOComponentModule, Provider<Context> provider) {
        this.module = iOComponentModule;
        this.contextProvider = provider;
    }

    public static IOComponentModule_ProvidesDeviceInformationFactory create(IOComponentModule iOComponentModule, Provider<Context> provider) {
        return new IOComponentModule_ProvidesDeviceInformationFactory(iOComponentModule, provider);
    }

    @Nullable
    public static DeviceInformation providesDeviceInformation(IOComponentModule iOComponentModule, Context context) {
        return iOComponentModule.providesDeviceInformation(context);
    }

    @Override // javax.inject.Provider
    @Nullable
    public DeviceInformation get() {
        return providesDeviceInformation(this.module, this.contextProvider.get());
    }
}
