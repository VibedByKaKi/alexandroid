package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.SourceFactory;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentStore;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class StartDialogTurnCallbacksProvider {
    private static final String TAG = "StartDialogTurnCallbacksProvider";
    private final AlexaClientEventBus alexaClientEventBus;
    private final AttachmentStore attachmentStore;
    private final DialogTurnDataProvider dialogTurnDataProvider;
    private final DialogTurnProvider dialogTurnProvider;
    private final SourceFactory sourceFactory;

    @Inject
    public StartDialogTurnCallbacksProvider(AlexaClientEventBus alexaClientEventBus, AttachmentStore attachmentStore, DialogTurnProvider dialogTurnProvider, DialogTurnDataProvider dialogTurnDataProvider, SourceFactory sourceFactory) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.attachmentStore = attachmentStore;
        this.dialogTurnProvider = dialogTurnProvider;
        this.dialogTurnDataProvider = dialogTurnDataProvider;
        this.sourceFactory = sourceFactory;
    }

    public StartDialogTurnCallbacks createFirstTurnCallbacks(MultiTurnDialog multiTurnDialog, String str, LaunchSource launchSource, DialogTurnLifecycle dialogTurnLifecycle, DialogTurnIdentifier dialogTurnIdentifier) {
        return new StartDialogTurnCallbacks(this.alexaClientEventBus, str, launchSource, multiTurnDialog, this.attachmentStore, this.sourceFactory, this.dialogTurnProvider, this.dialogTurnDataProvider, dialogTurnLifecycle, dialogTurnIdentifier);
    }

    public StartNextDialogTurnCallbacks createNextTurnCallbacks(MultiTurnDialog multiTurnDialog, String str, LaunchSource launchSource, DialogTurnLifecycle dialogTurnLifecycle, DialogTurnIdentifier dialogTurnIdentifier) {
        return new StartNextDialogTurnCallbacks(this.alexaClientEventBus, str, launchSource, multiTurnDialog, this.attachmentStore, this.sourceFactory, this.dialogTurnProvider, this.dialogTurnDataProvider, dialogTurnLifecycle, dialogTurnIdentifier);
    }
}
