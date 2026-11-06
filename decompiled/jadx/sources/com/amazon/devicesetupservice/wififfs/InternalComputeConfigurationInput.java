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
import com.amazon.devicesetup.common.v1.ComputeConfigurationInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalComputeConfigurationInput")
@Documentation("Input structure for the \"Compute Configuration\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalComputeConfigurationInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalComputeConfigurationInput");
    private ComputeConfigurationInput computeConfigurationInputData;

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
        if (obj instanceof InternalComputeConfigurationInput) {
            return super.equals(obj) && Objects.equals(getComputeConfigurationInputData(), ((InternalComputeConfigurationInput) obj).getComputeConfigurationInputData());
        }
        return false;
    }

    @Documentation("Input structure for the \"compute configuration data\" API.")
    public ComputeConfigurationInput getComputeConfigurationInputData() {
        return this.computeConfigurationInputData;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getComputeConfigurationInputData());
    }

    public void setComputeConfigurationInputData(ComputeConfigurationInput computeConfigurationInput) {
        this.computeConfigurationInputData = computeConfigurationInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withComputeConfigurationInputData(getComputeConfigurationInputData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalComputeConfigurationInput(super=" + super.toString() + ", computeConfigurationInputData=" + String.valueOf(this.computeConfigurationInputData) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected ComputeConfigurationInput computeConfigurationInputData;

        public InternalComputeConfigurationInput build() {
            InternalComputeConfigurationInput internalComputeConfigurationInput = new InternalComputeConfigurationInput();
            populate(internalComputeConfigurationInput);
            return internalComputeConfigurationInput;
        }

        public void populate(InternalComputeConfigurationInput internalComputeConfigurationInput) {
            super.populate((DeviceAuthenticatedInput) internalComputeConfigurationInput);
            internalComputeConfigurationInput.setComputeConfigurationInputData(this.computeConfigurationInputData);
        }

        public Builder withComputeConfigurationInputData(ComputeConfigurationInput computeConfigurationInput) {
            this.computeConfigurationInputData = computeConfigurationInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
