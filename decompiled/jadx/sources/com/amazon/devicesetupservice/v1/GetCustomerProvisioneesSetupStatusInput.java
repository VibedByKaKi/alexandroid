package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.ProvisioneeIdentifier;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetCustomerProvisioneesSetupStatusInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetCustomerProvisioneesSetupStatusInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetCustomerProvisioneesSetupStatusInput");
    private String customerId;
    private List<ProvisioneeIdentifier> provisioneeIdentifiers;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCustomerProvisioneesSetupStatusInput)) {
            return false;
        }
        GetCustomerProvisioneesSetupStatusInput getCustomerProvisioneesSetupStatusInput = (GetCustomerProvisioneesSetupStatusInput) obj;
        return super.equals(obj) && Objects.equals(getCustomerId(), getCustomerProvisioneesSetupStatusInput.getCustomerId()) && Objects.equals(getProvisioneeIdentifiers(), getCustomerProvisioneesSetupStatusInput.getProvisioneeIdentifiers());
    }

    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getCustomerId() {
        return this.customerId;
    }

    @Documentation("A list of ProvisioneeIdentifier, objects can be null.")
    public List<ProvisioneeIdentifier> getProvisioneeIdentifiers() {
        return this.provisioneeIdentifiers;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getCustomerId(), getProvisioneeIdentifiers());
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setProvisioneeIdentifiers(List<ProvisioneeIdentifier> list) {
        this.provisioneeIdentifiers = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withCustomerId(getCustomerId());
        builder.withProvisioneeIdentifiers(getProvisioneeIdentifiers());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("GetCustomerProvisioneesSetupStatusInput(super=");
        sb.append(super.toString());
        sb.append(", , customerId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerId, ", provisioneeIdentifiers=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.provisioneeIdentifiers, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String customerId;
        protected List<ProvisioneeIdentifier> provisioneeIdentifiers;

        public GetCustomerProvisioneesSetupStatusInput build() {
            GetCustomerProvisioneesSetupStatusInput getCustomerProvisioneesSetupStatusInput = new GetCustomerProvisioneesSetupStatusInput();
            populate(getCustomerProvisioneesSetupStatusInput);
            return getCustomerProvisioneesSetupStatusInput;
        }

        public void populate(GetCustomerProvisioneesSetupStatusInput getCustomerProvisioneesSetupStatusInput) {
            super.populate((AuthenticatedInput) getCustomerProvisioneesSetupStatusInput);
            getCustomerProvisioneesSetupStatusInput.setCustomerId(this.customerId);
            getCustomerProvisioneesSetupStatusInput.setProvisioneeIdentifiers(this.provisioneeIdentifiers);
        }

        public Builder withCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public Builder withProvisioneeIdentifiers(List<ProvisioneeIdentifier> list) {
            this.provisioneeIdentifiers = list;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
