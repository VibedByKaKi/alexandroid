package com.amazon.alexa.client.alexaservice.audio.core;

import android.media.AudioManager;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AudioManagerWrapper_Factory implements Factory<AudioManagerWrapper> {
    private final Provider<AudioManager> audioManagerLazyProvider;

    public AudioManagerWrapper_Factory(Provider<AudioManager> provider) {
        this.audioManagerLazyProvider = provider;
    }

    public static AudioManagerWrapper_Factory create(Provider<AudioManager> provider) {
        return new AudioManagerWrapper_Factory(provider);
    }

    public static AudioManagerWrapper newInstance(Lazy<AudioManager> lazy) {
        return new AudioManagerWrapper(lazy);
    }

    @Override // javax.inject.Provider
    public AudioManagerWrapper get() {
        return newInstance(DoubleCheck.lazy(this.audioManagerLazyProvider));
    }
}
