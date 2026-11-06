package com.amazon.alexa.handsfree.notification.views.quicksettings;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.SettingsProvider;
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
public final class QuickSettingsNotificationPresenter_Factory implements Factory<QuickSettingsNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<NotificationMetadataProvider> metadataProvider;
    private final Provider<NotificationType> notificationTypeProvider;
    private final Provider<SettingsProvider> settingsProvider;

    public QuickSettingsNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3, Provider<SettingsProvider> provider4) {
        this.dismissIntentProvider = provider;
        this.notificationTypeProvider = provider2;
        this.metadataProvider = provider3;
        this.settingsProvider = provider4;
    }

    public static QuickSettingsNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3, Provider<SettingsProvider> provider4) {
        return new QuickSettingsNotificationPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static QuickSettingsNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationType notificationType, NotificationMetadataProvider notificationMetadataProvider, SettingsProvider settingsProvider) {
        return new QuickSettingsNotificationPresenter(dismissIntentProvider, notificationType, notificationMetadataProvider, settingsProvider);
    }

    @Override // javax.inject.Provider
    public QuickSettingsNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.notificationTypeProvider.get(), this.metadataProvider.get(), this.settingsProvider.get());
    }
}
