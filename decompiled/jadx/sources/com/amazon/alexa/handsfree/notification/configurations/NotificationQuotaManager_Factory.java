package com.amazon.alexa.handsfree.notification.configurations;

import android.content.Context;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.configurations.NotificationQuotaManager;
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
public final class NotificationQuotaManager_Factory implements Factory<NotificationQuotaManager> {
    private final Provider<Context> contextProvider;
    private final Provider<NotificationOccurrenceCounter> notificationOccurrenceCounterProvider;
    private final Provider<NotificationQuotaManager.QuotaConstraintsHandler> quotaConstraintsHandlerProvider;

    public NotificationQuotaManager_Factory(Provider<Context> provider, Provider<NotificationOccurrenceCounter> provider2, Provider<NotificationQuotaManager.QuotaConstraintsHandler> provider3) {
        this.contextProvider = provider;
        this.notificationOccurrenceCounterProvider = provider2;
        this.quotaConstraintsHandlerProvider = provider3;
    }

    public static NotificationQuotaManager_Factory create(Provider<Context> provider, Provider<NotificationOccurrenceCounter> provider2, Provider<NotificationQuotaManager.QuotaConstraintsHandler> provider3) {
        return new NotificationQuotaManager_Factory(provider, provider2, provider3);
    }

    public static NotificationQuotaManager newInstance(Context context, NotificationOccurrenceCounter notificationOccurrenceCounter, NotificationQuotaManager.QuotaConstraintsHandler quotaConstraintsHandler) {
        return new NotificationQuotaManager(context, notificationOccurrenceCounter, quotaConstraintsHandler);
    }

    @Override // javax.inject.Provider
    public NotificationQuotaManager get() {
        return newInstance(this.contextProvider.get(), this.notificationOccurrenceCounterProvider.get(), this.quotaConstraintsHandlerProvider.get());
    }
}
