package com.amazon.alexa.handsfree.notification.views.voiceprofile;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
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
public final class VoiceProfileNotificationPresenter_Factory implements Factory<VoiceProfileNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<NotificationMetadataProvider> metadataProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public VoiceProfileNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3) {
        this.dismissIntentProvider = provider;
        this.notificationTypeProvider = provider2;
        this.metadataProvider = provider3;
    }

    public static VoiceProfileNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3) {
        return new VoiceProfileNotificationPresenter_Factory(provider, provider2, provider3);
    }

    public static VoiceProfileNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationType notificationType, NotificationMetadataProvider notificationMetadataProvider) {
        return new VoiceProfileNotificationPresenter(dismissIntentProvider, notificationType, notificationMetadataProvider);
    }

    @Override // javax.inject.Provider
    public VoiceProfileNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.notificationTypeProvider.get(), this.metadataProvider.get());
    }
}
