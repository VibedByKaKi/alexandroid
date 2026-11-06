package com.amazon.alexa.handsfree.notification.views.quicksettings;

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
public final class QuickSettingsNotification_Factory implements Factory<QuickSettingsNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<Integer> notificationIdProvider;
    private final Provider<QuickSettingsNotificationPresenter> quickSettingsNotificationPresenterProvider;

    public QuickSettingsNotification_Factory(Provider<String> provider, Provider<QuickSettingsNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.quickSettingsNotificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static QuickSettingsNotification_Factory create(Provider<String> provider, Provider<QuickSettingsNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new QuickSettingsNotification_Factory(provider, provider2, provider3);
    }

    public static QuickSettingsNotification newInstance(String str, QuickSettingsNotificationPresenter quickSettingsNotificationPresenter, int i) {
        return new QuickSettingsNotification(str, quickSettingsNotificationPresenter, i);
    }

    @Override // javax.inject.Provider
    public QuickSettingsNotification get() {
        return newInstance(this.channelIdProvider.get(), this.quickSettingsNotificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
