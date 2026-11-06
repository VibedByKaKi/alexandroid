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
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetMatchingNetworksRequest")
@Documentation("Structure of GetMatchingNetworksRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetMatchingNetworksRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetMatchingNetworksRequest");
    private String deviceId;
    private String deviceType;
    private List<NetworkScanResult> networkScanList;

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
        if (!(obj instanceof GetMatchingNetworksRequest)) {
            return false;
        }
        GetMatchingNetworksRequest getMatchingNetworksRequest = (GetMatchingNetworksRequest) obj;
        return super.equals(obj) && Objects.equals(getNetworkScanList(), getMatchingNetworksRequest.getNetworkScanList()) && Objects.equals(getDeviceId(), getMatchingNetworksRequest.getDeviceId()) && Objects.equals(getDeviceType(), getMatchingNetworksRequest.getDeviceType());
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

    @MaxLength(1024)
    @MinLength(0)
    @Required
    public List<NetworkScanResult> getNetworkScanList() {
        return this.networkScanList;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNetworkScanList(), getDeviceId(), getDeviceType());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setNetworkScanList(List<NetworkScanResult> list) {
        this.networkScanList = list;
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
        builder.withNetworkScanList(getNetworkScanList());
        builder.withDeviceId(getDeviceId());
        builder.withDeviceType(getDeviceType());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("GetMatchingNetworksRequest(super=");
        sb.append(super.toString());
        sb.append(", , , networkScanList=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", deviceId=*** REDACTED ***, deviceType=", (List) this.networkScanList, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String deviceId;
        protected String deviceType;
        protected List<NetworkScanResult> networkScanList;

        public GetMatchingNetworksRequest build() {
            GetMatchingNetworksRequest getMatchingNetworksRequest = new GetMatchingNetworksRequest();
            populate(getMatchingNetworksRequest);
            return getMatchingNetworksRequest;
        }

        public void populate(GetMatchingNetworksRequest getMatchingNetworksRequest) {
            super.populate((CredentialLockerBaseRequest) getMatchingNetworksRequest);
            getMatchingNetworksRequest.setNetworkScanList(this.networkScanList);
            getMatchingNetworksRequest.setDeviceId(this.deviceId);
            getMatchingNetworksRequest.setDeviceType(this.deviceType);
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder withNetworkScanList(List<NetworkScanResult> list) {
            this.networkScanList = list;
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
