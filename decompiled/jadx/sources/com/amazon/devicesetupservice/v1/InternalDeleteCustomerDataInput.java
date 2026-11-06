package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("InternalDeleteCustomerDataInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalDeleteCustomerDataInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalDeleteCustomerDataInput");
    private String customerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String customerId;

        public InternalDeleteCustomerDataInput build() {
            InternalDeleteCustomerDataInput internalDeleteCustomerDataInput = new InternalDeleteCustomerDataInput();
            populate(internalDeleteCustomerDataInput);
            return internalDeleteCustomerDataInput;
        }

        public void populate(InternalDeleteCustomerDataInput internalDeleteCustomerDataInput) {
            internalDeleteCustomerDataInput.setCustomerId(this.customerId);
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
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
        if (obj instanceof InternalDeleteCustomerDataInput) {
            return Objects.equals(getCustomerId(), ((InternalDeleteCustomerDataInput) obj).getCustomerId());
        }
        return false;
    }

    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId());
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerId(getCustomerId());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.customerId, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("InternalDeleteCustomerDataInput(customerId="));
    }
}
