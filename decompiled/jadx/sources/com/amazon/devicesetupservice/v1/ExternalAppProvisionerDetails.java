package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.ProvisionerDetails;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("ExternalAppProvisionerDetails")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ExternalAppProvisionerDetails extends ProvisionerDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ExternalAppProvisionerDetails");
    private String appName;
    private String applicationVersion;
    private String deviceModel;
    private String firmwareVersion;
    private String manufacturer;
    private String operatingSystem;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisionerDetails.Builder {
        protected String appName;
        protected String applicationVersion;
        protected String deviceModel;
        protected String firmwareVersion;
        protected String manufacturer;
        protected String operatingSystem;

        public ExternalAppProvisionerDetails build() {
            ExternalAppProvisionerDetails externalAppProvisionerDetails = new ExternalAppProvisionerDetails();
            populate(externalAppProvisionerDetails);
            return externalAppProvisionerDetails;
        }

        public void populate(ExternalAppProvisionerDetails externalAppProvisionerDetails) {
            super.populate((ProvisionerDetails) externalAppProvisionerDetails);
            externalAppProvisionerDetails.setDeviceModel(this.deviceModel);
            externalAppProvisionerDetails.setManufacturer(this.manufacturer);
            externalAppProvisionerDetails.setFirmwareVersion(this.firmwareVersion);
            externalAppProvisionerDetails.setAppName(this.appName);
            externalAppProvisionerDetails.setApplicationVersion(this.applicationVersion);
            externalAppProvisionerDetails.setOperatingSystem(this.operatingSystem);
        }

        public Builder withAppName(String str) {
            this.appName = str;
            return this;
        }

        public Builder withApplicationVersion(String str) {
            this.applicationVersion = str;
            return this;
        }

        public Builder withDeviceModel(String str) {
            this.deviceModel = str;
            return this;
        }

        public Builder withFirmwareVersion(String str) {
            this.firmwareVersion = str;
            return this;
        }

        public Builder withManufacturer(String str) {
            this.manufacturer = str;
            return this;
        }

        public Builder withOperatingSystem(String str) {
            this.operatingSystem = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.ProvisionerDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAppProvisionerDetails)) {
            return false;
        }
        ExternalAppProvisionerDetails externalAppProvisionerDetails = (ExternalAppProvisionerDetails) obj;
        return super.equals(obj) && Objects.equals(getDeviceModel(), externalAppProvisionerDetails.getDeviceModel()) && Objects.equals(getManufacturer(), externalAppProvisionerDetails.getManufacturer()) && Objects.equals(getFirmwareVersion(), externalAppProvisionerDetails.getFirmwareVersion()) && Objects.equals(getAppName(), externalAppProvisionerDetails.getAppName()) && Objects.equals(getApplicationVersion(), externalAppProvisionerDetails.getApplicationVersion()) && Objects.equals(getOperatingSystem(), externalAppProvisionerDetails.getOperatingSystem());
    }

    @MaxLength(100)
    @MinLength(1)
    public String getAppName() {
        return this.appName;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @MaxLength(512)
    @MinLength(1)
    public String getManufacturer() {
        return this.manufacturer;
    }

    @EnumValues({"Android", "iOS", "OTHER"})
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override // com.amazon.devicesetupservice.ProvisionerDetails
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDeviceModel(), getManufacturer(), getFirmwareVersion(), getAppName(), getApplicationVersion(), getOperatingSystem());
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setApplicationVersion(String str) {
        this.applicationVersion = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setOperatingSystem(String str) {
        this.operatingSystem = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceModel(getDeviceModel());
        builder.withManufacturer(getManufacturer());
        builder.withFirmwareVersion(getFirmwareVersion());
        builder.withAppName(getAppName());
        builder.withApplicationVersion(getApplicationVersion());
        builder.withOperatingSystem(getOperatingSystem());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisionerDetails
    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalAppProvisionerDetails(super=");
        sb.append(super.toString());
        sb.append(", , , , , , deviceModel=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceModel, ", manufacturer=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.manufacturer, ", firmwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.firmwareVersion, ", appName=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.appName, ", applicationVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.applicationVersion, ", operatingSystem=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.operatingSystem, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
