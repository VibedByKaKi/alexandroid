package com.amazon.alexa.client.alexaservice.audio.core;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.telephony.TelephonyManager;
import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.DefaultMediaPlaybackAuthority;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.MediaPlaybackAuthority;
import com.amazon.alexa.client.alexaservice.base.componentstate.ConnectedAccessoriesStatusProvider;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.instrumentation.ExoAudioPlayerInitializer;
import com.amazon.alexa.client.alexaservice.networking.NetworkAuthority;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentStore;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.wakeword.pryon.AudioPlaybackConfigurationHelper;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class AudioPlayerModule {
    public static final String AUDIO_PLAYER_FACTORY = "ExoAudioPlayer";
    private static final int MAX_STREAMS = 4;

    @Provides
    @Singleton
    public BluetoothScoController provideBluetoothScoController(Context context, AudioManager audioManager, TelephonyManager telephonyManager, AlexaServiceScoMetrics alexaServiceScoMetrics) {
        return new BluetoothScoController(audioManager, telephonyManager, context, alexaServiceScoMetrics);
    }

    @Provides
    @Singleton
    public AudioPlaybackConfigurationHelper providesAudioPlaybackConfigurationHelper() {
        return AudioPlaybackConfigurationHelper.getInstance();
    }

    @Provides
    @Singleton
    @Named(AUDIO_PLAYER_FACTORY)
    public ExoAudioPlayerFactory providesAudioPlayerFactory(Context context, TimeProvider timeProvider, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, Lazy<AttachmentStore> lazy, Lazy<NetworkAuthority> lazy2, Lazy<PlaylistParser> lazy3, ExoAudioPlayerInitializer exoAudioPlayerInitializer) {
        return new ExoAudioPlayerFactory(context, timeProvider, featureFlagConfigurationAuthority, lazy, lazy2, lazy3, exoAudioPlayerInitializer);
    }

    @Provides
    @Singleton
    public MediaPlaybackAuthority providesMediaPlaybackAuthority(Context context, ConnectedAccessoriesStatusProvider connectedAccessoriesStatusProvider, AlexaClientEventBus alexaClientEventBus) {
        return new DefaultMediaPlaybackAuthority(context, connectedAccessoriesStatusProvider, alexaClientEventBus);
    }

    @Provides
    public MediaPlayer providesMediaPlayer() {
        return new MediaPlayer();
    }

    @Provides
    @Singleton
    @Named(SoundAuthority.SCO_SOUNDPOOL)
    public SoundPool providesScoSoundPool() {
        return new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(2).build()).setMaxStreams(4).build();
    }

    @Provides
    @Singleton
    @Named("ScoSoundWrapper")
    public SoundWrapper providesScoSoundWrapper(@Named("ScoSoundPool") Lazy<SoundPool> lazy, Context context) {
        return new SoundWrapper(lazy, context);
    }

    @Provides
    @Singleton
    public SoundPool providesSoundPool() {
        return new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build()).setMaxStreams(4).build();
    }

    @Provides
    @Singleton
    public SoundWrapper providesSoundWrapper(Lazy<SoundPool> lazy, Context context) {
        return new SoundWrapper(lazy, context);
    }

    @Provides
    @Singleton
    public AudioPlayer providesSpeechAudioPlayer(Context context, TimeProvider timeProvider, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, Lazy<AttachmentStore> lazy, Lazy<NetworkAuthority> lazy2, ExoAudioPlayerInitializer exoAudioPlayerInitializer) {
        return new ExoAudioPlayer(context, timeProvider, featureFlagConfigurationAuthority, "speech-player", lazy, lazy2, null, exoAudioPlayerInitializer);
    }
}
