package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class RecordingEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RecordingStartedSource {
        BUTTON_PRESS,
        WAKEWORD
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class StartedEvent extends RecordingEvent {
        public StartedEvent() {
            super(0);
        }

        public static StartedEvent create(ExtendedClient extendedClient, RecordingStartedSource recordingStartedSource, DialogRequestIdentifier dialogRequestIdentifier, AlexaDialogExtras alexaDialogExtras) {
            return new AutoValue_RecordingEvent_StartedEvent(extendedClient, recordingStartedSource, dialogRequestIdentifier, alexaDialogExtras);
        }

        public abstract ExtendedClient getClient();

        public abstract AlexaDialogExtras getDialogExtras();

        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract RecordingStartedSource getSource();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class StopEvent extends RecordingEvent {
        public StopEvent() {
            super(0);
        }

        private static StopEvent create(StopRecordingSource stopRecordingSource) {
            return new AutoValue_RecordingEvent_StopEvent(stopRecordingSource);
        }

        public static StopEvent createFromButtonPress() {
            return create(StopRecordingSource.BUTTON_PRESS);
        }

        public static StopEvent createFromOtherSource() {
            return create(StopRecordingSource.OTHER);
        }

        public static StopEvent createFromStopCapture() {
            return create(StopRecordingSource.STOP_CAPTURE);
        }

        public abstract StopRecordingSource getStopRecordingSource();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StopRecordingSource {
        BUTTON_PRESS,
        STOP_CAPTURE,
        API,
        OTHER
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class StoppedEvent extends RecordingEvent {
        public StoppedEvent() {
            super(0);
        }

        public static StoppedEvent create(StopRecordingSource stopRecordingSource, DialogRequestIdentifier dialogRequestIdentifier) {
            return new AutoValue_RecordingEvent_StoppedEvent(stopRecordingSource, dialogRequestIdentifier);
        }

        public abstract DialogRequestIdentifier getDialogRequestId();

        public abstract StopRecordingSource getStopRecordingSource();
    }

    public /* synthetic */ RecordingEvent(int i) {
        this();
    }

    private RecordingEvent() {
    }
}
