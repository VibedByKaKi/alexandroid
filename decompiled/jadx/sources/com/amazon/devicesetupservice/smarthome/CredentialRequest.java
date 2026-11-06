package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("CredentialRequest")
@Documentation("A request object that the clients need to fill in with protocolType (required) and\n        an optional list of authMaterialIds.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CredentialRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.CredentialRequest");
    private List<String> authMaterialIdList;
    private MatterProvisioneeDetails matterProvisioneeDetails;
    private String protocolType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<String> authMaterialIdList;
        protected MatterProvisioneeDetails matterProvisioneeDetails;
        protected String protocolType;

        public CredentialRequest build() {
            CredentialRequest credentialRequest = new CredentialRequest();
            populate(credentialRequest);
            return credentialRequest;
        }

        public void populate(CredentialRequest credentialRequest) {
            credentialRequest.setProtocolType(this.protocolType);
            credentialRequest.setMatterProvisioneeDetails(this.matterProvisioneeDetails);
            credentialRequest.setAuthMaterialIdList(this.authMaterialIdList);
        }

        public Builder withAuthMaterialIdList(List<String> list) {
            this.authMaterialIdList = list;
            return this;
        }

        public Builder withMatterProvisioneeDetails(MatterProvisioneeDetails matterProvisioneeDetails) {
            this.matterProvisioneeDetails = matterProvisioneeDetails;
            return this;
        }

        public Builder withProtocolType(String str) {
            this.protocolType = str;
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
        if (!(obj instanceof CredentialRequest)) {
            return false;
        }
        CredentialRequest credentialRequest = (CredentialRequest) obj;
        return Objects.equals(getProtocolType(), credentialRequest.getProtocolType()) && Objects.equals(getMatterProvisioneeDetails(), credentialRequest.getMatterProvisioneeDetails()) && Objects.equals(getAuthMaterialIdList(), credentialRequest.getAuthMaterialIdList());
    }

    @ListMemberConstraint(@NestedConstraints)
    public List<String> getAuthMaterialIdList() {
        return this.authMaterialIdList;
    }

    @Documentation("Matter provisionee details from a BLE beacon.")
    public MatterProvisioneeDetails getMatterProvisioneeDetails() {
        return this.matterProvisioneeDetails;
    }

    @EnumValues({ProtocolType.ZIGBEE, ProtocolType.BLE, ProtocolType.BLE_MESH, ProtocolType.WIFI, "MATTER", ProtocolType.THREAD})
    @Required
    public String getProtocolType() {
        return this.protocolType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProtocolType(), getMatterProvisioneeDetails(), getAuthMaterialIdList());
    }

    public void setAuthMaterialIdList(List<String> list) {
        this.authMaterialIdList = list;
    }

    public void setMatterProvisioneeDetails(MatterProvisioneeDetails matterProvisioneeDetails) {
        this.matterProvisioneeDetails = matterProvisioneeDetails;
    }

    public void setProtocolType(String str) {
        this.protocolType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProtocolType(getProtocolType());
        builder.withMatterProvisioneeDetails(getMatterProvisioneeDetails());
        builder.withAuthMaterialIdList(getAuthMaterialIdList());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialRequest(protocolType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.protocolType, ", matterProvisioneeDetails=", sb);
        sb.append(String.valueOf(this.matterProvisioneeDetails));
        sb.append(", authMaterialIdList=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.authMaterialIdList, sb);
    }
}
