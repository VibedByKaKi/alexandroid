package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaHeader implements Parcelable {
    public static final Parcelable.Creator<AlexaHeader> CREATOR = new Parcelable.Creator<AlexaHeader>() { // from class: com.amazon.alexa.api.AlexaHeader.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaHeader createFromParcel(Parcel parcel) {
            return new AlexaHeader(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaHeader[] newArray(int i) {
            return new AlexaHeader[i];
        }
    };

    @Nullable
    private final String correlationToken;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String endpointId;

    @Nullable
    private final String eventCorrelationToken;

    @Nullable
    private final String instance;
    private final String messageId;
    private final String name;
    private final String namespace;

    @Nullable
    private final String payloadVersion;

    @Nullable
    private final String presentationUri;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private String correlationToken;

        @Nullable
        private String dialogRequestId;

        @Nullable
        private String endpointId;

        @Nullable
        private String eventCorrelationToken;

        @Nullable
        private String instance;
        private String messageId;
        private String name;
        private String namespace;

        @Nullable
        private String payloadVersion;

        @Nullable
        private String presentationUri;

        @Nullable
        private String universalPrivacyCode;

        private Builder() {
            this.messageId = AlexaHeader.generateMessageId();
        }

        public AlexaHeader build() {
            return new AlexaHeader(this);
        }

        public Builder setCorrelationToken(@Nullable String str) {
            this.correlationToken = str;
            return this;
        }

        public Builder setDialogRequestId(@Nullable String str) {
            this.dialogRequestId = str;
            return this;
        }

        public Builder setEndpointId(@Nullable String str) {
            this.endpointId = str;
            return this;
        }

        public Builder setEventCorrelationToken(@Nullable String str) {
            this.eventCorrelationToken = str;
            return this;
        }

        public Builder setInstance(@Nullable String str) {
            this.instance = str;
            return this;
        }

        public Builder setMessageId(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.messageId = str;
            }
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setNamespace(String str) {
            this.namespace = str;
            return this;
        }

        public Builder setPayloadVersion(@Nullable String str) {
            this.payloadVersion = str;
            return this;
        }

        public Builder setPresentationUri(@Nullable String str) {
            this.presentationUri = str;
            return this;
        }

        public Builder setUniversalPrivacyCode(@Nullable String str) {
            this.universalPrivacyCode = str;
            return this;
        }

        public Builder setUpc(@Nullable String str) {
            this.universalPrivacyCode = str;
            return this;
        }
    }

    public AlexaHeader(Parcel parcel) {
        this.namespace = parcel.readString();
        this.name = parcel.readString();
        this.messageId = parcel.readString();
        this.dialogRequestId = parcel.readString();
        this.correlationToken = parcel.readString();
        this.payloadVersion = parcel.readString();
        this.presentationUri = parcel.readString();
        this.universalPrivacyCode = parcel.readString();
        this.eventCorrelationToken = parcel.readString();
        this.instance = parcel.readString();
        this.endpointId = parcel.readString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlexaHeader create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @Nullable String str11) {
        return TextUtils.isEmpty(str3) ? new AlexaHeader(str, str2, generateMessageId(), str4, str5, str6, str7, str8, str9, str10, str11) : new AlexaHeader(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateMessageId() {
        return UUID.randomUUID().toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCorrelationToken() {
        return this.correlationToken;
    }

    @Nullable
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public String getEndpointId() {
        return this.endpointId;
    }

    public String getEventCorrelationToken() {
        return this.eventCorrelationToken;
    }

    @Nullable
    public String getInstance() {
        return this.instance;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getPayloadVersion() {
        return this.payloadVersion;
    }

    @Nullable
    public String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public String getUpc() {
        return this.universalPrivacyCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.namespace);
        parcel.writeString(this.name);
        parcel.writeString(this.messageId);
        parcel.writeString(this.dialogRequestId);
        parcel.writeString(this.correlationToken);
        parcel.writeString(this.payloadVersion);
        parcel.writeString(this.presentationUri);
        parcel.writeString(this.universalPrivacyCode);
        parcel.writeString(this.eventCorrelationToken);
        parcel.writeString(this.instance);
        parcel.writeString(this.endpointId);
    }

    public static AlexaHeader create(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return create(str, str2, generateMessageId(), null, null, null);
        }
        return create(str, str2, str3, null, null, null);
    }

    public static AlexaHeader create(String str, String str2, String str3, String str4, String str5, String str6) {
        return create(str, str2, str3, str4, str5, str6, null, null, null, null);
    }

    public static AlexaHeader create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return create(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, null);
    }

    public static AlexaHeader create(String str, String str2) {
        return create(str, str2, generateMessageId(), null, null, null);
    }

    private AlexaHeader(Builder builder) {
        this(builder.namespace, builder.name, builder.messageId, builder.dialogRequestId, builder.correlationToken, builder.payloadVersion, builder.presentationUri, builder.universalPrivacyCode, builder.eventCorrelationToken, builder.instance, builder.endpointId);
    }

    private AlexaHeader(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @Nullable String str11) {
        Preconditions.isFalse(TextUtils.isEmpty(str), "The provided namespace was null or empty");
        Preconditions.isFalse(TextUtils.isEmpty(str2), "The provided name was null or empty");
        this.namespace = str;
        this.name = str2;
        this.messageId = str3;
        this.dialogRequestId = str4;
        this.correlationToken = str5;
        this.payloadVersion = str6;
        this.presentationUri = str7;
        this.universalPrivacyCode = str8;
        this.eventCorrelationToken = str9;
        this.instance = str10;
        this.endpointId = str11;
    }
}
