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
import com.amazon.devicesetup.common.v1.StartPinBasedSetupInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalStartPinBasedSetupInput")
@Documentation("Input structure for the \"start PIN-based setup\" internal API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalStartPinBasedSetupInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalStartPinBasedSetupInput");
    private StartPinBasedSetupInput startPinBasedSetupInputData;

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
        if (obj instanceof InternalStartPinBasedSetupInput) {
            return super.equals(obj) && Objects.equals(getStartPinBasedSetupInputData(), ((InternalStartPinBasedSetupInput) obj).getStartPinBasedSetupInputData());
        }
        return false;
    }

    @Documentation("Input structure for the \"start PIN-based setup\" API.")
    public StartPinBasedSetupInput getStartPinBasedSetupInputData() {
        return this.startPinBasedSetupInputData;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getStartPinBasedSetupInputData());
    }

    public void setStartPinBasedSetupInputData(StartPinBasedSetupInput startPinBasedSetupInput) {
        this.startPinBasedSetupInputData = startPinBasedSetupInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withStartPinBasedSetupInputData(getStartPinBasedSetupInputData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalStartPinBasedSetupInput(super=" + super.toString() + ", startPinBasedSetupInputData=" + String.valueOf(this.startPinBasedSetupInputData) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected StartPinBasedSetupInput startPinBasedSetupInputData;

        public InternalStartPinBasedSetupInput build() {
            InternalStartPinBasedSetupInput internalStartPinBasedSetupInput = new InternalStartPinBasedSetupInput();
            populate(internalStartPinBasedSetupInput);
            return internalStartPinBasedSetupInput;
        }

        public void populate(InternalStartPinBasedSetupInput internalStartPinBasedSetupInput) {
            super.populate((DeviceAuthenticatedInput) internalStartPinBasedSetupInput);
            internalStartPinBasedSetupInput.setStartPinBasedSetupInputData(this.startPinBasedSetupInputData);
        }

        public Builder withStartPinBasedSetupInputData(StartPinBasedSetupInput startPinBasedSetupInput) {
            this.startPinBasedSetupInputData = startPinBasedSetupInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
