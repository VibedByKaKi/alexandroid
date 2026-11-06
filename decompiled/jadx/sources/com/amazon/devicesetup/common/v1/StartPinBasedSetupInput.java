package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
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
@XmlName("StartPinBasedSetupInput")
@Documentation("Input structure for the \"start PIN-based setup\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class StartPinBasedSetupInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.StartPinBasedSetupInput");
    private DeviceDetails deviceDetails;
    private String hashedPin;
    private String nonce;
    private String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected DeviceDetails deviceDetails;
        protected String hashedPin;
        protected String nonce;
        protected String sessionId;

        public StartPinBasedSetupInput build() {
            StartPinBasedSetupInput startPinBasedSetupInput = new StartPinBasedSetupInput();
            populate(startPinBasedSetupInput);
            return startPinBasedSetupInput;
        }

        public void populate(StartPinBasedSetupInput startPinBasedSetupInput) {
            startPinBasedSetupInput.setNonce(this.nonce);
            startPinBasedSetupInput.setSessionId(this.sessionId);
            startPinBasedSetupInput.setDeviceDetails(this.deviceDetails);
            startPinBasedSetupInput.setHashedPin(this.hashedPin);
        }

        public Builder withDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        public Builder withHashedPin(String str) {
            this.hashedPin = str;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
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
        if (!(obj instanceof StartPinBasedSetupInput)) {
            return false;
        }
        StartPinBasedSetupInput startPinBasedSetupInput = (StartPinBasedSetupInput) obj;
        return Objects.equals(getNonce(), startPinBasedSetupInput.getNonce()) && Objects.equals(getSessionId(), startPinBasedSetupInput.getSessionId()) && Objects.equals(getDeviceDetails(), startPinBasedSetupInput.getDeviceDetails()) && Objects.equals(getHashedPin(), startPinBasedSetupInput.getHashedPin());
    }

    @Documentation("Device identifiers.")
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Required
    @Documentation("Hashed PIN of the client device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getHashedPin() {
        return this.hashedPin;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @MaxLength(255)
    @Required
    @MinLength(1)
    @Documentation("Unique token used to identify a provisioning session.\n        It will be in the form of a amazon common identifier.\n        e.g: amzn1.ffs.session-id.some-uuid")
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getSessionId(), getDeviceDetails(), getHashedPin());
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setHashedPin(String str) {
        this.hashedPin = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withSessionId(getSessionId());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withHashedPin(getHashedPin());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartPinBasedSetupInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", sessionId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionId, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", hashedPin=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.hashedPin, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
