package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("CertificateAuthority")
@Documentation("providerName - provider of the certificate authority, usually an Amazon internal team that has\n        integrated with Credential Locker to become a WPA2-Enterprise network credential provider.\n        id - ID of the certificate authority that will issue certificates to a supplicant.\n        The format of this field will vary depending on the party integrating with CredentialLocker.\n        For Alexa Smart Properties, this ID will be in a directed format\n        (i.e. amzn1.alexa.enterprise.wifi.certificateauthority.did.BASE64-ENCODED-STRING).")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class CertificateAuthority {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.CertificateAuthority");
    private String id;
    private String providerName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String id;
        protected String providerName;

        public CertificateAuthority build() {
            CertificateAuthority certificateAuthority = new CertificateAuthority();
            populate(certificateAuthority);
            return certificateAuthority;
        }

        public void populate(CertificateAuthority certificateAuthority) {
            certificateAuthority.setProviderName(this.providerName);
            certificateAuthority.setId(this.id);
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withProviderName(String str) {
            this.providerName = str;
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
        if (!(obj instanceof CertificateAuthority)) {
            return false;
        }
        CertificateAuthority certificateAuthority = (CertificateAuthority) obj;
        return Objects.equals(getProviderName(), certificateAuthority.getProviderName()) && Objects.equals(getId(), certificateAuthority.getId());
    }

    @Sensitive
    public String getId() {
        return this.id;
    }

    @EnumValues({ProviderName.ALEXA_ENTERPRISE})
    @Documentation("Used in WPA2-Enterprise configurations that have a remote certificate provider.")
    public String getProviderName() {
        return this.providerName;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProviderName(), getId());
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProviderName(getProviderName());
        builder.withId(getId());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.providerName, ", id=*** REDACTED ***)", new StringBuilder("CertificateAuthority(providerName="));
    }
}
