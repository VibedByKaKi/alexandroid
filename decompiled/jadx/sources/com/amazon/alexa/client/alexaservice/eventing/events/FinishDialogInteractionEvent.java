package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.validation.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class FinishDialogInteractionEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class SuccessEvent extends FinishDialogInteractionEvent {
        public static SuccessEvent create(DialogRequestIdentifier dialogRequestIdentifier) {
            return create(dialogRequestIdentifier, false);
        }

        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract boolean isTextDialog();

        public static SuccessEvent create(DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
            return new AutoValue_FinishDialogInteractionEvent_SuccessEvent(dialogRequestIdentifier, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class CancelEvent extends FinishDialogInteractionEvent {
        public static CancelEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogCancelReason dialogCancelReason) {
            return new AutoValue_FinishDialogInteractionEvent_CancelEvent(dialogTurnIdentifier, null, dialogCancelReason);
        }

        public abstract DialogCancelReason getCancelReason();

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        public abstract DialogTurnIdentifier getDialogTurnIdentifier();

        public static CancelEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogRequestIdentifier dialogRequestIdentifier, DialogCancelReason dialogCancelReason) {
            return new AutoValue_FinishDialogInteractionEvent_CancelEvent(dialogTurnIdentifier, dialogRequestIdentifier, dialogCancelReason);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ImmediateResultEvent extends FinishDialogInteractionEvent {
        public static ImmediateResultEvent create(@Nullable String str, DialogInteractionResult.Reason reason) {
            return create(str, "", reason, false);
        }

        @Nullable
        public abstract String getInvocationType();

        public abstract DialogInteractionResult.Reason getReason();

        public abstract String getSoftwareVersion();

        public abstract boolean isTextDialog();

        public static ImmediateResultEvent create(@Nullable String str, DialogInteractionResult.Reason reason, boolean z) {
            return create(str, "", reason, z);
        }

        public static ImmediateResultEvent create(@Nullable String str, String str2, DialogInteractionResult.Reason reason) {
            return create(str, str2, reason, false);
        }

        public static ImmediateResultEvent create(@Nullable String str, String str2, DialogInteractionResult.Reason reason, boolean z) {
            return new AutoValue_FinishDialogInteractionEvent_ImmediateResultEvent(str, str2, reason, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FailureEvent extends FinishDialogInteractionEvent {
        public static FailureEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogFailureReason dialogFailureReason, @Nullable Map<String, String> map, boolean z) {
            dialogFailureReason.setTextDialog(z);
            return new AutoValue_FinishDialogInteractionEvent_FailureEvent(dialogRequestIdentifier, dialogFailureReason, map, z);
        }

        public abstract DialogRequestIdentifier getDialogRequestIdentifier();

        @Nullable
        public abstract Map<String, String> getFailureInformation();

        public abstract DialogFailureReason getFailureReason();

        public abstract boolean isTextDialog();

        public static FailureEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogFailureReason dialogFailureReason, boolean z) {
            return create(dialogRequestIdentifier, dialogFailureReason, null, z);
        }

        public static FailureEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogFailureReason dialogFailureReason, @Nullable Map<String, String> map) {
            return create(dialogRequestIdentifier, dialogFailureReason, map, false);
        }

        public static FailureEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogFailureReason dialogFailureReason) {
            return create(dialogRequestIdentifier, dialogFailureReason, null, false);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class AbandonEvent extends FinishDialogInteractionEvent {
        public static AbandonEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogAbandonReason dialogAbandonReason) {
            Preconditions.notNull(dialogRequestIdentifier, "dialogRequestIdentifier is null");
            return create(null, dialogRequestIdentifier, dialogAbandonReason, false);
        }

        public abstract DialogAbandonReason getAbandonReason();

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestId();

        @Nullable
        public abstract DialogTurnIdentifier getDialogTurnIdentifier();

        public abstract boolean isTextDialog();

        public static AbandonEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogAbandonReason dialogAbandonReason) {
            return create(dialogTurnIdentifier, null, dialogAbandonReason, false);
        }

        public static AbandonEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogAbandonReason dialogAbandonReason, boolean z) {
            return create(dialogTurnIdentifier, null, dialogAbandonReason, z);
        }

        public static AbandonEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogAbandonReason dialogAbandonReason, boolean z) {
            Preconditions.notNull(dialogRequestIdentifier, "dialogRequestIdentifier is null");
            return create(null, dialogRequestIdentifier, dialogAbandonReason, z);
        }

        public static AbandonEvent create(@Nullable DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, DialogAbandonReason dialogAbandonReason, boolean z) {
            return new AutoValue_FinishDialogInteractionEvent_AbandonEvent(dialogTurnIdentifier, dialogRequestIdentifier, dialogAbandonReason, z);
        }
    }
}
