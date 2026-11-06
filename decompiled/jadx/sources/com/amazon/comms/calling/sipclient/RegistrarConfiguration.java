package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RegistrarConfiguration {

    @Nullable
    private String authToken;
    private int authTokenIntervalInSecs;
    private final String callId;

    @Nonnull
    private final String domain;
    private final int expires;
    private final Map<String, String> headers;

    @Nullable
    private final String proxyHost;
    private final int proxyPort;

    @Nonnull
    private final String realm;
    private final long receivedTimeMillis;

    @Nonnull
    private final String scheme;

    @Nonnull
    private final String sipInstance;

    @Nonnull
    private final String user;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RegistrarConfigurationBuilder {
        private String authToken;
        private int authTokenIntervalInSecs;
        private String callId;
        private String domain;
        private int expires;
        private Map<String, String> headers;
        private String proxyHost;
        private int proxyPort;
        private String realm;
        private long receivedTimeMillis;
        private String scheme;
        private String sipInstance;
        private String user;

        public RegistrarConfigurationBuilder authToken(@Nullable String str) {
            this.authToken = str;
            return this;
        }

        public RegistrarConfigurationBuilder authTokenIntervalInSecs(int i) {
            this.authTokenIntervalInSecs = i;
            return this;
        }

        public RegistrarConfiguration build() {
            return new RegistrarConfiguration(this.scheme, this.domain, this.user, this.sipInstance, this.expires, this.receivedTimeMillis, this.realm, this.authToken, this.authTokenIntervalInSecs, this.proxyHost, this.proxyPort, this.headers, this.callId);
        }

        public RegistrarConfigurationBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public RegistrarConfigurationBuilder domain(@Nonnull String str) {
            if (str != null) {
                this.domain = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("domain is marked non-null but is null");
            return null;
        }

        public RegistrarConfigurationBuilder expires(int i) {
            this.expires = i;
            return this;
        }

        public RegistrarConfigurationBuilder headers(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public RegistrarConfigurationBuilder proxyHost(@Nullable String str) {
            this.proxyHost = str;
            return this;
        }

        public RegistrarConfigurationBuilder proxyPort(int i) {
            this.proxyPort = i;
            return this;
        }

        public RegistrarConfigurationBuilder realm(@Nonnull String str) {
            if (str != null) {
                this.realm = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("realm is marked non-null but is null");
            return null;
        }

        public RegistrarConfigurationBuilder receivedTimeMillis(long j) {
            this.receivedTimeMillis = j;
            return this;
        }

        public RegistrarConfigurationBuilder scheme(@Nonnull String str) {
            if (str != null) {
                this.scheme = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("scheme is marked non-null but is null");
            return null;
        }

        public RegistrarConfigurationBuilder sipInstance(@Nonnull String str) {
            if (str != null) {
                this.sipInstance = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("sipInstance is marked non-null but is null");
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RegistrarConfiguration.RegistrarConfigurationBuilder(scheme=");
            sb.append(this.scheme);
            sb.append(", domain=");
            sb.append(this.domain);
            sb.append(", user=");
            sb.append(this.user);
            sb.append(", sipInstance=");
            sb.append(this.sipInstance);
            sb.append(", expires=");
            sb.append(this.expires);
            sb.append(", receivedTimeMillis=");
            sb.append(this.receivedTimeMillis);
            sb.append(", realm=");
            sb.append(this.realm);
            sb.append(", authToken=");
            sb.append(this.authToken);
            sb.append(", authTokenIntervalInSecs=");
            sb.append(this.authTokenIntervalInSecs);
            sb.append(", proxyHost=");
            sb.append(this.proxyHost);
            sb.append(", proxyPort=");
            sb.append(this.proxyPort);
            sb.append(", headers=");
            sb.append(this.headers);
            sb.append(", callId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.callId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public RegistrarConfigurationBuilder user(@Nonnull String str) {
            if (str != null) {
                this.user = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("user is marked non-null but is null");
            return null;
        }
    }

    public RegistrarConfiguration(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull String str4, int i, long j, @Nonnull String str5, @Nullable String str6, int i2, @Nullable String str7, int i3, Map<String, String> map, String str8) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("scheme is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("domain is marked non-null but is null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("user is marked non-null but is null");
            throw null;
        }
        if (str4 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sipInstance is marked non-null but is null");
            throw null;
        }
        if (str5 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("realm is marked non-null but is null");
            throw null;
        }
        this.scheme = str;
        this.domain = str2;
        this.user = str3;
        this.sipInstance = str4;
        this.expires = i;
        this.receivedTimeMillis = j;
        this.realm = str5;
        this.authToken = str6;
        this.authTokenIntervalInSecs = i2;
        this.proxyHost = str7;
        this.proxyPort = i3;
        this.headers = map;
        this.callId = str8;
    }

    public static RegistrarConfigurationBuilder builder() {
        return new RegistrarConfigurationBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegistrarConfiguration)) {
            return false;
        }
        RegistrarConfiguration registrarConfiguration = (RegistrarConfiguration) obj;
        if (getExpires() != registrarConfiguration.getExpires() || getProxyPort() != registrarConfiguration.getProxyPort()) {
            return false;
        }
        String scheme = getScheme();
        String scheme2 = registrarConfiguration.getScheme();
        if (scheme != null ? !scheme.equals(scheme2) : scheme2 != null) {
            return false;
        }
        String domain = getDomain();
        String domain2 = registrarConfiguration.getDomain();
        if (domain != null ? !domain.equals(domain2) : domain2 != null) {
            return false;
        }
        String user = getUser();
        String user2 = registrarConfiguration.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String sipInstance = getSipInstance();
        String sipInstance2 = registrarConfiguration.getSipInstance();
        if (sipInstance != null ? !sipInstance.equals(sipInstance2) : sipInstance2 != null) {
            return false;
        }
        String realm = getRealm();
        String realm2 = registrarConfiguration.getRealm();
        if (realm != null ? !realm.equals(realm2) : realm2 != null) {
            return false;
        }
        String proxyHost = getProxyHost();
        String proxyHost2 = registrarConfiguration.getProxyHost();
        return proxyHost != null ? proxyHost.equals(proxyHost2) : proxyHost2 == null;
    }

    @Nullable
    public String getAuthToken() {
        return this.authToken;
    }

    public int getAuthTokenIntervalInSecs() {
        return this.authTokenIntervalInSecs;
    }

    public String getCallId() {
        return this.callId;
    }

    @Nonnull
    public String getDomain() {
        return this.domain;
    }

    public int getExpires() {
        return this.expires;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public String getProxyHost() {
        return this.proxyHost;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    @Nonnull
    public String getRealm() {
        return this.realm;
    }

    public long getReceivedTimeMillis() {
        return this.receivedTimeMillis;
    }

    @Nonnull
    public String getScheme() {
        return this.scheme;
    }

    @Nonnull
    public String getSipInstance() {
        return this.sipInstance;
    }

    @Nonnull
    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        int proxyPort = getProxyPort() + ((getExpires() + 59) * 59);
        String scheme = getScheme();
        int hashCode = (proxyPort * 59) + (scheme == null ? 43 : scheme.hashCode());
        String domain = getDomain();
        int hashCode2 = (hashCode * 59) + (domain == null ? 43 : domain.hashCode());
        String user = getUser();
        int hashCode3 = (hashCode2 * 59) + (user == null ? 43 : user.hashCode());
        String sipInstance = getSipInstance();
        int hashCode4 = (hashCode3 * 59) + (sipInstance == null ? 43 : sipInstance.hashCode());
        String realm = getRealm();
        int i = hashCode4 * 59;
        int hashCode5 = realm == null ? 43 : realm.hashCode();
        String proxyHost = getProxyHost();
        return ((i + hashCode5) * 59) + (proxyHost != null ? proxyHost.hashCode() : 43);
    }

    public void setAuthToken(@Nullable String str) {
        this.authToken = str;
    }

    public void setAuthTokenIntervalInSecs(int i) {
        this.authTokenIntervalInSecs = i;
    }

    public RegistrarConfigurationBuilder toBuilder() {
        return new RegistrarConfigurationBuilder().scheme(this.scheme).domain(this.domain).user(this.user).sipInstance(this.sipInstance).expires(this.expires).receivedTimeMillis(this.receivedTimeMillis).realm(this.realm).authToken(this.authToken).authTokenIntervalInSecs(this.authTokenIntervalInSecs).proxyHost(this.proxyHost).proxyPort(this.proxyPort).headers(this.headers).callId(this.callId);
    }

    public String toString() {
        return "RegistrarConfiguration(scheme=" + getScheme() + ", domain=" + getDomain() + ", user=" + getUser() + ", sipInstance=" + getSipInstance() + ", expires=" + getExpires() + ", receivedTimeMillis=" + getReceivedTimeMillis() + ", realm=" + getRealm() + ", authTokenIntervalInSecs=" + getAuthTokenIntervalInSecs() + ", proxyHost=" + getProxyHost() + ", proxyPort=" + getProxyPort() + ", headers=" + getHeaders() + ", callId=" + getCallId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
