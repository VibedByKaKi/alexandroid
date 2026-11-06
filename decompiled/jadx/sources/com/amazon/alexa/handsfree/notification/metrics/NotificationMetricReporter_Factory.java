package com.amazon.alexa.handsfree.notification.metrics;

import android.content.Context;
import com.amazon.alexa.handsfree.notification.api.NotificationContract;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
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
public final class NotificationMetricReporter_Factory implements Factory<NotificationMetricReporter> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsBuilderProvider> metricsBuilderProvider;
    private final Provider<NotificationContract> notificationContractProvider;

    public NotificationMetricReporter_Factory(Provider<Context> provider, Provider<MetricsBuilderProvider> provider2, Provider<NotificationContract> provider3) {
        this.contextProvider = provider;
        this.metricsBuilderProvider = provider2;
        this.notificationContractProvider = provider3;
    }

    public static NotificationMetricReporter_Factory create(Provider<Context> provider, Provider<MetricsBuilderProvider> provider2, Provider<NotificationContract> provider3) {
        return new NotificationMetricReporter_Factory(provider, provider2, provider3);
    }

    public static NotificationMetricReporter newInstance(Context context, MetricsBuilderProvider metricsBuilderProvider, NotificationContract notificationContract) {
        return new NotificationMetricReporter(context, metricsBuilderProvider, notificationContract);
    }

    @Override // javax.inject.Provider
    public NotificationMetricReporter get() {
        return newInstance(this.contextProvider.get(), this.metricsBuilderProvider.get(), this.notificationContractProvider.get());
    }
}
