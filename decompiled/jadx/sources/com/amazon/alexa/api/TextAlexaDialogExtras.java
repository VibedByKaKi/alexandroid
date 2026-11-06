package com.amazon.alexa.api;

import android.text.TextUtils;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class TextAlexaDialogExtras {
    private final long dialogStartTimestampMillis;

    @Nullable
    private final TextInputType inputType;

    @Nullable
    private final String interactionLabel;
    private final String invocationType;

    @Nullable
    private final ResponseType responseType;
    private final boolean suppressSpeechResponse;
    private final TimeProvider timeProvider;

    @Nullable
    private final String universalPrivacyCode;

    private TextAlexaDialogExtras(Builder builder) {
        TimeProvider timeProvider = new TimeProvider();
        this.timeProvider = timeProvider;
        this.suppressSpeechResponse = builder.suppressSpeechResponse;
        this.invocationType = builder.invocationType;
        this.dialogStartTimestampMillis = builder.dialogStartTimestampMillis == 0 ? timeProvider.elapsedRealTime() : builder.dialogStartTimestampMillis;
        this.universalPrivacyCode = builder.universalPrivacyCode;
        this.interactionLabel = builder.interactionLabel;
        this.responseType = builder.responseType;
        this.inputType = builder.inputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TextAlexaDialogExtras textAlexaDialogExtras = (TextAlexaDialogExtras) obj;
            if (this.suppressSpeechResponse == textAlexaDialogExtras.suppressSpeechResponse && Objects.equals(this.invocationType, textAlexaDialogExtras.invocationType) && Long.valueOf(this.dialogStartTimestampMillis).equals(Long.valueOf(textAlexaDialogExtras.dialogStartTimestampMillis)) && Objects.equals(this.universalPrivacyCode, textAlexaDialogExtras.universalPrivacyCode) && Objects.equals(this.interactionLabel, textAlexaDialogExtras.interactionLabel) && Objects.equals(this.responseType, textAlexaDialogExtras.responseType) && Objects.equals(this.inputType, textAlexaDialogExtras.inputType)) {
                return true;
            }
        }
        return false;
    }

    public long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    @Nullable
    public TextInputType getInputType() {
        return this.inputType;
    }

    @Nullable
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    public String getInvocationType() {
        return this.invocationType;
    }

    @Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }

    @Nullable
    public String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.suppressSpeechResponse), this.invocationType, Long.valueOf(this.dialogStartTimestampMillis), this.universalPrivacyCode, this.interactionLabel, this.responseType, this.inputType);
    }

    public boolean suppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private long dialogStartTimestampMillis;
        private TextInputType inputType;
        private String interactionLabel;
        private String invocationType;
        private ResponseType responseType;
        private boolean suppressSpeechResponse;
        private String universalPrivacyCode;

        public TextAlexaDialogExtras build() {
            Preconditions.isFalse(TextUtils.isEmpty(this.invocationType), "Invocation type cannot be empty");
            return new TextAlexaDialogExtras(this);
        }

        public Builder setDialogStartTimestampMillis(long j) {
            this.dialogStartTimestampMillis = j;
            return this;
        }

        public Builder setInputType(TextInputType textInputType) {
            this.inputType = textInputType;
            return this;
        }

        public Builder setInteractionLabel(String str) {
            this.interactionLabel = str;
            return this;
        }

        public Builder setInvocationType(String str) {
            this.invocationType = str;
            return this;
        }

        public Builder setResponseType(ResponseType responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setUniversalPrivacyCode(String str) {
            this.universalPrivacyCode = str;
            return this;
        }

        public Builder suppressSpeechResponse(boolean z) {
            this.suppressSpeechResponse = z;
            return this;
        }

        private Builder() {
        }
    }
}
