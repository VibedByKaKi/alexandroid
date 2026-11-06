package com.amazon.alexa.accessory.frames.translation.service;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.identity.auth.device.api.MAPActorManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/service/SpeechTranslationClient;", "", MissingTokenPull.TRIGGER_CONNECT, "", "userLanguage", "", "bystanderLanguage", "callback", "Lcom/amazon/alexa/accessory/frames/translation/service/SpeechTranslationClient$CloudEventCallback;", "disconnect", "pauseSession", "resumeSession", "sendAudio", "audioData", "", "isConnected", "", "()Z", "CloudEventCallback", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SpeechTranslationClient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J0\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0003H&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\rH&¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/service/SpeechTranslationClient$CloudEventCallback;", "", "onSessionStarted", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "onTranscription", "channel", "", "completionId", "utteranceId", "text", "isFinal", "", "onTranslation", "utteranceIds", "translatedText", "onTranslatedAudio", "audioData", "", "onAudioEnded", "onSessionEnded", "onError", "code", "message", MAPActorManager.KEY_RETRYABLE, "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CloudEventCallback {
        void onAudioEnded(int channel, @NotNull String completionId, @NotNull String utteranceIds);

        void onError(@NotNull String code, @NotNull String message, boolean retryable);

        void onSessionEnded();

        void onSessionStarted(@NotNull String sessionId);

        void onTranscription(int channel, @NotNull String completionId, @NotNull String utteranceId, @NotNull String text, boolean isFinal);

        void onTranslatedAudio(int channel, @NotNull byte[] audioData);

        void onTranslation(int channel, @NotNull String completionId, @NotNull String utteranceIds, @NotNull String translatedText, boolean isFinal);
    }

    void connect(@NotNull String userLanguage, @NotNull String bystanderLanguage, @NotNull CloudEventCallback callback);

    void disconnect();

    boolean isConnected();

    void pauseSession();

    void resumeSession();

    void sendAudio(@NotNull byte[] audioData);
}
