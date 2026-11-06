package com.amazon.devicesetupservice.pwsync.v1;

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
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("ValidateWifiSyncAuthTokenInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ValidateWifiSyncAuthTokenInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.ValidateWifiSyncAuthTokenInput");
    private String authMaterialIndex;
    private String productIndex;
    private String sessionToken;
    private String wifiSyncAuthToken;

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
        if (!(obj instanceof ValidateWifiSyncAuthTokenInput)) {
            return false;
        }
        ValidateWifiSyncAuthTokenInput validateWifiSyncAuthTokenInput = (ValidateWifiSyncAuthTokenInput) obj;
        return super.equals(obj) && Objects.equals(getProductIndex(), validateWifiSyncAuthTokenInput.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), validateWifiSyncAuthTokenInput.getAuthMaterialIndex()) && Objects.equals(getWifiSyncAuthToken(), validateWifiSyncAuthTokenInput.getWifiSyncAuthToken()) && Objects.equals(getSessionToken(), validateWifiSyncAuthTokenInput.getSessionToken());
    }

    @Required
    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @MaxLength(36)
    @Required
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getSessionToken() {
        return this.sessionToken;
    }

    @MaxLength(255)
    @Required
    @Sensitive
    @MinLength(1)
    @Documentation("Unique token that will serve as a secret to be stored on a provisionee device and in WNKS.\n        It will be in the form of an amazon common identifier.\n        e.g: amzn1.ffs.wifi-sync-auth-token.some-uuid")
    public String getWifiSyncAuthToken() {
        return this.wifiSyncAuthToken;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), getWifiSyncAuthToken(), getSessionToken());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public void setWifiSyncAuthToken(String str) {
        this.wifiSyncAuthToken = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withWifiSyncAuthToken(getWifiSyncAuthToken());
        builder.withSessionToken(getSessionToken());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("ValidateWifiSyncAuthTokenInput(super=");
        sb.append(super.toString());
        sb.append(", , , , productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", wifiSyncAuthToken=*** REDACTED ***, sessionToken=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sessionToken, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String authMaterialIndex;
        protected String productIndex;
        protected String sessionToken;
        protected String wifiSyncAuthToken;

        public ValidateWifiSyncAuthTokenInput build() {
            ValidateWifiSyncAuthTokenInput validateWifiSyncAuthTokenInput = new ValidateWifiSyncAuthTokenInput();
            populate(validateWifiSyncAuthTokenInput);
            return validateWifiSyncAuthTokenInput;
        }

        public void populate(ValidateWifiSyncAuthTokenInput validateWifiSyncAuthTokenInput) {
            super.populate((AuthenticatedInput) validateWifiSyncAuthTokenInput);
            validateWifiSyncAuthTokenInput.setProductIndex(this.productIndex);
            validateWifiSyncAuthTokenInput.setAuthMaterialIndex(this.authMaterialIndex);
            validateWifiSyncAuthTokenInput.setWifiSyncAuthToken(this.wifiSyncAuthToken);
            validateWifiSyncAuthTokenInput.setSessionToken(this.sessionToken);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withSessionToken(String str) {
            this.sessionToken = str;
            return this;
        }

        public Builder withWifiSyncAuthToken(String str) {
            this.wifiSyncAuthToken = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
