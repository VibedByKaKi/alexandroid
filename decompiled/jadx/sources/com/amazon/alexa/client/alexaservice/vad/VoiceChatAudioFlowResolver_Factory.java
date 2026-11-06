package com.amazon.alexa.client.alexaservice.vad;

import android.media.AudioManager;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VoiceChatAudioFlowResolver_Factory implements Factory<VoiceChatAudioFlowResolver> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<FeatureFlagConfigurationAuthority> featureFlagConfigurationAuthorityProvider;

    public VoiceChatAudioFlowResolver_Factory(Provider<AudioManager> provider, Provider<FeatureFlagConfigurationAuthority> provider2) {
        this.audioManagerProvider = provider;
        this.featureFlagConfigurationAuthorityProvider = provider2;
    }

    public static VoiceChatAudioFlowResolver_Factory create(Provider<AudioManager> provider, Provider<FeatureFlagConfigurationAuthority> provider2) {
        return new VoiceChatAudioFlowResolver_Factory(provider, provider2);
    }

    public static VoiceChatAudioFlowResolver newInstance(AudioManager audioManager, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        return new VoiceChatAudioFlowResolver(audioManager, featureFlagConfigurationAuthority);
    }

    @Override // javax.inject.Provider
    public VoiceChatAudioFlowResolver get() {
        return newInstance(this.audioManagerProvider.get(), this.featureFlagConfigurationAuthorityProvider.get());
    }
}
