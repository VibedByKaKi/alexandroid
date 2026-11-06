package com.amazon.devicesetupservice.wififfs;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("DeviceAuthenticatedInput")
@Documentation("The base class to hold the device authentication data.\n        It is the DHAv2 certificate for the device.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput");
    private String deviceCertificate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String deviceCertificate;

        public void populate(DeviceAuthenticatedInput deviceAuthenticatedInput) {
            deviceAuthenticatedInput.setDeviceCertificate(this.deviceCertificate);
        }

        public Builder withDeviceCertificate(String str) {
            this.deviceCertificate = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceAuthenticatedInput) {
            return Objects.equals(getDeviceCertificate(), ((DeviceAuthenticatedInput) obj).getDeviceCertificate());
        }
        return false;
    }

    @Required
    @Documentation("This is a PEM-encoded string. It can be either the entire certificate chain\n        on the device or only the leaf certificate. The isCertificateChainPresent\n        parameter should be used to denote which is being passed in.")
    public String getDeviceCertificate() {
        return this.deviceCertificate;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceCertificate());
    }

    public void setDeviceCertificate(String str) {
        this.deviceCertificate = str;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceCertificate, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("DeviceAuthenticatedInput(deviceCertificate="));
    }
}
