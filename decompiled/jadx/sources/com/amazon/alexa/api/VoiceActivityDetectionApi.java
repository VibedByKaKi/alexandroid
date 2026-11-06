package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface VoiceActivityDetectionApi {
    void deregisterListener(@NonNull VoiceActivityDetectionListener voiceActivityDetectionListener);

    boolean isMuted();

    boolean isVoiceActivityDetectionActive();

    void muteVoiceActivityDetection();

    void registerListener(@NonNull VoiceActivityDetectionListener voiceActivityDetectionListener);

    void startVoiceActivityDetection();

    void stopVoiceActivityDetection();

    default void stopVoiceActivityDetection(@NonNull VoiceChatModeChangeReason voiceChatModeChangeReason) {
        stopVoiceActivityDetection();
    }

    void unmuteVoiceActivityDetection();

    default void stopVoiceActivityDetectionIfSilenced() {
    }

    default void setLiveModeOnboardingVisible(boolean z) {
    }
}
