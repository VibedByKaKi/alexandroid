package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.ProvisioneeDetails;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("NetworkedProvisioneeDetails")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class NetworkedProvisioneeDetails extends ProvisioneeDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.NetworkedProvisioneeDetails");
    private String authMaterialIndex;
    private String productIndex;
    private ProvisionableInfo provisioneeInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends ProvisioneeDetails.Builder {
        protected String authMaterialIndex;
        protected String productIndex;
        protected ProvisionableInfo provisioneeInfo;

        public NetworkedProvisioneeDetails build() {
            NetworkedProvisioneeDetails networkedProvisioneeDetails = new NetworkedProvisioneeDetails();
            populate(networkedProvisioneeDetails);
            return networkedProvisioneeDetails;
        }

        public void populate(NetworkedProvisioneeDetails networkedProvisioneeDetails) {
            super.populate((ProvisioneeDetails) networkedProvisioneeDetails);
            networkedProvisioneeDetails.setProductIndex(this.productIndex);
            networkedProvisioneeDetails.setAuthMaterialIndex(this.authMaterialIndex);
            networkedProvisioneeDetails.setProvisioneeInfo(this.provisioneeInfo);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withProvisioneeInfo(ProvisionableInfo provisionableInfo) {
            this.provisioneeInfo = provisionableInfo;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkedProvisioneeDetails)) {
            return false;
        }
        NetworkedProvisioneeDetails networkedProvisioneeDetails = (NetworkedProvisioneeDetails) obj;
        return super.equals(obj) && Objects.equals(getProductIndex(), networkedProvisioneeDetails.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), networkedProvisioneeDetails.getAuthMaterialIndex()) && Objects.equals(getProvisioneeInfo(), networkedProvisioneeDetails.getProvisioneeInfo());
    }

    @Required
    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    public ProvisionableInfo getProvisioneeInfo() {
        return this.provisioneeInfo;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), getProvisioneeInfo());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setProvisioneeInfo(ProvisionableInfo provisionableInfo) {
        this.provisioneeInfo = provisionableInfo;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withProvisioneeInfo(getProvisioneeInfo());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.ProvisioneeDetails
    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkedProvisioneeDetails(super=");
        sb.append(super.toString());
        sb.append(", , , productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", provisioneeInfo=", sb);
        sb.append(String.valueOf(this.provisioneeInfo));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
