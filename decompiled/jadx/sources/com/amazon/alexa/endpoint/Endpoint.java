package com.amazon.alexa.endpoint;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Endpoint {

    @CheckForNull
    private final Cookie cookie;

    @CheckForNull
    private final String endpointId;

    @CheckForNull
    private final Scope scope;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class EndpointBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Cookie cookie;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String endpointId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Scope scope;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EndpointBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Endpoint build() {
            return new Endpoint(this.scope, this.endpointId, this.cookie);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EndpointBuilder cookie(@CheckForNull Cookie cookie) {
            this.cookie = cookie;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EndpointBuilder endpointId(@CheckForNull String str) {
            this.endpointId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EndpointBuilder scope(@CheckForNull Scope scope) {
            this.scope = scope;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String valueOf = String.valueOf(this.scope);
            String str = this.endpointId;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Endpoint.EndpointBuilder(scope=", valueOf, ", endpointId=", str, ", cookie="), String.valueOf(this.cookie), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Endpoint(@CheckForNull Scope scope, @CheckForNull String str, @CheckForNull Cookie cookie) {
        this.scope = scope;
        this.endpointId = str;
        this.cookie = cookie;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static EndpointBuilder builder() {
        return new EndpointBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Endpoint)) {
            return false;
        }
        Endpoint endpoint = (Endpoint) obj;
        Scope scope = getScope();
        Scope scope2 = endpoint.getScope();
        if (scope != null ? !scope.equals(scope2) : scope2 != null) {
            return false;
        }
        String endpointId = getEndpointId();
        String endpointId2 = endpoint.getEndpointId();
        if (endpointId != null ? !endpointId.equals(endpointId2) : endpointId2 != null) {
            return false;
        }
        Cookie cookie = getCookie();
        Cookie cookie2 = endpoint.getCookie();
        return cookie != null ? cookie.equals(cookie2) : cookie2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Cookie getCookie() {
        return this.cookie;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpointId() {
        return this.endpointId;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Scope getScope() {
        return this.scope;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Scope scope = getScope();
        int hashCode = scope == null ? 43 : scope.hashCode();
        String endpointId = getEndpointId();
        int i = (hashCode + 59) * 59;
        int hashCode2 = endpointId == null ? 43 : endpointId.hashCode();
        Cookie cookie = getCookie();
        return ((i + hashCode2) * 59) + (cookie != null ? cookie.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String valueOf = String.valueOf(getScope());
        String endpointId = getEndpointId();
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Endpoint(scope=", valueOf, ", endpointId=", endpointId, ", cookie="), String.valueOf(getCookie()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
