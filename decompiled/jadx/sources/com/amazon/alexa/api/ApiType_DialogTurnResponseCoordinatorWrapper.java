package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_DialogTurnResponseCoordinatorWrapper extends DialogTurnResponseCoordinator implements AlexaDialogTurnResponseCoordinator {
    private final AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator;

    public ApiType_DialogTurnResponseCoordinatorWrapper(AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator) {
        this.alexaDialogTurnResponseCoordinator = alexaDialogTurnResponseCoordinator;
    }

    @Override // com.amazon.alexa.api.DialogTurnResponseCoordinator, com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator
    public void onReservedResponseStarted(long j) {
        this.alexaDialogTurnResponseCoordinator.onReservedResponseStarted(j);
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator
    public void reserveResponse(long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        this.alexaDialogTurnResponseCoordinator.reserveResponse(j, alexaDialogTurnResponseCoordinationPolicy, alexaDialogTurnResponseReservationCallbacks);
    }

    @Override // com.amazon.alexa.api.DialogTurnResponseCoordinator
    public void reserveResponse(long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, DialogTurnResponseReservationCallbacks dialogTurnResponseReservationCallbacks) {
    }
}
