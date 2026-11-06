package com.amazon.devicesetupservice.wss1p;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Sensitive;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wss1p/")
@CoralSuppressWarnings
@Generated
@XmlName("CreateAPForWifiProvisioneeOutput")
@Documentation("Output structure for \"Create AP For Wifi Provisionee\" API. It will contain\n        canProceed value, ssid, passphrase, timeouts and hostport list")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CreateAPForWifiProvisioneeOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wss1p.CreateAPForWifiProvisioneeOutput");
    private String blacklistTimeout;
    private boolean canProceed;
    private String deviceId;
    private String endpointToUse;
    private List<String> hostPortList;
    private String passphrase;
    private String ssid;
    private String timeout;
    private String waitTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String blacklistTimeout;
        protected boolean canProceed;
        protected String deviceId;
        protected String endpointToUse;
        protected List<String> hostPortList;
        protected String passphrase;
        protected String ssid;
        protected String timeout;
        protected String waitTime;

        public CreateAPForWifiProvisioneeOutput build() {
            CreateAPForWifiProvisioneeOutput createAPForWifiProvisioneeOutput = new CreateAPForWifiProvisioneeOutput();
            populate(createAPForWifiProvisioneeOutput);
            return createAPForWifiProvisioneeOutput;
        }

        public void populate(CreateAPForWifiProvisioneeOutput createAPForWifiProvisioneeOutput) {
            createAPForWifiProvisioneeOutput.setCanProceed(this.canProceed);
            createAPForWifiProvisioneeOutput.setWaitTime(this.waitTime);
            createAPForWifiProvisioneeOutput.setSsid(this.ssid);
            createAPForWifiProvisioneeOutput.setPassphrase(this.passphrase);
            createAPForWifiProvisioneeOutput.setDeviceId(this.deviceId);
            createAPForWifiProvisioneeOutput.setTimeout(this.timeout);
            createAPForWifiProvisioneeOutput.setBlacklistTimeout(this.blacklistTimeout);
            createAPForWifiProvisioneeOutput.setHostPortList(this.hostPortList);
            createAPForWifiProvisioneeOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withBlacklistTimeout(String str) {
            this.blacklistTimeout = str;
            return this;
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withHostPortList(List<String> list) {
            this.hostPortList = list;
            return this;
        }

        public Builder withPassphrase(String str) {
            this.passphrase = str;
            return this;
        }

        public Builder withSsid(String str) {
            this.ssid = str;
            return this;
        }

        public Builder withTimeout(String str) {
            this.timeout = str;
            return this;
        }

        public Builder withWaitTime(String str) {
            this.waitTime = str;
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
        if (!(obj instanceof CreateAPForWifiProvisioneeOutput)) {
            return false;
        }
        CreateAPForWifiProvisioneeOutput createAPForWifiProvisioneeOutput = (CreateAPForWifiProvisioneeOutput) obj;
        return Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(createAPForWifiProvisioneeOutput.isCanProceed())) && Objects.equals(getWaitTime(), createAPForWifiProvisioneeOutput.getWaitTime()) && Objects.equals(getSsid(), createAPForWifiProvisioneeOutput.getSsid()) && Objects.equals(getPassphrase(), createAPForWifiProvisioneeOutput.getPassphrase()) && Objects.equals(getDeviceId(), createAPForWifiProvisioneeOutput.getDeviceId()) && Objects.equals(getTimeout(), createAPForWifiProvisioneeOutput.getTimeout()) && Objects.equals(getBlacklistTimeout(), createAPForWifiProvisioneeOutput.getBlacklistTimeout()) && Objects.equals(getHostPortList(), createAPForWifiProvisioneeOutput.getHostPortList()) && Objects.equals(getEndpointToUse(), createAPForWifiProvisioneeOutput.getEndpointToUse());
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getBlacklistTimeout() {
        return this.blacklistTimeout;
    }

    @MaxLength(26)
    @MinLength(26)
    @Documentation("AuthMaterialIndex bytes delimited with ':'")
    public String getDeviceId() {
        return this.deviceId;
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @ListMemberConstraint(@NestedConstraints(pattern = {@Pattern("(https://.*(\\..*)+):(\\d*)")}))
    @Documentation("List of host-port(s) that the provisionee can access")
    public List<String> getHostPortList() {
        return this.hostPortList;
    }

    @Documentation("Private PSKs are unique pre-shared keys created for individuals or\n        groups of users on the same SSID and used for WPA or WPA2 passphrase.")
    @Sensitive
    public String getPassphrase() {
        return this.passphrase;
    }

    @MaxLength(34)
    @MinLength(1)
    @Sensitive
    public String getSsid() {
        return this.ssid;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getTimeout() {
        return this.timeout;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Boolean.valueOf(isCanProceed()), getWaitTime(), getSsid(), getPassphrase(), getDeviceId(), getTimeout(), getBlacklistTimeout(), getHostPortList(), getEndpointToUse());
    }

    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setBlacklistTimeout(String str) {
        this.blacklistTimeout = str;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setHostPortList(List<String> list) {
        this.hostPortList = list;
    }

    public void setPassphrase(String str) {
        this.passphrase = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setTimeout(String str) {
        this.timeout = str;
    }

    public void setWaitTime(String str) {
        this.waitTime = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCanProceed(isCanProceed());
        builder.withWaitTime(getWaitTime());
        builder.withSsid(getSsid());
        builder.withPassphrase(getPassphrase());
        builder.withDeviceId(getDeviceId());
        builder.withTimeout(getTimeout());
        builder.withBlacklistTimeout(getBlacklistTimeout());
        builder.withHostPortList(getHostPortList());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateAPForWifiProvisioneeOutput(canProceed=");
        sb.append(String.valueOf(this.canProceed));
        sb.append(", waitTime=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.waitTime, ", ssid=*** REDACTED ***, passphrase=*** REDACTED ***, deviceId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceId, ", timeout=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.timeout, ", blacklistTimeout=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.blacklistTimeout, ", hostPortList=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", endpointToUse=", (List) this.hostPortList, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
