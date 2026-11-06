package com.amazon.devicesetupservice.wss1p;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.ErrorInfo;
import com.amazon.devicesetup.common.v1.WifiProvisionerEvent;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wss1p/")
@CoralSuppressWarnings
@Generated
@XmlName("ReportWifiProvisionerEventInput")
@Documentation("Input structure for \"ReportWifiProvisionerEvent\" API. Its input include\n        the event type, the encoded SSID the event was related to, and a provisioner info object.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ReportWifiProvisionerEventInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wss1p.ReportWifiProvisionerEventInput");
    private String accessPointSsid;
    private ErrorInfo errorInfo;
    private String eventType;
    private DiscoveredDevice probeRequest;
    private ProvisionerInfo provisionerInfo;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportWifiProvisionerEventInput)) {
            return false;
        }
        ReportWifiProvisionerEventInput reportWifiProvisionerEventInput = (ReportWifiProvisionerEventInput) obj;
        return super.equals(obj) && Objects.equals(getEventType(), reportWifiProvisionerEventInput.getEventType()) && Objects.equals(getProbeRequest(), reportWifiProvisionerEventInput.getProbeRequest()) && Objects.equals(getAccessPointSsid(), reportWifiProvisionerEventInput.getAccessPointSsid()) && Objects.equals(getProvisionerInfo(), reportWifiProvisionerEventInput.getProvisionerInfo()) && Objects.equals(getErrorInfo(), reportWifiProvisionerEventInput.getErrorInfo());
    }

    @MaxLength(34)
    @MinLength(1)
    @Sensitive
    public String getAccessPointSsid() {
        return this.accessPointSsid;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    @EnumValues({WifiProvisionerEvent.PROBE_REQUEST_SCANNING_STARTED, WifiProvisionerEvent.PROBE_REQUEST_SCANNING_STOPPED, WifiProvisionerEvent.PROBE_REQUEST_RECEIVED, WifiProvisionerEvent.ACCESS_POINT_CREATED, WifiProvisionerEvent.ACCESS_POINT_DESTROYED, WifiProvisionerEvent.PROVISIONEE_CONNECTED, WifiProvisionerEvent.PROVISIONEE_DISCONNECTED, "SESSION_ENDED", "ERROR"})
    @Required
    @Documentation("Wifi Provisioner Event Types")
    public String getEventType() {
        return this.eventType;
    }

    @Documentation("Structure holds discovered device's mac, rssi and encodedSsid")
    public DiscoveredDevice getProbeRequest() {
        return this.probeRequest;
    }

    @Required
    public ProvisionerInfo getProvisionerInfo() {
        return this.provisionerInfo;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getEventType(), getProbeRequest(), getAccessPointSsid(), getProvisionerInfo(), getErrorInfo());
    }

    public void setAccessPointSsid(String str) {
        this.accessPointSsid = str;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setProbeRequest(DiscoveredDevice discoveredDevice) {
        this.probeRequest = discoveredDevice;
    }

    public void setProvisionerInfo(ProvisionerInfo provisionerInfo) {
        this.provisionerInfo = provisionerInfo;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withEventType(getEventType());
        builder.withProbeRequest(getProbeRequest());
        builder.withAccessPointSsid(getAccessPointSsid());
        builder.withProvisionerInfo(getProvisionerInfo());
        builder.withErrorInfo(getErrorInfo());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("ReportWifiProvisionerEventInput(super=");
        sb.append(super.toString());
        sb.append(", , , , , eventType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.eventType, ", probeRequest=", sb);
        sb.append(String.valueOf(this.probeRequest));
        sb.append(", accessPointSsid=*** REDACTED ***, provisionerInfo=");
        sb.append(String.valueOf(this.provisionerInfo));
        sb.append(", errorInfo=");
        sb.append(String.valueOf(this.errorInfo));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String accessPointSsid;
        protected ErrorInfo errorInfo;
        protected String eventType;
        protected DiscoveredDevice probeRequest;
        protected ProvisionerInfo provisionerInfo;

        public ReportWifiProvisionerEventInput build() {
            ReportWifiProvisionerEventInput reportWifiProvisionerEventInput = new ReportWifiProvisionerEventInput();
            populate(reportWifiProvisionerEventInput);
            return reportWifiProvisionerEventInput;
        }

        public void populate(ReportWifiProvisionerEventInput reportWifiProvisionerEventInput) {
            super.populate((AuthenticatedInput) reportWifiProvisionerEventInput);
            reportWifiProvisionerEventInput.setEventType(this.eventType);
            reportWifiProvisionerEventInput.setProbeRequest(this.probeRequest);
            reportWifiProvisionerEventInput.setAccessPointSsid(this.accessPointSsid);
            reportWifiProvisionerEventInput.setProvisionerInfo(this.provisionerInfo);
            reportWifiProvisionerEventInput.setErrorInfo(this.errorInfo);
        }

        public Builder withAccessPointSsid(String str) {
            this.accessPointSsid = str;
            return this;
        }

        public Builder withErrorInfo(ErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        public Builder withEventType(String str) {
            this.eventType = str;
            return this;
        }

        public Builder withProbeRequest(DiscoveredDevice discoveredDevice) {
            this.probeRequest = discoveredDevice;
            return this;
        }

        public Builder withProvisionerInfo(ProvisionerInfo provisionerInfo) {
            this.provisionerInfo = provisionerInfo;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
