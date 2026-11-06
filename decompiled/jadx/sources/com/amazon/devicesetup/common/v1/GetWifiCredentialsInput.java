package com.amazon.devicesetup.common.v1;

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
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWifiCredentialsInput")
@Documentation("Input structure for the \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWifiCredentialsInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.GetWifiCredentialsInput");
    private DeviceDetails deviceDetails;
    private String nonce;
    private int sequenceNumber;
    private String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected DeviceDetails deviceDetails;
        protected String nonce;
        protected int sequenceNumber;
        protected String sessionId;

        public GetWifiCredentialsInput build() {
            GetWifiCredentialsInput getWifiCredentialsInput = new GetWifiCredentialsInput();
            populate(getWifiCredentialsInput);
            return getWifiCredentialsInput;
        }

        public void populate(GetWifiCredentialsInput getWifiCredentialsInput) {
            getWifiCredentialsInput.setNonce(this.nonce);
            getWifiCredentialsInput.setSessionId(this.sessionId);
            getWifiCredentialsInput.setDeviceDetails(this.deviceDetails);
            getWifiCredentialsInput.setSequenceNumber(this.sequenceNumber);
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
        if (!(obj instanceof GetWifiCredentialsInput)) {
            return false;
        }
        GetWifiCredentialsInput getWifiCredentialsInput = (GetWifiCredentialsInput) obj;
        return Objects.equals(getNonce(), getWifiCredentialsInput.getNonce()) && Objects.equals(getSessionId(), getWifiCredentialsInput.getSessionId()) && Objects.equals(getDeviceDetails(), getWifiCredentialsInput.getDeviceDetails()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(getWifiCredentialsInput.getSequenceNumber()));
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

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getDeviceDetails(), Integer.valueOf(getSequenceNumber()));
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

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withSequenceNumber(getSequenceNumber());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetWifiCredentialsInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", sequenceNumber=");
        sb.append(String.valueOf(this.sequenceNumber));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
