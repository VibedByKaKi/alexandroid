package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_DialogTurnResponseReservationCallbacksWrapper extends DialogTurnResponseReservationCallbacks implements AlexaDialogTurnResponseReservationCallbacks {
    private final AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks;

    public ApiType_DialogTurnResponseReservationCallbacksWrapper(AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        this.alexaDialogTurnResponseReservationCallbacks = alexaDialogTurnResponseReservationCallbacks;
    }

    @Override // com.amazon.alexa.api.DialogTurnResponseReservationCallbacks, com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onAgreed(long j) {
        this.alexaDialogTurnResponseReservationCallbacks.onAgreed(j);
    }

    @Override // com.amazon.alexa.api.DialogTurnResponseReservationCallbacks, com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks
    public void onDisputed(long j) {
        this.alexaDialogTurnResponseReservationCallbacks.onDisputed(j);
    }
}
