package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionListener;", "", "onSpeechDetected", "", "timestamp", "", "confidenceLevel", "", "onSilenceDetected", "duration", "onVoiceChatModeStateChanged", "state", "Lcom/amazon/alexa/api/compat/model/VoiceChatModeState;", "reason", "Lcom/amazon/alexa/api/compat/model/VoiceChatModeChangeReason;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VoiceActivityDetectionListener {
    void onSilenceDetected(long timestamp, long duration);

    void onSpeechDetected(long timestamp, float confidenceLevel);

    void onVoiceChatModeStateChanged(@NotNull VoiceChatModeState state);

    default void onVoiceChatModeStateChanged(@NotNull VoiceChatModeState state, @NotNull VoiceChatModeChangeReason reason) {
        state.getClass();
        reason.getClass();
        onVoiceChatModeStateChanged(state);
    }
}
