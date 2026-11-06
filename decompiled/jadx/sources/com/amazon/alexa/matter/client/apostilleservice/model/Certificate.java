package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Certificate {
    private final String encoding;
    private final String name;
    private final String type;
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CertificateBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String encoding;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String name;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String value;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Certificate build() {
            return new Certificate(this.type, this.encoding, this.value, this.name);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateBuilder encoding(String str) {
            this.encoding = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateBuilder name(String str) {
            this.name = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("Certificate.CertificateBuilder(type=");
            sb.append(this.type);
            sb.append(", encoding=");
            sb.append(this.encoding);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", name=");
            return a$$ExternalSyntheticOutline0.m(sb, this.name, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateBuilder type(String str) {
            this.type = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateBuilder value(String str) {
            this.value = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Certificate() {
        this.type = null;
        this.encoding = null;
        this.value = null;
        this.name = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CertificateBuilder builder() {
        return new CertificateBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) obj;
        String type = getType();
        String type2 = certificate.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String encoding = getEncoding();
        String encoding2 = certificate.getEncoding();
        if (encoding != null ? !encoding.equals(encoding2) : encoding2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = certificate.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        String name = getName();
        String name2 = certificate.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEncoding() {
        return this.encoding;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getName() {
        return this.name;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getValue() {
        return this.value;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String encoding = getEncoding();
        int hashCode2 = ((hashCode + 59) * 59) + (encoding == null ? 43 : encoding.hashCode());
        String value = getValue();
        int i = hashCode2 * 59;
        int hashCode3 = value == null ? 43 : value.hashCode();
        String name = getName();
        return ((i + hashCode3) * 59) + (name != null ? name.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Certificate(type=" + getType() + ", encoding=" + getEncoding() + ", value=" + getValue() + ", name=" + getName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Certificate withEncoding(String str) {
        return this.encoding == str ? this : new Certificate(this.type, str, this.value, this.name);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Certificate withName(String str) {
        return this.name == str ? this : new Certificate(this.type, this.encoding, this.value, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Certificate withType(String str) {
        return this.type == str ? this : new Certificate(str, this.encoding, this.value, this.name);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Certificate withValue(String str) {
        return this.value == str ? this : new Certificate(this.type, this.encoding, str, this.name);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Certificate(String str, String str2, String str3, String str4) {
        this.type = str;
        this.encoding = str2;
        this.value = str3;
        this.name = str4;
    }
}
