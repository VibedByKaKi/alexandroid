package com.amazon.alexa.client.alexaservice.audio.core;

import android.media.MediaPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AudioPlayerModule_ProvidesMediaPlayerFactory implements Factory<MediaPlayer> {
    private final AudioPlayerModule module;

    public AudioPlayerModule_ProvidesMediaPlayerFactory(AudioPlayerModule audioPlayerModule) {
        this.module = audioPlayerModule;
    }

    public static AudioPlayerModule_ProvidesMediaPlayerFactory create(AudioPlayerModule audioPlayerModule) {
        return new AudioPlayerModule_ProvidesMediaPlayerFactory(audioPlayerModule);
    }

    public static MediaPlayer providesMediaPlayer(AudioPlayerModule audioPlayerModule) {
        return (MediaPlayer) Preconditions.checkNotNullFromProvides(audioPlayerModule.providesMediaPlayer());
    }

    @Override // javax.inject.Provider
    public MediaPlayer get() {
        return providesMediaPlayer(this.module);
    }
}
