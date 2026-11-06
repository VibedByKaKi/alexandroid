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
import com.amazon.devicesetup.common.v1.ProvisionWithPreAuthorizedCodeInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalProvisionWithPreAuthorizedCodeInput")
@Documentation("Input structure for the \"pre-authorized code base provisioning session\" internal API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalProvisionWithPreAuthorizedCodeInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalProvisionWithPreAuthorizedCodeInput");
    private ProvisionWithPreAuthorizedCodeInput provisionWithPreAuthorizedCodeInputData;

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
        if (obj instanceof InternalProvisionWithPreAuthorizedCodeInput) {
            return super.equals(obj) && Objects.equals(getProvisionWithPreAuthorizedCodeInputData(), ((InternalProvisionWithPreAuthorizedCodeInput) obj).getProvisionWithPreAuthorizedCodeInputData());
        }
        return false;
    }

    @Documentation("Input structure for the \"provision with authorized code\" API.")
    public ProvisionWithPreAuthorizedCodeInput getProvisionWithPreAuthorizedCodeInputData() {
        return this.provisionWithPreAuthorizedCodeInputData;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProvisionWithPreAuthorizedCodeInputData());
    }

    public void setProvisionWithPreAuthorizedCodeInputData(ProvisionWithPreAuthorizedCodeInput provisionWithPreAuthorizedCodeInput) {
        this.provisionWithPreAuthorizedCodeInputData = provisionWithPreAuthorizedCodeInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withProvisionWithPreAuthorizedCodeInputData(getProvisionWithPreAuthorizedCodeInputData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalProvisionWithPreAuthorizedCodeInput(super=" + super.toString() + ", provisionWithPreAuthorizedCodeInputData=" + String.valueOf(this.provisionWithPreAuthorizedCodeInputData) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected ProvisionWithPreAuthorizedCodeInput provisionWithPreAuthorizedCodeInputData;

        public InternalProvisionWithPreAuthorizedCodeInput build() {
            InternalProvisionWithPreAuthorizedCodeInput internalProvisionWithPreAuthorizedCodeInput = new InternalProvisionWithPreAuthorizedCodeInput();
            populate(internalProvisionWithPreAuthorizedCodeInput);
            return internalProvisionWithPreAuthorizedCodeInput;
        }

        public void populate(InternalProvisionWithPreAuthorizedCodeInput internalProvisionWithPreAuthorizedCodeInput) {
            super.populate((DeviceAuthenticatedInput) internalProvisionWithPreAuthorizedCodeInput);
            internalProvisionWithPreAuthorizedCodeInput.setProvisionWithPreAuthorizedCodeInputData(this.provisionWithPreAuthorizedCodeInputData);
        }

        public Builder withProvisionWithPreAuthorizedCodeInputData(ProvisionWithPreAuthorizedCodeInput provisionWithPreAuthorizedCodeInput) {
            this.provisionWithPreAuthorizedCodeInputData = provisionWithPreAuthorizedCodeInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
