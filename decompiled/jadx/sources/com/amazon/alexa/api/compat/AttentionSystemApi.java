package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAttentionSystemSettingsListener;
import com.amazon.alexa.api.AlexaUserSpeechListener;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/AttentionSystemApi;", "", "registerStateListener", "", "alexaStateListener", "Lcom/amazon/alexa/api/compat/AlexaStateListener;", "deregisterStateListener", "registerUserSpeechListener", "alexaUserSpeechListener", "Lcom/amazon/alexa/api/AlexaUserSpeechListener;", "deregisterUserSpeechListener", MetricsConstants.Method.CACHE_CLEAR, "setWakeSoundEnabled", "isWakeSoundEnabled", "", "setEndpointSoundEnabled", "isEndpointSoundEnabled", "registerAttentionSystemSettingsListener", "attentionSystemSettingsListener", "Lcom/amazon/alexa/api/AlexaAttentionSystemSettingsListener;", "deregisterAttentionSystemSettingsListener", "stopForegroundAudioTask", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AttentionSystemApi {
    void clear();

    void deregisterAttentionSystemSettingsListener(@NotNull AlexaAttentionSystemSettingsListener attentionSystemSettingsListener);

    void deregisterStateListener(@NotNull AlexaStateListener alexaStateListener);

    void deregisterUserSpeechListener(@NotNull AlexaUserSpeechListener alexaUserSpeechListener);

    void registerAttentionSystemSettingsListener(@NotNull AlexaAttentionSystemSettingsListener attentionSystemSettingsListener);

    void registerStateListener(@NotNull AlexaStateListener alexaStateListener);

    void registerUserSpeechListener(@NotNull AlexaUserSpeechListener alexaUserSpeechListener);

    void setEndpointSoundEnabled(boolean isEndpointSoundEnabled);

    void setWakeSoundEnabled(boolean isWakeSoundEnabled);

    void stopForegroundAudioTask();
}
