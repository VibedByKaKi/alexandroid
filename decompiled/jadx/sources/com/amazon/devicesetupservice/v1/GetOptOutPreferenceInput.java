package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.v1.OptOutPreferenceInput;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetOptOutPreferenceInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetOptOutPreferenceInput extends OptOutPreferenceInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetOptOutPreferenceInput");

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOptOutPreferenceInput) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode));
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerCredentials(getCustomerCredentials());
        builder.withCustomerId(getCustomerId());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("GetOptOutPreferenceInput(super="), super.toString(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends OptOutPreferenceInput.Builder {
        public GetOptOutPreferenceInput build() {
            GetOptOutPreferenceInput getOptOutPreferenceInput = new GetOptOutPreferenceInput();
            populate(getOptOutPreferenceInput);
            return getOptOutPreferenceInput;
        }

        public void populate(GetOptOutPreferenceInput getOptOutPreferenceInput) {
            super.populate((OptOutPreferenceInput) getOptOutPreferenceInput);
        }

        @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput.Builder
        public Builder withCustomerCredentials(CustomerCredentials customerCredentials) {
            super.withCustomerCredentials(customerCredentials);
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput.Builder
        public Builder withCustomerId(String str) {
            super.withCustomerId(str);
            return this;
        }
    }
}
