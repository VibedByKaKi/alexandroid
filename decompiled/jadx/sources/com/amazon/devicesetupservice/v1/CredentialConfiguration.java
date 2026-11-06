package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Sensitive;
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
@XmlName("CredentialConfiguration")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CredentialConfiguration {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.CredentialConfiguration");
    private String privateSharedKey;
    private WepKeyConfiguration wepKeyConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String privateSharedKey;
        protected WepKeyConfiguration wepKeyConfiguration;

        public CredentialConfiguration build() {
            CredentialConfiguration credentialConfiguration = new CredentialConfiguration();
            populate(credentialConfiguration);
            return credentialConfiguration;
        }

        public void populate(CredentialConfiguration credentialConfiguration) {
            credentialConfiguration.setWepKeyConfiguration(this.wepKeyConfiguration);
            credentialConfiguration.setPrivateSharedKey(this.privateSharedKey);
        }

        public Builder withPrivateSharedKey(String str) {
            this.privateSharedKey = str;
            return this;
        }

        public Builder withWepKeyConfiguration(WepKeyConfiguration wepKeyConfiguration) {
            this.wepKeyConfiguration = wepKeyConfiguration;
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
        if (!(obj instanceof CredentialConfiguration)) {
            return false;
        }
        CredentialConfiguration credentialConfiguration = (CredentialConfiguration) obj;
        return Objects.equals(getWepKeyConfiguration(), credentialConfiguration.getWepKeyConfiguration()) && Objects.equals(getPrivateSharedKey(), credentialConfiguration.getPrivateSharedKey());
    }

    @Documentation("Private PSKs are unique pre-shared keys created for individuals or\n        groups of users on the same SSID and used for WPA or WPA2 passphrase.")
    @Sensitive
    public String getPrivateSharedKey() {
        return this.privateSharedKey;
    }

    public WepKeyConfiguration getWepKeyConfiguration() {
        return this.wepKeyConfiguration;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWepKeyConfiguration(), getPrivateSharedKey());
    }

    public void setPrivateSharedKey(String str) {
        this.privateSharedKey = str;
    }

    public void setWepKeyConfiguration(WepKeyConfiguration wepKeyConfiguration) {
        this.wepKeyConfiguration = wepKeyConfiguration;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWepKeyConfiguration(getWepKeyConfiguration());
        builder.withPrivateSharedKey(getPrivateSharedKey());
        return builder;
    }

    public String toString() {
        return "CredentialConfiguration(wepKeyConfiguration=" + String.valueOf(this.wepKeyConfiguration) + ", privateSharedKey=*** REDACTED ***)";
    }
}
