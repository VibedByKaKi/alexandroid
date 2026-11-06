package com.amazon.alexa.client.metrics.mobilytics;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import com.amazon.alexa.client.metrics.mobilytics.MobilyticsDeviceImpl;
import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsDeviceProviderImpl implements MobilyticsDeviceProvider {
    private final MetricsClientConfiguration clientConfiguration;

    public MobilyticsDeviceProviderImpl(MetricsClientConfiguration metricsClientConfiguration) {
        this.clientConfiguration = metricsClientConfiguration;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public MobilyticsDevice device() {
        MobilyticsDeviceImpl.Builder withDeviceType = MobilyticsDeviceImpl.builder().withDeviceType(this.clientConfiguration.getMetricsDeviceType());
        String metricsDeviceSerialNumber = this.clientConfiguration.getMetricsDeviceSerialNumber();
        if (metricsDeviceSerialNumber != null) {
            withDeviceType.withDeviceSerialNumber(metricsDeviceSerialNumber);
        }
        return withDeviceType.build();
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void addListener(@NonNull MobilyticsDeviceProvider.Listener listener) {
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void removeListener(@NonNull MobilyticsDeviceProvider.Listener listener) {
    }
}
