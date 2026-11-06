package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("RecordDevicePossessionIntentInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordDevicePossessionIntentInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.RecordDevicePossessionIntentInput");
    private String customerId;
    private String productId;
    private String publicKey;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDevicePossessionIntentInput)) {
            return false;
        }
        RecordDevicePossessionIntentInput recordDevicePossessionIntentInput = (RecordDevicePossessionIntentInput) obj;
        return super.equals(obj) && Objects.equals(getPublicKey(), recordDevicePossessionIntentInput.getPublicKey()) && Objects.equals(getProductId(), recordDevicePossessionIntentInput.getProductId()) && Objects.equals(getCustomerId(), recordDevicePossessionIntentInput.getCustomerId());
    }

    @MinLength(1)
    @Required
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    @MaxLength(100)
    @MinLength(1)
    @Required
    public String getProductId() {
        return this.productId;
    }

    @MaxLength(4096)
    @MinLength(1)
    @Required
    public String getPublicKey() {
        return this.publicKey;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getPublicKey(), getProductId(), getCustomerId());
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withPublicKey(getPublicKey());
        builder.withProductId(getProductId());
        builder.withCustomerId(getCustomerId());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordDevicePossessionIntentInput(super=");
        sb.append(super.toString());
        sb.append(", , , publicKey=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.publicKey, ", productId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productId, ", customerId=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.customerId, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String customerId;
        protected String productId;
        protected String publicKey;

        public RecordDevicePossessionIntentInput build() {
            RecordDevicePossessionIntentInput recordDevicePossessionIntentInput = new RecordDevicePossessionIntentInput();
            populate(recordDevicePossessionIntentInput);
            return recordDevicePossessionIntentInput;
        }

        public void populate(RecordDevicePossessionIntentInput recordDevicePossessionIntentInput) {
            super.populate((AuthenticatedInput) recordDevicePossessionIntentInput);
            recordDevicePossessionIntentInput.setPublicKey(this.publicKey);
            recordDevicePossessionIntentInput.setProductId(this.productId);
            recordDevicePossessionIntentInput.setCustomerId(this.customerId);
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withProductId(String str) {
            this.productId = str;
            return this;
        }

        public Builder withPublicKey(String str) {
            this.publicKey = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
