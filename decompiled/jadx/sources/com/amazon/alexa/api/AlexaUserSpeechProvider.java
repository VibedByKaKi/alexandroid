package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlexaUserSpeechProvider {
    void onDialogFinished(DialogData dialogData);

    void onDialogRequestDenied(DialogRequestDeniedReason dialogRequestDeniedReason);

    void onDialogRequested(AlexaDialogTurn alexaDialogTurn);

    void onDialogStarted(DialogData dialogData);

    void onDialogTurnFinished(DialogTurnData dialogTurnData);

    void onDialogTurnRequested(AlexaNextDialogTurn alexaNextDialogTurn);

    void onDialogTurnReserveResponse(DialogTurnData dialogTurnData, long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks);

    void onDialogTurnResponsePending(DialogTurnData dialogTurnData, AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator);

    void onDialogTurnStarted(DialogTurnData dialogTurnData);

    void pauseWakeWordDetection(String str);

    void resumeWakeWordDetection(String str);

    void setWakeWordDetectionEnabled(boolean z);
}
