package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ScapProvisionerDetails")
@Documentation("Provisioner details.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ScapProvisionerDetails extends ProvisionerDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ScapProvisionerDetails");
    private String countryCode;
    private String firmwareVersion;
    private String languageLocale;
    private String softwareVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisionerDetails.Builder {
        protected String countryCode;
        protected String firmwareVersion;
        protected String languageLocale;
        protected String softwareVersion;

        public ScapProvisionerDetails build() {
            ScapProvisionerDetails scapProvisionerDetails = new ScapProvisionerDetails();
            populate(scapProvisionerDetails);
            return scapProvisionerDetails;
        }

        public void populate(ScapProvisionerDetails scapProvisionerDetails) {
            super.populate((ProvisionerDetails) scapProvisionerDetails);
            scapProvisionerDetails.setCountryCode(this.countryCode);
            scapProvisionerDetails.setLanguageLocale(this.languageLocale);
            scapProvisionerDetails.setFirmwareVersion(this.firmwareVersion);
            scapProvisionerDetails.setSoftwareVersion(this.softwareVersion);
        }

        public Builder withCountryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public Builder withFirmwareVersion(String str) {
            this.firmwareVersion = str;
            return this;
        }

        public Builder withLanguageLocale(String str) {
            this.languageLocale = str;
            return this;
        }

        public Builder withSoftwareVersion(String str) {
            this.softwareVersion = str;
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
        if (!(obj instanceof ScapProvisionerDetails)) {
            return false;
        }
        ScapProvisionerDetails scapProvisionerDetails = (ScapProvisionerDetails) obj;
        return super.equals(obj) && Objects.equals(getCountryCode(), scapProvisionerDetails.getCountryCode()) && Objects.equals(getLanguageLocale(), scapProvisionerDetails.getLanguageLocale()) && Objects.equals(getFirmwareVersion(), scapProvisionerDetails.getFirmwareVersion()) && Objects.equals(getSoftwareVersion(), scapProvisionerDetails.getSoftwareVersion());
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @MaxLength(100)
    @MinLength(1)
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getLanguageLocale() {
        return this.languageLocale;
    }

    @MaxLength(100)
    @MinLength(2)
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Override // com.amazon.devicesetupservice.ProvisionerDetails
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getCountryCode(), getLanguageLocale(), getFirmwareVersion(), getSoftwareVersion());
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setLanguageLocale(String str) {
        this.languageLocale = str;
    }

    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCountryCode(getCountryCode());
        builder.withLanguageLocale(getLanguageLocale());
        builder.withFirmwareVersion(getFirmwareVersion());
        builder.withSoftwareVersion(getSoftwareVersion());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisionerDetails
    public String toString() {
        StringBuilder sb = new StringBuilder("ScapProvisionerDetails(super=");
        sb.append(super.toString());
        sb.append(", , , , countryCode=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.countryCode, ", languageLocale=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.languageLocale, ", firmwareVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.firmwareVersion, ", softwareVersion=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.softwareVersion, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
