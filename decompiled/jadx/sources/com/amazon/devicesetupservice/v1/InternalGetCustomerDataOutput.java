package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("InternalGetCustomerDataOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalGetCustomerDataOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalGetCustomerDataOutput");
    private CustomerFFSOptOutPreference customerFFSOptOutPreference;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected CustomerFFSOptOutPreference customerFFSOptOutPreference;

        public InternalGetCustomerDataOutput build() {
            InternalGetCustomerDataOutput internalGetCustomerDataOutput = new InternalGetCustomerDataOutput();
            populate(internalGetCustomerDataOutput);
            return internalGetCustomerDataOutput;
        }

        public void populate(InternalGetCustomerDataOutput internalGetCustomerDataOutput) {
            internalGetCustomerDataOutput.setCustomerFFSOptOutPreference(this.customerFFSOptOutPreference);
        }

        public Builder withCustomerFFSOptOutPreference(CustomerFFSOptOutPreference customerFFSOptOutPreference) {
            this.customerFFSOptOutPreference = customerFFSOptOutPreference;
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
        if (obj instanceof InternalGetCustomerDataOutput) {
            return Objects.equals(getCustomerFFSOptOutPreference(), ((InternalGetCustomerDataOutput) obj).getCustomerFFSOptOutPreference());
        }
        return false;
    }

    public CustomerFFSOptOutPreference getCustomerFFSOptOutPreference() {
        return this.customerFFSOptOutPreference;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerFFSOptOutPreference());
    }

    public void setCustomerFFSOptOutPreference(CustomerFFSOptOutPreference customerFFSOptOutPreference) {
        this.customerFFSOptOutPreference = customerFFSOptOutPreference;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerFFSOptOutPreference(getCustomerFFSOptOutPreference());
        return builder;
    }

    public String toString() {
        return "InternalGetCustomerDataOutput(customerFFSOptOutPreference=" + String.valueOf(this.customerFFSOptOutPreference) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
