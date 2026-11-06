package com.amazon.devicesetupservice.lts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.lts/")
@Generated
@XmlName("RecordLightTouchSetupUserConsentOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordLightTouchSetupUserConsentOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.lts.RecordLightTouchSetupUserConsentOutput");
    private String endpointToUse;
    private boolean success;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected boolean success;

        public RecordLightTouchSetupUserConsentOutput build() {
            RecordLightTouchSetupUserConsentOutput recordLightTouchSetupUserConsentOutput = new RecordLightTouchSetupUserConsentOutput();
            populate(recordLightTouchSetupUserConsentOutput);
            return recordLightTouchSetupUserConsentOutput;
        }

        public void populate(RecordLightTouchSetupUserConsentOutput recordLightTouchSetupUserConsentOutput) {
            recordLightTouchSetupUserConsentOutput.setSuccess(this.success);
            recordLightTouchSetupUserConsentOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withSuccess(boolean z) {
            this.success = z;
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
        if (!(obj instanceof RecordLightTouchSetupUserConsentOutput)) {
            return false;
        }
        RecordLightTouchSetupUserConsentOutput recordLightTouchSetupUserConsentOutput = (RecordLightTouchSetupUserConsentOutput) obj;
        return Boolean.valueOf(isSuccess()).equals(Boolean.valueOf(recordLightTouchSetupUserConsentOutput.isSuccess())) && Objects.equals(getEndpointToUse(), recordLightTouchSetupUserConsentOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Boolean.valueOf(isSuccess()), getEndpointToUse());
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSuccess(isSuccess());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecordLightTouchSetupUserConsentOutput(success=");
        sb.append(String.valueOf(this.success));
        sb.append(", endpointToUse=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
