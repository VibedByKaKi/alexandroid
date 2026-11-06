package com.amazon.deecomms.core;

import android.media.AudioManager;
import com.amazon.deecomms.calling.model.CallContext;
import com.amazon.deecomms.media.audio.AudioInputController;
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
/* loaded from: classes5.dex */
public final class AudioModule_ProvidesMicStateControllerFactory implements Factory<AudioInputController> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<CallContext> callContextProvider;
    private final AudioModule module;

    public AudioModule_ProvidesMicStateControllerFactory(AudioModule audioModule, Provider<AudioManager> provider, Provider<CallContext> provider2) {
        this.module = audioModule;
        this.audioManagerProvider = provider;
        this.callContextProvider = provider2;
    }

    public static AudioModule_ProvidesMicStateControllerFactory create(AudioModule audioModule, Provider<AudioManager> provider, Provider<CallContext> provider2) {
        return new AudioModule_ProvidesMicStateControllerFactory(audioModule, provider, provider2);
    }

    public static AudioInputController providesMicStateController(AudioModule audioModule, AudioManager audioManager, CallContext callContext) {
        return (AudioInputController) Preconditions.checkNotNullFromProvides(audioModule.providesMicStateController(audioManager, callContext));
    }

    @Override // javax.inject.Provider
    public AudioInputController get() {
        return providesMicStateController(this.module, this.audioManagerProvider.get(), this.callContextProvider.get());
    }
}
