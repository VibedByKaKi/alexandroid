package com.amazon.alexa.api.compat;

import android.app.PendingIntent;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\t\u0010\u0006\u001a\u00020\u0003H¦\u0002J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/api/compat/AudioPlaybackControlApi;", "", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "", "play", "pause", "next", "stop", "registerMediaPlaybackListener", "mediaPlaybackListener", "Lcom/amazon/alexa/api/compat/AlexaMediaPlaybackListener;", "deregisterMediaPlaybackListener", "setMediaNotificationContentIntent", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "registerAlexaAudioPlaybackStatusListener", "alexaAudioPlaybackStatusListener", "Lcom/amazon/alexa/api/compat/AlexaAudioPlaybackStatusListener;", "deregisterAlexaAudioPlaybackStatusListener", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AudioPlaybackControlApi {
    void deregisterAlexaAudioPlaybackStatusListener(@NotNull AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener);

    void deregisterMediaPlaybackListener(@NotNull AlexaMediaPlaybackListener mediaPlaybackListener);

    void next();

    void pause();

    void play();

    void previous();

    void registerAlexaAudioPlaybackStatusListener(@NotNull AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener);

    void registerMediaPlaybackListener(@NotNull AlexaMediaPlaybackListener mediaPlaybackListener);

    void setMediaNotificationContentIntent(@NotNull PendingIntent pendingIntent);

    void stop();
}
