package com.amazon.alexa.handsfree.notification;

import android.content.Context;
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
public final class NotificationUtils_Factory implements Factory<NotificationUtils> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsBuilderProvider> metricsBuilderProvider;
    private final Provider<NotificationOccurrenceCounter> notificationOccurrenceCounterProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public NotificationUtils_Factory(Provider<Context> provider, Provider<NotificationType> provider2, Provider<MetricsBuilderProvider> provider3, Provider<NotificationOccurrenceCounter> provider4) {
        this.contextProvider = provider;
        this.notificationTypeProvider = provider2;
        this.metricsBuilderProvider = provider3;
        this.notificationOccurrenceCounterProvider = provider4;
    }

    public static NotificationUtils_Factory create(Provider<Context> provider, Provider<NotificationType> provider2, Provider<MetricsBuilderProvider> provider3, Provider<NotificationOccurrenceCounter> provider4) {
        return new NotificationUtils_Factory(provider, provider2, provider3, provider4);
    }

    public static NotificationUtils newInstance(Context context, NotificationType notificationType, MetricsBuilderProvider metricsBuilderProvider, NotificationOccurrenceCounter notificationOccurrenceCounter) {
        return new NotificationUtils(context, notificationType, metricsBuilderProvider, notificationOccurrenceCounter);
    }

    @Override // javax.inject.Provider
    public NotificationUtils get() {
        return newInstance(this.contextProvider.get(), this.notificationTypeProvider.get(), this.metricsBuilderProvider.get(), this.notificationOccurrenceCounterProvider.get());
    }
}
