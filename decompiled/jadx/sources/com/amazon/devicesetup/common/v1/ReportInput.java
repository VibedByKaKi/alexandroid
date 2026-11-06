package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MaxValue;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ReportInput")
@Documentation("Input structure for the \"report\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ReportInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.ReportInput");
    private String currentProvisioningState;
    private DeviceDetails deviceDetails;
    private String nonce;
    private String registrationState;
    private int sequenceNumber;
    private String sessionId;
    private String stateTransitionResult;
    private List<WifiReportData> wifiNetworkInfoList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String currentProvisioningState;
        protected DeviceDetails deviceDetails;
        protected String nonce;
        protected String registrationState;
        protected int sequenceNumber;
        protected String sessionId;
        protected String stateTransitionResult;
        protected List<WifiReportData> wifiNetworkInfoList;

        public ReportInput build() {
            ReportInput reportInput = new ReportInput();
            populate(reportInput);
            return reportInput;
        }

        public void populate(ReportInput reportInput) {
            reportInput.setNonce(this.nonce);
            reportInput.setSessionId(this.sessionId);
            reportInput.setDeviceDetails(this.deviceDetails);
            reportInput.setSequenceNumber(this.sequenceNumber);
            reportInput.setCurrentProvisioningState(this.currentProvisioningState);
            reportInput.setRegistrationState(this.registrationState);
            reportInput.setStateTransitionResult(this.stateTransitionResult);
            reportInput.setWifiNetworkInfoList(this.wifiNetworkInfoList);
        }

        public Builder withCurrentProvisioningState(String str) {
            this.currentProvisioningState = str;
            return this;
        }

        public Builder withDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withRegistrationState(String str) {
            this.registrationState = str;
            return this;
        }

        public Builder withSequenceNumber(int i) {
            this.sequenceNumber = i;
            return this;
        }

        public Builder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder withStateTransitionResult(String str) {
            this.stateTransitionResult = str;
            return this;
        }

        public Builder withWifiNetworkInfoList(List<WifiReportData> list) {
            this.wifiNetworkInfoList = list;
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
        if (!(obj instanceof ReportInput)) {
            return false;
        }
        ReportInput reportInput = (ReportInput) obj;
        return Objects.equals(getNonce(), reportInput.getNonce()) && Objects.equals(getSessionId(), reportInput.getSessionId()) && Objects.equals(getDeviceDetails(), reportInput.getDeviceDetails()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(reportInput.getSequenceNumber())) && Objects.equals(getCurrentProvisioningState(), reportInput.getCurrentProvisioningState()) && Objects.equals(getRegistrationState(), reportInput.getRegistrationState()) && Objects.equals(getStateTransitionResult(), reportInput.getStateTransitionResult()) && Objects.equals(getWifiNetworkInfoList(), reportInput.getWifiNetworkInfoList());
    }

    @EnumValues({ProvisioningState.NOT_PROVISIONED, "DISCOVERED", ProvisioningState.START_PROVISIONING, ProvisioningState.START_PIN_BASED_SETUP, ProvisioningState.POST_WIFI_SCAN_DATA, ProvisioningState.GET_WIFI_LIST, ProvisioningState.COMPUTE_CONFIGURATION, ProvisioningState.CONNECTING_TO_USER_NETWORK, ProvisioningState.CONNECTED_TO_USER_NETWORK, "TOKEN_REDEEMED", "DONE"})
    @Required
    @Documentation("Provisioning state for authenticated provisionee.")
    public String getCurrentProvisioningState() {
        return this.currentProvisioningState;
    }

    @Documentation("Device identifiers.")
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @EnumValues({"NOT_REGISTERED", "IN_PROGRESS", RegistrationState.COMPLETE, "FAILED"})
    @Documentation("Registration state.")
    public String getRegistrationState() {
        return this.registrationState;
    }

    @MaxValue("9999")
    @Required
    @MinValue("1")
    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @MaxLength(255)
    @Required
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getSessionId() {
        return this.sessionId;
    }

    @EnumValues({"SUCCESS", "FAILURE"})
    @Required
    public String getStateTransitionResult() {
        return this.stateTransitionResult;
    }

    @Documentation("Wi-Fi report data list for \"report\" API.")
    public List<WifiReportData> getWifiNetworkInfoList() {
        return this.wifiNetworkInfoList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getDeviceDetails(), Integer.valueOf(getSequenceNumber()), getCurrentProvisioningState(), getRegistrationState(), getStateTransitionResult(), getWifiNetworkInfoList());
    }

    public void setCurrentProvisioningState(String str) {
        this.currentProvisioningState = str;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setRegistrationState(String str) {
        this.registrationState = str;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setStateTransitionResult(String str) {
        this.stateTransitionResult = str;
    }

    public void setWifiNetworkInfoList(List<WifiReportData> list) {
        this.wifiNetworkInfoList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withSequenceNumber(getSequenceNumber());
        builder.withCurrentProvisioningState(getCurrentProvisioningState());
        builder.withRegistrationState(getRegistrationState());
        builder.withStateTransitionResult(getStateTransitionResult());
        builder.withWifiNetworkInfoList(getWifiNetworkInfoList());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", sequenceNumber=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", currentProvisioningState=", this.sequenceNumber, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.currentProvisioningState, ", registrationState=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.registrationState, ", stateTransitionResult=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.stateTransitionResult, ", wifiNetworkInfoList=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiNetworkInfoList, sb);
    }
}
