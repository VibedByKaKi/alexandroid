package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("GetCustomerDevicesCredentialsInput")
@Documentation("Input structure for the \"Get Customer Devices Credentials\" API. It will take a list\n        of CredentialRequests and a provisionerInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetCustomerDevicesCredentialsInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.GetCustomerDevicesCredentialsInput");
    private List<CredentialRequest> credentialRequests;
    private ProvisionerInfo provisionerInfo;

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
        if (!(obj instanceof GetCustomerDevicesCredentialsInput)) {
            return false;
        }
        GetCustomerDevicesCredentialsInput getCustomerDevicesCredentialsInput = (GetCustomerDevicesCredentialsInput) obj;
        return super.equals(obj) && Objects.equals(getCredentialRequests(), getCustomerDevicesCredentialsInput.getCredentialRequests()) && Objects.equals(getProvisionerInfo(), getCustomerDevicesCredentialsInput.getProvisionerInfo());
    }

    public List<CredentialRequest> getCredentialRequests() {
        return this.credentialRequests;
    }

    @Required
    public ProvisionerInfo getProvisionerInfo() {
        return this.provisionerInfo;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getCredentialRequests(), getProvisionerInfo());
    }

    public void setCredentialRequests(List<CredentialRequest> list) {
        this.credentialRequests = list;
    }

    public void setProvisionerInfo(ProvisionerInfo provisionerInfo) {
        this.provisionerInfo = provisionerInfo;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withCredentialRequests(getCredentialRequests());
        builder.withProvisionerInfo(getProvisionerInfo());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("GetCustomerDevicesCredentialsInput(super=");
        sb.append(super.toString());
        sb.append(", , credentialRequests=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", provisionerInfo=", (List) this.credentialRequests, sb);
        sb.append(String.valueOf(this.provisionerInfo));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected List<CredentialRequest> credentialRequests;
        protected ProvisionerInfo provisionerInfo;

        public GetCustomerDevicesCredentialsInput build() {
            GetCustomerDevicesCredentialsInput getCustomerDevicesCredentialsInput = new GetCustomerDevicesCredentialsInput();
            populate(getCustomerDevicesCredentialsInput);
            return getCustomerDevicesCredentialsInput;
        }

        public void populate(GetCustomerDevicesCredentialsInput getCustomerDevicesCredentialsInput) {
            super.populate((AuthenticatedInput) getCustomerDevicesCredentialsInput);
            getCustomerDevicesCredentialsInput.setCredentialRequests(this.credentialRequests);
            getCustomerDevicesCredentialsInput.setProvisionerInfo(this.provisionerInfo);
        }

        public Builder withCredentialRequests(List<CredentialRequest> list) {
            this.credentialRequests = list;
            return this;
        }

        public Builder withProvisionerInfo(ProvisionerInfo provisionerInfo) {
            this.provisionerInfo = provisionerInfo;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
