package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaDialogTurnMetricsCallback;
import com.amazon.alexa.api.AlexaDialogTurnStopCallback;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class DialogTurnProvider {
    @Inject
    public DialogTurnProvider() {
    }

    public DialogTurn createDialogTurn(AlexaClientEventBus alexaClientEventBus, String str, LaunchSource launchSource, DialogTurnData dialogTurnData, DialogTurnLifecycle dialogTurnLifecycle, DialogTurnIdentifier dialogTurnIdentifier, AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, boolean z, @Nullable AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback) {
        return new DialogTurn(alexaClientEventBus, str, launchSource, dialogTurnData, dialogTurnLifecycle, dialogTurnIdentifier, alexaDialogTurnStopCallback, z, alexaDialogTurnMetricsCallback);
    }
}
