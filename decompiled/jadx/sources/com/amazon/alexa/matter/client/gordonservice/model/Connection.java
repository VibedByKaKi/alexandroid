package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Connection {
    private final String applicationProtocol;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ConnectionBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String applicationProtocol;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ConnectionBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ConnectionBuilder applicationProtocol(String str) {
            this.applicationProtocol = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Connection build() {
            return new Connection(this.type, this.applicationProtocol);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("Connection.ConnectionBuilder(type=");
            sb.append(this.type);
            sb.append(", applicationProtocol=");
            return a$$ExternalSyntheticOutline0.m(sb, this.applicationProtocol, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ConnectionBuilder type(String str) {
            this.type = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Connection() {
        this.type = null;
        this.applicationProtocol = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ConnectionBuilder builder() {
        return new ConnectionBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Connection)) {
            return false;
        }
        Connection connection = (Connection) obj;
        String type = getType();
        String type2 = connection.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String applicationProtocol = getApplicationProtocol();
        String applicationProtocol2 = connection.getApplicationProtocol();
        return applicationProtocol != null ? applicationProtocol.equals(applicationProtocol2) : applicationProtocol2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getApplicationProtocol() {
        return this.applicationProtocol;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String applicationProtocol = getApplicationProtocol();
        return ((hashCode + 59) * 59) + (applicationProtocol != null ? applicationProtocol.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Connection(type=" + getType() + ", applicationProtocol=" + getApplicationProtocol() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Connection withApplicationProtocol(String str) {
        return this.applicationProtocol == str ? this : new Connection(this.type, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Connection withType(String str) {
        return this.type == str ? this : new Connection(str, this.applicationProtocol);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Connection(String str, String str2) {
        this.type = str;
        this.applicationProtocol = str2;
    }
}
