package com.amazon.alexa.handsfree.notification.views.voiceprofile;

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
public final class VoiceProfileMetadataProvider_Factory implements Factory<VoiceProfileMetadataProvider> {
    private final Provider<NotificationStateProvider> notificationStateProvider;

    public VoiceProfileMetadataProvider_Factory(Provider<NotificationStateProvider> provider) {
        this.notificationStateProvider = provider;
    }

    public static VoiceProfileMetadataProvider_Factory create(Provider<NotificationStateProvider> provider) {
        return new VoiceProfileMetadataProvider_Factory(provider);
    }

    public static VoiceProfileMetadataProvider newInstance(NotificationStateProvider notificationStateProvider) {
        return new VoiceProfileMetadataProvider(notificationStateProvider);
    }

    @Override // javax.inject.Provider
    public VoiceProfileMetadataProvider get() {
        return newInstance(this.notificationStateProvider.get());
    }
}
