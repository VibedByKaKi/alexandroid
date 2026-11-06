package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration;
import com.amazon.alexa.mobilytics.configuration.DeviceConfiguration;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MwsPivotsProtobufHandler_Factory implements Factory<MwsPivotsProtobufHandler> {
    private final Provider<ApplicationConfiguration> applicationConfigurationProvider;
    private final Provider<DeviceConfiguration> deviceConfigurationProvider;
    private final Provider<MobilyticsUserProvider> userProvider;

    public MwsPivotsProtobufHandler_Factory(Provider<ApplicationConfiguration> provider, Provider<DeviceConfiguration> provider2, Provider<MobilyticsUserProvider> provider3) {
        this.applicationConfigurationProvider = provider;
        this.deviceConfigurationProvider = provider2;
        this.userProvider = provider3;
    }

    public static MwsPivotsProtobufHandler_Factory create(Provider<ApplicationConfiguration> provider, Provider<DeviceConfiguration> provider2, Provider<MobilyticsUserProvider> provider3) {
        return new MwsPivotsProtobufHandler_Factory(provider, provider2, provider3);
    }

    public static MwsPivotsProtobufHandler newInstance(ApplicationConfiguration applicationConfiguration, DeviceConfiguration deviceConfiguration, MobilyticsUserProvider mobilyticsUserProvider) {
        return new MwsPivotsProtobufHandler(applicationConfiguration, deviceConfiguration, mobilyticsUserProvider);
    }

    @Override // javax.inject.Provider
    public MwsPivotsProtobufHandler get() {
        return newInstance(this.applicationConfigurationProvider.get(), this.deviceConfigurationProvider.get(), this.userProvider.get());
    }
}
