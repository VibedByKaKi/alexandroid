package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
@XmlName("PostWifiScanDataInput")
@Documentation("Input structure for the \"post Wi-Fi scan data\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class PostWifiScanDataInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.PostWifiScanDataInput");
    private DeviceDetails deviceDetails;
    private String nonce;
    private int sequenceNumber;
    private String sessionId;
    private boolean shouldReturnUnknownScanData;
    private List<WifiScanData> wifiScanDataList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected DeviceDetails deviceDetails;
        protected String nonce;
        protected int sequenceNumber;
        protected String sessionId;
        protected boolean shouldReturnUnknownScanData;
        protected List<WifiScanData> wifiScanDataList;

        public PostWifiScanDataInput build() {
            PostWifiScanDataInput postWifiScanDataInput = new PostWifiScanDataInput();
            populate(postWifiScanDataInput);
            return postWifiScanDataInput;
        }

        public void populate(PostWifiScanDataInput postWifiScanDataInput) {
            postWifiScanDataInput.setNonce(this.nonce);
            postWifiScanDataInput.setSessionId(this.sessionId);
            postWifiScanDataInput.setDeviceDetails(this.deviceDetails);
            postWifiScanDataInput.setSequenceNumber(this.sequenceNumber);
            postWifiScanDataInput.setWifiScanDataList(this.wifiScanDataList);
            postWifiScanDataInput.setShouldReturnUnknownScanData(this.shouldReturnUnknownScanData);
        }

        public Builder withDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
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

        public Builder withShouldReturnUnknownScanData(boolean z) {
            this.shouldReturnUnknownScanData = z;
            return this;
        }

        public Builder withWifiScanDataList(List<WifiScanData> list) {
            this.wifiScanDataList = list;
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
        if (!(obj instanceof PostWifiScanDataInput)) {
            return false;
        }
        PostWifiScanDataInput postWifiScanDataInput = (PostWifiScanDataInput) obj;
        return Objects.equals(getNonce(), postWifiScanDataInput.getNonce()) && Objects.equals(getSessionId(), postWifiScanDataInput.getSessionId()) && Objects.equals(getDeviceDetails(), postWifiScanDataInput.getDeviceDetails()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(postWifiScanDataInput.getSequenceNumber())) && Objects.equals(getWifiScanDataList(), postWifiScanDataInput.getWifiScanDataList()) && Boolean.valueOf(isShouldReturnUnknownScanData()).equals(Boolean.valueOf(postWifiScanDataInput.isShouldReturnUnknownScanData()));
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

    @Required
    @Documentation("Wi-Fi scan data list for \"get Wi-Fi credentials\" API.")
    public List<WifiScanData> getWifiScanDataList() {
        return this.wifiScanDataList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getDeviceDetails(), Integer.valueOf(getSequenceNumber()), getWifiScanDataList(), Boolean.valueOf(isShouldReturnUnknownScanData()));
    }

    @Documentation("Boolean passed by the client indicating whether the cloud should return\n        the unknown scan data list as part of the PostWifiScanData response.")
    public boolean isShouldReturnUnknownScanData() {
        return this.shouldReturnUnknownScanData;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setShouldReturnUnknownScanData(boolean z) {
        this.shouldReturnUnknownScanData = z;
    }

    public void setWifiScanDataList(List<WifiScanData> list) {
        this.wifiScanDataList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withSequenceNumber(getSequenceNumber());
        builder.withWifiScanDataList(getWifiScanDataList());
        builder.withShouldReturnUnknownScanData(isShouldReturnUnknownScanData());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostWifiScanDataInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", sequenceNumber=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", wifiScanDataList=", this.sequenceNumber, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", shouldReturnUnknownScanData=", (List) this.wifiScanDataList, sb);
        sb.append(String.valueOf(this.shouldReturnUnknownScanData));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
