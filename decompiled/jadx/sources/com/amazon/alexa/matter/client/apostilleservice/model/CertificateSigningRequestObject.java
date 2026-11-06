package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CertificateSigningRequestObject {
    private final String encoding;
    private final String type;
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CertificateSigningRequestObjectBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String encoding;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String value;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateSigningRequestObjectBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateSigningRequestObject build() {
            return new CertificateSigningRequestObject(this.type, this.encoding, this.value);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateSigningRequestObjectBuilder encoding(String str) {
            this.encoding = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CertificateSigningRequestObject.CertificateSigningRequestObjectBuilder(type=");
            sb.append(this.type);
            sb.append(", encoding=");
            sb.append(this.encoding);
            sb.append(", value=");
            return a$$ExternalSyntheticOutline0.m(sb, this.value, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateSigningRequestObjectBuilder type(String str) {
            this.type = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CertificateSigningRequestObjectBuilder value(String str) {
            this.value = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CertificateSigningRequestObject() {
        this.type = null;
        this.encoding = null;
        this.value = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CertificateSigningRequestObjectBuilder builder() {
        return new CertificateSigningRequestObjectBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificateSigningRequestObject)) {
            return false;
        }
        CertificateSigningRequestObject certificateSigningRequestObject = (CertificateSigningRequestObject) obj;
        String type = getType();
        String type2 = certificateSigningRequestObject.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String encoding = getEncoding();
        String encoding2 = certificateSigningRequestObject.getEncoding();
        if (encoding != null ? !encoding.equals(encoding2) : encoding2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = certificateSigningRequestObject.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEncoding() {
        return this.encoding;
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
        int i = (hashCode + 59) * 59;
        int hashCode2 = encoding == null ? 43 : encoding.hashCode();
        String value = getValue();
        return ((i + hashCode2) * 59) + (value != null ? value.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CertificateSigningRequestObject(type=" + getType() + ", encoding=" + getEncoding() + ", value=" + getValue() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateSigningRequestObject withEncoding(String str) {
        return this.encoding == str ? this : new CertificateSigningRequestObject(this.type, str, this.value);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateSigningRequestObject withType(String str) {
        return this.type == str ? this : new CertificateSigningRequestObject(str, this.encoding, this.value);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateSigningRequestObject withValue(String str) {
        return this.value == str ? this : new CertificateSigningRequestObject(this.type, this.encoding, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateSigningRequestObject(String str, String str2, String str3) {
        this.type = str;
        this.encoding = str2;
        this.value = str3;
    }
}
