package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("ProvisionerInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionerInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ProvisionerInfo");
    private String application;
    private String applicationVersion;
    private String deviceModel;
    private String firmwareVersion;
    private String manufacturer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String application;
        protected String applicationVersion;
        protected String deviceModel;
        protected String firmwareVersion;
        protected String manufacturer;

        public ProvisionerInfo build() {
            ProvisionerInfo provisionerInfo = new ProvisionerInfo();
            populate(provisionerInfo);
            return provisionerInfo;
        }

        public void populate(ProvisionerInfo provisionerInfo) {
            provisionerInfo.setDeviceModel(this.deviceModel);
            provisionerInfo.setManufacturer(this.manufacturer);
            provisionerInfo.setFirmwareVersion(this.firmwareVersion);
            provisionerInfo.setApplication(this.application);
            provisionerInfo.setApplicationVersion(this.applicationVersion);
        }

        public Builder withApplication(String str) {
            this.application = str;
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
        if (!(obj instanceof ProvisionerInfo)) {
            return false;
        }
        ProvisionerInfo provisionerInfo = (ProvisionerInfo) obj;
        return Objects.equals(getDeviceModel(), provisionerInfo.getDeviceModel()) && Objects.equals(getManufacturer(), provisionerInfo.getManufacturer()) && Objects.equals(getFirmwareVersion(), provisionerInfo.getFirmwareVersion()) && Objects.equals(getApplication(), provisionerInfo.getApplication()) && Objects.equals(getApplicationVersion(), provisionerInfo.getApplicationVersion());
    }

    @MaxLength(100)
    @MinLength(1)
    public String getApplication() {
        return this.application;
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

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceModel(), getManufacturer(), getFirmwareVersion(), getApplication(), getApplicationVersion());
    }

    public void setApplication(String str) {
        this.application = str;
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

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceModel(getDeviceModel());
        builder.withManufacturer(getManufacturer());
        builder.withFirmwareVersion(getFirmwareVersion());
        builder.withApplication(getApplication());
        builder.withApplicationVersion(getApplicationVersion());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionerInfo(deviceModel=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceModel, ", manufacturer=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.manufacturer, ", firmwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.firmwareVersion, ", application=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.application, ", applicationVersion=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.applicationVersion, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
