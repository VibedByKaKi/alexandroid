package com.amazon.devicesetupservice.v1;

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
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("DeviceAuthInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DeviceAuthInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.DeviceAuthInfo");
    private String x5c;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String x5c;

        public DeviceAuthInfo build() {
            DeviceAuthInfo deviceAuthInfo = new DeviceAuthInfo();
            populate(deviceAuthInfo);
            return deviceAuthInfo;
        }

        public void populate(DeviceAuthInfo deviceAuthInfo) {
            deviceAuthInfo.setX5c(this.x5c);
        }

        public Builder withX5c(String str) {
            this.x5c = str;
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
        if (obj instanceof DeviceAuthInfo) {
            return Objects.equals(getX5c(), ((DeviceAuthInfo) obj).getX5c());
        }
        return false;
    }

    @Required
    @Documentation("This is a PEM-encoded string. It can be either the entire certificate chain\n        on the device or only the leaf certificate. The isCertificateChainPresent\n        parameter should be used to denote which is being passed in.")
    public String getX5c() {
        return this.x5c;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getX5c());
    }

    public void setX5c(String str) {
        this.x5c = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withX5c(getX5c());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.x5c, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("DeviceAuthInfo(x5c="));
    }
}
