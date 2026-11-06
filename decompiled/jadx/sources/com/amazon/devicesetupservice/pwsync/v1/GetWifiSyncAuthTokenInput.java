package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("GetWifiSyncAuthTokenInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWifiSyncAuthTokenInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.GetWifiSyncAuthTokenInput");
    private String certificate;
    private Boolean isCertificateChainPresent;
    private String publicKey;
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
        if (!(obj instanceof GetWifiSyncAuthTokenInput)) {
            return false;
        }
        GetWifiSyncAuthTokenInput getWifiSyncAuthTokenInput = (GetWifiSyncAuthTokenInput) obj;
        return super.equals(obj) && Objects.equals(getCertificate(), getWifiSyncAuthTokenInput.getCertificate()) && Objects.equals(isIsCertificateChainPresent(), getWifiSyncAuthTokenInput.isIsCertificateChainPresent()) && Objects.equals(getPublicKey(), getWifiSyncAuthTokenInput.getPublicKey()) && Long.valueOf(getTimestamp()).equals(Long.valueOf(getWifiSyncAuthTokenInput.getTimestamp())) && Objects.equals(getSignature(), getWifiSyncAuthTokenInput.getSignature());
    }

    @Documentation("This is a PEM-encoded string. It can be either the entire certificate chain\n        on the device or only the leaf certificate. The isCertificateChainPresent\n        parameter should be used to denote which is being passed in.")
    public String getCertificate() {
        return this.certificate;
    }

    @MaxLength(4096)
    @MinLength(1)
    public String getPublicKey() {
        return this.publicKey;
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
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getCertificate(), isIsCertificateChainPresent(), getPublicKey(), Long.valueOf(getTimestamp()), getSignature());
    }

    public Boolean isIsCertificateChainPresent() {
        return this.isCertificateChainPresent;
    }

    public void setCertificate(String str) {
        this.certificate = str;
    }

    public void setIsCertificateChainPresent(Boolean bool) {
        this.isCertificateChainPresent = bool;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
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
        builder.withCertificate(getCertificate());
        builder.withIsCertificateChainPresent(isIsCertificateChainPresent());
        builder.withPublicKey(getPublicKey());
        builder.withTimestamp(getTimestamp());
        builder.withSignature(getSignature());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("GetWifiSyncAuthTokenInput(super=");
        sb.append(super.toString());
        sb.append(", , , , , certificate=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.certificate, ", isCertificateChainPresent=", sb);
        sb.append(String.valueOf(this.isCertificateChainPresent));
        sb.append(", publicKey=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.publicKey, ", timestamp=", sb);
        sb.append(String.valueOf(this.timestamp));
        sb.append(", signature=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.signature, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String certificate;
        protected Boolean isCertificateChainPresent;
        protected String publicKey;
        protected String signature;
        protected long timestamp;

        public GetWifiSyncAuthTokenInput build() {
            GetWifiSyncAuthTokenInput getWifiSyncAuthTokenInput = new GetWifiSyncAuthTokenInput();
            populate(getWifiSyncAuthTokenInput);
            return getWifiSyncAuthTokenInput;
        }

        public void populate(GetWifiSyncAuthTokenInput getWifiSyncAuthTokenInput) {
            super.populate((AuthenticatedInput) getWifiSyncAuthTokenInput);
            getWifiSyncAuthTokenInput.setCertificate(this.certificate);
            getWifiSyncAuthTokenInput.setIsCertificateChainPresent(this.isCertificateChainPresent);
            getWifiSyncAuthTokenInput.setPublicKey(this.publicKey);
            getWifiSyncAuthTokenInput.setTimestamp(this.timestamp);
            getWifiSyncAuthTokenInput.setSignature(this.signature);
        }

        public Builder withCertificate(String str) {
            this.certificate = str;
            return this;
        }

        public Builder withIsCertificateChainPresent(Boolean bool) {
            this.isCertificateChainPresent = bool;
            return this;
        }

        public Builder withPublicKey(String str) {
            this.publicKey = str;
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
