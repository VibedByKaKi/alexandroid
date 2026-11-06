package com.amazon.alexa.api.compat.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AttentionSystemApiV2;", "", "registerStateListener", "", "alexaStateListener", "Lcom/amazon/alexa/api/compat/model/AlexaAttentionSystemListener;", "deregisterStateListener", "registerUserSpeechListener", "alexaUserSpeechListener", "Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechListener;", "deregisterUserSpeechListener", "stopForegroundAudioTask", "setWakeSoundEnabled", "enable", "", "setEndpointSoundEnabled", "registerAttentionSystemSettingsListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaAttentionSystemSettingsListener;", "deregisterAttentionSystemSettingsListener", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AttentionSystemApiV2 {
    void deregisterAttentionSystemSettingsListener(@NotNull AlexaAttentionSystemSettingsListener listener);

    void deregisterStateListener(@NotNull AlexaAttentionSystemListener alexaStateListener);

    void deregisterUserSpeechListener(@NotNull AlexaUserSpeechListener alexaUserSpeechListener);

    void registerAttentionSystemSettingsListener(@NotNull AlexaAttentionSystemSettingsListener listener);

    void registerStateListener(@NotNull AlexaAttentionSystemListener alexaStateListener);

    void registerUserSpeechListener(@NotNull AlexaUserSpeechListener alexaUserSpeechListener);

    void setEndpointSoundEnabled(boolean enable);

    void setWakeSoundEnabled(boolean enable);

    void stopForegroundAudioTask();
}
