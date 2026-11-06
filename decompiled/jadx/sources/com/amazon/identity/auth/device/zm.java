package com.amazon.identity.auth.device;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zm extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1112a;
    public final HttpURLConnection b;
    public byte[] c;
    public IOException d;
    public byte[] e;

    public zm(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.f1112a = new Object[0];
        this.b = httpURLConnection;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.b.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.b.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.b.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.b.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.b.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.b.getContent();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.b.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.b.getContentLength();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.b.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.b.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.b.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.b.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.b.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        ByteArrayInputStream byteArrayInputStream;
        synchronized (this.f1112a) {
            if (this.e == null) {
                try {
                    try {
                        InputStream errorStream = this.b.getErrorStream();
                        if (errorStream != null) {
                            this.e = mo.a(errorStream);
                        } else {
                            Log.i(yf.a("ResetableHttpURLConnection"), "No Error Stream found");
                            this.e = new byte[0];
                        }
                        mo.a((Closeable) errorStream);
                    } catch (IOException unused) {
                        this.e = new byte[0];
                        mo.a((Closeable) null);
                    }
                } catch (Throwable th) {
                    mo.a((Closeable) null);
                    throw th;
                }
            }
            byteArrayInputStream = new ByteArrayInputStream(this.e);
        }
        return byteArrayInputStream;
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.b.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.b.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        return this.b.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        return this.b.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.b.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.b.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.b.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        ByteArrayInputStream byteArrayInputStream;
        synchronized (this.f1112a) {
            if (this.c == null && this.d == null) {
                InputStream inputStream = null;
                try {
                    try {
                        inputStream = this.b.getInputStream();
                        this.c = mo.a(inputStream);
                    } catch (IOException e) {
                        this.c = new byte[0];
                        this.d = e;
                        throw e;
                    }
                } finally {
                    mo.a((Closeable) inputStream);
                }
            }
            IOException iOException = this.d;
            if (iOException != null) {
                throw iOException;
            }
            byteArrayInputStream = new ByteArrayInputStream(this.c);
        }
        return byteArrayInputStream;
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.b.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.b.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.b.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.b.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.b.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.b.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.b.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.b.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.b.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.b.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.b.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.b.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.b.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.b.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.b.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.b.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.b.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.b.setDoInput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.b.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.b.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.b.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.b.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.b.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.b.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.b.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.b.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.b.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.b.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.b.getHeaderField(str);
    }
}
