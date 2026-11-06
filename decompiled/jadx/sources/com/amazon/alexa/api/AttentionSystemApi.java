package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AttentionSystemApi {
    void deregisterListener(@NonNull AlexaAttentionSystemListener alexaAttentionSystemListener);

    void deregisterListener(@NonNull AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener);

    void deregisterListener(@NonNull AlexaStateListener alexaStateListener);

    void deregisterListener(@NonNull AlexaUserSpeechListener alexaUserSpeechListener);

    void registerListener(@NonNull AlexaAttentionSystemListener alexaAttentionSystemListener);

    void registerListener(@NonNull AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener);

    void registerListener(@NonNull AlexaStateListener alexaStateListener);

    void registerListener(@NonNull AlexaUserSpeechListener alexaUserSpeechListener);

    void setEndpointSoundEnabled(boolean z);

    void setWakeSoundEnabled(boolean z);

    void stopForegroundAudioTask();
}
