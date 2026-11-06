package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.WifiScanData;
import com.amazon.devicesetupservice.ProvisioneeIdentifier;
import com.amazon.devicesetupservice.reporting.ProvisioningMethod;
import com.amazon.devicesetupservice.reporting.State;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("ProvisioneeSetupInformation")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisioneeSetupInformation {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ProvisioneeSetupInformation");
    private AuthMaterialIdentifier authMaterialIdentifier;
    private String errorCode;
    private String lastUpdatedTime;
    private ProvisioneeIdentifier provisioneeIdentifier;
    private LegacyIdentifier provisionerInformation;
    private String provisioningMethod;
    private String provisioningState;
    private String provisioningStatus;
    private WifiScanData wifiNetworkInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected AuthMaterialIdentifier authMaterialIdentifier;
        protected String errorCode;
        protected String lastUpdatedTime;
        protected ProvisioneeIdentifier provisioneeIdentifier;
        protected LegacyIdentifier provisionerInformation;
        protected String provisioningMethod;
        protected String provisioningState;
        protected String provisioningStatus;
        protected WifiScanData wifiNetworkInfo;

        public ProvisioneeSetupInformation build() {
            ProvisioneeSetupInformation provisioneeSetupInformation = new ProvisioneeSetupInformation();
            populate(provisioneeSetupInformation);
            return provisioneeSetupInformation;
        }

        public void populate(ProvisioneeSetupInformation provisioneeSetupInformation) {
            provisioneeSetupInformation.setProvisioneeIdentifier(this.provisioneeIdentifier);
            provisioneeSetupInformation.setAuthMaterialIdentifier(this.authMaterialIdentifier);
            provisioneeSetupInformation.setProvisioningMethod(this.provisioningMethod);
            provisioneeSetupInformation.setProvisioningState(this.provisioningState);
            provisioneeSetupInformation.setProvisioningStatus(this.provisioningStatus);
            provisioneeSetupInformation.setLastUpdatedTime(this.lastUpdatedTime);
            provisioneeSetupInformation.setProvisionerInformation(this.provisionerInformation);
            provisioneeSetupInformation.setWifiNetworkInfo(this.wifiNetworkInfo);
            provisioneeSetupInformation.setErrorCode(this.errorCode);
        }

        public Builder withAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
            this.authMaterialIdentifier = authMaterialIdentifier;
            return this;
        }

        public Builder withErrorCode(String str) {
            this.errorCode = str;
            return this;
        }

        public Builder withLastUpdatedTime(String str) {
            this.lastUpdatedTime = str;
            return this;
        }

        public Builder withProvisioneeIdentifier(ProvisioneeIdentifier provisioneeIdentifier) {
            this.provisioneeIdentifier = provisioneeIdentifier;
            return this;
        }

        public Builder withProvisionerInformation(LegacyIdentifier legacyIdentifier) {
            this.provisionerInformation = legacyIdentifier;
            return this;
        }

        public Builder withProvisioningMethod(String str) {
            this.provisioningMethod = str;
            return this;
        }

        public Builder withProvisioningState(String str) {
            this.provisioningState = str;
            return this;
        }

        public Builder withProvisioningStatus(String str) {
            this.provisioningStatus = str;
            return this;
        }

        public Builder withWifiNetworkInfo(WifiScanData wifiScanData) {
            this.wifiNetworkInfo = wifiScanData;
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
        if (!(obj instanceof ProvisioneeSetupInformation)) {
            return false;
        }
        ProvisioneeSetupInformation provisioneeSetupInformation = (ProvisioneeSetupInformation) obj;
        return Objects.equals(getProvisioneeIdentifier(), provisioneeSetupInformation.getProvisioneeIdentifier()) && Objects.equals(getAuthMaterialIdentifier(), provisioneeSetupInformation.getAuthMaterialIdentifier()) && Objects.equals(getProvisioningMethod(), provisioneeSetupInformation.getProvisioningMethod()) && Objects.equals(getProvisioningState(), provisioneeSetupInformation.getProvisioningState()) && Objects.equals(getProvisioningStatus(), provisioneeSetupInformation.getProvisioningStatus()) && Objects.equals(getLastUpdatedTime(), provisioneeSetupInformation.getLastUpdatedTime()) && Objects.equals(getProvisionerInformation(), provisioneeSetupInformation.getProvisionerInformation()) && Objects.equals(getWifiNetworkInfo(), provisioneeSetupInformation.getWifiNetworkInfo()) && Objects.equals(getErrorCode(), provisioneeSetupInformation.getErrorCode());
    }

    @Required
    public AuthMaterialIdentifier getAuthMaterialIdentifier() {
        return this.authMaterialIdentifier;
    }

    @MaxLength(50)
    @MinLength(7)
    public String getErrorCode() {
        return this.errorCode;
    }

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    @Documentation("This is the base structure for identifying a provisionee during a setup progress status check.")
    public ProvisioneeIdentifier getProvisioneeIdentifier() {
        return this.provisioneeIdentifier;
    }

    public LegacyIdentifier getProvisionerInformation() {
        return this.provisionerInformation;
    }

    @EnumValues({ProvisioningMethod.FFS, "MANUAL", ProvisioningMethod.WIFI_FFS, ProvisioningMethod.SH_PHILIPS, "MATTER"})
    public String getProvisioningMethod() {
        return this.provisioningMethod;
    }

    @EnumValues({"DISCOVERED", "CONNECTED", State.SECURE_CHANNEL_ESTABLISHED, State.RETRIEVED_PROVISIONING_DETAILS, State.PROVISIONED, State.NETWORKED, "REGISTERED", "DONE", State.PROVISIONER_COMPLETE, "REGISTRATION_COMPLETE", "TOKEN_REDEEMED", State.STARTED_AUTHENTICATION, State.FINALIZED_AUTHENTICATION, State.GET_CREDENTIALS, State.SAVED_NETWORK, State.EXPIRED})
    public String getProvisioningState() {
        return this.provisioningState;
    }

    @EnumValues({"SUCCESS", "FAILURE"})
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    @Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
    public WifiScanData getWifiNetworkInfo() {
        return this.wifiNetworkInfo;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProvisioneeIdentifier(), getAuthMaterialIdentifier(), getProvisioningMethod(), getProvisioningState(), getProvisioningStatus(), getLastUpdatedTime(), getProvisionerInformation(), getWifiNetworkInfo(), getErrorCode());
    }

    public void setAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
        this.authMaterialIdentifier = authMaterialIdentifier;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setLastUpdatedTime(String str) {
        this.lastUpdatedTime = str;
    }

    public void setProvisioneeIdentifier(ProvisioneeIdentifier provisioneeIdentifier) {
        this.provisioneeIdentifier = provisioneeIdentifier;
    }

    public void setProvisionerInformation(LegacyIdentifier legacyIdentifier) {
        this.provisionerInformation = legacyIdentifier;
    }

    public void setProvisioningMethod(String str) {
        this.provisioningMethod = str;
    }

    public void setProvisioningState(String str) {
        this.provisioningState = str;
    }

    public void setProvisioningStatus(String str) {
        this.provisioningStatus = str;
    }

    public void setWifiNetworkInfo(WifiScanData wifiScanData) {
        this.wifiNetworkInfo = wifiScanData;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProvisioneeIdentifier(getProvisioneeIdentifier());
        builder.withAuthMaterialIdentifier(getAuthMaterialIdentifier());
        builder.withProvisioningMethod(getProvisioningMethod());
        builder.withProvisioningState(getProvisioningState());
        builder.withProvisioningStatus(getProvisioningStatus());
        builder.withLastUpdatedTime(getLastUpdatedTime());
        builder.withProvisionerInformation(getProvisionerInformation());
        builder.withWifiNetworkInfo(getWifiNetworkInfo());
        builder.withErrorCode(getErrorCode());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisioneeSetupInformation(provisioneeIdentifier=");
        sb.append(String.valueOf(this.provisioneeIdentifier));
        sb.append(", authMaterialIdentifier=");
        sb.append(String.valueOf(this.authMaterialIdentifier));
        sb.append(", provisioningMethod=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningMethod, ", provisioningState=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningState, ", provisioningStatus=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningStatus, ", lastUpdatedTime=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.lastUpdatedTime, ", provisionerInformation=", sb);
        sb.append(String.valueOf(this.provisionerInformation));
        sb.append(", wifiNetworkInfo=");
        sb.append(String.valueOf(this.wifiNetworkInfo));
        sb.append(", errorCode=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.errorCode, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
