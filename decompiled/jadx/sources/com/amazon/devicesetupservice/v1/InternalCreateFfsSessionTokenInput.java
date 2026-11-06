package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("InternalCreateFfsSessionTokenInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalCreateFfsSessionTokenInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalCreateFfsSessionTokenInput");
    private String accessToken;
    private String customerId;
    private String deviceSerial;
    private String productIndex;
    private String publicKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected String customerId;
        protected String deviceSerial;
        protected String productIndex;
        protected String publicKey;

        public InternalCreateFfsSessionTokenInput build() {
            InternalCreateFfsSessionTokenInput internalCreateFfsSessionTokenInput = new InternalCreateFfsSessionTokenInput();
            populate(internalCreateFfsSessionTokenInput);
            return internalCreateFfsSessionTokenInput;
        }

        public void populate(InternalCreateFfsSessionTokenInput internalCreateFfsSessionTokenInput) {
            internalCreateFfsSessionTokenInput.setCustomerId(this.customerId);
            internalCreateFfsSessionTokenInput.setPublicKey(this.publicKey);
            internalCreateFfsSessionTokenInput.setProductIndex(this.productIndex);
            internalCreateFfsSessionTokenInput.setAccessToken(this.accessToken);
            internalCreateFfsSessionTokenInput.setDeviceSerial(this.deviceSerial);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withDeviceSerial(String str) {
            this.deviceSerial = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withPublicKey(String str) {
            this.publicKey = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCreateFfsSessionTokenInput)) {
            return false;
        }
        InternalCreateFfsSessionTokenInput internalCreateFfsSessionTokenInput = (InternalCreateFfsSessionTokenInput) obj;
        return Objects.equals(getCustomerId(), internalCreateFfsSessionTokenInput.getCustomerId()) && Objects.equals(getPublicKey(), internalCreateFfsSessionTokenInput.getPublicKey()) && Objects.equals(getProductIndex(), internalCreateFfsSessionTokenInput.getProductIndex()) && Objects.equals(getAccessToken(), internalCreateFfsSessionTokenInput.getAccessToken()) && Objects.equals(getDeviceSerial(), internalCreateFfsSessionTokenInput.getDeviceSerial());
    }

    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    @MinLength(1)
    @Required
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    @MaxLength(100)
    @MinLength(1)
    @Sensitive
    public String getDeviceSerial() {
        return this.deviceSerial;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @MaxLength(4096)
    @MinLength(1)
    @Required
    public String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId(), getPublicKey(), getProductIndex(), getAccessToken(), getDeviceSerial());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceSerial(String str) {
        this.deviceSerial = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerId(getCustomerId());
        builder.withPublicKey(getPublicKey());
        builder.withProductIndex(getProductIndex());
        builder.withAccessToken(getAccessToken());
        builder.withDeviceSerial(getDeviceSerial());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalCreateFfsSessionTokenInput(customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", publicKey=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.publicKey, ", productIndex=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.productIndex, ", accessToken=*** REDACTED ***, deviceSerial=*** REDACTED ***)", sb);
    }
}
