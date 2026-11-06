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
@XmlName("GetNewWifiConfigurationRequest")
@Documentation("Structure of GetNewWifiConfigurationRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetNewWifiConfigurationRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetNewWifiConfigurationRequest");
    private String deviceId;
    private String deviceType;
    private WifiNetworkInfo oldWifiNetworkInfo;
    private boolean utf8Supported;

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
        if (!(obj instanceof GetNewWifiConfigurationRequest)) {
            return false;
        }
        GetNewWifiConfigurationRequest getNewWifiConfigurationRequest = (GetNewWifiConfigurationRequest) obj;
        return super.equals(obj) && Objects.equals(getDeviceId(), getNewWifiConfigurationRequest.getDeviceId()) && Objects.equals(getDeviceType(), getNewWifiConfigurationRequest.getDeviceType()) && Boolean.valueOf(isUtf8Supported()).equals(Boolean.valueOf(getNewWifiConfigurationRequest.isUtf8Supported())) && Objects.equals(getOldWifiNetworkInfo(), getNewWifiConfigurationRequest.getOldWifiNetworkInfo());
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
    @Documentation("This represents a wifi network which extends from WifiNetworkExtended and has properties such as\n        lastUpdatedDateUtcMillis - last updated date in UTC milliseconds")
    public WifiNetworkInfo getOldWifiNetworkInfo() {
        return this.oldWifiNetworkInfo;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceId(), getDeviceType(), Boolean.valueOf(isUtf8Supported()), getOldWifiNetworkInfo());
    }

    public boolean isUtf8Supported() {
        return this.utf8Supported;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setOldWifiNetworkInfo(WifiNetworkInfo wifiNetworkInfo) {
        this.oldWifiNetworkInfo = wifiNetworkInfo;
    }

    public void setUtf8Supported(boolean z) {
        this.utf8Supported = z;
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
        builder.withUtf8Supported(isUtf8Supported());
        builder.withOldWifiNetworkInfo(getOldWifiNetworkInfo());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("GetNewWifiConfigurationRequest(super=");
        sb.append(super.toString());
        sb.append(", , , , deviceId=*** REDACTED ***, deviceType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceType, ", utf8Supported=", sb);
        sb.append(String.valueOf(this.utf8Supported));
        sb.append(", oldWifiNetworkInfo=");
        sb.append(String.valueOf(this.oldWifiNetworkInfo));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String deviceId;
        protected String deviceType;
        protected WifiNetworkInfo oldWifiNetworkInfo;
        protected boolean utf8Supported;

        public GetNewWifiConfigurationRequest build() {
            GetNewWifiConfigurationRequest getNewWifiConfigurationRequest = new GetNewWifiConfigurationRequest();
            populate(getNewWifiConfigurationRequest);
            return getNewWifiConfigurationRequest;
        }

        public void populate(GetNewWifiConfigurationRequest getNewWifiConfigurationRequest) {
            super.populate((CredentialLockerBaseRequest) getNewWifiConfigurationRequest);
            getNewWifiConfigurationRequest.setDeviceId(this.deviceId);
            getNewWifiConfigurationRequest.setDeviceType(this.deviceType);
            getNewWifiConfigurationRequest.setUtf8Supported(this.utf8Supported);
            getNewWifiConfigurationRequest.setOldWifiNetworkInfo(this.oldWifiNetworkInfo);
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder withOldWifiNetworkInfo(WifiNetworkInfo wifiNetworkInfo) {
            this.oldWifiNetworkInfo = wifiNetworkInfo;
            return this;
        }

        public Builder withUtf8Supported(boolean z) {
            this.utf8Supported = z;
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
