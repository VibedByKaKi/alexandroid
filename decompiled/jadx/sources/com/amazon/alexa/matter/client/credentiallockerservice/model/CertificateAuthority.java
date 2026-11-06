package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CertificateAuthority {
    private final String id;
    private final String providerName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CertificateAuthorityBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String id;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String providerName;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateAuthorityBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateAuthority build() {
            return new CertificateAuthority(this.providerName, this.id);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateAuthorityBuilder id(String str) {
            this.id = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateAuthorityBuilder providerName(String str) {
            this.providerName = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CertificateAuthority.CertificateAuthorityBuilder(providerName=");
            sb.append(this.providerName);
            sb.append(", id=");
            return a$$ExternalSyntheticOutline0.m(sb, this.id, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CertificateAuthority() {
        this.providerName = null;
        this.id = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CertificateAuthorityBuilder builder() {
        return new CertificateAuthorityBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificateAuthority)) {
            return false;
        }
        CertificateAuthority certificateAuthority = (CertificateAuthority) obj;
        String providerName = getProviderName();
        String providerName2 = certificateAuthority.getProviderName();
        if (providerName != null ? !providerName.equals(providerName2) : providerName2 != null) {
            return false;
        }
        String id = getId();
        String id2 = certificateAuthority.getId();
        return id != null ? id.equals(id2) : id2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getId() {
        return this.id;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getProviderName() {
        return this.providerName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String providerName = getProviderName();
        int hashCode = providerName == null ? 43 : providerName.hashCode();
        String id = getId();
        return ((hashCode + 59) * 59) + (id != null ? id.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CertificateAuthority(providerName=" + getProviderName() + ", id=" + getId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateAuthority withId(String str) {
        return this.id == str ? this : new CertificateAuthority(this.providerName, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateAuthority withProviderName(String str) {
        return this.providerName == str ? this : new CertificateAuthority(str, this.id);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateAuthority(String str, String str2) {
        this.providerName = str;
        this.id = str2;
    }
}
