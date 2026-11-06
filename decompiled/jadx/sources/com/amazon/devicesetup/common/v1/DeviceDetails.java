package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("DeviceDetails")
@Documentation("Device identifiers.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DeviceDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.DeviceDetails");
    private String authMaterialIndex;
    private String deviceModel;
    private String deviceName;
    private String deviceSerial;
    private String firmwareVersion;
    private String hardwareVersion;
    private String manufacturer;
    private String productIndex;
    private String sdkVersion;
    private String softwareVersionIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String authMaterialIndex;
        protected String deviceModel;
        protected String deviceName;
        protected String deviceSerial;
        protected String firmwareVersion;
        protected String hardwareVersion;
        protected String manufacturer;
        protected String productIndex;
        protected String sdkVersion;
        protected String softwareVersionIndex;

        public DeviceDetails build() {
            DeviceDetails deviceDetails = new DeviceDetails();
            populate(deviceDetails);
            return deviceDetails;
        }

        public void populate(DeviceDetails deviceDetails) {
            deviceDetails.setManufacturer(this.manufacturer);
            deviceDetails.setDeviceName(this.deviceName);
            deviceDetails.setDeviceModel(this.deviceModel);
            deviceDetails.setDeviceSerial(this.deviceSerial);
            deviceDetails.setProductIndex(this.productIndex);
            deviceDetails.setAuthMaterialIndex(this.authMaterialIndex);
            deviceDetails.setSoftwareVersionIndex(this.softwareVersionIndex);
            deviceDetails.setFirmwareVersion(this.firmwareVersion);
            deviceDetails.setHardwareVersion(this.hardwareVersion);
            deviceDetails.setSdkVersion(this.sdkVersion);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withDeviceModel(String str) {
            this.deviceModel = str;
            return this;
        }

        public Builder withDeviceName(String str) {
            this.deviceName = str;
            return this;
        }

        public Builder withDeviceSerial(String str) {
            this.deviceSerial = str;
            return this;
        }

        public Builder withFirmwareVersion(String str) {
            this.firmwareVersion = str;
            return this;
        }

        public Builder withHardwareVersion(String str) {
            this.hardwareVersion = str;
            return this;
        }

        public Builder withManufacturer(String str) {
            this.manufacturer = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withSdkVersion(String str) {
            this.sdkVersion = str;
            return this;
        }

        public Builder withSoftwareVersionIndex(String str) {
            this.softwareVersionIndex = str;
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
        if (!(obj instanceof DeviceDetails)) {
            return false;
        }
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        return Objects.equals(getManufacturer(), deviceDetails.getManufacturer()) && Objects.equals(getDeviceName(), deviceDetails.getDeviceName()) && Objects.equals(getDeviceModel(), deviceDetails.getDeviceModel()) && Objects.equals(getDeviceSerial(), deviceDetails.getDeviceSerial()) && Objects.equals(getProductIndex(), deviceDetails.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), deviceDetails.getAuthMaterialIndex()) && Objects.equals(getSoftwareVersionIndex(), deviceDetails.getSoftwareVersionIndex()) && Objects.equals(getFirmwareVersion(), deviceDetails.getFirmwareVersion()) && Objects.equals(getHardwareVersion(), deviceDetails.getHardwareVersion()) && Objects.equals(getSdkVersion(), deviceDetails.getSdkVersion());
    }

    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @MaxLength(100)
    @MinLength(0)
    public String getDeviceName() {
        return this.deviceName;
    }

    @MaxLength(100)
    @MinLength(1)
    @Sensitive
    public String getDeviceSerial() {
        return this.deviceSerial;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @MaxLength(512)
    @MinLength(1)
    public String getManufacturer() {
        return this.manufacturer;
    }

    @MaxLength(4)
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @MaxLength(100)
    @MinLength(0)
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @MaxLength(100)
    @MinLength(2)
    public String getSoftwareVersionIndex() {
        return this.softwareVersionIndex;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getManufacturer(), getDeviceName(), getDeviceModel(), getDeviceSerial(), getProductIndex(), getAuthMaterialIndex(), getSoftwareVersionIndex(), getFirmwareVersion(), getHardwareVersion(), getSdkVersion());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSerial(String str) {
        this.deviceSerial = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setSoftwareVersionIndex(String str) {
        this.softwareVersionIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withManufacturer(getManufacturer());
        builder.withDeviceName(getDeviceName());
        builder.withDeviceModel(getDeviceModel());
        builder.withDeviceSerial(getDeviceSerial());
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withSoftwareVersionIndex(getSoftwareVersionIndex());
        builder.withFirmwareVersion(getFirmwareVersion());
        builder.withHardwareVersion(getHardwareVersion());
        builder.withSdkVersion(getSdkVersion());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceDetails(manufacturer=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.manufacturer, ", deviceName=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceName, ", deviceModel=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceModel, ", deviceSerial=*** REDACTED ***, productIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", softwareVersionIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.softwareVersionIndex, ", firmwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.firmwareVersion, ", hardwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.hardwareVersion, ", sdkVersion=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sdkVersion, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
