package com.amazon.alexa.accessory.repositories.device;

import com.amazon.alexa.accessory.protocol.Device;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface DeviceProvider {
    void provideDeviceConfiguration(Device.DeviceConfiguration deviceConfiguration);

    void provideDeviceFeatures(Device.DeviceFeatures deviceFeatures);

    void provideDeviceFeaturesError(Throwable th);

    void provideDeviceInformationSet(Set<Device.DeviceInformation> set);
}
