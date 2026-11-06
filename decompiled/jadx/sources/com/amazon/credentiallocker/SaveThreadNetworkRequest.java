package com.amazon.credentiallocker;

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
import com.amazon.credentiallocker.CredentialLockerBaseRequest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("SaveThreadNetworkRequest")
@Documentation("Structure of SaveThreadNetworkRequest")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class SaveThreadNetworkRequest extends CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.SaveThreadNetworkRequest");
    private String deviceType;
    private ThreadNetwork threadNetwork;

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
        if (!(obj instanceof SaveThreadNetworkRequest)) {
            return false;
        }
        SaveThreadNetworkRequest saveThreadNetworkRequest = (SaveThreadNetworkRequest) obj;
        return super.equals(obj) && Objects.equals(getDeviceType(), saveThreadNetworkRequest.getDeviceType()) && Objects.equals(getThreadNetwork(), saveThreadNetworkRequest.getThreadNetwork());
    }

    @MaxLength(32)
    @MinLength(1)
    @Documentation("deviceType is the type of device you are using Android, iOS or the name of the device")
    @Pattern("[a-zA-Z0-9]+")
    public String getDeviceType() {
        return this.deviceType;
    }

    @Required
    @Documentation("Thread network structure containing credentials and other operational parameters\n        networkName - Name of the Thread network. A utf8 string with a maximum length of 16 bytes\n        extendedPanId - 8 bytes represented as a hex string\n        networkKey - 16 bytes represented as a hex string\n        pskc - Hashed commissioner credential 16 bytes represented as a hex string\n        commissionerCredential - Human readable commissioner credential utf8 encoded, 6-255 bytes inclusive\n        meshLocalPrefix - ipv6 network address\n        panId - 2 bytes represented as hex string\n        channelPage - 0 for 802.15.4, other values reserved for future PHY layers\n        channelNumber - Current channel number (11-26 for 802.15.4)\n        channelMask - Bitmask representing allowable channels for the network. Channel 0 is lsb\n        party - 1P (Amazon), 2P (EERO), or 3P owned network")
    public ThreadNetwork getThreadNetwork() {
        return this.threadNetwork;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceType(), getThreadNetwork());
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setThreadNetwork(ThreadNetwork threadNetwork) {
        this.threadNetwork = threadNetwork;
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
        builder.withDeviceType(getDeviceType());
        builder.withThreadNetwork(getThreadNetwork());
        return builder;
    }

    @Override // com.amazon.credentiallocker.CredentialLockerBaseRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("SaveThreadNetworkRequest(super=");
        sb.append(super.toString());
        sb.append(", , deviceType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceType, ", threadNetwork=", sb);
        sb.append(String.valueOf(this.threadNetwork));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends CredentialLockerBaseRequest.Builder {
        protected String deviceType;
        protected ThreadNetwork threadNetwork;

        public SaveThreadNetworkRequest build() {
            SaveThreadNetworkRequest saveThreadNetworkRequest = new SaveThreadNetworkRequest();
            populate(saveThreadNetworkRequest);
            return saveThreadNetworkRequest;
        }

        public void populate(SaveThreadNetworkRequest saveThreadNetworkRequest) {
            super.populate((CredentialLockerBaseRequest) saveThreadNetworkRequest);
            saveThreadNetworkRequest.setDeviceType(this.deviceType);
            saveThreadNetworkRequest.setThreadNetwork(this.threadNetwork);
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder withThreadNetwork(ThreadNetwork threadNetwork) {
            this.threadNetwork = threadNetwork;
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
