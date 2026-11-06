package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("InvalidateWifiSyncAuthTokenInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InvalidateWifiSyncAuthTokenInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.InvalidateWifiSyncAuthTokenInput");
    private String authMaterialIndex;
    private String productIndex;
    private String signature;
    private long timestamp;

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
        if (!(obj instanceof InvalidateWifiSyncAuthTokenInput)) {
            return false;
        }
        InvalidateWifiSyncAuthTokenInput invalidateWifiSyncAuthTokenInput = (InvalidateWifiSyncAuthTokenInput) obj;
        return super.equals(obj) && Objects.equals(getProductIndex(), invalidateWifiSyncAuthTokenInput.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), invalidateWifiSyncAuthTokenInput.getAuthMaterialIndex()) && Long.valueOf(getTimestamp()).equals(Long.valueOf(invalidateWifiSyncAuthTokenInput.getTimestamp())) && Objects.equals(getSignature(), invalidateWifiSyncAuthTokenInput.getSignature());
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

    @MaxLength(2048)
    @Required
    @MinLength(1)
    @Documentation("Signature validating a payload. This will be Base64 encoded string.\n        Signature length varies based on what kind of key was used to compute\n        the signature.")
    public String getSignature() {
        return this.signature;
    }

    @Required
    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), Long.valueOf(getTimestamp()), getSignature());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withTimestamp(getTimestamp());
        builder.withSignature(getSignature());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("InvalidateWifiSyncAuthTokenInput(super=");
        sb.append(super.toString());
        sb.append(", , , , productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", timestamp=", sb);
        sb.append(String.valueOf(this.timestamp));
        sb.append(", signature=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.signature, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String authMaterialIndex;
        protected String productIndex;
        protected String signature;
        protected long timestamp;

        public InvalidateWifiSyncAuthTokenInput build() {
            InvalidateWifiSyncAuthTokenInput invalidateWifiSyncAuthTokenInput = new InvalidateWifiSyncAuthTokenInput();
            populate(invalidateWifiSyncAuthTokenInput);
            return invalidateWifiSyncAuthTokenInput;
        }

        public void populate(InvalidateWifiSyncAuthTokenInput invalidateWifiSyncAuthTokenInput) {
            super.populate((AuthenticatedInput) invalidateWifiSyncAuthTokenInput);
            invalidateWifiSyncAuthTokenInput.setProductIndex(this.productIndex);
            invalidateWifiSyncAuthTokenInput.setAuthMaterialIndex(this.authMaterialIndex);
            invalidateWifiSyncAuthTokenInput.setTimestamp(this.timestamp);
            invalidateWifiSyncAuthTokenInput.setSignature(this.signature);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withSignature(String str) {
            this.signature = str;
            return this;
        }

        public Builder withTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
