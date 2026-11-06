package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("ValidateWifiSyncAuthTokenOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ValidateWifiSyncAuthTokenOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.ValidateWifiSyncAuthTokenOutput");
    private String endpointToUse;
    private Boolean validToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected Boolean validToken;

        public ValidateWifiSyncAuthTokenOutput build() {
            ValidateWifiSyncAuthTokenOutput validateWifiSyncAuthTokenOutput = new ValidateWifiSyncAuthTokenOutput();
            populate(validateWifiSyncAuthTokenOutput);
            return validateWifiSyncAuthTokenOutput;
        }

        public void populate(ValidateWifiSyncAuthTokenOutput validateWifiSyncAuthTokenOutput) {
            validateWifiSyncAuthTokenOutput.setEndpointToUse(this.endpointToUse);
            validateWifiSyncAuthTokenOutput.setValidToken(this.validToken);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withValidToken(Boolean bool) {
            this.validToken = bool;
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
        if (!(obj instanceof ValidateWifiSyncAuthTokenOutput)) {
            return false;
        }
        ValidateWifiSyncAuthTokenOutput validateWifiSyncAuthTokenOutput = (ValidateWifiSyncAuthTokenOutput) obj;
        return Objects.equals(getEndpointToUse(), validateWifiSyncAuthTokenOutput.getEndpointToUse()) && Objects.equals(isValidToken(), validateWifiSyncAuthTokenOutput.isValidToken());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getEndpointToUse(), isValidToken());
    }

    public Boolean isValidToken() {
        return this.validToken;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setValidToken(Boolean bool) {
        this.validToken = bool;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withEndpointToUse(getEndpointToUse());
        builder.withValidToken(isValidToken());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ValidateWifiSyncAuthTokenOutput(endpointToUse=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.endpointToUse, ", validToken=", sb);
        sb.append(String.valueOf(this.validToken));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
