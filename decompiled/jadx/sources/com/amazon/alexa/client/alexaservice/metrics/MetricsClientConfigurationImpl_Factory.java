package com.amazon.alexa.client.alexaservice.metrics;

import com.amazon.alexa.client.alexaservice.base.device.DeviceInformationProvider;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetricsClientConfigurationImpl_Factory implements Factory<MetricsClientConfigurationImpl> {
    private final Provider<ClientConfiguration> configurationProvider;
    private final Provider<DeviceInformationProvider> deviceInformationProvider;

    public MetricsClientConfigurationImpl_Factory(Provider<ClientConfiguration> provider, Provider<DeviceInformationProvider> provider2) {
        this.configurationProvider = provider;
        this.deviceInformationProvider = provider2;
    }

    public static MetricsClientConfigurationImpl_Factory create(Provider<ClientConfiguration> provider, Provider<DeviceInformationProvider> provider2) {
        return new MetricsClientConfigurationImpl_Factory(provider, provider2);
    }

    public static MetricsClientConfigurationImpl newInstance(ClientConfiguration clientConfiguration, DeviceInformationProvider deviceInformationProvider) {
        return new MetricsClientConfigurationImpl(clientConfiguration, deviceInformationProvider);
    }

    @Override // javax.inject.Provider
    public MetricsClientConfigurationImpl get() {
        return newInstance(this.configurationProvider.get(), this.deviceInformationProvider.get());
    }
}
