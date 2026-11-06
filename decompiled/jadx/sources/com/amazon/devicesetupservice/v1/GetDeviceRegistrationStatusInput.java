package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("GetDeviceRegistrationStatusInput")
@Documentation("The input can contain only one of the device identifier types.\n        If you provide more than one then we will just fail.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetDeviceRegistrationStatusInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetDeviceRegistrationStatusInput");
    private String accessToken;
    private AuthMaterialIdentifier authMaterialIdentifier;
    private String barcodeIdentifier;
    private LegacyIdentifier legacyIdentifier;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected AuthMaterialIdentifier authMaterialIdentifier;
        protected String barcodeIdentifier;
        protected LegacyIdentifier legacyIdentifier;

        public GetDeviceRegistrationStatusInput build() {
            GetDeviceRegistrationStatusInput getDeviceRegistrationStatusInput = new GetDeviceRegistrationStatusInput();
            populate(getDeviceRegistrationStatusInput);
            return getDeviceRegistrationStatusInput;
        }

        public void populate(GetDeviceRegistrationStatusInput getDeviceRegistrationStatusInput) {
            getDeviceRegistrationStatusInput.setLegacyIdentifier(this.legacyIdentifier);
            getDeviceRegistrationStatusInput.setAuthMaterialIdentifier(this.authMaterialIdentifier);
            getDeviceRegistrationStatusInput.setBarcodeIdentifier(this.barcodeIdentifier);
            getDeviceRegistrationStatusInput.setAccessToken(this.accessToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
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
        if (!(obj instanceof GetDeviceRegistrationStatusInput)) {
            return false;
        }
        GetDeviceRegistrationStatusInput getDeviceRegistrationStatusInput = (GetDeviceRegistrationStatusInput) obj;
        return Objects.equals(getLegacyIdentifier(), getDeviceRegistrationStatusInput.getLegacyIdentifier()) && Objects.equals(getAuthMaterialIdentifier(), getDeviceRegistrationStatusInput.getAuthMaterialIdentifier()) && Objects.equals(getBarcodeIdentifier(), getDeviceRegistrationStatusInput.getBarcodeIdentifier()) && Objects.equals(getAccessToken(), getDeviceRegistrationStatusInput.getAccessToken());
    }

    @HttpHeader("x-amz-access-token")
    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
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

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getLegacyIdentifier(), getAuthMaterialIdentifier(), getBarcodeIdentifier(), getAccessToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
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
        builder.withLegacyIdentifier(getLegacyIdentifier());
        builder.withAuthMaterialIdentifier(getAuthMaterialIdentifier());
        builder.withBarcodeIdentifier(getBarcodeIdentifier());
        builder.withAccessToken(getAccessToken());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetDeviceRegistrationStatusInput(legacyIdentifier=");
        sb.append(String.valueOf(this.legacyIdentifier));
        sb.append(", authMaterialIdentifier=");
        sb.append(String.valueOf(this.authMaterialIdentifier));
        sb.append(", barcodeIdentifier=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.barcodeIdentifier, ", accessToken=*** REDACTED ***)", sb);
    }
}
