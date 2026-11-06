package com.amazon.devicesetupservice.wififfs;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetup.common.v1.GetWifiCredentialsInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalGetWifiCredentialsInput")
@Documentation("Input structure for the \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalGetWifiCredentialsInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalGetWifiCredentialsInput");
    private GetWifiCredentialsInput getWifiCredentialsInputData;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InternalGetWifiCredentialsInput) {
            return super.equals(obj) && Objects.equals(getGetWifiCredentialsInputData(), ((InternalGetWifiCredentialsInput) obj).getGetWifiCredentialsInputData());
        }
        return false;
    }

    @Documentation("Input structure for the \"get Wi-Fi credentials\" API.")
    public GetWifiCredentialsInput getGetWifiCredentialsInputData() {
        return this.getWifiCredentialsInputData;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getGetWifiCredentialsInputData());
    }

    public void setGetWifiCredentialsInputData(GetWifiCredentialsInput getWifiCredentialsInput) {
        this.getWifiCredentialsInputData = getWifiCredentialsInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withGetWifiCredentialsInputData(getGetWifiCredentialsInputData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalGetWifiCredentialsInput(super=" + super.toString() + ", getWifiCredentialsInputData=" + String.valueOf(this.getWifiCredentialsInputData) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected GetWifiCredentialsInput getWifiCredentialsInputData;

        public InternalGetWifiCredentialsInput build() {
            InternalGetWifiCredentialsInput internalGetWifiCredentialsInput = new InternalGetWifiCredentialsInput();
            populate(internalGetWifiCredentialsInput);
            return internalGetWifiCredentialsInput;
        }

        public void populate(InternalGetWifiCredentialsInput internalGetWifiCredentialsInput) {
            super.populate((DeviceAuthenticatedInput) internalGetWifiCredentialsInput);
            internalGetWifiCredentialsInput.setGetWifiCredentialsInputData(this.getWifiCredentialsInputData);
        }

        public Builder withGetWifiCredentialsInputData(GetWifiCredentialsInput getWifiCredentialsInput) {
            this.getWifiCredentialsInputData = getWifiCredentialsInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
