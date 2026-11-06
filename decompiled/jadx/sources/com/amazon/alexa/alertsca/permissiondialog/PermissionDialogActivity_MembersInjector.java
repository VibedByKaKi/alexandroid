package com.amazon.alexa.alertsca.permissiondialog;

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
public final class PermissionDialogActivity_MembersInjector implements MembersInjector<PermissionDialogActivity> {
    private final Provider<MetricsService> metricsServiceProvider;

    public PermissionDialogActivity_MembersInjector(Provider<MetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static MembersInjector<PermissionDialogActivity> create(Provider<MetricsService> provider) {
        return new PermissionDialogActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.alertsca.permissiondialog.PermissionDialogActivity.metricsService")
    public static void injectMetricsService(PermissionDialogActivity permissionDialogActivity, MetricsService metricsService) {
        permissionDialogActivity.metricsService = metricsService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PermissionDialogActivity permissionDialogActivity) {
        injectMetricsService(permissionDialogActivity, this.metricsServiceProvider.get());
    }
}
