package com.amazon.alexa.endpoint;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Scope {

    @CheckForNull
    private final String token;

    @CheckForNull
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ScopeBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String token;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ScopeBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Scope build() {
            return new Scope(this.type, this.token);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Scope.ScopeBuilder(type=", this.type, ", token=", this.token, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ScopeBuilder token(@CheckForNull String str) {
            this.token = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ScopeBuilder type(@CheckForNull String str) {
            this.type = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Scope(@CheckForNull String str, @CheckForNull String str2) {
        this.type = str;
        this.token = str2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ScopeBuilder builder() {
        return new ScopeBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        String type = getType();
        String type2 = scope.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String token = getToken();
        String token2 = scope.getToken();
        return token != null ? token.equals(token2) : token2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getToken() {
        return this.token;
    }

    @CheckForNull
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
        String token = getToken();
        return ((hashCode + 59) * 59) + (token != null ? token.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Scope(type=", getType(), ", token=", getToken(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
