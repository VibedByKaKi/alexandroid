package com.amazon.alexa.handsfree.notification.views.languageswitching;

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
public final class LanguageSwitchingNotification_Factory implements Factory<LanguageSwitchingNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<LanguageSwitchingNotificationPresenter> languageSwitchingNotificationPresenterProvider;
    private final Provider<Integer> notificationIdProvider;

    public LanguageSwitchingNotification_Factory(Provider<String> provider, Provider<LanguageSwitchingNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.languageSwitchingNotificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static LanguageSwitchingNotification_Factory create(Provider<String> provider, Provider<LanguageSwitchingNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new LanguageSwitchingNotification_Factory(provider, provider2, provider3);
    }

    public static LanguageSwitchingNotification newInstance(String str, LanguageSwitchingNotificationPresenter languageSwitchingNotificationPresenter, int i) {
        return new LanguageSwitchingNotification(str, languageSwitchingNotificationPresenter, i);
    }

    @Override // javax.inject.Provider
    public LanguageSwitchingNotification get() {
        return newInstance(this.channelIdProvider.get(), this.languageSwitchingNotificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
