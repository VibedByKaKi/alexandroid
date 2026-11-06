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
import com.amazon.devicesetup.common.v1.PostWifiScanDataInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalPostWifiScanDataInput")
@Documentation("Input structure for the \"post Wi-Fi scan data\" internal API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalPostWifiScanDataInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalPostWifiScanDataInput");
    private PostWifiScanDataInput postWifiScanDataInput;

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
        if (obj instanceof InternalPostWifiScanDataInput) {
            return super.equals(obj) && Objects.equals(getPostWifiScanDataInput(), ((InternalPostWifiScanDataInput) obj).getPostWifiScanDataInput());
        }
        return false;
    }

    @Documentation("Input structure for the \"post Wi-Fi scan data\" API.")
    public PostWifiScanDataInput getPostWifiScanDataInput() {
        return this.postWifiScanDataInput;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getPostWifiScanDataInput());
    }

    public void setPostWifiScanDataInput(PostWifiScanDataInput postWifiScanDataInput) {
        this.postWifiScanDataInput = postWifiScanDataInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withPostWifiScanDataInput(getPostWifiScanDataInput());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalPostWifiScanDataInput(super=" + super.toString() + ", postWifiScanDataInput=" + String.valueOf(this.postWifiScanDataInput) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected PostWifiScanDataInput postWifiScanDataInput;

        public InternalPostWifiScanDataInput build() {
            InternalPostWifiScanDataInput internalPostWifiScanDataInput = new InternalPostWifiScanDataInput();
            populate(internalPostWifiScanDataInput);
            return internalPostWifiScanDataInput;
        }

        public void populate(InternalPostWifiScanDataInput internalPostWifiScanDataInput) {
            super.populate((DeviceAuthenticatedInput) internalPostWifiScanDataInput);
            internalPostWifiScanDataInput.setPostWifiScanDataInput(this.postWifiScanDataInput);
        }

        public Builder withPostWifiScanDataInput(PostWifiScanDataInput postWifiScanDataInput) {
            this.postWifiScanDataInput = postWifiScanDataInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
