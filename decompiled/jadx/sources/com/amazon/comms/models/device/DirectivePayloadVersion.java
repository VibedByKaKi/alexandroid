package com.amazon.comms.models.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DirectivePayloadVersion {
    private String CLIENT_IDENTIFIER;
    private String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DirectivePayloadVersionBuilder {
        private String CLIENT_IDENTIFIER;
        private String version;

        public DirectivePayloadVersionBuilder CLIENT_IDENTIFIER(String str) {
            this.CLIENT_IDENTIFIER = str;
            return this;
        }

        public DirectivePayloadVersion build() {
            return new DirectivePayloadVersion(this.CLIENT_IDENTIFIER, this.version);
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("DirectivePayloadVersion.DirectivePayloadVersionBuilder(CLIENT_IDENTIFIER=", this.CLIENT_IDENTIFIER, ", version=", this.version, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public DirectivePayloadVersionBuilder version(String str) {
            this.version = str;
            return this;
        }
    }

    public DirectivePayloadVersion() {
        this.CLIENT_IDENTIFIER = "Domain:Application:Communications:Calling";
    }

    public static DirectivePayloadVersionBuilder builder() {
        return new DirectivePayloadVersionBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DirectivePayloadVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectivePayloadVersion)) {
            return false;
        }
        DirectivePayloadVersion directivePayloadVersion = (DirectivePayloadVersion) obj;
        if (!directivePayloadVersion.canEqual(this)) {
            return false;
        }
        String client_identifier = getCLIENT_IDENTIFIER();
        String client_identifier2 = directivePayloadVersion.getCLIENT_IDENTIFIER();
        if (client_identifier != null ? !client_identifier.equals(client_identifier2) : client_identifier2 != null) {
            return false;
        }
        String version = getVersion();
        String version2 = directivePayloadVersion.getVersion();
        return version != null ? version.equals(version2) : version2 == null;
    }

    public String getCLIENT_IDENTIFIER() {
        return this.CLIENT_IDENTIFIER;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String client_identifier = getCLIENT_IDENTIFIER();
        int hashCode = client_identifier == null ? 43 : client_identifier.hashCode();
        String version = getVersion();
        return ((hashCode + 59) * 59) + (version != null ? version.hashCode() : 43);
    }

    public void setCLIENT_IDENTIFIER(String str) {
        this.CLIENT_IDENTIFIER = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("DirectivePayloadVersion(CLIENT_IDENTIFIER=", getCLIENT_IDENTIFIER(), ", version=", getVersion(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public DirectivePayloadVersion(String str, String str2) {
        this.CLIENT_IDENTIFIER = str;
        this.version = str2;
    }
}
