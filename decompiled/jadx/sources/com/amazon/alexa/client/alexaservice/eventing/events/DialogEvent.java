package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.AlexaDialogRequest;
import com.amazon.alexa.api.DialogExtras;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProvider;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialog;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.SpeakPayload;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DialogEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class TextDialogReceiveEvent extends DialogEvent {
        public static TextDialogReceiveEvent create(SpeakPayload speakPayload) {
            return new AutoValue_DialogEvent_TextDialogReceiveEvent(speakPayload);
        }

        public abstract SpeakPayload getSpeakPayload();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class TextRequestDialogEvent extends DialogEvent {
        public static TextRequestDialogEvent create(ExtendedClient extendedClient, String str, LaunchSource launchSource, AlexaDialogRequest alexaDialogRequest, AlexaDialogExtras alexaDialogExtras, ApiCallMetadata apiCallMetadata) {
            return new AutoValue_DialogEvent_TextRequestDialogEvent(extendedClient, str, launchSource, alexaDialogRequest, alexaDialogExtras, apiCallMetadata);
        }

        public abstract AlexaDialogExtras getAlexaDialogExtras();

        public abstract ApiCallMetadata getApiCallMetadata();

        public abstract ExtendedClient getClient();

        public abstract AlexaDialogRequest getDialogRequest();

        public abstract LaunchSource getLaunchSource();

        public abstract String getMessage();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class TextTurnAvailableEvent extends DialogEvent {
        public static TextTurnAvailableEvent create(MultiTurnDialog multiTurnDialog, ApiCallMetadata apiCallMetadata) {
            return new AutoValue_DialogEvent_TextTurnAvailableEvent(multiTurnDialog, apiCallMetadata);
        }

        public abstract ApiCallMetadata getApiCallMetadata();

        public abstract MultiTurnDialog getMultiTurnDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class TurnAvailableEvent extends DialogEvent {
        public static TurnAvailableEvent create(MultiTurnDialog multiTurnDialog) {
            return new AutoValue_DialogEvent_TurnAvailableEvent(multiTurnDialog);
        }

        public abstract MultiTurnDialog getMultiTurnDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class UnverifiedTurnReceivedEvent extends DialogEvent {
        public static UnverifiedTurnReceivedEvent create(MultiTurnDialog multiTurnDialog) {
            return new AutoValue_DialogEvent_UnverifiedTurnReceivedEvent(multiTurnDialog);
        }

        public abstract MultiTurnDialog getMultiTurnDialog();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class NewDialogRequestedEvent extends DialogEvent {
        private static final String WAKEWORD_EMPTY = "";

        public static NewDialogRequestedEvent create(LaunchSource launchSource, UserSpeechProvider userSpeechProvider, AlexaDialogRequest alexaDialogRequest) {
            return create(launchSource, userSpeechProvider, alexaDialogRequest, "");
        }

        public abstract AlexaDialogRequest getAlexaDialogRequest();

        public abstract LaunchSource getLaunchSource();

        public abstract UserSpeechProvider getUserSpeechProvider();

        public abstract String getWakeword();

        public static NewDialogRequestedEvent create(LaunchSource launchSource, UserSpeechProvider userSpeechProvider, AlexaDialogRequest alexaDialogRequest, String str) {
            return new AutoValue_DialogEvent_NewDialogRequestedEvent(launchSource, userSpeechProvider, alexaDialogRequest, str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class RequestDialogEvent extends DialogEvent {
        public static RequestDialogEvent create(LaunchSource launchSource, AlexaDialogRequest alexaDialogRequest) {
            return create(launchSource, alexaDialogRequest, DialogExtras.DEFAULT);
        }

        public abstract AlexaDialogExtras getAlexaDialogExtras();

        public abstract AlexaDialogRequest getDialogRequest();

        public abstract LaunchSource getLaunchSource();

        public static RequestDialogEvent create(LaunchSource launchSource, AlexaDialogRequest alexaDialogRequest, AlexaDialogExtras alexaDialogExtras) {
            return new AutoValue_DialogEvent_RequestDialogEvent(launchSource, alexaDialogRequest, alexaDialogExtras);
        }
    }
}
