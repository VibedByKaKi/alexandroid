package com.amazon.alexa.client.alexaservice.vad;

import android.media.AudioManager;
import com.amazon.alexa.client.alexaservice.VoiceActivityDetectionAuthority;
import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusFrameDecoder;
import com.amazon.alexa.client.alexaservice.audio.core.opus.SenzOpusFrameDecoder;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.naturalturn.NaturalTurnVadSessionFactory;
import com.amazon.alexa.client.alexaservice.vad.audio.VADAudioRecorderConfig;
import com.amazon.alexa.client.alexaservice.vad.audio.mode.AudioManagerAudioModeProvider;
import com.amazon.alexa.client.alexaservice.vad.audio.mode.AudioModeProvider;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADConfiguration;
import com.amazon.alexa.client.alexaservice.vad.detector.silero.SileroVADModel;
import com.amazon.alexa.client.alexaservice.vad.metrics.VADMetricsAuthority;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class VADModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OpusFrameDecoder lambda$providesNaturalTurnVadSessionFactory$0() {
        return new SenzOpusFrameDecoder(16000, 1);
    }

    @Provides
    @Singleton
    public AudioModeProvider providesAudioModeProvider(AudioManager audioManager) {
        return new AudioManagerAudioModeProvider(audioManager);
    }

    @Provides
    @Singleton
    public NaturalTurnVadSessionFactory providesNaturalTurnVadSessionFactory(AlexaClientEventBus alexaClientEventBus, VoiceActivityDetectionAuthority voiceActivityDetectionAuthority, MultiTurnDialogAuthority multiTurnDialogAuthority) {
        return new NaturalTurnVadSessionFactory(alexaClientEventBus, voiceActivityDetectionAuthority, multiTurnDialogAuthority, ManagedExecutorFactory.newSingleThreadScheduledExecutor("SecondaryVadVerifier"), new VADModule$$ExternalSyntheticLambda0());
    }

    @Provides
    @Singleton
    public VADAudioRecorderConfig providesVADAudioRecorderConfig() {
        return VADAudioRecorderConfig.builder().setAecEnabled(true).setNoiseSuppressionEnabled(true).build();
    }

    @Provides
    @Singleton
    public VADConfiguration providesVADConfiguration() {
        return VADConfiguration.builder(SileroVADModel.defaultModelConfiguration()).setSpeechThreshold(0.999f).setPrerollDurationMs(512).setHonorExpectSpeech(false).setExitIntentClassifierEnabled(true).build();
    }

    @Provides
    @Singleton
    public VADMetricsAuthority providesVADMetricsAuthority(AlexaClientEventBus alexaClientEventBus, MetricsService metricsService, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        return new VADMetricsAuthority(alexaClientEventBus, metricsService, featureFlagConfigurationAuthority);
    }
}
