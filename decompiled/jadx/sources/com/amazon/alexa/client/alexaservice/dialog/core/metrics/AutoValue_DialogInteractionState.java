package com.amazon.alexa.client.alexaservice.dialog.core.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DialogInteractionState extends DialogInteractionState {
    private final long attemptStartedTime;
    private final DialogRequestIdentifier dialogRequestId;
    private final DialogTurnIdentifier dialogTurnId;
    private final String invocationType;
    private final DialogInteractionProgress progress;
    private final String softwareVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DialogInteractionState.Builder {
        private Long attemptStartedTime;
        private DialogRequestIdentifier dialogRequestId;
        private DialogTurnIdentifier dialogTurnId;
        private String invocationType;
        private DialogInteractionProgress progress;
        private String softwareVersion;

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState autoBuild() {
            String str = this.softwareVersion == null ? " softwareVersion" : "";
            if (this.attemptStartedTime == null) {
                str = str.concat(" attemptStartedTime");
            }
            if (this.progress == null) {
                str = str.concat(" progress");
            }
            if (str.isEmpty()) {
                return new AutoValue_DialogInteractionState(this.dialogTurnId, this.dialogRequestId, this.invocationType, this.softwareVersion, this.attemptStartedTime.longValue(), this.progress, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        @Nullable
        public DialogRequestIdentifier getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        @Nullable
        public DialogTurnIdentifier getDialogTurnId() {
            return this.dialogTurnId;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        @Nullable
        public String getInvocationType() {
            return this.invocationType;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public String getSoftwareVersion() {
            String str = this.softwareVersion;
            if (str != null) {
                return str;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Property \"softwareVersion\" has not been set");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setAttemptStartedTime(long j) {
            this.attemptStartedTime = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setDialogRequestId(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
            this.dialogRequestId = dialogRequestIdentifier;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setDialogTurnId(@Nullable DialogTurnIdentifier dialogTurnIdentifier) {
            this.dialogTurnId = dialogTurnIdentifier;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setInvocationType(@Nullable String str) {
            this.invocationType = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setProgress(DialogInteractionProgress dialogInteractionProgress) {
            if (dialogInteractionProgress != null) {
                this.progress = dialogInteractionProgress;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null progress");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState.Builder
        public DialogInteractionState.Builder setSoftwareVersion(String str) {
            if (str != null) {
                this.softwareVersion = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null softwareVersion");
            return null;
        }
    }

    private AutoValue_DialogInteractionState(@Nullable DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str, String str2, long j, DialogInteractionProgress dialogInteractionProgress) {
        this.dialogTurnId = dialogTurnIdentifier;
        this.dialogRequestId = dialogRequestIdentifier;
        this.invocationType = str;
        this.softwareVersion = str2;
        this.attemptStartedTime = j;
        this.progress = dialogInteractionProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DialogInteractionState) {
            DialogInteractionState dialogInteractionState = (DialogInteractionState) obj;
            DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnId;
            if (dialogTurnIdentifier != null ? dialogTurnIdentifier.equals(dialogInteractionState.getDialogTurnId()) : dialogInteractionState.getDialogTurnId() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(dialogInteractionState.getDialogRequestId()) : dialogInteractionState.getDialogRequestId() == null) {
                    String str = this.invocationType;
                    if (str != null ? str.equals(dialogInteractionState.getInvocationType()) : dialogInteractionState.getInvocationType() == null) {
                        if (this.softwareVersion.equals(dialogInteractionState.getSoftwareVersion()) && this.attemptStartedTime == dialogInteractionState.getAttemptStartedTime() && this.progress.equals(dialogInteractionState.getProgress())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    public long getAttemptStartedTime() {
        return this.attemptStartedTime;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    @Nullable
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    @Nullable
    public DialogTurnIdentifier getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    public DialogInteractionProgress getProgress() {
        return this.progress;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionState
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int hashCode() {
        DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnId;
        int hashCode = ((dialogTurnIdentifier == null ? 0 : dialogTurnIdentifier.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
        int hashCode2 = (hashCode ^ (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode())) * 1000003;
        String str = this.invocationType;
        int hashCode3 = (((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.softwareVersion.hashCode()) * 1000003;
        long j = this.attemptStartedTime;
        return this.progress.hashCode() ^ ((hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "DialogInteractionState{dialogTurnId=" + this.dialogTurnId + ", dialogRequestId=" + this.dialogRequestId + ", invocationType=" + this.invocationType + ", softwareVersion=" + this.softwareVersion + ", attemptStartedTime=" + this.attemptStartedTime + ", progress=" + this.progress + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_DialogInteractionState(DialogTurnIdentifier dialogTurnIdentifier, DialogRequestIdentifier dialogRequestIdentifier, String str, String str2, long j, DialogInteractionProgress dialogInteractionProgress, int i) {
        this(dialogTurnIdentifier, dialogRequestIdentifier, str, str2, j, dialogInteractionProgress);
    }
}
