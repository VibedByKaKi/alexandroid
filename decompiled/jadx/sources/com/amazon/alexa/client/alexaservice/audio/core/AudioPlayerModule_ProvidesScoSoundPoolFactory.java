package com.amazon.alexa.client.alexaservice.audio.core;

import android.media.SoundPool;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class AudioPlayerModule_ProvidesScoSoundPoolFactory implements Factory<SoundPool> {
    private final AudioPlayerModule module;

    public AudioPlayerModule_ProvidesScoSoundPoolFactory(AudioPlayerModule audioPlayerModule) {
        this.module = audioPlayerModule;
    }

    public static AudioPlayerModule_ProvidesScoSoundPoolFactory create(AudioPlayerModule audioPlayerModule) {
        return new AudioPlayerModule_ProvidesScoSoundPoolFactory(audioPlayerModule);
    }

    public static SoundPool providesScoSoundPool(AudioPlayerModule audioPlayerModule) {
        return (SoundPool) Preconditions.checkNotNullFromProvides(audioPlayerModule.providesScoSoundPool());
    }

    @Override // javax.inject.Provider
    public SoundPool get() {
        return providesScoSoundPool(this.module);
    }
}
