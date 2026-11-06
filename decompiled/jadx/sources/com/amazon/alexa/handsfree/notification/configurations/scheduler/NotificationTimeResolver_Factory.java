package com.amazon.alexa.handsfree.notification.configurations.scheduler;

import android.content.Context;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
import com.amazon.alexa.handsfree.notification.configurations.scheduler.NotificationTimeResolver;
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
public final class NotificationTimeResolver_Factory implements Factory<NotificationTimeResolver> {
    private final Provider<NotificationQuotaManager.QuotaConstraintsHandler> configIntervalHandlerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<NotificationOccurrenceCounter> notificationOccurrenceCounterProvider;
    private final Provider<NotificationTimeResolver.ScheduleTransformation> scheduleTransformationProvider;

    public NotificationTimeResolver_Factory(Provider<Context> provider, Provider<NotificationQuotaManager.QuotaConstraintsHandler> provider2, Provider<NotificationOccurrenceCounter> provider3, Provider<NotificationTimeResolver.ScheduleTransformation> provider4) {
        this.contextProvider = provider;
        this.configIntervalHandlerProvider = provider2;
        this.notificationOccurrenceCounterProvider = provider3;
        this.scheduleTransformationProvider = provider4;
    }

    public static NotificationTimeResolver_Factory create(Provider<Context> provider, Provider<NotificationQuotaManager.QuotaConstraintsHandler> provider2, Provider<NotificationOccurrenceCounter> provider3, Provider<NotificationTimeResolver.ScheduleTransformation> provider4) {
        return new NotificationTimeResolver_Factory(provider, provider2, provider3, provider4);
    }

    public static NotificationTimeResolver newInstance(Context context, NotificationQuotaManager.QuotaConstraintsHandler quotaConstraintsHandler, NotificationOccurrenceCounter notificationOccurrenceCounter, Object obj) {
        return new NotificationTimeResolver(context, quotaConstraintsHandler, notificationOccurrenceCounter, (NotificationTimeResolver.ScheduleTransformation) obj);
    }

    @Override // javax.inject.Provider
    public NotificationTimeResolver get() {
        return newInstance(this.contextProvider.get(), this.configIntervalHandlerProvider.get(), this.notificationOccurrenceCounterProvider.get(), this.scheduleTransformationProvider.get());
    }
}
