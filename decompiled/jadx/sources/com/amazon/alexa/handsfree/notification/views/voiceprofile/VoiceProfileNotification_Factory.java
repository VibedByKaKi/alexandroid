package com.amazon.alexa.handsfree.notification.views.voiceprofile;

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
public final class VoiceProfileNotification_Factory implements Factory<VoiceProfileNotification> {
    private final Provider<String> channelIdProvider;
    private final Provider<Integer> notificationIdProvider;
    private final Provider<VoiceProfileNotificationPresenter> voiceProfileNotificationPresenterProvider;

    public VoiceProfileNotification_Factory(Provider<String> provider, Provider<VoiceProfileNotificationPresenter> provider2, Provider<Integer> provider3) {
        this.channelIdProvider = provider;
        this.voiceProfileNotificationPresenterProvider = provider2;
        this.notificationIdProvider = provider3;
    }

    public static VoiceProfileNotification_Factory create(Provider<String> provider, Provider<VoiceProfileNotificationPresenter> provider2, Provider<Integer> provider3) {
        return new VoiceProfileNotification_Factory(provider, provider2, provider3);
    }

    public static VoiceProfileNotification newInstance(String str, Object obj, int i) {
        return new VoiceProfileNotification(str, (VoiceProfileNotificationPresenter) obj, i);
    }

    @Override // javax.inject.Provider
    public VoiceProfileNotification get() {
        return newInstance(this.channelIdProvider.get(), this.voiceProfileNotificationPresenterProvider.get(), this.notificationIdProvider.get().intValue());
    }
}
