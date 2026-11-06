package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.v1.OptOutPreferenceInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("SetOptOutPreferenceInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SetOptOutPreferenceInput extends OptOutPreferenceInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.SetOptOutPreferenceInput");
    private Boolean hasOptedOut;

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
        if (obj instanceof SetOptOutPreferenceInput) {
            return super.equals(obj) && Objects.equals(isHasOptedOut(), ((SetOptOutPreferenceInput) obj).isHasOptedOut());
        }
        return false;
    }

    @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), isHasOptedOut());
    }

    @Required
    public Boolean isHasOptedOut() {
        return this.hasOptedOut;
    }

    public void setHasOptedOut(Boolean bool) {
        this.hasOptedOut = bool;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerCredentials(getCustomerCredentials());
        builder.withCustomerId(getCustomerId());
        builder.withHasOptedOut(isHasOptedOut());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.OptOutPreferenceInput
    public String toString() {
        return "SetOptOutPreferenceInput(super=" + super.toString() + ", hasOptedOut=" + String.valueOf(this.hasOptedOut) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends OptOutPreferenceInput.Builder {
        protected Boolean hasOptedOut;

        public SetOptOutPreferenceInput build() {
            SetOptOutPreferenceInput setOptOutPreferenceInput = new SetOptOutPreferenceInput();
            populate(setOptOutPreferenceInput);
            return setOptOutPreferenceInput;
        }

        public void populate(SetOptOutPreferenceInput setOptOutPreferenceInput) {
            super.populate((OptOutPreferenceInput) setOptOutPreferenceInput);
            setOptOutPreferenceInput.setHasOptedOut(this.hasOptedOut);
        }

        public Builder withHasOptedOut(Boolean bool) {
            this.hasOptedOut = bool;
            return this;
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
