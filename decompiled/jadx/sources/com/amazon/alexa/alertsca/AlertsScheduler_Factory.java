package com.amazon.alexa.alertsca;

import android.app.AlarmManager;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.alexa.device.api.DeviceInformation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsScheduler_Factory implements Factory<AlertsScheduler> {
    private final Provider<AlarmManager> alarmManagerProvider;
    private final Provider<DeviceInformation> deviceInformationProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public AlertsScheduler_Factory(Provider<AlarmManager> provider, Provider<MetricsService> provider2, Provider<DeviceInformation> provider3) {
        this.alarmManagerProvider = provider;
        this.metricsServiceProvider = provider2;
        this.deviceInformationProvider = provider3;
    }

    public static AlertsScheduler_Factory create(Provider<AlarmManager> provider, Provider<MetricsService> provider2, Provider<DeviceInformation> provider3) {
        return new AlertsScheduler_Factory(provider, provider2, provider3);
    }

    public static AlertsScheduler newInstance(AlarmManager alarmManager, MetricsService metricsService, DeviceInformation deviceInformation) {
        return new AlertsScheduler(alarmManager, metricsService, deviceInformation);
    }

    @Override // javax.inject.Provider
    public AlertsScheduler get() {
        return newInstance(this.alarmManagerProvider.get(), this.metricsServiceProvider.get(), this.deviceInformationProvider.get());
    }
}
