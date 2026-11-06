package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CredentialConfiguration {
    private final List<String> authenticationServerCertificates;
    private final CertificateAuthority certificateAuthority;
    private final String eapAuthenticationMethod;
    private final String privateSharedKey;
    private final WepKeyConfiguration wepKeyConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CredentialConfigurationBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<String> authenticationServerCertificates;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CertificateAuthority certificateAuthority;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String eapAuthenticationMethod;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String privateSharedKey;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private WepKeyConfiguration wepKeyConfiguration;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder authenticationServerCertificates(List<String> list) {
            this.authenticationServerCertificates = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfiguration build() {
            return new CredentialConfiguration(this.privateSharedKey, this.authenticationServerCertificates, this.eapAuthenticationMethod, this.certificateAuthority, this.wepKeyConfiguration);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder certificateAuthority(CertificateAuthority certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder eapAuthenticationMethod(String str) {
            this.eapAuthenticationMethod = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder privateSharedKey(String str) {
            this.privateSharedKey = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "CredentialConfiguration.CredentialConfigurationBuilder(privateSharedKey=" + this.privateSharedKey + ", authenticationServerCertificates=" + this.authenticationServerCertificates + ", eapAuthenticationMethod=" + this.eapAuthenticationMethod + ", certificateAuthority=" + this.certificateAuthority + ", wepKeyConfiguration=" + this.wepKeyConfiguration + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigurationBuilder wepKeyConfiguration(WepKeyConfiguration wepKeyConfiguration) {
            this.wepKeyConfiguration = wepKeyConfiguration;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CredentialConfiguration() {
        this.privateSharedKey = null;
        this.authenticationServerCertificates = null;
        this.eapAuthenticationMethod = null;
        this.certificateAuthority = null;
        this.wepKeyConfiguration = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CredentialConfigurationBuilder builder() {
        return new CredentialConfigurationBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CredentialConfiguration)) {
            return false;
        }
        CredentialConfiguration credentialConfiguration = (CredentialConfiguration) obj;
        String privateSharedKey = getPrivateSharedKey();
        String privateSharedKey2 = credentialConfiguration.getPrivateSharedKey();
        if (privateSharedKey != null ? !privateSharedKey.equals(privateSharedKey2) : privateSharedKey2 != null) {
            return false;
        }
        List<String> authenticationServerCertificates = getAuthenticationServerCertificates();
        List<String> authenticationServerCertificates2 = credentialConfiguration.getAuthenticationServerCertificates();
        if (authenticationServerCertificates != null ? !authenticationServerCertificates.equals(authenticationServerCertificates2) : authenticationServerCertificates2 != null) {
            return false;
        }
        String eapAuthenticationMethod = getEapAuthenticationMethod();
        String eapAuthenticationMethod2 = credentialConfiguration.getEapAuthenticationMethod();
        if (eapAuthenticationMethod != null ? !eapAuthenticationMethod.equals(eapAuthenticationMethod2) : eapAuthenticationMethod2 != null) {
            return false;
        }
        CertificateAuthority certificateAuthority = getCertificateAuthority();
        CertificateAuthority certificateAuthority2 = credentialConfiguration.getCertificateAuthority();
        if (certificateAuthority != null ? !certificateAuthority.equals(certificateAuthority2) : certificateAuthority2 != null) {
            return false;
        }
        WepKeyConfiguration wepKeyConfiguration = getWepKeyConfiguration();
        WepKeyConfiguration wepKeyConfiguration2 = credentialConfiguration.getWepKeyConfiguration();
        return wepKeyConfiguration != null ? wepKeyConfiguration.equals(wepKeyConfiguration2) : wepKeyConfiguration2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<String> getAuthenticationServerCertificates() {
        return this.authenticationServerCertificates;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateAuthority getCertificateAuthority() {
        return this.certificateAuthority;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEapAuthenticationMethod() {
        return this.eapAuthenticationMethod;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPrivateSharedKey() {
        return this.privateSharedKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WepKeyConfiguration getWepKeyConfiguration() {
        return this.wepKeyConfiguration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String privateSharedKey = getPrivateSharedKey();
        int hashCode = privateSharedKey == null ? 43 : privateSharedKey.hashCode();
        List<String> authenticationServerCertificates = getAuthenticationServerCertificates();
        int hashCode2 = ((hashCode + 59) * 59) + (authenticationServerCertificates == null ? 43 : authenticationServerCertificates.hashCode());
        String eapAuthenticationMethod = getEapAuthenticationMethod();
        int hashCode3 = (hashCode2 * 59) + (eapAuthenticationMethod == null ? 43 : eapAuthenticationMethod.hashCode());
        CertificateAuthority certificateAuthority = getCertificateAuthority();
        int i = hashCode3 * 59;
        int hashCode4 = certificateAuthority == null ? 43 : certificateAuthority.hashCode();
        WepKeyConfiguration wepKeyConfiguration = getWepKeyConfiguration();
        return ((i + hashCode4) * 59) + (wepKeyConfiguration != null ? wepKeyConfiguration.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CredentialConfiguration(privateSharedKey=" + getPrivateSharedKey() + ", authenticationServerCertificates=" + getAuthenticationServerCertificates() + ", eapAuthenticationMethod=" + getEapAuthenticationMethod() + ", certificateAuthority=" + getCertificateAuthority() + ", wepKeyConfiguration=" + getWepKeyConfiguration() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration withAuthenticationServerCertificates(List<String> list) {
        return this.authenticationServerCertificates == list ? this : new CredentialConfiguration(this.privateSharedKey, list, this.eapAuthenticationMethod, this.certificateAuthority, this.wepKeyConfiguration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration withCertificateAuthority(CertificateAuthority certificateAuthority) {
        return this.certificateAuthority == certificateAuthority ? this : new CredentialConfiguration(this.privateSharedKey, this.authenticationServerCertificates, this.eapAuthenticationMethod, certificateAuthority, this.wepKeyConfiguration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration withEapAuthenticationMethod(String str) {
        return this.eapAuthenticationMethod == str ? this : new CredentialConfiguration(this.privateSharedKey, this.authenticationServerCertificates, str, this.certificateAuthority, this.wepKeyConfiguration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration withPrivateSharedKey(String str) {
        return this.privateSharedKey == str ? this : new CredentialConfiguration(str, this.authenticationServerCertificates, this.eapAuthenticationMethod, this.certificateAuthority, this.wepKeyConfiguration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration withWepKeyConfiguration(WepKeyConfiguration wepKeyConfiguration) {
        return this.wepKeyConfiguration == wepKeyConfiguration ? this : new CredentialConfiguration(this.privateSharedKey, this.authenticationServerCertificates, this.eapAuthenticationMethod, this.certificateAuthority, wepKeyConfiguration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration(String str, List<String> list, String str2, CertificateAuthority certificateAuthority, WepKeyConfiguration wepKeyConfiguration) {
        this.privateSharedKey = str;
        this.authenticationServerCertificates = list;
        this.eapAuthenticationMethod = str2;
        this.certificateAuthority = certificateAuthority;
        this.wepKeyConfiguration = wepKeyConfiguration;
    }
}
