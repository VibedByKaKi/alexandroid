package com.amazon.alexa.handsfree.notification.views.lockscreen;

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
public final class ShowOnLockscreenNotificationPresenter_Factory implements Factory<ShowOnLockscreenNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<NotificationMetadataProvider> metadataProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public ShowOnLockscreenNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationMetadataProvider> provider2, Provider<NotificationType> provider3) {
        this.dismissIntentProvider = provider;
        this.metadataProvider = provider2;
        this.notificationTypeProvider = provider3;
    }

    public static ShowOnLockscreenNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationMetadataProvider> provider2, Provider<NotificationType> provider3) {
        return new ShowOnLockscreenNotificationPresenter_Factory(provider, provider2, provider3);
    }

    public static ShowOnLockscreenNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationMetadataProvider notificationMetadataProvider, NotificationType notificationType) {
        return new ShowOnLockscreenNotificationPresenter(dismissIntentProvider, notificationMetadataProvider, notificationType);
    }

    @Override // javax.inject.Provider
    public ShowOnLockscreenNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.metadataProvider.get(), this.notificationTypeProvider.get());
    }
}
