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
import com.amazon.devicesetup.common.v1.ReportInput;
import com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wififfs/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalReportInput")
@Documentation("Input structure for the \"report\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalReportInput extends DeviceAuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wififfs.InternalReportInput");
    private ReportInput reportInputData;

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
        if (obj instanceof InternalReportInput) {
            return super.equals(obj) && Objects.equals(getReportInputData(), ((InternalReportInput) obj).getReportInputData());
        }
        return false;
    }

    @Documentation("Input structure for the \"report\" API.")
    public ReportInput getReportInputData() {
        return this.reportInputData;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getReportInputData());
    }

    public void setReportInputData(ReportInput reportInput) {
        this.reportInputData = reportInput;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceCertificate(getDeviceCertificate());
        builder.withReportInputData(getReportInputData());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput
    public String toString() {
        return "InternalReportInput(super=" + super.toString() + ", reportInputData=" + String.valueOf(this.reportInputData) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DeviceAuthenticatedInput.Builder {
        protected ReportInput reportInputData;

        public InternalReportInput build() {
            InternalReportInput internalReportInput = new InternalReportInput();
            populate(internalReportInput);
            return internalReportInput;
        }

        public void populate(InternalReportInput internalReportInput) {
            super.populate((DeviceAuthenticatedInput) internalReportInput);
            internalReportInput.setReportInputData(this.reportInputData);
        }

        public Builder withReportInputData(ReportInput reportInput) {
            this.reportInputData = reportInput;
            return this;
        }

        @Override // com.amazon.devicesetupservice.wififfs.DeviceAuthenticatedInput.Builder
        public Builder withDeviceCertificate(String str) {
            super.withDeviceCertificate(str);
            return this;
        }
    }
}
