package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy;
import com.amazon.alexa.api.AlexaDialogTurnResponseCoordinator;
import com.amazon.alexa.api.AlexaDialogTurnResponseReservationCallbacks;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProvider;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnLifecycle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UserSpeechProviderTurnLifecycle implements DialogTurnLifecycle {
    private final UserSpeechProvider userSpeechProvider;

    public UserSpeechProviderTurnLifecycle(UserSpeechProvider userSpeechProvider) {
        this.userSpeechProvider = userSpeechProvider;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnLifecycle
    public void onDialogTurnFinished(DialogTurnIdentifier dialogTurnIdentifier) {
        this.userSpeechProvider.onDialogTurnFinished(dialogTurnIdentifier);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnLifecycle
    public void onDialogTurnReserveResponse(DialogTurnIdentifier dialogTurnIdentifier, long j, AlexaDialogTurnResponseCoordinationPolicy alexaDialogTurnResponseCoordinationPolicy, AlexaDialogTurnResponseReservationCallbacks alexaDialogTurnResponseReservationCallbacks) {
        this.userSpeechProvider.onDialogTurnReserveResponse(dialogTurnIdentifier, j, alexaDialogTurnResponseCoordinationPolicy, alexaDialogTurnResponseReservationCallbacks);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnLifecycle
    public void onDialogTurnResponsePending(DialogTurnIdentifier dialogTurnIdentifier, AlexaDialogTurnResponseCoordinator alexaDialogTurnResponseCoordinator) {
        this.userSpeechProvider.onDialogTurnResponsePending(dialogTurnIdentifier, alexaDialogTurnResponseCoordinator);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnLifecycle
    public void onDialogTurnStarted(DialogTurnIdentifier dialogTurnIdentifier) {
        this.userSpeechProvider.onDialogTurnStarted(dialogTurnIdentifier);
    }
}
