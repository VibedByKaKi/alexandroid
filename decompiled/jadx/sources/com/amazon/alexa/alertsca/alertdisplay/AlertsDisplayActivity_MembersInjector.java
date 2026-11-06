package com.amazon.alexa.alertsca.alertdisplay;

import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsDisplayActivity_MembersInjector implements MembersInjector<AlertsDisplayActivity> {
    private final Provider<MetricsService> metricsServiceProvider;

    public AlertsDisplayActivity_MembersInjector(Provider<MetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static MembersInjector<AlertsDisplayActivity> create(Provider<MetricsService> provider) {
        return new AlertsDisplayActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.alertsca.alertdisplay.AlertsDisplayActivity.metricsService")
    public static void injectMetricsService(AlertsDisplayActivity alertsDisplayActivity, MetricsService metricsService) {
        alertsDisplayActivity.metricsService = metricsService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AlertsDisplayActivity alertsDisplayActivity) {
        injectMetricsService(alertsDisplayActivity, this.metricsServiceProvider.get());
    }
}
