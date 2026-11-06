package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DialogTurnLifecycle {
    void onDialogTurnFinished(DialogTurnIdentifier dialogTurnIdentifier);

    void onDialogTurnReserveResponse(DialogTurnIdentifier dialogTurnIdentifier, long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks);

    void onDialogTurnResponsePending(DialogTurnIdentifier dialogTurnIdentifier, AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator);

    void onDialogTurnStarted(DialogTurnIdentifier dialogTurnIdentifier);
}
