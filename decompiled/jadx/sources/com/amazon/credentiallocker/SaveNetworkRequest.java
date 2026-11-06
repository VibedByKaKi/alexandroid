package com.amazon.credentiallocker;

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
import com.amazon.credentiallocker.CredentialLockerBaseRequest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("SaveNetworkRequest")
@Documentation("Structure of SaveNetworkRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class SaveNetworkRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.SaveNetworkRequest");
    private String deviceId;
    private String deviceType;
    private Network network;

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
        if (!(obj instanceof SaveNetworkRequest)) {
            return false;
        }
        SaveNetworkRequest saveNetworkRequest = (SaveNetworkRequest) obj;
        return super.equals(obj) && Objects.equals(getDeviceId(), saveNetworkRequest.getDeviceId()) && Objects.equals(getDeviceType(), saveNetworkRequest.getDeviceType()) && Objects.equals(getNetwork(), saveNetworkRequest.getNetwork());
    }

    @MaxLength(60)
    @Sensitive
    @MinLength(1)
    @Documentation("deviceId (device identification) is a distinctive number associated with a smartphone or similar handheld device.")
    @Pattern("[a-zA-Z0-9]+")
    public String getDeviceId() {
        return this.deviceId;
    }

    @MaxLength(32)
    @MinLength(1)
    @Documentation("deviceType is the type of device you are using Android, iOS or the name of the device")
    @Pattern("[a-zA-Z0-9]+")
    public String getDeviceType() {
        return this.deviceType;
    }

    @Required
    @Documentation("Network represents an individual Wifi or Thread network credential.\n        Support for Wifi networks will be added in a future release.")
    public Network getNetwork() {
        return this.network;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceId(), getDeviceType(), getNetwork());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setNetwork(Network network) {
        this.network = network;
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
        builder.withNetwork(getNetwork());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("SaveNetworkRequest(super=");
        sb.append(super.toString());
        sb.append(", , , deviceId=*** REDACTED ***, deviceType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceType, ", network=", sb);
        sb.append(String.valueOf(this.network));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String deviceId;
        protected String deviceType;
        protected Network network;

        public SaveNetworkRequest build() {
            SaveNetworkRequest saveNetworkRequest = new SaveNetworkRequest();
            populate(saveNetworkRequest);
            return saveNetworkRequest;
        }

        public void populate(SaveNetworkRequest saveNetworkRequest) {
            super.populate((CredentialLockerBaseRequest) saveNetworkRequest);
            saveNetworkRequest.setDeviceId(this.deviceId);
            saveNetworkRequest.setDeviceType(this.deviceType);
            saveNetworkRequest.setNetwork(this.network);
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder withNetwork(Network network) {
            this.network = network;
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
