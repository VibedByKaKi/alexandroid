package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ResponseCoordinationBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechProvider;", "", "onDialogRequested", "", "alexaDialogTurn", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurn;", "onDialogTurnRequested", "alexaNextDialogTurn", "Lcom/amazon/alexa/api/compat/model/AlexaNextDialogTurn;", "onDialogRequestDenied", "deniedReason", "Lcom/amazon/alexa/api/compat/model/DialogRequestDeniedReason;", "setWakeWordDetectionEnabled", "enabled", "", "pauseWakeWordDetection", "wakeWord", "", "resumeWakeWordDetection", "onDialogStarted", "dialogData", "Lcom/amazon/alexa/api/compat/model/DialogData;", "onDialogTurnStarted", "dialogTurnData", "Lcom/amazon/alexa/api/compat/model/DialogTurnData;", "onDialogTurnFinished", "onDialogFinished", "onPlaybackStarted", "onPlaybackStopped", "onDialogTurnResponsePending", "coordinator", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseCoordinator;", "onDialogTurnReserveResponse", ResponseCoordinationBundleKeys.DECISION_TIMESTAMP_EPOCH_MS, "", ResponseCoordinationBundleKeys.COORDINATION_POLICY, "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseCoordinationPolicy;", "callbacks", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnResponseReservationCallbacks;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaUserSpeechProvider {
    void onDialogFinished(@Nullable DialogData dialogData);

    void onDialogRequestDenied(@Nullable DialogRequestDeniedReason deniedReason);

    void onDialogRequested(@NotNull AlexaDialogTurn alexaDialogTurn);

    void onDialogStarted(@Nullable DialogData dialogData);

    void onDialogTurnFinished(@Nullable DialogTurnData dialogTurnData);

    void onDialogTurnRequested(@NotNull AlexaNextDialogTurn alexaNextDialogTurn);

    default void onDialogTurnReserveResponse(@NotNull DialogTurnData dialogTurnData, long decisionTimestampEpochMs, @NotNull AlexaDialogTurnResponseCoordinationPolicy coordinationPolicy, @NotNull AlexaDialogTurnResponseReservationCallbacks callbacks) {
        dialogTurnData.getClass();
        coordinationPolicy.getClass();
        callbacks.getClass();
    }

    default void onDialogTurnResponsePending(@NotNull DialogTurnData dialogTurnData, @NotNull AlexaDialogTurnResponseCoordinator coordinator) {
        dialogTurnData.getClass();
        coordinator.getClass();
    }

    void onDialogTurnStarted(@Nullable DialogTurnData dialogTurnData);

    void pauseWakeWordDetection(@Nullable String wakeWord);

    void resumeWakeWordDetection(@Nullable String wakeWord);

    void setWakeWordDetectionEnabled(boolean enabled);

    default void onPlaybackStarted() {
    }

    default void onPlaybackStopped() {
    }
}
