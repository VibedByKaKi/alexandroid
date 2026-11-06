package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ResponseCoordinationMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ExternalReservedResponseStartedEvent extends ResponseCoordinationMetricEvent {
        public static ExternalReservedResponseStartedEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2) {
            return new AutoValue_ResponseCoordinationMetricEvent_ExternalReservedResponseStartedEvent(str, dialogRequestIdentifier, j, j2);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract long getExternalDecisionTimestampEpochMs();

        public abstract long getExternalReservedResponseStartedEpochMs();

        @Nullable
        public abstract String getInvocationType();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResponseAlreadyReservedEvent extends ResponseCoordinationMetricEvent {
        public static ResponseAlreadyReservedEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, long j3, long j4) {
            return new AutoValue_ResponseCoordinationMetricEvent_ResponseAlreadyReservedEvent(str, dialogRequestIdentifier, j, j2, j3, j4);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract long getExternalDecisionReceivedTimestampEpochMs();

        public abstract long getExternalDecisionTimestampEpochMs();

        public abstract long getInternalDecisionTimestampEpochMs();

        @Nullable
        public abstract String getInvocationType();

        public abstract long getReservationTimestampEpochMs();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResponseMustBeCoordinatedEvent extends ResponseCoordinationMetricEvent {
        public static ResponseMustBeCoordinatedEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier) {
            return new AutoValue_ResponseCoordinationMetricEvent_ResponseMustBeCoordinatedEvent(str, dialogRequestIdentifier);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        @Nullable
        public abstract String getInvocationType();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResponseReservedEvent extends ResponseCoordinationMetricEvent {
        public static ResponseReservedEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
            return new AutoValue_ResponseCoordinationMetricEvent_ResponseReservedEvent(str, dialogRequestIdentifier, z);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        @Nullable
        public abstract String getInvocationType();

        public abstract boolean isInternal();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ShallowExternalReservationEvent extends ResponseCoordinationMetricEvent {
        public static ShallowExternalReservationEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
            return new AutoValue_ResponseCoordinationMetricEvent_ShallowExternalReservationEvent(str, dialogRequestIdentifier, z);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        @Nullable
        public abstract String getInvocationType();

        public abstract boolean isAgreed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ShallowInternalReservationEvent extends ResponseCoordinationMetricEvent {
        public static ShallowInternalReservationEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, boolean z, long j, long j2, long j3) {
            return new AutoValue_ResponseCoordinationMetricEvent_ShallowInternalReservationEvent(str, dialogRequestIdentifier, z, j, j2, j3);
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract long getExternalResponseReceivedTimestampEpochMs();

        public abstract long getExternalResponseTimestampEpochMs();

        public abstract long getInternalDecisionTimestampEpochMs();

        @Nullable
        public abstract String getInvocationType();

        public abstract boolean isAgreed();
    }
}
