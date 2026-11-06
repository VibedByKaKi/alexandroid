package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetRegistrationTokenInput")
@Documentation("This input structure requires the auth token vended by DMS during the JITR Flow. This token is typically\n        a concatenation of STS Token and AEGIS certificate. More information here:\n        https://quip-amazon.com/h4bxAi8y10DW/Device-Authentication-Using-AEGIS-STS\n        @param deviceAuthenticationToken: required\n        @param productIndex: required")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetRegistrationTokenInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetRegistrationTokenInput");
    private String deviceAuthenticationToken;
    private String productIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String deviceAuthenticationToken;
        protected String productIndex;

        public GetRegistrationTokenInput build() {
            GetRegistrationTokenInput getRegistrationTokenInput = new GetRegistrationTokenInput();
            populate(getRegistrationTokenInput);
            return getRegistrationTokenInput;
        }

        public void populate(GetRegistrationTokenInput getRegistrationTokenInput) {
            getRegistrationTokenInput.setDeviceAuthenticationToken(this.deviceAuthenticationToken);
            getRegistrationTokenInput.setProductIndex(this.productIndex);
        }

        public Builder withDeviceAuthenticationToken(String str) {
            this.deviceAuthenticationToken = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
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
        if (!(obj instanceof GetRegistrationTokenInput)) {
            return false;
        }
        GetRegistrationTokenInput getRegistrationTokenInput = (GetRegistrationTokenInput) obj;
        return Objects.equals(getDeviceAuthenticationToken(), getRegistrationTokenInput.getDeviceAuthenticationToken()) && Objects.equals(getProductIndex(), getRegistrationTokenInput.getProductIndex());
    }

    @MaxLength(4900)
    @Required
    @Sensitive
    @MinLength(1)
    public String getDeviceAuthenticationToken() {
        return this.deviceAuthenticationToken;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceAuthenticationToken(), getProductIndex());
    }

    public void setDeviceAuthenticationToken(String str) {
        this.deviceAuthenticationToken = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceAuthenticationToken(getDeviceAuthenticationToken());
        builder.withProductIndex(getProductIndex());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.productIndex, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("GetRegistrationTokenInput(deviceAuthenticationToken=*** REDACTED ***, productIndex="));
    }
}
