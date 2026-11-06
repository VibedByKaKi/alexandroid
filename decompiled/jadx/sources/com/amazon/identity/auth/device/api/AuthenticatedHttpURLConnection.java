package com.amazon.identity.auth.device.api;

import android.annotation.TargetApi;
import com.amazon.identity.auth.device.b6;
import com.amazon.identity.auth.device.framework.s;
import com.amazon.identity.auth.device.qc;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class AuthenticatedHttpURLConnection extends s {
    private final HttpURLConnection d;
    private final AuthenticationMethod e;
    private final Object[] f;
    private qc g;

    public AuthenticatedHttpURLConnection(URL url, HttpURLConnection httpURLConnection, AuthenticationMethod authenticationMethod) {
        super(url);
        this.f = new Object[0];
        this.e = authenticationMethod;
        this.d = httpURLConnection;
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.d.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.d.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.d.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.d.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.d.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.d.getDoOutput();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.d.getIfModifiedSince();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.d.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        qc qcVar;
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    this.g = new qc(this.d);
                }
                qcVar = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qcVar;
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.d.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.d.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.d.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.d.getRequestProperty(str);
    }

    @Override // com.amazon.identity.auth.device.framework.s, java.net.URLConnection
    public URL getURL() {
        return this.d.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.d.getUseCaches();
    }

    @Override // com.amazon.identity.auth.device.framework.s
    public HttpURLConnection performOnConnectionRequested() throws IOException {
        this.e.a(new b6(this) { // from class: com.amazon.identity.auth.device.api.AuthenticatedHttpURLConnection.1
            @Override // com.amazon.identity.auth.device.b6
            public byte[] getBody() {
                AuthenticatedHttpURLConnection authenticatedHttpURLConnection = (AuthenticatedHttpURLConnection) getUrlConnection();
                synchronized (authenticatedHttpURLConnection.f) {
                    try {
                        qc qcVar = authenticatedHttpURLConnection.g;
                        if (qcVar == null) {
                            return new byte[0];
                        }
                        return qcVar.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        synchronized (this.f) {
            try {
                qc qcVar = this.g;
                if (qcVar != null) {
                    qcVar.a();
                }
            } finally {
            }
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.d.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.d.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.d.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.d.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.d.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.d.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.d.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.d.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.d.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.d.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.d.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.d.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.d.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.d.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.d.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    @TargetApi(19)
    public void setFixedLengthStreamingMode(long j) {
        this.d.setFixedLengthStreamingMode(j);
    }
}
