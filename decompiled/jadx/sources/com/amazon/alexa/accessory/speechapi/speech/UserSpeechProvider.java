package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import com.amazon.minerva.client.thirdparty.transport.UploadResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u001f !J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&¨\u0006\""}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider;", "", "onDialogFinished", "", "onDialogRequestDenied", "reason", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$DialogDeniedReason;", "onDialogRequested", "dialogTurn", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurn;", "onDialogStarted", "onDialogTurnFinished", "onDialogTurnRequested", "nextDialogTurn", "Lcom/amazon/alexa/accessory/speechapi/speech/NextDialogTurn;", "onDialogTurnReserveResponse", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", "policy", "Lcom/amazon/alexa/accessory/speechapi/speech/ResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/accessory/speechapi/speech/AlexaResponseCoordinationCallbacks;", "onDialogTurnResponsePending", "coordinator", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnResponseCoordinator;", "onDialogTurnStarted", "pauseWakeWordDetection", "resumeWakeWordDetection", "setWakeWordDetectionEnabled", "enabled", "", "DialogDeniedReason", "Scope", "SupportedInitiationType", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface UserSpeechProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$DialogDeniedReason;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "INVALID_AUDIO_METADATA", "INVALID_WAKE_WORD", "SCREEN_LOCKED", "SOURCE_ARBITRATION", "SPEECH_PROVIDER_NOT_REGISTERED", "CANNOT_REQUEST_DIALOG", "CANNOT_REQUEST_FIRST_TURN", "NOT_ALLOWED_TO_BARGE_IN", "NOT_ALLOWED_TO_START_FIRST_TURN", "DIALOG_NOT_STARTED", "DIALOG_NOT_CURRENT", "UNEXPECTED_OR_ERROR_IN_TURN", "UNEXPECTED_OR_ERROR_IN_NEXT_TURN", "START_DIALOG_NOT_ALLOWED", "CONTINUE_INVALID_DIALOG", "WAKE_WORD_ENGINE_NOT_READY", "WAKE_WORD_AUDIO_INCOMPLETE", "BINDING_ERROR", "SERVICE_DISCONNECTED", "LEADER_SELECTION_ERROR", "LEADER_DISABLED_ERROR", UploadResult.CLIENT_ERROR, "UNMAPPED", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DialogDeniedReason {
        UNKNOWN,
        INVALID_AUDIO_METADATA,
        INVALID_WAKE_WORD,
        SCREEN_LOCKED,
        SOURCE_ARBITRATION,
        SPEECH_PROVIDER_NOT_REGISTERED,
        CANNOT_REQUEST_DIALOG,
        CANNOT_REQUEST_FIRST_TURN,
        NOT_ALLOWED_TO_BARGE_IN,
        NOT_ALLOWED_TO_START_FIRST_TURN,
        DIALOG_NOT_STARTED,
        DIALOG_NOT_CURRENT,
        UNEXPECTED_OR_ERROR_IN_TURN,
        UNEXPECTED_OR_ERROR_IN_NEXT_TURN,
        START_DIALOG_NOT_ALLOWED,
        CONTINUE_INVALID_DIALOG,
        WAKE_WORD_ENGINE_NOT_READY,
        WAKE_WORD_AUDIO_INCOMPLETE,
        BINDING_ERROR,
        SERVICE_DISCONNECTED,
        LEADER_SELECTION_ERROR,
        LEADER_DISABLED_ERROR,
        CLIENT_ERROR,
        UNMAPPED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$Scope;", "", "(Ljava/lang/String;I)V", "EXTERNAL_DEVICE", "SYSTEM", "APPLICATION", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Scope {
        EXTERNAL_DEVICE,
        SYSTEM,
        APPLICATION
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$SupportedInitiationType;", "", "(Ljava/lang/String;I)V", "WAKE_WORD", "TAP_TO_TALK", "PUSH_TO_TALK", "SERVER", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SupportedInitiationType {
        WAKE_WORD,
        TAP_TO_TALK,
        PUSH_TO_TALK,
        SERVER
    }

    void onDialogFinished();

    void onDialogRequestDenied(@Nullable DialogDeniedReason reason);

    void onDialogRequested(@NotNull DialogTurn dialogTurn);

    void onDialogStarted();

    void onDialogTurnFinished();

    void onDialogTurnRequested(@NotNull NextDialogTurn nextDialogTurn);

    void onDialogTurnReserveResponse(long decisionTimestampEpochMs, @NotNull ResponseCoordinationPolicy policy, @NotNull AlexaResponseCoordinationCallbacks callbacks);

    void onDialogTurnResponsePending(@NotNull DialogTurnResponseCoordinator coordinator);

    void onDialogTurnStarted();

    void pauseWakeWordDetection();

    void resumeWakeWordDetection();

    void setWakeWordDetectionEnabled(boolean enabled);
}
