package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpLabel;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialLockerBaseRequest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("DeleteWifiConfigurationsRequest")
@Documentation("Structure of DeleteWifiConfigurationsRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class DeleteWifiConfigurationsRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.DeleteWifiConfigurationsRequest");
    private String deviceId;
    private String deviceType;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteWifiConfigurationsRequest)) {
            return false;
        }
        DeleteWifiConfigurationsRequest deleteWifiConfigurationsRequest = (DeleteWifiConfigurationsRequest) obj;
        return super.equals(obj) && Objects.equals(getDeviceId(), deleteWifiConfigurationsRequest.getDeviceId()) && Objects.equals(getDeviceType(), deleteWifiConfigurationsRequest.getDeviceType());
    }

    @HttpLabel("deviceId")
    @MaxLength(60)
    @Sensitive
    @MinLength(1)
    @Documentation("deviceId (device identification) is a distinctive number associated with a smartphone or similar handheld device.")
    @Pattern("[a-zA-Z0-9]+")
    public String getDeviceId() {
        return this.deviceId;
    }

    @HttpLabel("deviceType")
    @MaxLength(32)
    @MinLength(1)
    @Documentation("deviceType is the type of device you are using Android, iOS or the name of the device")
    @Pattern("[a-zA-Z0-9]+")
    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceId(), getDeviceType());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withClientName(getClientName());
        builder.withClientVersion(getClientVersion());
        builder.withClientProduct(getClientProduct());
        builder.withClientModel(getClientModel());
        builder.withClientManufacturer(getClientManufacturer());
        builder.withClientOs(getClientOs());
        builder.withClientOsVersion(getClientOsVersion());
        builder.withDeviceName(getDeviceName());
        builder.withDeviceVersion(getDeviceVersion());
        builder.withDeviceManufacturer(getDeviceManufacturer());
        builder.withDeviceId(getDeviceId());
        builder.withDeviceType(getDeviceType());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteWifiConfigurationsRequest(super=");
        sb.append(super.toString());
        sb.append(", , deviceId=*** REDACTED ***, deviceType=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String deviceId;
        protected String deviceType;

        public DeleteWifiConfigurationsRequest build() {
            DeleteWifiConfigurationsRequest deleteWifiConfigurationsRequest = new DeleteWifiConfigurationsRequest();
            populate(deleteWifiConfigurationsRequest);
            return deleteWifiConfigurationsRequest;
        }

        public void populate(DeleteWifiConfigurationsRequest deleteWifiConfigurationsRequest) {
            super.populate((CredentialLockerBaseRequest) deleteWifiConfigurationsRequest);
            deleteWifiConfigurationsRequest.setDeviceId(this.deviceId);
            deleteWifiConfigurationsRequest.setDeviceType(this.deviceType);
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientManufacturer(String str) {
            super.withClientManufacturer(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientModel(String str) {
            super.withClientModel(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientName(String str) {
            super.withClientName(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientOs(String str) {
            super.withClientOs(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientOsVersion(String str) {
            super.withClientOsVersion(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientProduct(String str) {
            super.withClientProduct(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withClientVersion(String str) {
            super.withClientVersion(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceManufacturer(String str) {
            super.withDeviceManufacturer(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceName(String str) {
            super.withDeviceName(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest.Builder
        public Builder withDeviceVersion(String str) {
            super.withDeviceVersion(str);
            return this;
        }
    }
}
