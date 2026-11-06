package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class RecoverableVoiceInteractionEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DownchannelAvailable extends RecoverableVoiceInteractionEvent {
        public static DownchannelAvailable create(DialogFailureReason dialogFailureReason, String str, long j) {
            return new AutoValue_RecoverableVoiceInteractionEvent_DownchannelAvailable(dialogFailureReason, str, j);
        }

        public abstract DialogFailureReason getFailureReason();

        public abstract String getInvocationType();

        public abstract long getLatencyBetweenFailureAndAvailableMs();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DownchannelConnected extends RecoverableVoiceInteractionEvent {
        public static DownchannelConnected create(DialogFailureReason dialogFailureReason, String str, long j) {
            return new AutoValue_RecoverableVoiceInteractionEvent_DownchannelConnected(dialogFailureReason, str, j);
        }

        public abstract DialogFailureReason getFailureReason();

        public abstract String getInvocationType();

        public abstract long getLatencyBetweenFailureAndConnectedMs();
    }
}
