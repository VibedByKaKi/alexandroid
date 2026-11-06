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
@XmlName("OptOutPreferenceInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class OptOutPreferenceInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.OptOutPreferenceInput");
    private CustomerCredentials customerCredentials;
    private String customerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected CustomerCredentials customerCredentials;
        protected String customerId;

        public void populate(OptOutPreferenceInput optOutPreferenceInput) {
            optOutPreferenceInput.setCustomerCredentials(this.customerCredentials);
            optOutPreferenceInput.setCustomerId(this.customerId);
        }

        public Builder withCustomerCredentials(CustomerCredentials customerCredentials) {
            this.customerCredentials = customerCredentials;
            return this;
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptOutPreferenceInput)) {
            return false;
        }
        OptOutPreferenceInput optOutPreferenceInput = (OptOutPreferenceInput) obj;
        return Objects.equals(getCustomerCredentials(), optOutPreferenceInput.getCustomerCredentials()) && Objects.equals(getCustomerId(), optOutPreferenceInput.getCustomerId());
    }

    public CustomerCredentials getCustomerCredentials() {
        return this.customerCredentials;
    }

    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerCredentials(), getCustomerId());
    }

    public void setCustomerCredentials(CustomerCredentials customerCredentials) {
        this.customerCredentials = customerCredentials;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OptOutPreferenceInput(customerCredentials=");
        sb.append(String.valueOf(this.customerCredentials));
        sb.append(", customerId=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.customerId, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
