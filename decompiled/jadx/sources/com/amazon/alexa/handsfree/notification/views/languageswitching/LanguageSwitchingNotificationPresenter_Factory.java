package com.amazon.alexa.handsfree.notification.views.languageswitching;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
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
public final class LanguageSwitchingNotificationPresenter_Factory implements Factory<LanguageSwitchingNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<HandsFreeSetupStateProvider> handsFreeSetupStateProvider;
    private final Provider<NotificationMetadataProvider> metadataProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public LanguageSwitchingNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3, Provider<HandsFreeSetupStateProvider> provider4) {
        this.dismissIntentProvider = provider;
        this.notificationTypeProvider = provider2;
        this.metadataProvider = provider3;
        this.handsFreeSetupStateProvider = provider4;
    }

    public static LanguageSwitchingNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<NotificationMetadataProvider> provider3, Provider<HandsFreeSetupStateProvider> provider4) {
        return new LanguageSwitchingNotificationPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static LanguageSwitchingNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationType notificationType, NotificationMetadataProvider notificationMetadataProvider, HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        return new LanguageSwitchingNotificationPresenter(dismissIntentProvider, notificationType, notificationMetadataProvider, handsFreeSetupStateProvider);
    }

    @Override // javax.inject.Provider
    public LanguageSwitchingNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.notificationTypeProvider.get(), this.metadataProvider.get(), this.handsFreeSetupStateProvider.get());
    }
}
