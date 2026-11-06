package com.amazon.alexa.handsfree.notification.views.killswitch;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
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
public final class KillSwitchNotificationPresenter_Factory implements Factory<KillSwitchNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<KillSwitchMetadataProvider> metadataProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public KillSwitchNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<KillSwitchMetadataProvider> provider3) {
        this.dismissIntentProvider = provider;
        this.notificationTypeProvider = provider2;
        this.metadataProvider = provider3;
    }

    public static KillSwitchNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<KillSwitchMetadataProvider> provider3) {
        return new KillSwitchNotificationPresenter_Factory(provider, provider2, provider3);
    }

    public static KillSwitchNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationType notificationType, Object obj) {
        return new KillSwitchNotificationPresenter(dismissIntentProvider, notificationType, (KillSwitchMetadataProvider) obj);
    }

    @Override // javax.inject.Provider
    public KillSwitchNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.notificationTypeProvider.get(), this.metadataProvider.get());
    }
}
