package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_DialogTurnStopCallbackWrapper extends DialogTurnStopCallback implements AlexaDialogTurnStopCallback {
    private final AlexaDialogTurnStopCallback alexaDialogTurnStopCallback;

    public ApiType_DialogTurnStopCallbackWrapper(AlexaDialogTurnStopCallback alexaDialogTurnStopCallback) {
        this.alexaDialogTurnStopCallback = alexaDialogTurnStopCallback;
    }

    @Override // com.amazon.alexa.api.DialogTurnStopCallback, com.amazon.alexa.api.AlexaDialogTurnStopCallback
    public void stopRecording() {
        this.alexaDialogTurnStopCallback.stopRecording();
    }
}
