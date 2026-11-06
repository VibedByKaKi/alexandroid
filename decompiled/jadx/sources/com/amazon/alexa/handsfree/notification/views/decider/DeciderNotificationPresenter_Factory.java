package com.amazon.alexa.handsfree.notification.views.decider;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
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
public final class DeciderNotificationPresenter_Factory implements Factory<DeciderNotificationPresenter> {
    private final Provider<DeciderMetadataProvider> deciderMetadataProvider;
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<HandsFreeSetupStateProvider> handsFreeSetupStateProvider;
    private final Provider<NotificationType> notificationTypeProvider;

    public DeciderNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<DeciderMetadataProvider> provider3, Provider<HandsFreeSetupStateProvider> provider4) {
        this.dismissIntentProvider = provider;
        this.notificationTypeProvider = provider2;
        this.deciderMetadataProvider = provider3;
        this.handsFreeSetupStateProvider = provider4;
    }

    public static DeciderNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<NotificationType> provider2, Provider<DeciderMetadataProvider> provider3, Provider<HandsFreeSetupStateProvider> provider4) {
        return new DeciderNotificationPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static DeciderNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, NotificationType notificationType, DeciderMetadataProvider deciderMetadataProvider, HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        return new DeciderNotificationPresenter(dismissIntentProvider, notificationType, deciderMetadataProvider, handsFreeSetupStateProvider);
    }

    @Override // javax.inject.Provider
    public DeciderNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.notificationTypeProvider.get(), this.deciderMetadataProvider.get(), this.handsFreeSetupStateProvider.get());
    }
}
