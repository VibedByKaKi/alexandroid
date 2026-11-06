package com.amazon.alexa.client.alexaservice.audio.core;

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
public final class SpeechPlayer_Factory implements Factory<SpeechPlayer> {
    private final Provider<AudioPlayer> audioPlayerProvider;

    public SpeechPlayer_Factory(Provider<AudioPlayer> provider) {
        this.audioPlayerProvider = provider;
    }

    public static SpeechPlayer_Factory create(Provider<AudioPlayer> provider) {
        return new SpeechPlayer_Factory(provider);
    }

    public static SpeechPlayer newInstance(AudioPlayer audioPlayer) {
        return new SpeechPlayer(audioPlayer);
    }

    @Override // javax.inject.Provider
    public SpeechPlayer get() {
        return newInstance(this.audioPlayerProvider.get());
    }
}
