package com.amazon.alexa.client.alexaservice.base.capabilities.legacy;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class LegacyFlagsModule {
    private static final boolean DEFAULT_ARBITRATION_SUPPORT = true;
    private static final boolean DEFAULT_AUDIO_PLAYER_TTS_URLS_SUPPORT = false;
    private static final boolean DEFAULT_AXON_SUPPORT = true;
    private static final boolean DEFAULT_COMMS_SUPPORT = true;
    private static final String DEFAULT_DATAMART_NAMESPACE = "Vox";
    private static final boolean DEFAULT_DROPIN_OUTBOUND_SUPPORT = true;
    private static final boolean DEFAULT_HOME_AUTOMATION_SUPPORT = true;
    private static final boolean DEFAULT_KEYS_IN_HEADER_SUPPORT = false;
    private static final boolean DEFAULT_LYRICS_IN_CARD_SUPPORT = false;
    private static final boolean DEFAULT_MIXING_BEHAVIOR_FOR_AUDIO_PLAYER_SUPPORT = false;
    private static final boolean DEFAULT_PFM_CHANGED = true;
    private static final boolean DEFAULT_SCRUBBING_SUPPORT = true;
    private static final boolean DEFAULT_SECURE_LOCKSCREEN_SUPPORT = false;
    private static final boolean DEFAULT_SIP_OUTBOUND_CALLING_SUPPORT = true;
    private static final boolean DEFAULT_SPEECH_SYNTHESIZER_TTS_URLS_SUPPORT = false;
    private static final String DEFAULT_TARGET_PLATFORM = "TABLET";
    private static final String DEFAULT_TEMPLATE_FRIENDLY_NAME = "VOX";
    private static final boolean DEFAULT_TTS_SPEECHMARKS_SUPPORT = true;
    private static final boolean DEFAULT_VIDEO_CALLING_SUPPORT = true;
    private static final boolean DEFAULT_VOICE_PROFILE_SWITCHING_DISABLED_STATUS = true;

    private int getScreenWidth(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @Provides
    public LegacyFlags providesDefaultLegacyFlags(WindowManager windowManager, Lazy<ClientConfiguration> lazy) {
        return LegacyFlags.builder().setSupportsTtsSpeechmarks(true).setSupportsLyricsInCard(false).setSupportsPfmChanged(lazy.get().getSupportsPfmChanged() != null ? lazy.get().getSupportsPfmChanged().booleanValue() : true).setFriendlyNameTemplate("VOX").setScreenWidth(getScreenWidth(windowManager)).setSupportsSpeechSynthesizerTtsUrls(false).setSupportsAudioPlayerTtsUrls(false).setSupportsScrubbing(true).setSupportsHomeAutomation(true).setSupportsKeysInHeader(false).setSupportsMixingBehaviorForAudioPlayer(false).setSupportsComms(true).setSupportsDropinOutbound(true).setSupportsSipOutboundCalling(true).setSupportsVideoCalling(true).setVoiceProfileSwitchingDisabled(true).setSupportsArbitration(true).setSupportsSecureLockscreen(false).setSupportsDatamartNamespace(!TextUtils.isEmpty(lazy.get().getDatamartNamespace()) ? lazy.get().getDatamartNamespace() : "Vox").setSupportsTargetPlatform("TABLET").setSupportsAxon(true).build();
    }
}
