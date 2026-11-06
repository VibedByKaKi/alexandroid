package org.apache.http.client.config;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class RequestConfig implements Cloneable {
    public static final RequestConfig DEFAULT = new Builder().build();
    private final boolean authenticationEnabled;
    private final boolean circularRedirectsAllowed;
    private final int connectTimeout;
    private final int connectionRequestTimeout;
    private final boolean contentCompressionEnabled;
    private final String cookieSpec;
    private final boolean expectContinueEnabled;
    private final InetAddress localAddress;
    private final int maxRedirects;
    private final boolean normalizeUri;
    private final HttpHost proxy;
    private final Collection<String> proxyPreferredAuthSchemes;
    private final boolean redirectsEnabled;
    private final boolean relativeRedirectsAllowed;
    private final int socketTimeout;
    private final boolean staleConnectionCheckEnabled;
    private final Collection<String> targetPreferredAuthSchemes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean circularRedirectsAllowed;
        private String cookieSpec;
        private boolean expectContinueEnabled;
        private InetAddress localAddress;
        private HttpHost proxy;
        private Collection<String> proxyPreferredAuthSchemes;
        private Collection<String> targetPreferredAuthSchemes;
        private boolean staleConnectionCheckEnabled = false;
        private boolean redirectsEnabled = true;
        private int maxRedirects = 50;
        private boolean relativeRedirectsAllowed = true;
        private boolean authenticationEnabled = true;
        private int connectionRequestTimeout = -1;
        private int connectTimeout = -1;
        private int socketTimeout = -1;
        private boolean contentCompressionEnabled = true;
        private boolean normalizeUri = true;

        public RequestConfig build() {
            return new RequestConfig(this.expectContinueEnabled, this.proxy, this.localAddress, this.staleConnectionCheckEnabled, this.cookieSpec, this.redirectsEnabled, this.relativeRedirectsAllowed, this.circularRedirectsAllowed, this.maxRedirects, this.authenticationEnabled, this.targetPreferredAuthSchemes, this.proxyPreferredAuthSchemes, this.connectionRequestTimeout, this.connectTimeout, this.socketTimeout, this.contentCompressionEnabled, this.normalizeUri);
        }

        public Builder setAuthenticationEnabled(boolean z) {
            this.authenticationEnabled = z;
            return this;
        }

        public Builder setCircularRedirectsAllowed(boolean z) {
            this.circularRedirectsAllowed = z;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        public Builder setConnectionRequestTimeout(int i) {
            this.connectionRequestTimeout = i;
            return this;
        }

        public Builder setContentCompressionEnabled(boolean z) {
            this.contentCompressionEnabled = z;
            return this;
        }

        public Builder setCookieSpec(String str) {
            this.cookieSpec = str;
            return this;
        }

        @Deprecated
        public Builder setDecompressionEnabled(boolean z) {
            this.contentCompressionEnabled = z;
            return this;
        }

        public Builder setExpectContinueEnabled(boolean z) {
            this.expectContinueEnabled = z;
            return this;
        }

        public Builder setLocalAddress(InetAddress inetAddress) {
            this.localAddress = inetAddress;
            return this;
        }

        public Builder setMaxRedirects(int i) {
            this.maxRedirects = i;
            return this;
        }

        public Builder setNormalizeUri(boolean z) {
            this.normalizeUri = z;
            return this;
        }

        public Builder setProxy(HttpHost httpHost) {
            this.proxy = httpHost;
            return this;
        }

        public Builder setProxyPreferredAuthSchemes(Collection<String> collection) {
            this.proxyPreferredAuthSchemes = collection;
            return this;
        }

        public Builder setRedirectsEnabled(boolean z) {
            this.redirectsEnabled = z;
            return this;
        }

        public Builder setRelativeRedirectsAllowed(boolean z) {
            this.relativeRedirectsAllowed = z;
            return this;
        }

        public Builder setSocketTimeout(int i) {
            this.socketTimeout = i;
            return this;
        }

        @Deprecated
        public Builder setStaleConnectionCheckEnabled(boolean z) {
            this.staleConnectionCheckEnabled = z;
            return this;
        }

        public Builder setTargetPreferredAuthSchemes(Collection<String> collection) {
            this.targetPreferredAuthSchemes = collection;
            return this;
        }
    }

    public RequestConfig(boolean z, HttpHost httpHost, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection<String> collection, Collection<String> collection2, int i2, int i3, int i4, boolean z7, boolean z8) {
        this.expectContinueEnabled = z;
        this.proxy = httpHost;
        this.localAddress = inetAddress;
        this.staleConnectionCheckEnabled = z2;
        this.cookieSpec = str;
        this.redirectsEnabled = z3;
        this.relativeRedirectsAllowed = z4;
        this.circularRedirectsAllowed = z5;
        this.maxRedirects = i;
        this.authenticationEnabled = z6;
        this.targetPreferredAuthSchemes = collection;
        this.proxyPreferredAuthSchemes = collection2;
        this.connectionRequestTimeout = i2;
        this.connectTimeout = i3;
        this.socketTimeout = i4;
        this.contentCompressionEnabled = z7;
        this.normalizeUri = z8;
    }

    public static Builder copy(RequestConfig requestConfig) {
        return new Builder().setExpectContinueEnabled(requestConfig.isExpectContinueEnabled()).setProxy(requestConfig.getProxy()).setLocalAddress(requestConfig.getLocalAddress()).setStaleConnectionCheckEnabled(requestConfig.isStaleConnectionCheckEnabled()).setCookieSpec(requestConfig.getCookieSpec()).setRedirectsEnabled(requestConfig.isRedirectsEnabled()).setRelativeRedirectsAllowed(requestConfig.isRelativeRedirectsAllowed()).setCircularRedirectsAllowed(requestConfig.isCircularRedirectsAllowed()).setMaxRedirects(requestConfig.getMaxRedirects()).setAuthenticationEnabled(requestConfig.isAuthenticationEnabled()).setTargetPreferredAuthSchemes(requestConfig.getTargetPreferredAuthSchemes()).setProxyPreferredAuthSchemes(requestConfig.getProxyPreferredAuthSchemes()).setConnectionRequestTimeout(requestConfig.getConnectionRequestTimeout()).setConnectTimeout(requestConfig.getConnectTimeout()).setSocketTimeout(requestConfig.getSocketTimeout()).setDecompressionEnabled(requestConfig.isDecompressionEnabled()).setContentCompressionEnabled(requestConfig.isContentCompressionEnabled()).setNormalizeUri(requestConfig.isNormalizeUri());
    }

    public static Builder custom() {
        return new Builder();
    }

    public RequestConfig clone() throws CloneNotSupportedException {
        return (RequestConfig) super.clone();
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getConnectionRequestTimeout() {
        return this.connectionRequestTimeout;
    }

    public String getCookieSpec() {
        return this.cookieSpec;
    }

    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public int getMaxRedirects() {
        return this.maxRedirects;
    }

    public HttpHost getProxy() {
        return this.proxy;
    }

    public Collection<String> getProxyPreferredAuthSchemes() {
        return this.proxyPreferredAuthSchemes;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public Collection<String> getTargetPreferredAuthSchemes() {
        return this.targetPreferredAuthSchemes;
    }

    public boolean isAuthenticationEnabled() {
        return this.authenticationEnabled;
    }

    public boolean isCircularRedirectsAllowed() {
        return this.circularRedirectsAllowed;
    }

    public boolean isContentCompressionEnabled() {
        return this.contentCompressionEnabled;
    }

    @Deprecated
    public boolean isDecompressionEnabled() {
        return this.contentCompressionEnabled;
    }

    public boolean isExpectContinueEnabled() {
        return this.expectContinueEnabled;
    }

    public boolean isNormalizeUri() {
        return this.normalizeUri;
    }

    public boolean isRedirectsEnabled() {
        return this.redirectsEnabled;
    }

    public boolean isRelativeRedirectsAllowed() {
        return this.relativeRedirectsAllowed;
    }

    @Deprecated
    public boolean isStaleConnectionCheckEnabled() {
        return this.staleConnectionCheckEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[expectContinueEnabled=");
        sb.append(this.expectContinueEnabled);
        sb.append(", proxy=");
        sb.append(this.proxy);
        sb.append(", localAddress=");
        sb.append(this.localAddress);
        sb.append(", cookieSpec=");
        sb.append(this.cookieSpec);
        sb.append(", redirectsEnabled=");
        sb.append(this.redirectsEnabled);
        sb.append(", relativeRedirectsAllowed=");
        sb.append(this.relativeRedirectsAllowed);
        sb.append(", maxRedirects=");
        sb.append(this.maxRedirects);
        sb.append(", circularRedirectsAllowed=");
        sb.append(this.circularRedirectsAllowed);
        sb.append(", authenticationEnabled=");
        sb.append(this.authenticationEnabled);
        sb.append(", targetPreferredAuthSchemes=");
        sb.append(this.targetPreferredAuthSchemes);
        sb.append(", proxyPreferredAuthSchemes=");
        sb.append(this.proxyPreferredAuthSchemes);
        sb.append(", connectionRequestTimeout=");
        sb.append(this.connectionRequestTimeout);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", socketTimeout=");
        sb.append(this.socketTimeout);
        sb.append(", contentCompressionEnabled=");
        sb.append(this.contentCompressionEnabled);
        sb.append(", normalizeUri=");
        return a$$ExternalSyntheticOutline0.m(sb, this.normalizeUri, MarkdownConstants.RIGHT_BRACKET);
    }

    public RequestConfig() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0, true, true);
    }
}
