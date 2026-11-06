package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
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
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("ProvisionableInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionableInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ProvisionableInfo");
    private String deviceModel;
    private String deviceName;
    private String deviceSerial;
    private String firmwareVersion;
    private String hardwareVersion;
    private String manufacturer;
    private String sdkVersion;
    private String softwareVersionIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String deviceModel;
        protected String deviceName;
        protected String deviceSerial;
        protected String firmwareVersion;
        protected String hardwareVersion;
        protected String manufacturer;
        protected String sdkVersion;
        protected String softwareVersionIndex;

        public ProvisionableInfo build() {
            ProvisionableInfo provisionableInfo = new ProvisionableInfo();
            populate(provisionableInfo);
            return provisionableInfo;
        }

        public void populate(ProvisionableInfo provisionableInfo) {
            provisionableInfo.setDeviceName(this.deviceName);
            provisionableInfo.setSoftwareVersionIndex(this.softwareVersionIndex);
            provisionableInfo.setDeviceModel(this.deviceModel);
            provisionableInfo.setDeviceSerial(this.deviceSerial);
            provisionableInfo.setManufacturer(this.manufacturer);
            provisionableInfo.setFirmwareVersion(this.firmwareVersion);
            provisionableInfo.setHardwareVersion(this.hardwareVersion);
            provisionableInfo.setSdkVersion(this.sdkVersion);
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
        if (!(obj instanceof ProvisionableInfo)) {
            return false;
        }
        ProvisionableInfo provisionableInfo = (ProvisionableInfo) obj;
        return Objects.equals(getDeviceName(), provisionableInfo.getDeviceName()) && Objects.equals(getSoftwareVersionIndex(), provisionableInfo.getSoftwareVersionIndex()) && Objects.equals(getDeviceModel(), provisionableInfo.getDeviceModel()) && Objects.equals(getDeviceSerial(), provisionableInfo.getDeviceSerial()) && Objects.equals(getManufacturer(), provisionableInfo.getManufacturer()) && Objects.equals(getFirmwareVersion(), provisionableInfo.getFirmwareVersion()) && Objects.equals(getHardwareVersion(), provisionableInfo.getHardwareVersion()) && Objects.equals(getSdkVersion(), provisionableInfo.getSdkVersion());
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceName(), getSoftwareVersionIndex(), getDeviceModel(), getDeviceSerial(), getManufacturer(), getFirmwareVersion(), getHardwareVersion(), getSdkVersion());
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

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setSoftwareVersionIndex(String str) {
        this.softwareVersionIndex = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceName(getDeviceName());
        builder.withSoftwareVersionIndex(getSoftwareVersionIndex());
        builder.withDeviceModel(getDeviceModel());
        builder.withDeviceSerial(getDeviceSerial());
        builder.withManufacturer(getManufacturer());
        builder.withFirmwareVersion(getFirmwareVersion());
        builder.withHardwareVersion(getHardwareVersion());
        builder.withSdkVersion(getSdkVersion());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionableInfo(deviceName=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceName, ", softwareVersionIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.softwareVersionIndex, ", deviceModel=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceModel, ", deviceSerial=*** REDACTED ***, manufacturer=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.manufacturer, ", firmwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.firmwareVersion, ", hardwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.hardwareVersion, ", sdkVersion=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sdkVersion, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
