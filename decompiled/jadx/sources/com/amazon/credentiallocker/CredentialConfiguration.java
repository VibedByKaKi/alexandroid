package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("CredentialConfiguration")
@Documentation("privateSharedKey - wifi password for wpa and other network, \"null\" for wep, guest.\n        authenticationMethod - Authentication method for WPA2-Enterprise networks (currently only EAP-TLS is supported)\n        certificateAuthority -\n        authenticationServerCertificates - List of certificates used to identify a trusted network on a supplicant.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class CredentialConfiguration {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.CredentialConfiguration");
    private List<String> authenticationServerCertificates;
    private CertificateAuthority certificateAuthority;
    private String eapAuthenticationMethod;
    private String privateSharedKey;
    private WepKeyConfiguration wepKeyConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<String> authenticationServerCertificates;
        protected CertificateAuthority certificateAuthority;
        protected String eapAuthenticationMethod;
        protected String privateSharedKey;
        protected WepKeyConfiguration wepKeyConfiguration;

        public CredentialConfiguration build() {
            CredentialConfiguration credentialConfiguration = new CredentialConfiguration();
            populate(credentialConfiguration);
            return credentialConfiguration;
        }

        public void populate(CredentialConfiguration credentialConfiguration) {
            credentialConfiguration.setWepKeyConfiguration(this.wepKeyConfiguration);
            credentialConfiguration.setEapAuthenticationMethod(this.eapAuthenticationMethod);
            credentialConfiguration.setCertificateAuthority(this.certificateAuthority);
            credentialConfiguration.setAuthenticationServerCertificates(this.authenticationServerCertificates);
            credentialConfiguration.setPrivateSharedKey(this.privateSharedKey);
        }

        public Builder withAuthenticationServerCertificates(List<String> list) {
            this.authenticationServerCertificates = list;
            return this;
        }

        public Builder withCertificateAuthority(CertificateAuthority certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder withEapAuthenticationMethod(String str) {
            this.eapAuthenticationMethod = str;
            return this;
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
        return Objects.equals(getWepKeyConfiguration(), credentialConfiguration.getWepKeyConfiguration()) && Objects.equals(getEapAuthenticationMethod(), credentialConfiguration.getEapAuthenticationMethod()) && Objects.equals(getCertificateAuthority(), credentialConfiguration.getCertificateAuthority()) && Objects.equals(getAuthenticationServerCertificates(), credentialConfiguration.getAuthenticationServerCertificates()) && Objects.equals(getPrivateSharedKey(), credentialConfiguration.getPrivateSharedKey());
    }

    @ListMemberConstraint(@NestedConstraints)
    public List<String> getAuthenticationServerCertificates() {
        return this.authenticationServerCertificates;
    }

    @Documentation("providerName - provider of the certificate authority, usually an Amazon internal team that has\n        integrated with Credential Locker to become a WPA2-Enterprise network credential provider.\n        id - ID of the certificate authority that will issue certificates to a supplicant.\n        The format of this field will vary depending on the party integrating with CredentialLocker.\n        For Alexa Smart Properties, this ID will be in a directed format\n        (i.e. amzn1.alexa.enterprise.wifi.certificateauthority.did.BASE64-ENCODED-STRING).")
    public CertificateAuthority getCertificateAuthority() {
        return this.certificateAuthority;
    }

    @EnumValues({EapAuthenticationMethod.EAP_TLS})
    @Documentation("Type of the authentication method used in the extensible authentication protocol with the WPA2_EAP network type.\n        Currently, we only support EAP-TLS.")
    public String getEapAuthenticationMethod() {
        return this.eapAuthenticationMethod;
    }

    @Sensitive
    public String getPrivateSharedKey() {
        return this.privateSharedKey;
    }

    public WepKeyConfiguration getWepKeyConfiguration() {
        return this.wepKeyConfiguration;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWepKeyConfiguration(), getEapAuthenticationMethod(), getCertificateAuthority(), getAuthenticationServerCertificates(), getPrivateSharedKey());
    }

    public void setAuthenticationServerCertificates(List<String> list) {
        this.authenticationServerCertificates = list;
    }

    public void setCertificateAuthority(CertificateAuthority certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    public void setEapAuthenticationMethod(String str) {
        this.eapAuthenticationMethod = str;
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
        builder.withEapAuthenticationMethod(getEapAuthenticationMethod());
        builder.withCertificateAuthority(getCertificateAuthority());
        builder.withAuthenticationServerCertificates(getAuthenticationServerCertificates());
        builder.withPrivateSharedKey(getPrivateSharedKey());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialConfiguration(wepKeyConfiguration=");
        sb.append(String.valueOf(this.wepKeyConfiguration));
        sb.append(", eapAuthenticationMethod=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.eapAuthenticationMethod, ", certificateAuthority=", sb);
        sb.append(String.valueOf(this.certificateAuthority));
        sb.append(", authenticationServerCertificates=*** REDACTED ***, privateSharedKey=*** REDACTED ***)");
        return sb.toString();
    }
}
