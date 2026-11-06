package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import com.amazon.alexa.mobilytics.configuration.DeviceConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DeviceProtobufHandler_Factory implements Factory<DeviceProtobufHandler> {
    private final Provider<DeviceConfiguration> deviceConfigurationProvider;

    public DeviceProtobufHandler_Factory(Provider<DeviceConfiguration> provider) {
        this.deviceConfigurationProvider = provider;
    }

    public static DeviceProtobufHandler_Factory create(Provider<DeviceConfiguration> provider) {
        return new DeviceProtobufHandler_Factory(provider);
    }

    public static DeviceProtobufHandler newInstance(DeviceConfiguration deviceConfiguration) {
        return new DeviceProtobufHandler(deviceConfiguration);
    }

    @Override // javax.inject.Provider
    public DeviceProtobufHandler get() {
        return newInstance(this.deviceConfigurationProvider.get());
    }
}
