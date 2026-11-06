package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_DialogTurnMetricsCallbackWrapper extends DialogTurnMetricsCallback implements AlexaDialogTurnMetricsCallback {
    private final AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback;

    public ApiType_DialogTurnMetricsCallbackWrapper(AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback) {
        this.alexaDialogTurnMetricsCallback = alexaDialogTurnMetricsCallback;
    }

    @Override // com.amazon.alexa.api.DialogTurnMetricsCallback, com.amazon.alexa.api.AlexaDialogTurnMetricsCallback
    public void onUserPerceivedLatencyData(UserPerceivedLatencyData userPerceivedLatencyData) {
        this.alexaDialogTurnMetricsCallback.onUserPerceivedLatencyData(userPerceivedLatencyData);
    }
}
