package com.amazon.alexa.client.alexaservice.metrics;

import com.amazon.alexa.client.alexaservice.base.device.DeviceInformationProvider;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricsClientConfigurationImpl implements MetricsClientConfiguration {
    private final ClientConfiguration configuration;
    private final DeviceInformationProvider deviceInformationProvider;

    @Inject
    public MetricsClientConfigurationImpl(ClientConfiguration clientConfiguration, DeviceInformationProvider deviceInformationProvider) {
        this.configuration = clientConfiguration;
        this.deviceInformationProvider = deviceInformationProvider;
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    public String getAwsMobileAnalyticsApplicationId() {
        return this.configuration.getAwsMobileAnalyticsApplicationId();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    public String getMetricsDeviceSerialNumber() {
        return this.deviceInformationProvider.getDeviceSerialNumber();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    public String getMetricsDeviceType() {
        return this.deviceInformationProvider.getDeviceType();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    public String getMetricsServiceName() {
        return this.configuration.getMetricsServiceName();
    }
}
