package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
@XmlName("StartProvisioningSessionV2Input")
@Documentation("Input structure for the \"start provisioning session\" version 2 API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class StartProvisioningSessionV2Input {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.StartProvisioningSessionV2Input");
    private AccessPoint accessPoint;
    private String nonce;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected AccessPoint accessPoint;
        protected String nonce;

        public StartProvisioningSessionV2Input build() {
            StartProvisioningSessionV2Input startProvisioningSessionV2Input = new StartProvisioningSessionV2Input();
            populate(startProvisioningSessionV2Input);
            return startProvisioningSessionV2Input;
        }

        public void populate(StartProvisioningSessionV2Input startProvisioningSessionV2Input) {
            startProvisioningSessionV2Input.setNonce(this.nonce);
            startProvisioningSessionV2Input.setAccessPoint(this.accessPoint);
        }

        public Builder withAccessPoint(AccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
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
        if (!(obj instanceof StartProvisioningSessionV2Input)) {
            return false;
        }
        StartProvisioningSessionV2Input startProvisioningSessionV2Input = (StartProvisioningSessionV2Input) obj;
        return Objects.equals(getNonce(), startProvisioningSessionV2Input.getNonce()) && Objects.equals(getAccessPoint(), startProvisioningSessionV2Input.getAccessPoint());
    }

    @Required
    @Documentation("Structure holds Access Point BSSID and SSID")
    public AccessPoint getAccessPoint() {
        return this.accessPoint;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getAccessPoint());
    }

    public void setAccessPoint(AccessPoint accessPoint) {
        this.accessPoint = accessPoint;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withAccessPoint(getAccessPoint());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartProvisioningSessionV2Input(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", accessPoint=", sb);
        sb.append(String.valueOf(this.accessPoint));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
