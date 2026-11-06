package com.amazon.comms.calling.infrastructure;

import android.content.Context;
import android.media.AudioManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallAudioPlayer_Factory implements Factory<CallAudioPlayer> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> mContextProvider;
    private final Provider<VibrationProvider> vibrationProvider;

    public CallAudioPlayer_Factory(Provider<Context> provider, Provider<AudioManager> provider2, Provider<VibrationProvider> provider3) {
        this.mContextProvider = provider;
        this.audioManagerProvider = provider2;
        this.vibrationProvider = provider3;
    }

    public static CallAudioPlayer_Factory create(Provider<Context> provider, Provider<AudioManager> provider2, Provider<VibrationProvider> provider3) {
        return new CallAudioPlayer_Factory(provider, provider2, provider3);
    }

    public static CallAudioPlayer newInstance(Context context, AudioManager audioManager, VibrationProvider vibrationProvider) {
        return new CallAudioPlayer(context, audioManager, vibrationProvider);
    }

    @Override // javax.inject.Provider
    public CallAudioPlayer get() {
        return newInstance(this.mContextProvider.get(), this.audioManagerProvider.get(), this.vibrationProvider.get());
    }
}
