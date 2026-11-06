package com.amazon.alexa.handsfree.notification.views.decider;

import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
import com.amazon.alexa.handsfree.notification.views.NotificationStateProvider;
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
public final class DeciderMetadataProvider_Factory implements Factory<DeciderMetadataProvider> {
    private final Provider<HandsFreeSetupStateProvider> handsFreeSetupStateProvider;
    private final Provider<NotificationStateProvider> notificationStateProvider;

    public DeciderMetadataProvider_Factory(Provider<NotificationStateProvider> provider, Provider<HandsFreeSetupStateProvider> provider2) {
        this.notificationStateProvider = provider;
        this.handsFreeSetupStateProvider = provider2;
    }

    public static DeciderMetadataProvider_Factory create(Provider<NotificationStateProvider> provider, Provider<HandsFreeSetupStateProvider> provider2) {
        return new DeciderMetadataProvider_Factory(provider, provider2);
    }

    public static DeciderMetadataProvider newInstance(NotificationStateProvider notificationStateProvider, HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        return new DeciderMetadataProvider(notificationStateProvider, handsFreeSetupStateProvider);
    }

    @Override // javax.inject.Provider
    public DeciderMetadataProvider get() {
        return newInstance(this.notificationStateProvider.get(), this.handsFreeSetupStateProvider.get());
    }
}
