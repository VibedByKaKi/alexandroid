package com.amazon.devicesetupservice.v1;

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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("StartEcdheAuthenticationSessionInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class StartEcdheAuthenticationSessionInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.StartEcdheAuthenticationSessionInput");
    private String authMaterialIndex;
    private String nonce;
    private String productIndex;
    private String softwareVersionIndex;

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
        if (!(obj instanceof StartEcdheAuthenticationSessionInput)) {
            return false;
        }
        StartEcdheAuthenticationSessionInput startEcdheAuthenticationSessionInput = (StartEcdheAuthenticationSessionInput) obj;
        return super.equals(obj) && Objects.equals(getProductIndex(), startEcdheAuthenticationSessionInput.getProductIndex()) && Objects.equals(getSoftwareVersionIndex(), startEcdheAuthenticationSessionInput.getSoftwareVersionIndex()) && Objects.equals(getAuthMaterialIndex(), startEcdheAuthenticationSessionInput.getAuthMaterialIndex()) && Objects.equals(getNonce(), startEcdheAuthenticationSessionInput.getNonce());
    }

    @Required
    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @MaxLength(100)
    @MinLength(2)
    @Required
    public String getSoftwareVersionIndex() {
        return this.softwareVersionIndex;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProductIndex(), getSoftwareVersionIndex(), getAuthMaterialIndex(), getNonce());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setSoftwareVersionIndex(String str) {
        this.softwareVersionIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withProductIndex(getProductIndex());
        builder.withSoftwareVersionIndex(getSoftwareVersionIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withNonce(getNonce());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("StartEcdheAuthenticationSessionInput(super=");
        sb.append(super.toString());
        sb.append(", , , , productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", softwareVersionIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.softwareVersionIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", nonce=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.nonce, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String authMaterialIndex;
        protected String nonce;
        protected String productIndex;
        protected String softwareVersionIndex;

        public StartEcdheAuthenticationSessionInput build() {
            StartEcdheAuthenticationSessionInput startEcdheAuthenticationSessionInput = new StartEcdheAuthenticationSessionInput();
            populate(startEcdheAuthenticationSessionInput);
            return startEcdheAuthenticationSessionInput;
        }

        public void populate(StartEcdheAuthenticationSessionInput startEcdheAuthenticationSessionInput) {
            super.populate((AuthenticatedInput) startEcdheAuthenticationSessionInput);
            startEcdheAuthenticationSessionInput.setProductIndex(this.productIndex);
            startEcdheAuthenticationSessionInput.setSoftwareVersionIndex(this.softwareVersionIndex);
            startEcdheAuthenticationSessionInput.setAuthMaterialIndex(this.authMaterialIndex);
            startEcdheAuthenticationSessionInput.setNonce(this.nonce);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withSoftwareVersionIndex(String str) {
            this.softwareVersionIndex = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
