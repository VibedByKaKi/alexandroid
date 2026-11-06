package com.amazon.alexa.voiceui.notifications;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class SmartLockNotificationPresenter_Factory implements Factory<SmartLockNotificationPresenter> {
    private final Provider<SmartLockNotificationView> notificationViewProvider;
    private final Provider<SmartLockNotificationInteractor> notificationsInteractorProvider;

    public SmartLockNotificationPresenter_Factory(Provider<SmartLockNotificationView> provider, Provider<SmartLockNotificationInteractor> provider2) {
        this.notificationViewProvider = provider;
        this.notificationsInteractorProvider = provider2;
    }

    public static SmartLockNotificationPresenter_Factory create(Provider<SmartLockNotificationView> provider, Provider<SmartLockNotificationInteractor> provider2) {
        return new SmartLockNotificationPresenter_Factory(provider, provider2);
    }

    public static SmartLockNotificationPresenter newInstance(Object obj, Object obj2) {
        return new SmartLockNotificationPresenter((SmartLockNotificationView) obj, (SmartLockNotificationInteractor) obj2);
    }

    @Override // javax.inject.Provider
    public SmartLockNotificationPresenter get() {
        return newInstance(this.notificationViewProvider.get(), this.notificationsInteractorProvider.get());
    }
}
