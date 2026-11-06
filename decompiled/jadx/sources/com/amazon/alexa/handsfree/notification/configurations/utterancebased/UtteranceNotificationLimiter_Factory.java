package com.amazon.alexa.handsfree.notification.configurations.utterancebased;

import android.content.Context;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import com.amazon.alexa.handsfree.notification.NotificationType;
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
public final class UtteranceNotificationLimiter_Factory implements Factory<UtteranceNotificationLimiter> {
    private final Provider<Context> contextProvider;
    private final Provider<NotificationOccurrenceCounter> notificationOccurrenceCounterProvider;
    private final Provider<NotificationType> notificationTypeProvider;
    private final Provider<UtteranceConfigHandler> utteranceConfigHandlerProvider;

    public UtteranceNotificationLimiter_Factory(Provider<Context> provider, Provider<NotificationType> provider2, Provider<NotificationOccurrenceCounter> provider3, Provider<UtteranceConfigHandler> provider4) {
        this.contextProvider = provider;
        this.notificationTypeProvider = provider2;
        this.notificationOccurrenceCounterProvider = provider3;
        this.utteranceConfigHandlerProvider = provider4;
    }

    public static UtteranceNotificationLimiter_Factory create(Provider<Context> provider, Provider<NotificationType> provider2, Provider<NotificationOccurrenceCounter> provider3, Provider<UtteranceConfigHandler> provider4) {
        return new UtteranceNotificationLimiter_Factory(provider, provider2, provider3, provider4);
    }

    public static UtteranceNotificationLimiter newInstance(Context context, NotificationType notificationType, NotificationOccurrenceCounter notificationOccurrenceCounter, UtteranceConfigHandler utteranceConfigHandler) {
        return new UtteranceNotificationLimiter(context, notificationType, notificationOccurrenceCounter, utteranceConfigHandler);
    }

    @Override // javax.inject.Provider
    public UtteranceNotificationLimiter get() {
        return newInstance(this.contextProvider.get(), this.notificationTypeProvider.get(), this.notificationOccurrenceCounterProvider.get(), this.utteranceConfigHandlerProvider.get());
    }
}
