package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.DeviceAssociationMethod;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetProvisioneeDataFromFfsSessionTokenOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetProvisioneeDataFromFfsSessionTokenOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetProvisioneeDataFromFfsSessionTokenOutput");
    private String accessToken;
    private String authMaterialIndex;
    private String customerId;
    private String deviceAssociationMethod;
    private String deviceSerial;
    private String productIndex;
    private String publicKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected String authMaterialIndex;
        protected String customerId;
        protected String deviceAssociationMethod;
        protected String deviceSerial;
        protected String productIndex;
        protected String publicKey;

        public GetProvisioneeDataFromFfsSessionTokenOutput build() {
            GetProvisioneeDataFromFfsSessionTokenOutput getProvisioneeDataFromFfsSessionTokenOutput = new GetProvisioneeDataFromFfsSessionTokenOutput();
            populate(getProvisioneeDataFromFfsSessionTokenOutput);
            return getProvisioneeDataFromFfsSessionTokenOutput;
        }

        public void populate(GetProvisioneeDataFromFfsSessionTokenOutput getProvisioneeDataFromFfsSessionTokenOutput) {
            getProvisioneeDataFromFfsSessionTokenOutput.setCustomerId(this.customerId);
            getProvisioneeDataFromFfsSessionTokenOutput.setPublicKey(this.publicKey);
            getProvisioneeDataFromFfsSessionTokenOutput.setProductIndex(this.productIndex);
            getProvisioneeDataFromFfsSessionTokenOutput.setAuthMaterialIndex(this.authMaterialIndex);
            getProvisioneeDataFromFfsSessionTokenOutput.setDeviceAssociationMethod(this.deviceAssociationMethod);
            getProvisioneeDataFromFfsSessionTokenOutput.setAccessToken(this.accessToken);
            getProvisioneeDataFromFfsSessionTokenOutput.setDeviceSerial(this.deviceSerial);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withDeviceAssociationMethod(String str) {
            this.deviceAssociationMethod = str;
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
        if (!(obj instanceof GetProvisioneeDataFromFfsSessionTokenOutput)) {
            return false;
        }
        GetProvisioneeDataFromFfsSessionTokenOutput getProvisioneeDataFromFfsSessionTokenOutput = (GetProvisioneeDataFromFfsSessionTokenOutput) obj;
        return Objects.equals(getCustomerId(), getProvisioneeDataFromFfsSessionTokenOutput.getCustomerId()) && Objects.equals(getPublicKey(), getProvisioneeDataFromFfsSessionTokenOutput.getPublicKey()) && Objects.equals(getProductIndex(), getProvisioneeDataFromFfsSessionTokenOutput.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), getProvisioneeDataFromFfsSessionTokenOutput.getAuthMaterialIndex()) && Objects.equals(getDeviceAssociationMethod(), getProvisioneeDataFromFfsSessionTokenOutput.getDeviceAssociationMethod()) && Objects.equals(getAccessToken(), getProvisioneeDataFromFfsSessionTokenOutput.getAccessToken()) && Objects.equals(getDeviceSerial(), getProvisioneeDataFromFfsSessionTokenOutput.getDeviceSerial());
    }

    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    @EnumValues({DeviceAssociationMethod.INNER_BARCODE, DeviceAssociationMethod.OUTER_BARCODE, DeviceAssociationMethod.CASTING, DeviceAssociationMethod.LIGHT_TOUCH_SETUP})
    public String getDeviceAssociationMethod() {
        return this.deviceAssociationMethod;
    }

    @MaxLength(100)
    @MinLength(1)
    @Sensitive
    public String getDeviceSerial() {
        return this.deviceSerial;
    }

    @MaxLength(4)
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @MaxLength(4096)
    @MinLength(1)
    public String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId(), getPublicKey(), getProductIndex(), getAuthMaterialIndex(), getDeviceAssociationMethod(), getAccessToken(), getDeviceSerial());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDeviceAssociationMethod(String str) {
        this.deviceAssociationMethod = str;
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
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withDeviceAssociationMethod(getDeviceAssociationMethod());
        builder.withAccessToken(getAccessToken());
        builder.withDeviceSerial(getDeviceSerial());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetProvisioneeDataFromFfsSessionTokenOutput(customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", publicKey=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.publicKey, ", productIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", deviceAssociationMethod=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceAssociationMethod, ", accessToken=*** REDACTED ***, deviceSerial=*** REDACTED ***)", sb);
    }
}
