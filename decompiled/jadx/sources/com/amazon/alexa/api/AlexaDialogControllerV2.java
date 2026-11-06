package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlexaDialogControllerV2 {
    void onDialogFinished();

    void onDialogStarted();

    void onDialogTurnFinished();

    void onDialogTurnStarted(String str);

    void startRecordingNextDialogTurn();

    void stopRecording();
}
