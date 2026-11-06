package com.amazon.alexa.alertsca;

import android.content.Context;
import android.media.AudioManager;
import com.amazon.alexa.alertsca.exoplayer.AmplitudeCalculatingAudioSink;
import com.amazon.alexa.alertsca.exoplayer.AmplitudeMultiplyingAudioProcessor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class VolumeAdjuster_Factory implements Factory<VolumeAdjuster> {
    private final Provider<AmplitudeCalculatingAudioSink> amplitudeCalculatingAudioSinkProvider;
    private final Provider<AmplitudeMultiplyingAudioProcessor> amplitudeMultiplyingAudioProcessorProvider;
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> contextProvider;

    public VolumeAdjuster_Factory(Provider<Context> provider, Provider<AudioManager> provider2, Provider<AmplitudeMultiplyingAudioProcessor> provider3, Provider<AmplitudeCalculatingAudioSink> provider4) {
        this.contextProvider = provider;
        this.audioManagerProvider = provider2;
        this.amplitudeMultiplyingAudioProcessorProvider = provider3;
        this.amplitudeCalculatingAudioSinkProvider = provider4;
    }

    public static VolumeAdjuster_Factory create(Provider<Context> provider, Provider<AudioManager> provider2, Provider<AmplitudeMultiplyingAudioProcessor> provider3, Provider<AmplitudeCalculatingAudioSink> provider4) {
        return new VolumeAdjuster_Factory(provider, provider2, provider3, provider4);
    }

    public static VolumeAdjuster newInstance(Context context, AudioManager audioManager, AmplitudeMultiplyingAudioProcessor amplitudeMultiplyingAudioProcessor, AmplitudeCalculatingAudioSink amplitudeCalculatingAudioSink) {
        return new VolumeAdjuster(context, audioManager, amplitudeMultiplyingAudioProcessor, amplitudeCalculatingAudioSink);
    }

    @Override // javax.inject.Provider
    public VolumeAdjuster get() {
        return newInstance(this.contextProvider.get(), this.audioManagerProvider.get(), this.amplitudeMultiplyingAudioProcessorProvider.get(), this.amplitudeCalculatingAudioSinkProvider.get());
    }
}
