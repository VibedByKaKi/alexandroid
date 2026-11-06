package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("GetProvisionableStatusInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetProvisionableStatusInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetProvisionableStatusInput");
    private AuthMaterialIdentifier authMaterialIdentifier;
    private String barcodeIdentifier;
    private LegacyIdentifier legacyIdentifier;

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
        if (!(obj instanceof GetProvisionableStatusInput)) {
            return false;
        }
        GetProvisionableStatusInput getProvisionableStatusInput = (GetProvisionableStatusInput) obj;
        return super.equals(obj) && Objects.equals(getLegacyIdentifier(), getProvisionableStatusInput.getLegacyIdentifier()) && Objects.equals(getAuthMaterialIdentifier(), getProvisionableStatusInput.getAuthMaterialIdentifier()) && Objects.equals(getBarcodeIdentifier(), getProvisionableStatusInput.getBarcodeIdentifier());
    }

    public AuthMaterialIdentifier getAuthMaterialIdentifier() {
        return this.authMaterialIdentifier;
    }

    @MinLength(1)
    public String getBarcodeIdentifier() {
        return this.barcodeIdentifier;
    }

    public LegacyIdentifier getLegacyIdentifier() {
        return this.legacyIdentifier;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getLegacyIdentifier(), getAuthMaterialIdentifier(), getBarcodeIdentifier());
    }

    public void setAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
        this.authMaterialIdentifier = authMaterialIdentifier;
    }

    public void setBarcodeIdentifier(String str) {
        this.barcodeIdentifier = str;
    }

    public void setLegacyIdentifier(LegacyIdentifier legacyIdentifier) {
        this.legacyIdentifier = legacyIdentifier;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withLegacyIdentifier(getLegacyIdentifier());
        builder.withAuthMaterialIdentifier(getAuthMaterialIdentifier());
        builder.withBarcodeIdentifier(getBarcodeIdentifier());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("GetProvisionableStatusInput(super=");
        sb.append(super.toString());
        sb.append(", , , legacyIdentifier=");
        sb.append(String.valueOf(this.legacyIdentifier));
        sb.append(", authMaterialIdentifier=");
        sb.append(String.valueOf(this.authMaterialIdentifier));
        sb.append(", barcodeIdentifier=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.barcodeIdentifier, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected AuthMaterialIdentifier authMaterialIdentifier;
        protected String barcodeIdentifier;
        protected LegacyIdentifier legacyIdentifier;

        public GetProvisionableStatusInput build() {
            GetProvisionableStatusInput getProvisionableStatusInput = new GetProvisionableStatusInput();
            populate(getProvisionableStatusInput);
            return getProvisionableStatusInput;
        }

        public void populate(GetProvisionableStatusInput getProvisionableStatusInput) {
            super.populate((AuthenticatedInput) getProvisionableStatusInput);
            getProvisionableStatusInput.setLegacyIdentifier(this.legacyIdentifier);
            getProvisionableStatusInput.setAuthMaterialIdentifier(this.authMaterialIdentifier);
            getProvisionableStatusInput.setBarcodeIdentifier(this.barcodeIdentifier);
        }

        public Builder withAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
            this.authMaterialIdentifier = authMaterialIdentifier;
            return this;
        }

        public Builder withBarcodeIdentifier(String str) {
            this.barcodeIdentifier = str;
            return this;
        }

        public Builder withLegacyIdentifier(LegacyIdentifier legacyIdentifier) {
            this.legacyIdentifier = legacyIdentifier;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
