package com.amazon.identity.auth.device.api;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.a0;
import com.amazon.identity.auth.device.b6;
import com.amazon.identity.auth.device.fp;
import com.amazon.identity.auth.device.vb;
import com.amazon.identity.auth.device.yf;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AuthenticatedURLConnection extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final AuthenticatedHttpsURLConnection f470a;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AccountNeedsRecoveryException extends IOException {
        private final Bundle mAccountRecoverContextBundle;

        @FireOsSdk
        public AccountNeedsRecoveryException(String str, Bundle bundle) {
            super(str);
            this.mAccountRecoverContextBundle = bundle;
        }

        @FireOsSdk
        public final Bundle getAccountRecoverContextBundle() {
            return this.mAccountRecoverContextBundle;
        }

        public final Bundle getExtraBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle("com.amazon.identity.mobi.account.recover.context", this.mAccountRecoverContextBundle);
            return bundle;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AuthenticationFailureIOException extends IOException {
        @FireOsSdk
        public AuthenticationFailureIOException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NoCredentialsException extends IOException {
        private static final long serialVersionUID = 1;

        @FireOsSdk
        public NoCredentialsException(String str) {
            super(str);
        }
    }

    @Deprecated
    public AuthenticatedURLConnection(URL url, AuthenticationMethod authenticationMethod) throws IOException {
        super(url);
        this.f470a = (AuthenticatedHttpsURLConnection) openConnection(url, authenticationMethod);
    }

    @FireOsSdk
    public static HttpURLConnection openConnection(HttpURLConnection httpURLConnection, AuthenticationMethod authenticationMethod) throws IOException {
        if (httpURLConnection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Must Specify a URL");
            return null;
        }
        if (authenticationMethod == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Must Specify an Authentication Method");
            return null;
        }
        AuthenticationType parse = AuthenticationType.parse(authenticationMethod.d);
        if (httpURLConnection instanceof HttpsURLConnection) {
            if (parse != AuthenticationType.OAuth || fp.b()) {
                return new AuthenticatedHttpsURLConnection((HttpsURLConnection) httpURLConnection, authenticationMethod);
            }
            authenticationMethod.a(new b6(httpURLConnection) { // from class: com.amazon.identity.auth.device.api.AuthenticatedURLConnection.1
                @Override // com.amazon.identity.auth.device.b6
                public byte[] getBody() {
                    return new byte[0];
                }
            });
            return httpURLConnection;
        }
        if (parse != null && parse.requireHttps()) {
            AtomicFile$$ExternalSyntheticBUOutline0.m(a0.a("The authentication type ", authenticationMethod.d, " can only be used over HTTPS. "));
            return null;
        }
        URL url = httpURLConnection.getURL();
        if (url != null) {
            url.getHost();
        }
        Objects.toString(parse);
        "user".equalsIgnoreCase(Build.TYPE);
        return new AuthenticatedHttpURLConnection(httpURLConnection.getURL(), httpURLConnection, authenticationMethod);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void addRequestProperty(String str, String str2) {
        this.f470a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void connect() throws IOException {
        try {
            this.f470a.connect();
        } catch (IOException e) {
            if (e instanceof SSLHandshakeException) {
                Log.e(yf.a("AuthenticatedURLConnection"), "SSL Handshake fail when establishing connect", e);
            }
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public void disconnect() {
        this.f470a.disconnect();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public boolean getAllowUserInteraction() {
        return this.f470a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public String getCipherSuite() {
        return this.f470a.getCipherSuite();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public int getConnectTimeout() {
        return this.f470a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public Object getContent() throws IOException {
        return this.f470a.getContent();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public String getContentEncoding() {
        return this.f470a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public int getContentLength() {
        return this.f470a.getContentLength();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public String getContentType() {
        return this.f470a.getContentType();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public long getDate() {
        return this.f470a.getDate();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public boolean getDefaultUseCaches() {
        return this.f470a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public boolean getDoInput() {
        return this.f470a.getDoInput();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public boolean getDoOutput() {
        return this.f470a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public InputStream getErrorStream() {
        return this.f470a.getErrorStream();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public long getExpiration() {
        return this.f470a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    @FireOsSdk
    public String getHeaderField(int i) {
        return this.f470a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    @FireOsSdk
    public long getHeaderFieldDate(String str, long j) {
        return this.f470a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public int getHeaderFieldInt(String str, int i) {
        return this.f470a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    @FireOsSdk
    public String getHeaderFieldKey(int i) {
        return this.f470a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public Map<String, List<String>> getHeaderFields() {
        return this.f470a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public HostnameVerifier getHostnameVerifier() {
        return this.f470a.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public long getIfModifiedSince() {
        return this.f470a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public InputStream getInputStream() throws IOException {
        try {
            return this.f470a.getInputStream();
        } catch (IOException e) {
            if (e instanceof SSLHandshakeException) {
                Log.e(yf.a("AuthenticatedURLConnection"), "SSL Handshake fail when getInputStream", e);
            }
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public boolean getInstanceFollowRedirects() {
        return this.f470a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public long getLastModified() {
        return this.f470a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public Certificate[] getLocalCertificates() {
        return this.f470a.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public Principal getLocalPrincipal() {
        return this.f470a.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public OutputStream getOutputStream() throws IOException {
        try {
            return this.f470a.getOutputStream();
        } catch (IOException e) {
            if (e instanceof SSLHandshakeException) {
                Log.e(yf.a("AuthenticatedURLConnection"), "SSL HandShake fail when getOutputStream", e);
            }
            throw e;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f470a.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    @FireOsSdk
    public Permission getPermission() throws IOException {
        return this.f470a.getPermission();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public int getReadTimeout() {
        return this.f470a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public String getRequestMethod() {
        return this.f470a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public Map<String, List<String>> getRequestProperties() {
        return this.f470a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public String getRequestProperty(String str) {
        return this.f470a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public int getResponseCode() throws IOException {
        try {
            return this.f470a.getResponseCode();
        } catch (IOException e) {
            if (e instanceof SSLHandshakeException) {
                Log.e(yf.a("AuthenticatedURLConnection"), "SSL Handshake fail when getResponseCode", e);
            }
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public String getResponseMessage() throws IOException {
        return this.f470a.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f470a.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f470a.getServerCertificates();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public URL getURL() {
        return this.f470a.getURL();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public boolean getUseCaches() {
        return this.f470a.getUseCaches();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setAllowUserInteraction(boolean z) {
        this.f470a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public void setChunkedStreamingMode(int i) {
        this.f470a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setConnectTimeout(int i) {
        this.f470a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setDefaultUseCaches(boolean z) {
        this.f470a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setDoInput(boolean z) {
        this.f470a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setDoOutput(boolean z) {
        this.f470a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public void setFixedLengthStreamingMode(int i) {
        this.f470a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f470a.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setIfModifiedSince(long j) {
        this.f470a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public void setInstanceFollowRedirects(boolean z) {
        this.f470a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setReadTimeout(int i) {
        this.f470a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public void setRequestMethod(String str) throws ProtocolException {
        this.f470a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setRequestProperty(String str, String str2) {
        this.f470a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    @FireOsSdk
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f470a.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public void setUseCaches(boolean z) {
        this.f470a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public String toString() {
        return this.f470a.toString();
    }

    @Override // java.net.HttpURLConnection
    @FireOsSdk
    public boolean usingProxy() {
        return this.f470a.usingProxy();
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f470a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    @FireOsSdk
    public String getHeaderField(String str) {
        return this.f470a.getHeaderField(str);
    }

    @FireOsSdk
    public static HttpURLConnection openConnection(URL url, AuthenticationMethod authenticationMethod) throws IOException {
        if (url == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Must Specify a URL");
            return null;
        }
        if (authenticationMethod != null) {
            URLConnection a2 = vb.a(url);
            if (a2 instanceof HttpURLConnection) {
                return openConnection((HttpURLConnection) a2, authenticationMethod);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Url must be an Https or Http Url");
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Must Specify an Authentication Method");
        return null;
    }
}
