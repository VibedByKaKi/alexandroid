package com.amazon.alexa.handsfree.notification.views.killswitch;

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
public final class KillSwitchNotification_Factory implements Factory<KillSwitchNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<Integer> notificationIdProvider;
    private final Provider<KillSwitchNotificationPresenter> notificationPresenterProvider;

    public KillSwitchNotification_Factory(Provider<String> provider, Provider<KillSwitchNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.notificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static KillSwitchNotification_Factory create(Provider<String> provider, Provider<KillSwitchNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new KillSwitchNotification_Factory(provider, provider2, provider3);
    }

    public static KillSwitchNotification newInstance(String str, Object obj, int i) {
        return new KillSwitchNotification(str, (KillSwitchNotificationPresenter) obj, i);
    }

    @Override // javax.inject.Provider
    public KillSwitchNotification get() {
        return newInstance(this.channelIdProvider.get(), this.notificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
