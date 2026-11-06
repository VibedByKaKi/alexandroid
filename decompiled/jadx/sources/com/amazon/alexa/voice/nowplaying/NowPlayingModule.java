package com.amazon.alexa.voice.nowplaying;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceNowPlayingEventBusModule;
import com.amazon.alexa.voice.ui.player.PlayerCardUpdater;
import com.amazon.alexa.voice.ui.superbowl.AudioPlayerCardUpdater;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class NowPlayingModule {
    private NowPlayingModule() {
    }

    @Provides
    @Singleton
    public static AudioPlaybackController provideAudioPlaybackController(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2) {
        return new AudioPlaybackController(alexaMobileFrameworkApisV2);
    }

    @Provides
    @Singleton
    public static DefaultNowPlayingCardManager provideDefaultNowPlayingCardManager(Context context, AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, VoiceNowPlayingEventBusModule voiceNowPlayingEventBusModule, AudioPlaybackController audioPlaybackController) {
        return new DefaultNowPlayingCardManager(context, alexaMobileFrameworkApisV2, voiceNowPlayingEventBusModule, audioPlaybackController);
    }

    @Provides
    @Singleton
    public static PlayerCardUpdater providePlayerCardUpdater() {
        return new AudioPlayerCardUpdater();
    }

    @Provides
    @Singleton
    public static VoiceNowPlayingEventBusModule provideVoiceNowPlayingBridge(AudioPlaybackController audioPlaybackController) {
        return new VoiceNowPlayingEventBusModule(audioPlaybackController);
    }
}
