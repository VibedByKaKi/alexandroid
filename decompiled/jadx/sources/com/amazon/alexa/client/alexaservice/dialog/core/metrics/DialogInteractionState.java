package com.amazon.alexa.client.alexaservice.dialog.core.metrics;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.AutoValue_DialogInteractionState;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DialogInteractionState {
    private static final String EMPTY_STRING = "";
    public static final DialogInteractionState IDLE = builder().setInvocationType("").setSoftwareVersion("").setAttemptStartedTime(0).setProgress(DialogInteractionProgress.NEW).build();
    private static final String TAG = "DialogInteractionState";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        private static final String UNKNOWN = "Unknown";

        public abstract DialogInteractionState autoBuild();

        public DialogInteractionState build() {
            if (getDialogRequestId() == null) {
                setDialogRequestId(DialogRequestIdentifier.NONE);
            }
            if (getDialogTurnId() == null) {
                setDialogTurnId(DialogTurnIdentifier.NONE);
            }
            if (getInvocationType() == null) {
                setInvocationType("Unknown");
            }
            if (getSoftwareVersion() == null) {
                setSoftwareVersion("");
            }
            return autoBuild();
        }

        @Nullable
        public abstract DialogRequestIdentifier getDialogRequestId();

        @Nullable
        public abstract DialogTurnIdentifier getDialogTurnId();

        @Nullable
        public abstract String getInvocationType();

        public abstract String getSoftwareVersion();

        public abstract Builder setAttemptStartedTime(long j);

        public abstract Builder setDialogRequestId(@Nullable DialogRequestIdentifier dialogRequestIdentifier);

        public abstract Builder setDialogTurnId(@Nullable DialogTurnIdentifier dialogTurnIdentifier);

        public abstract Builder setInvocationType(@Nullable String str);

        public abstract Builder setProgress(DialogInteractionProgress dialogInteractionProgress);

        public abstract Builder setSoftwareVersion(String str);
    }

    public static Builder builder() {
        return new AutoValue_DialogInteractionState.Builder();
    }

    public static DialogInteractionState update(DialogInteractionState dialogInteractionState, DialogInteractionProgress dialogInteractionProgress) {
        Log.i(TAG, "progress update to: " + dialogInteractionProgress);
        return builder().setDialogRequestId(dialogInteractionState.getDialogRequestId()).setDialogTurnId(dialogInteractionState.getDialogTurnId()).setInvocationType(dialogInteractionState.getInvocationType()).setSoftwareVersion(dialogInteractionState.getSoftwareVersion()).setAttemptStartedTime(dialogInteractionState.getAttemptStartedTime()).setProgress(dialogInteractionProgress).build();
    }

    public abstract long getAttemptStartedTime();

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestId();

    @Nullable
    public abstract DialogTurnIdentifier getDialogTurnId();

    @Nullable
    public abstract String getInvocationType();

    public abstract DialogInteractionProgress getProgress();

    public abstract String getSoftwareVersion();

    public static DialogInteractionState update(DialogInteractionState dialogInteractionState, String str) {
        return builder().setDialogRequestId(dialogInteractionState.getDialogRequestId()).setDialogTurnId(dialogInteractionState.getDialogTurnId()).setInvocationType(str).setSoftwareVersion(dialogInteractionState.getSoftwareVersion()).setAttemptStartedTime(dialogInteractionState.getAttemptStartedTime()).setProgress(dialogInteractionState.getProgress()).build();
    }

    public static DialogInteractionState update(DialogInteractionState dialogInteractionState, DialogRequestIdentifier dialogRequestIdentifier) {
        return builder().setDialogRequestId(dialogRequestIdentifier).setDialogTurnId(dialogInteractionState.getDialogTurnId()).setInvocationType(dialogInteractionState.getInvocationType()).setSoftwareVersion(dialogInteractionState.getSoftwareVersion()).setAttemptStartedTime(dialogInteractionState.getAttemptStartedTime()).setProgress(dialogInteractionState.getProgress()).build();
    }
}
