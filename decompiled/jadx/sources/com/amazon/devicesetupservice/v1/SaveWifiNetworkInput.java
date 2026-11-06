package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
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
import com.amazon.devicesetupservice.reporting.KeyExchangeMethod;
import com.amazon.devicesetupservice.reporting.ProvisioningMethod;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("SaveWifiNetworkInput")
@Documentation("Input structure for the \"save Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SaveWifiNetworkInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.SaveWifiNetworkInput");
    private String authMaterialIndex;
    private String keyExchangeMethod;
    private WifiNetworkInfo oldWifiNetwork;
    private String productIndex;
    private String provisioningMethod;
    private String sessionToken;
    private String trustMethod;
    private WifiConfiguration wifiConfig;

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
        if (!(obj instanceof SaveWifiNetworkInput)) {
            return false;
        }
        SaveWifiNetworkInput saveWifiNetworkInput = (SaveWifiNetworkInput) obj;
        return super.equals(obj) && Objects.equals(getProductIndex(), saveWifiNetworkInput.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), saveWifiNetworkInput.getAuthMaterialIndex()) && Objects.equals(getProvisioningMethod(), saveWifiNetworkInput.getProvisioningMethod()) && Objects.equals(getTrustMethod(), saveWifiNetworkInput.getTrustMethod()) && Objects.equals(getKeyExchangeMethod(), saveWifiNetworkInput.getKeyExchangeMethod()) && Objects.equals(getWifiConfig(), saveWifiNetworkInput.getWifiConfig()) && Objects.equals(getSessionToken(), saveWifiNetworkInput.getSessionToken()) && Objects.equals(getOldWifiNetwork(), saveWifiNetworkInput.getOldWifiNetwork());
    }

    @Required
    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @EnumValues({KeyExchangeMethod.ECDHE, KeyExchangeMethod.JPAKE})
    @Required
    public String getKeyExchangeMethod() {
        return this.keyExchangeMethod;
    }

    public WifiNetworkInfo getOldWifiNetwork() {
        return this.oldWifiNetwork;
    }

    @MaxLength(4)
    @Required
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @EnumValues({ProvisioningMethod.FFS, "MANUAL", ProvisioningMethod.WIFI_FFS, ProvisioningMethod.SH_PHILIPS, "MATTER"})
    @Required
    public String getProvisioningMethod() {
        return this.provisioningMethod;
    }

    @MaxLength(36)
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getSessionToken() {
        return this.sessionToken;
    }

    @EnumValues({"AUTHENTICATED", "UNAUTHENTICATED", "NONE"})
    @Required
    public String getTrustMethod() {
        return this.trustMethod;
    }

    @Required
    public WifiConfiguration getWifiConfig() {
        return this.wifiConfig;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), getProvisioningMethod(), getTrustMethod(), getKeyExchangeMethod(), getWifiConfig(), getSessionToken(), getOldWifiNetwork());
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setKeyExchangeMethod(String str) {
        this.keyExchangeMethod = str;
    }

    public void setOldWifiNetwork(WifiNetworkInfo wifiNetworkInfo) {
        this.oldWifiNetwork = wifiNetworkInfo;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setProvisioningMethod(String str) {
        this.provisioningMethod = str;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public void setTrustMethod(String str) {
        this.trustMethod = str;
    }

    public void setWifiConfig(WifiConfiguration wifiConfiguration) {
        this.wifiConfig = wifiConfiguration;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withProvisioningMethod(getProvisioningMethod());
        builder.withTrustMethod(getTrustMethod());
        builder.withKeyExchangeMethod(getKeyExchangeMethod());
        builder.withWifiConfig(getWifiConfig());
        builder.withSessionToken(getSessionToken());
        builder.withOldWifiNetwork(getOldWifiNetwork());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("SaveWifiNetworkInput(super=");
        sb.append(super.toString());
        sb.append(", , , , , , , , productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", provisioningMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningMethod, ", trustMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.trustMethod, ", keyExchangeMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.keyExchangeMethod, ", wifiConfig=", sb);
        sb.append(String.valueOf(this.wifiConfig));
        sb.append(", sessionToken=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sessionToken, ", oldWifiNetwork=", sb);
        sb.append(String.valueOf(this.oldWifiNetwork));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected String authMaterialIndex;
        protected String keyExchangeMethod;
        protected WifiNetworkInfo oldWifiNetwork;
        protected String productIndex;
        protected String provisioningMethod;
        protected String sessionToken;
        protected String trustMethod;
        protected WifiConfiguration wifiConfig;

        public SaveWifiNetworkInput build() {
            SaveWifiNetworkInput saveWifiNetworkInput = new SaveWifiNetworkInput();
            populate(saveWifiNetworkInput);
            return saveWifiNetworkInput;
        }

        public void populate(SaveWifiNetworkInput saveWifiNetworkInput) {
            super.populate((AuthenticatedInput) saveWifiNetworkInput);
            saveWifiNetworkInput.setProductIndex(this.productIndex);
            saveWifiNetworkInput.setAuthMaterialIndex(this.authMaterialIndex);
            saveWifiNetworkInput.setProvisioningMethod(this.provisioningMethod);
            saveWifiNetworkInput.setTrustMethod(this.trustMethod);
            saveWifiNetworkInput.setKeyExchangeMethod(this.keyExchangeMethod);
            saveWifiNetworkInput.setWifiConfig(this.wifiConfig);
            saveWifiNetworkInput.setSessionToken(this.sessionToken);
            saveWifiNetworkInput.setOldWifiNetwork(this.oldWifiNetwork);
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withKeyExchangeMethod(String str) {
            this.keyExchangeMethod = str;
            return this;
        }

        public Builder withOldWifiNetwork(WifiNetworkInfo wifiNetworkInfo) {
            this.oldWifiNetwork = wifiNetworkInfo;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withProvisioningMethod(String str) {
            this.provisioningMethod = str;
            return this;
        }

        public Builder withSessionToken(String str) {
            this.sessionToken = str;
            return this;
        }

        public Builder withTrustMethod(String str) {
            this.trustMethod = str;
            return this;
        }

        public Builder withWifiConfig(WifiConfiguration wifiConfiguration) {
            this.wifiConfig = wifiConfiguration;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
