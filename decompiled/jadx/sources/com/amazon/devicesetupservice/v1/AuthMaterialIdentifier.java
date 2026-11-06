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
import com.amazon.devicesetupservice.ProvisioneeIdentifier;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("AuthMaterialIdentifier")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class AuthMaterialIdentifier extends ProvisioneeIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.AuthMaterialIdentifier");
    private String authMaterialIndex;
    private String productIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisioneeIdentifier.Builder {
        protected String authMaterialIndex;
        protected String productIndex;

        public AuthMaterialIdentifier build() {
            AuthMaterialIdentifier authMaterialIdentifier = new AuthMaterialIdentifier();
            populate(authMaterialIdentifier);
            return authMaterialIdentifier;
        }

        public void populate(AuthMaterialIdentifier authMaterialIdentifier) {
            super.populate((ProvisioneeIdentifier) authMaterialIdentifier);
            authMaterialIdentifier.setAuthMaterialIndex(this.authMaterialIndex);
            authMaterialIdentifier.setProductIndex(this.productIndex);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
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

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthMaterialIdentifier)) {
            return false;
        }
        AuthMaterialIdentifier authMaterialIdentifier = (AuthMaterialIdentifier) obj;
        return super.equals(obj) && Objects.equals(getAuthMaterialIndex(), authMaterialIdentifier.getAuthMaterialIndex()) && Objects.equals(getProductIndex(), authMaterialIdentifier.getProductIndex());
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

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getAuthMaterialIndex(), getProductIndex());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withProductIndex(getProductIndex());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeIdentifier
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthMaterialIdentifier(super=");
        sb.append(super.toString());
        sb.append(", , authMaterialIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", productIndex=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.productIndex, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
