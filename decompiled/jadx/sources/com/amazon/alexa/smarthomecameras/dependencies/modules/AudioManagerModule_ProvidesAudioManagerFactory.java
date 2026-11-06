package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.audio.AudioManager;
import com.amazon.alexa.smarthomecameras.rtcsc.CamerasAppClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AudioManagerModule_ProvidesAudioManagerFactory implements Factory<AudioManager> {
    private final Provider<CamerasAppClient> appClientProvider;
    private final Provider<Context> contextProvider;

    public AudioManagerModule_ProvidesAudioManagerFactory(Provider<Context> provider, Provider<CamerasAppClient> provider2) {
        this.contextProvider = provider;
        this.appClientProvider = provider2;
    }

    public static AudioManagerModule_ProvidesAudioManagerFactory create(Provider<Context> provider, Provider<CamerasAppClient> provider2) {
        return new AudioManagerModule_ProvidesAudioManagerFactory(provider, provider2);
    }

    public static AudioManager providesAudioManager(Context context, CamerasAppClient camerasAppClient) {
        return (AudioManager) Preconditions.checkNotNull(AudioManagerModule.providesAudioManager(context, camerasAppClient), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public AudioManager get() {
        return providesAudioManager(this.contextProvider.get(), this.appClientProvider.get());
    }
}
