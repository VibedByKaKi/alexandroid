package com.amazon.alexa.client.alexaservice.vad;

import android.media.AudioManager;
import com.amazon.alexa.client.alexaservice.vad.audio.mode.AudioModeProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VADModule_ProvidesAudioModeProviderFactory implements Factory<AudioModeProvider> {
    private final Provider<AudioManager> audioManagerProvider;
    private final VADModule module;

    public VADModule_ProvidesAudioModeProviderFactory(VADModule vADModule, Provider<AudioManager> provider) {
        this.module = vADModule;
        this.audioManagerProvider = provider;
    }

    public static VADModule_ProvidesAudioModeProviderFactory create(VADModule vADModule, Provider<AudioManager> provider) {
        return new VADModule_ProvidesAudioModeProviderFactory(vADModule, provider);
    }

    public static AudioModeProvider providesAudioModeProvider(VADModule vADModule, AudioManager audioManager) {
        return (AudioModeProvider) Preconditions.checkNotNullFromProvides(vADModule.providesAudioModeProvider(audioManager));
    }

    @Override // javax.inject.Provider
    public AudioModeProvider get() {
        return providesAudioModeProvider(this.module, this.audioManagerProvider.get());
    }
}
