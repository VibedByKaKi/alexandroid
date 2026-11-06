package com.amazon.deecomms.core;

import com.amazon.deecomms.media.audio.AudioStateObservable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AudioModule_ProvidesAudioStateObservableFactory implements Factory<AudioStateObservable> {
    private final AudioModule module;

    public AudioModule_ProvidesAudioStateObservableFactory(AudioModule audioModule) {
        this.module = audioModule;
    }

    public static AudioModule_ProvidesAudioStateObservableFactory create(AudioModule audioModule) {
        return new AudioModule_ProvidesAudioStateObservableFactory(audioModule);
    }

    public static AudioStateObservable providesAudioStateObservable(AudioModule audioModule) {
        return (AudioStateObservable) Preconditions.checkNotNullFromProvides(audioModule.providesAudioStateObservable());
    }

    @Override // javax.inject.Provider
    public AudioStateObservable get() {
        return providesAudioStateObservable(this.module);
    }
}
