package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.api.DeviceInformation;
import dagger.Module;
import dagger.Provides;
import javax.annotation.Nullable;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class DeviceInformationModule {
    @Provides
    @Singleton
    @Nullable
    public DeviceInformation provideDeviceInformation() {
        return (DeviceInformation) Automotive$$ExternalSyntheticOutline0.m(DeviceInformation.class);
    }
}
