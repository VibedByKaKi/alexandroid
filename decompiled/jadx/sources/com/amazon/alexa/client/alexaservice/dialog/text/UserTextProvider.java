package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.api.AlexaDialogRequest;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProviderIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.StartDialogTurnCallbacks;
import com.amazon.alexa.client.alexaservice.dialog.core.StartNextDialogTurnCallbacks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface UserTextProvider {
    String getSoftwareVersion();

    UserSpeechProviderIdentifier getUserSpeechProviderIdentifier();

    void onDialogFinished(DialogIdentifier dialogIdentifier);

    void onDialogRequested(StartDialogTurnCallbacks startDialogTurnCallbacks, AlexaDialogRequest alexaDialogRequest);

    void onDialogStarted(DialogIdentifier dialogIdentifier);

    void onDialogTurnFinished(DialogTurnIdentifier dialogTurnIdentifier);

    void onDialogTurnRequested(StartNextDialogTurnCallbacks startNextDialogTurnCallbacks);

    void onDialogTurnStarted(DialogTurnIdentifier dialogTurnIdentifier);
}
