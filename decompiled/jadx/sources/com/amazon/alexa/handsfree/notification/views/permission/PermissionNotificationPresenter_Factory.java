package com.amazon.alexa.handsfree.notification.views.permission;

import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
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
public final class PermissionNotificationPresenter_Factory implements Factory<PermissionNotificationPresenter> {
    private final Provider<DismissIntentProvider> dismissIntentProvider;
    private final Provider<HandsFreeSetupStateProvider> handsFreeSetupStateProvider;
    private final Provider<PermissionMetadataProvider> permissionMetadataProvider;

    public PermissionNotificationPresenter_Factory(Provider<DismissIntentProvider> provider, Provider<PermissionMetadataProvider> provider2, Provider<HandsFreeSetupStateProvider> provider3) {
        this.dismissIntentProvider = provider;
        this.permissionMetadataProvider = provider2;
        this.handsFreeSetupStateProvider = provider3;
    }

    public static PermissionNotificationPresenter_Factory create(Provider<DismissIntentProvider> provider, Provider<PermissionMetadataProvider> provider2, Provider<HandsFreeSetupStateProvider> provider3) {
        return new PermissionNotificationPresenter_Factory(provider, provider2, provider3);
    }

    public static PermissionNotificationPresenter newInstance(DismissIntentProvider dismissIntentProvider, PermissionMetadataProvider permissionMetadataProvider, HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        return new PermissionNotificationPresenter(dismissIntentProvider, permissionMetadataProvider, handsFreeSetupStateProvider);
    }

    @Override // javax.inject.Provider
    public PermissionNotificationPresenter get() {
        return newInstance(this.dismissIntentProvider.get(), this.permissionMetadataProvider.get(), this.handsFreeSetupStateProvider.get());
    }
}
