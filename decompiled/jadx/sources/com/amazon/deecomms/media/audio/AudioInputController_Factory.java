package com.amazon.deecomms.media.audio;

import android.media.AudioManager;
import com.amazon.deecomms.calling.model.CallContext;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AudioInputController_Factory implements Factory<AudioInputController> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<CallContext> callContextProvider;

    public AudioInputController_Factory(Provider<AudioManager> provider, Provider<CallContext> provider2) {
        this.audioManagerProvider = provider;
        this.callContextProvider = provider2;
    }

    public static AudioInputController_Factory create(Provider<AudioManager> provider, Provider<CallContext> provider2) {
        return new AudioInputController_Factory(provider, provider2);
    }

    public static AudioInputController newInstance(AudioManager audioManager, CallContext callContext) {
        return new AudioInputController(audioManager, callContext);
    }

    @Override // javax.inject.Provider
    public AudioInputController get() {
        return newInstance(this.audioManagerProvider.get(), this.callContextProvider.get());
    }
}
