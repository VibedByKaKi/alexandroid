package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TurnEndPointInfo {

    @Nonnull
    private final String credential;

    @Nonnull
    private final String url;

    @Nonnull
    private final String username;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TurnEndPointInfoBuilder {
        private String credential;
        private String url;
        private String username;

        public TurnEndPointInfo build() {
            return new TurnEndPointInfo(this.url, this.username, this.credential);
        }

        public TurnEndPointInfoBuilder credential(@Nonnull String str) {
            if (str != null) {
                this.credential = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("credential is marked non-null but is null");
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TurnEndPointInfo.TurnEndPointInfoBuilder(url=");
            sb.append(this.url);
            sb.append(", username=");
            sb.append(this.username);
            sb.append(", credential=");
            return a$$ExternalSyntheticOutline0.m(sb, this.credential, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public TurnEndPointInfoBuilder url(@Nonnull String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("url is marked non-null but is null");
            return null;
        }

        public TurnEndPointInfoBuilder username(@Nonnull String str) {
            if (str != null) {
                this.username = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("username is marked non-null but is null");
            return null;
        }
    }

    public TurnEndPointInfo(@Nonnull String str, @Nonnull String str2, @Nonnull String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("url is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("username is marked non-null but is null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("credential is marked non-null but is null");
            throw null;
        }
        this.url = str;
        this.username = str2;
        this.credential = str3;
    }

    public static TurnEndPointInfoBuilder builder() {
        return new TurnEndPointInfoBuilder();
    }

    @Nonnull
    public String getCredential() {
        return this.credential;
    }

    @Nonnull
    public String getUrl() {
        return this.url;
    }

    @Nonnull
    public String getUsername() {
        return this.username;
    }

    public String toString() {
        return "TurnEndPointInfo(url=" + getUrl() + ", username=" + getUsername() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
