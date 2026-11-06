package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AuthenticationInfo {

    @Nullable
    private final String authToken;

    @Nonnull
    private final String password;

    @Nonnull
    private final String realm;

    @Nonnull
    private final String user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AuthenticationInfoBuilder {
        private String authToken;
        private String password;
        private String realm;
        private String user;

        public AuthenticationInfoBuilder authToken(@Nullable String str) {
            this.authToken = str;
            return this;
        }

        public AuthenticationInfo build() {
            return new AuthenticationInfo(this.realm, this.user, this.password, this.authToken);
        }

        public AuthenticationInfoBuilder password(@Nonnull String str) {
            if (str != null) {
                this.password = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("password is marked non-null but is null");
            return null;
        }

        public AuthenticationInfoBuilder realm(@Nonnull String str) {
            if (str != null) {
                this.realm = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("realm is marked non-null but is null");
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AuthenticationInfo.AuthenticationInfoBuilder(realm=");
            sb.append(this.realm);
            sb.append(", user=");
            sb.append(this.user);
            sb.append(", password=");
            sb.append(this.password);
            sb.append(", authToken=");
            return a$$ExternalSyntheticOutline0.m(sb, this.authToken, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public AuthenticationInfoBuilder user(@Nonnull String str) {
            if (str != null) {
                this.user = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("user is marked non-null but is null");
            return null;
        }
    }

    public AuthenticationInfo(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nullable String str4) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("realm is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("user is marked non-null but is null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("password is marked non-null but is null");
            throw null;
        }
        this.realm = str;
        this.user = str2;
        this.password = str3;
        this.authToken = str4;
    }

    public static AuthenticationInfoBuilder builder() {
        return new AuthenticationInfoBuilder();
    }

    @Nullable
    public String getAuthToken() {
        return this.authToken;
    }

    @Nonnull
    public String getPassword() {
        return this.password;
    }

    @Nonnull
    public String getRealm() {
        return this.realm;
    }

    @Nonnull
    public String getUser() {
        return this.user;
    }

    public String toString() {
        return "AuthenticationInfo(realm=" + getRealm() + ", user=" + getUser() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
