package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
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
@XmlName("InternalGetCustomerProvisioneeZeroTouchSetupStatusInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalGetCustomerProvisioneeZeroTouchSetupStatusInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalGetCustomerProvisioneeZeroTouchSetupStatusInput");
    private AuthMaterialIdentifier authMaterialIdentifier;
    private String customerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected AuthMaterialIdentifier authMaterialIdentifier;
        protected String customerId;

        public InternalGetCustomerProvisioneeZeroTouchSetupStatusInput build() {
            InternalGetCustomerProvisioneeZeroTouchSetupStatusInput internalGetCustomerProvisioneeZeroTouchSetupStatusInput = new InternalGetCustomerProvisioneeZeroTouchSetupStatusInput();
            populate(internalGetCustomerProvisioneeZeroTouchSetupStatusInput);
            return internalGetCustomerProvisioneeZeroTouchSetupStatusInput;
        }

        public void populate(InternalGetCustomerProvisioneeZeroTouchSetupStatusInput internalGetCustomerProvisioneeZeroTouchSetupStatusInput) {
            internalGetCustomerProvisioneeZeroTouchSetupStatusInput.setCustomerId(this.customerId);
            internalGetCustomerProvisioneeZeroTouchSetupStatusInput.setAuthMaterialIdentifier(this.authMaterialIdentifier);
        }

        public Builder withAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
            this.authMaterialIdentifier = authMaterialIdentifier;
            return this;
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
        if (!(obj instanceof InternalGetCustomerProvisioneeZeroTouchSetupStatusInput)) {
            return false;
        }
        InternalGetCustomerProvisioneeZeroTouchSetupStatusInput internalGetCustomerProvisioneeZeroTouchSetupStatusInput = (InternalGetCustomerProvisioneeZeroTouchSetupStatusInput) obj;
        return Objects.equals(getCustomerId(), internalGetCustomerProvisioneeZeroTouchSetupStatusInput.getCustomerId()) && Objects.equals(getAuthMaterialIdentifier(), internalGetCustomerProvisioneeZeroTouchSetupStatusInput.getAuthMaterialIdentifier());
    }

    @Required
    public AuthMaterialIdentifier getAuthMaterialIdentifier() {
        return this.authMaterialIdentifier;
    }

    @MinLength(1)
    @Required
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerId(), getAuthMaterialIdentifier());
    }

    public void setAuthMaterialIdentifier(AuthMaterialIdentifier authMaterialIdentifier) {
        this.authMaterialIdentifier = authMaterialIdentifier;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerId(getCustomerId());
        builder.withAuthMaterialIdentifier(getAuthMaterialIdentifier());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalGetCustomerProvisioneeZeroTouchSetupStatusInput(customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", authMaterialIdentifier=", sb);
        sb.append(String.valueOf(this.authMaterialIdentifier));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
