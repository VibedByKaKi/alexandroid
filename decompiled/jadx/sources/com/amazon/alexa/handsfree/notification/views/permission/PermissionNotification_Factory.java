package com.amazon.alexa.handsfree.notification.views.permission;

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
public final class PermissionNotification_Factory implements Factory<PermissionNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<Integer> notificationIdProvider;
    private final Provider<PermissionNotificationPresenter> permissionNotificationPresenterProvider;

    public PermissionNotification_Factory(Provider<String> provider, Provider<PermissionNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.permissionNotificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static PermissionNotification_Factory create(Provider<String> provider, Provider<PermissionNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new PermissionNotification_Factory(provider, provider2, provider3);
    }

    public static PermissionNotification newInstance(String str, Object obj, int i) {
        return new PermissionNotification(str, (PermissionNotificationPresenter) obj, i);
    }

    @Override // javax.inject.Provider
    public PermissionNotification get() {
        return newInstance(this.channelIdProvider.get(), this.permissionNotificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
