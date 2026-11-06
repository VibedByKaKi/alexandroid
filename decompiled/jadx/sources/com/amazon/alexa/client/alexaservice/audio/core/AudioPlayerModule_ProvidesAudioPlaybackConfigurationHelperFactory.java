package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.wakeword.pryon.AudioPlaybackConfigurationHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AudioPlayerModule_ProvidesAudioPlaybackConfigurationHelperFactory implements Factory<AudioPlaybackConfigurationHelper> {
    private final AudioPlayerModule module;

    public AudioPlayerModule_ProvidesAudioPlaybackConfigurationHelperFactory(AudioPlayerModule audioPlayerModule) {
        this.module = audioPlayerModule;
    }

    public static AudioPlayerModule_ProvidesAudioPlaybackConfigurationHelperFactory create(AudioPlayerModule audioPlayerModule) {
        return new AudioPlayerModule_ProvidesAudioPlaybackConfigurationHelperFactory(audioPlayerModule);
    }

    public static AudioPlaybackConfigurationHelper providesAudioPlaybackConfigurationHelper(AudioPlayerModule audioPlayerModule) {
        return (AudioPlaybackConfigurationHelper) Preconditions.checkNotNullFromProvides(audioPlayerModule.providesAudioPlaybackConfigurationHelper());
    }

    @Override // javax.inject.Provider
    public AudioPlaybackConfigurationHelper get() {
        return providesAudioPlaybackConfigurationHelper(this.module);
    }
}
