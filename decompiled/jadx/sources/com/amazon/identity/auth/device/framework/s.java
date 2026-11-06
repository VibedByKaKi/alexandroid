package com.amazon.identity.auth.device.framework;

import android.util.Log;
import com.amazon.identity.auth.device.diagnose.MAPCommonError;
import com.amazon.identity.auth.device.yf;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class s extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private HttpURLConnection f661a;
    private boolean b;
    private IOException c;

    public s(URL url) {
        super(url);
        this.b = false;
        this.c = null;
    }

    private synchronized void a() {
        if (this.b) {
            return;
        }
        if (this.c != null) {
            Log.i(yf.a("WrappableHttpURLConnection"), "The first connection attempt ended in IOException so throwing the same");
            throw this.c;
        }
        try {
            HttpURLConnection performOnConnectionRequested = performOnConnectionRequested();
            this.f661a = performOnConnectionRequested;
            if (performOnConnectionRequested == null) {
                throw new IOException("Connection could not be established");
            }
            this.b = true;
        } catch (IOException e) {
            this.c = e;
            if (e instanceof SSLHandshakeException) {
                Log.e(yf.a("WrappableHttpURLConnection"), "SSL Handshake fail when performOnConnectionRequested", e);
            }
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        try {
            a();
            this.f661a.connect();
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public synchronized void disconnect() {
        if (this.b) {
            this.f661a.disconnect();
        }
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        try {
            a();
            return this.f661a.getContent();
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        try {
            a();
            return this.f661a.getContentEncoding();
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get Content Encoding", e);
            return null;
        }
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        try {
            a();
            return this.f661a.getContentLength();
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get Content Length", e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        try {
            a();
            return this.f661a.getContentType();
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get Content Type", e);
            return null;
        }
    }

    @Override // java.net.URLConnection
    public long getDate() {
        try {
            a();
            return this.f661a.getDate();
        } catch (IOException e) {
            a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get Date", e);
            return 0L;
        }
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        HttpURLConnection httpURLConnection = this.f661a;
        if (httpURLConnection != null) {
            return httpURLConnection.getErrorStream();
        }
        return null;
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        try {
            a();
            return this.f661a.getExpiration();
        } catch (IOException e) {
            a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get expiration", e);
            return 0L;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        try {
            a();
            return this.f661a.getHeaderField(i);
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header field", e);
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        try {
            a();
            return this.f661a.getHeaderFieldDate(str, j);
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header field date", e);
            return j;
        }
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        try {
            a();
            return this.f661a.getHeaderFieldInt(str, i);
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header field int", e);
            return i;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        try {
            a();
            return this.f661a.getHeaderFieldKey(i);
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header field key", e);
            return null;
        }
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            a();
            return this.f661a.getHeaderFields();
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header fields", e);
            return new HashMap();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        try {
            a();
            return this.f661a.getInputStream();
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        try {
            a();
            return this.f661a.getLastModified();
        } catch (IOException e) {
            a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get last modified date", e);
            return 0L;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        try {
            a();
            return this.f661a.getPermission();
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        try {
            a();
            return this.f661a.getResponseCode();
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        try {
            a();
            return this.f661a.getResponseMessage();
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public abstract URL getURL();

    public abstract HttpURLConnection performOnConnectionRequested();

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        try {
            a();
            return this.f661a.getContent(clsArr);
        } catch (IOException e) {
            this.a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        try {
            a();
            return this.f661a.getHeaderField(str);
        } catch (IOException e) {
            this.a(e);
            Log.e(yf.a("WrappableHttpURLConnection"), "Could not get header field", e);
            return null;
        }
    }

    private void a(IOException iOException) {
        String str;
        if (iOException instanceof SSLHandshakeException) {
            URL url = getURL();
            if (url != null) {
                str = "Request host:" + url.getHost();
            } else {
                str = null;
            }
            MAPCommonError.SSLHandshakeException.addContextLog(str);
        }
    }
}
