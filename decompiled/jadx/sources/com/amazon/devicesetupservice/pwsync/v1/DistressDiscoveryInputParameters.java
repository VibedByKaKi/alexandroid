package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.DiscoveryInputParameters;
import com.amazon.devicesetupservice.reporting.ProvisioningMethod;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("DistressDiscoveryInputParameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DistressDiscoveryInputParameters extends DiscoveryInputParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.DistressDiscoveryInputParameters");
    private String nonce;
    private List<String> provisioningFlags;
    private String provisioningMethod;
    private String trustMethod;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DiscoveryInputParameters.Builder {
        protected String nonce;
        protected List<String> provisioningFlags;
        protected String provisioningMethod;
        protected String trustMethod;

        public DistressDiscoveryInputParameters build() {
            DistressDiscoveryInputParameters distressDiscoveryInputParameters = new DistressDiscoveryInputParameters();
            populate(distressDiscoveryInputParameters);
            return distressDiscoveryInputParameters;
        }

        public void populate(DistressDiscoveryInputParameters distressDiscoveryInputParameters) {
            super.populate((DiscoveryInputParameters) distressDiscoveryInputParameters);
            distressDiscoveryInputParameters.setNonce(this.nonce);
            distressDiscoveryInputParameters.setTrustMethod(this.trustMethod);
            distressDiscoveryInputParameters.setProvisioningMethod(this.provisioningMethod);
            distressDiscoveryInputParameters.setProvisioningFlags(this.provisioningFlags);
        }

        public Builder withNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder withProvisioningFlags(List<String> list) {
            this.provisioningFlags = list;
            return this;
        }

        public Builder withProvisioningMethod(String str) {
            this.provisioningMethod = str;
            return this;
        }

        public Builder withTrustMethod(String str) {
            this.trustMethod = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistressDiscoveryInputParameters)) {
            return false;
        }
        DistressDiscoveryInputParameters distressDiscoveryInputParameters = (DistressDiscoveryInputParameters) obj;
        return super.equals(obj) && Objects.equals(getNonce(), distressDiscoveryInputParameters.getNonce()) && Objects.equals(getTrustMethod(), distressDiscoveryInputParameters.getTrustMethod()) && Objects.equals(getProvisioningMethod(), distressDiscoveryInputParameters.getProvisioningMethod()) && Objects.equals(getProvisioningFlags(), distressDiscoveryInputParameters.getProvisioningFlags());
    }

    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    @ListMemberConstraint(@NestedConstraints)
    @Documentation("Optional list of arbitrary provisioning flags,\n        see https://w.amazon.com/bin/view/DevicePlatform/DeviceProvisioningSDK/FrustrationFreeSetup/DSS/EventConsumers/#HFieldsandDescription \n        for possible values")
    public List<String> getProvisioningFlags() {
        return this.provisioningFlags;
    }

    @EnumValues({ProvisioningMethod.FFS, "MANUAL", ProvisioningMethod.WIFI_FFS, ProvisioningMethod.SH_PHILIPS, "MATTER"})
    public String getProvisioningMethod() {
        return this.provisioningMethod;
    }

    @EnumValues({"AUTHENTICATED", "UNAUTHENTICATED", "NONE"})
    public String getTrustMethod() {
        return this.trustMethod;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getNonce(), getTrustMethod(), getProvisioningMethod(), getProvisioningFlags());
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setProvisioningFlags(List<String> list) {
        this.provisioningFlags = list;
    }

    public void setProvisioningMethod(String str) {
        this.provisioningMethod = str;
    }

    public void setTrustMethod(String str) {
        this.trustMethod = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withTrustMethod(getTrustMethod());
        builder.withProvisioningMethod(getProvisioningMethod());
        builder.withProvisioningFlags(getProvisioningFlags());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public String toString() {
        StringBuilder sb = new StringBuilder("DistressDiscoveryInputParameters(super=");
        sb.append(super.toString());
        sb.append(", , , , nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", trustMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.trustMethod, ", provisioningMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningMethod, ", provisioningFlags=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.provisioningFlags, sb);
    }
}
