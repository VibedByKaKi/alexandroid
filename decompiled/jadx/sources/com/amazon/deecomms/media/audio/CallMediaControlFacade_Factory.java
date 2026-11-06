package com.amazon.deecomms.media.audio;

import android.media.AudioManager;
import com.amazon.deecomms.media.VideoStateController;
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
public final class CallMediaControlFacade_Factory implements Factory<CallMediaControlFacade> {
    private final Provider<AudioInputController> audioInputControllerProvider;
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<AudioOutputController> audioStateChangeEventProvider;
    private final Provider<VideoStateController> videoStateControllerProvider;

    public CallMediaControlFacade_Factory(Provider<AudioOutputController> provider, Provider<AudioInputController> provider2, Provider<VideoStateController> provider3, Provider<AudioManager> provider4) {
        this.audioStateChangeEventProvider = provider;
        this.audioInputControllerProvider = provider2;
        this.videoStateControllerProvider = provider3;
        this.audioManagerProvider = provider4;
    }

    public static CallMediaControlFacade_Factory create(Provider<AudioOutputController> provider, Provider<AudioInputController> provider2, Provider<VideoStateController> provider3, Provider<AudioManager> provider4) {
        return new CallMediaControlFacade_Factory(provider, provider2, provider3, provider4);
    }

    public static CallMediaControlFacade newInstance(AudioOutputController audioOutputController, AudioInputController audioInputController, VideoStateController videoStateController, AudioManager audioManager) {
        return new CallMediaControlFacade(audioOutputController, audioInputController, videoStateController, audioManager);
    }

    @Override // javax.inject.Provider
    public CallMediaControlFacade get() {
        return newInstance(this.audioStateChangeEventProvider.get(), this.audioInputControllerProvider.get(), this.videoStateControllerProvider.get(), this.audioManagerProvider.get());
    }
}
