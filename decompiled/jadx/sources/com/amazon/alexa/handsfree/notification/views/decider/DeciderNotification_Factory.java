package com.amazon.alexa.handsfree.notification.views.decider;

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
public final class DeciderNotification_Factory implements Factory<DeciderNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<DeciderNotificationPresenter> deciderNotificationPresenterProvider;
    private final Provider<Integer> notificationIdProvider;

    public DeciderNotification_Factory(Provider<String> provider, Provider<DeciderNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.deciderNotificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static DeciderNotification_Factory create(Provider<String> provider, Provider<DeciderNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new DeciderNotification_Factory(provider, provider2, provider3);
    }

    public static DeciderNotification newInstance(String str, DeciderNotificationPresenter deciderNotificationPresenter, int i) {
        return new DeciderNotification(str, deciderNotificationPresenter, i);
    }

    @Override // javax.inject.Provider
    public DeciderNotification get() {
        return newInstance(this.channelIdProvider.get(), this.deciderNotificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
