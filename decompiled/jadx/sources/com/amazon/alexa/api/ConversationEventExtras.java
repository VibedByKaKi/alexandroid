package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ConversationEventExtras {

    @Nullable
    private final String interactionLabel;
    private final String invocationType;
    private final String presentationUri;

    @Nullable
    private final ResponseType responseType;
    private final long startTimestampInMillis;
    private final boolean suppressSpeechResponse;
    private final TimeProvider timeProvider;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<ConversationEventExtras> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ConversationEventExtrasKey implements Bundles.Key {
            INVOCATION_TYPE,
            PRESENTATION_URI,
            START_TIMESTAMP_IN_MILLIS,
            UNIVERSAL_PRIVACY_CODE,
            INTERACTION_LABEL,
            RESPONSE_TYPE,
            SUPPRESS_SPEECH_RESPONSE
        }

        @Nullable
        private ResponseType getResponseTypeFromBundle(Bundle bundle) {
            String optionalString = Bundles.getOptionalString(bundle, ConversationEventExtrasKey.RESPONSE_TYPE);
            if (optionalString != null) {
                try {
                    return ResponseType.valueOf(optionalString);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public ConversationEventExtras createFromBundle(Bundle bundle) {
            return ConversationEventExtras.builder().setInvocationType(Bundles.getString(bundle, ConversationEventExtrasKey.INVOCATION_TYPE)).setPresentationUri(Bundles.getString(bundle, ConversationEventExtrasKey.PRESENTATION_URI)).setStartTimestampInMillis(Bundles.getLong(bundle, ConversationEventExtrasKey.START_TIMESTAMP_IN_MILLIS)).setUniversalPrivacyCode(Bundles.getOptionalString(bundle, ConversationEventExtrasKey.UNIVERSAL_PRIVACY_CODE)).setInteractionLabel(Bundles.getOptionalString(bundle, ConversationEventExtrasKey.INTERACTION_LABEL)).setResponseType(getResponseTypeFromBundle(bundle)).suppressSpeechResponse(Bundles.getBoolean(bundle, ConversationEventExtrasKey.SUPPRESS_SPEECH_RESPONSE)).build();
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(ConversationEventExtras conversationEventExtras) {
            Bundle bundle = new Bundle();
            bundle.putString(ConversationEventExtrasKey.INVOCATION_TYPE.name(), conversationEventExtras.invocationType);
            bundle.putString(ConversationEventExtrasKey.PRESENTATION_URI.name(), conversationEventExtras.presentationUri);
            bundle.putLong(ConversationEventExtrasKey.START_TIMESTAMP_IN_MILLIS.name(), conversationEventExtras.startTimestampInMillis);
            bundle.putString(ConversationEventExtrasKey.UNIVERSAL_PRIVACY_CODE.name(), conversationEventExtras.universalPrivacyCode);
            bundle.putString(ConversationEventExtrasKey.INTERACTION_LABEL.name(), conversationEventExtras.interactionLabel);
            if (conversationEventExtras.responseType != null) {
                bundle.putString(ConversationEventExtrasKey.RESPONSE_TYPE.name(), conversationEventExtras.responseType.name());
            }
            bundle.putBoolean(ConversationEventExtrasKey.SUPPRESS_SPEECH_RESPONSE.name(), conversationEventExtras.suppressSpeechResponse);
            return bundle;
        }
    }

    private ConversationEventExtras(Builder builder) {
        TimeProvider timeProvider = new TimeProvider();
        this.timeProvider = timeProvider;
        this.invocationType = builder.invocationType;
        this.presentationUri = builder.presentationUri;
        this.startTimestampInMillis = builder.startTimestampInMillis == 0 ? timeProvider.elapsedRealTime() : builder.startTimestampInMillis;
        this.universalPrivacyCode = builder.universalPrivacyCode;
        this.interactionLabel = builder.interactionLabel;
        this.responseType = builder.responseType;
        this.suppressSpeechResponse = builder.suppressSpeechResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationEventExtras conversationEventExtras = (ConversationEventExtras) obj;
            if (Objects.equals(this.invocationType, conversationEventExtras.invocationType) && Objects.equals(this.presentationUri, conversationEventExtras.presentationUri) && Long.valueOf(this.startTimestampInMillis).equals(Long.valueOf(conversationEventExtras.startTimestampInMillis)) && Objects.equals(this.universalPrivacyCode, conversationEventExtras.universalPrivacyCode) && Objects.equals(this.interactionLabel, conversationEventExtras.interactionLabel) && Objects.equals(this.responseType, conversationEventExtras.responseType) && Boolean.valueOf(this.suppressSpeechResponse).equals(Boolean.valueOf(conversationEventExtras.suppressSpeechResponse))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    public String getInvocationType() {
        return this.invocationType;
    }

    public String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }

    public long getStartTimestampInMillis() {
        return this.startTimestampInMillis;
    }

    @Nullable
    public String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        return Objects.hash(this.invocationType, this.presentationUri, Long.valueOf(this.startTimestampInMillis), this.universalPrivacyCode, this.interactionLabel, this.responseType, Boolean.valueOf(this.suppressSpeechResponse));
    }

    public boolean suppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String interactionLabel;
        private String invocationType;
        private String presentationUri;
        private ResponseType responseType;
        private long startTimestampInMillis;
        private boolean suppressSpeechResponse;
        private String universalPrivacyCode;

        public ConversationEventExtras build() {
            Preconditions.notNull(this.invocationType, "Invocation type shouldn't be null");
            Preconditions.notNull(this.presentationUri, "Presentation Uri shouldn't be null");
            return new ConversationEventExtras(this);
        }

        public Builder setInteractionLabel(String str) {
            this.interactionLabel = str;
            return this;
        }

        public Builder setInvocationType(String str) {
            this.invocationType = str;
            return this;
        }

        public Builder setPresentationUri(String str) {
            this.presentationUri = str;
            return this;
        }

        public Builder setResponseType(ResponseType responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setStartTimestampInMillis(long j) {
            this.startTimestampInMillis = j;
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
