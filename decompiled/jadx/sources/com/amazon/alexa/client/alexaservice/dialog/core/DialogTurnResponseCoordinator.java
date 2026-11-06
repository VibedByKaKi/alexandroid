package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DialogTurnResponseCoordinator implements AlexaDialogTurnResponseCoordinator {
    private final DialogTurn dialogTurn;

    public DialogTurnResponseCoordinator(DialogTurn dialogTurn) {
        this.dialogTurn = dialogTurn;
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator
    public void onReservedResponseStarted(long j) {
        this.dialogTurn.setReservedResponseStarted(j);
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator
    public void reserveResponse(long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        this.dialogTurn.onReserveResponse(j, alexaDialogTurnResponseCoordinationPolicy, alexaDialogTurnResponseReservationCallbacks);
    }
}
