package com.amazon.identity.auth.device;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class rc {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f916a;
    public final HashMap b = new HashMap();
    public final ByteArrayOutputStream c = new ByteArrayOutputStream();
    public Integer d = null;
    public Long e = null;

    public rc(URL url) {
        if (url == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("url cannot be null");
            throw null;
        }
        URLConnection a2 = vb.a(url);
        if (a2 instanceof HttpURLConnection) {
            this.f916a = (HttpURLConnection) a2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("url must be at least http");
            throw null;
        }
    }

    public void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(this.f916a.getRequestMethod());
            Integer num = this.d;
            if (num != null) {
                httpURLConnection.setChunkedStreamingMode(num.intValue());
            }
            Long l = this.e;
            if (l != null) {
                httpURLConnection.setFixedLengthStreamingMode(l.longValue());
            }
            httpURLConnection.setInstanceFollowRedirects(this.f916a.getInstanceFollowRedirects());
            httpURLConnection.setAllowUserInteraction(this.f916a.getAllowUserInteraction());
            httpURLConnection.setConnectTimeout(this.f916a.getConnectTimeout());
            httpURLConnection.setDefaultUseCaches(this.f916a.getDefaultUseCaches());
            httpURLConnection.setDoInput(this.f916a.getDoInput());
            httpURLConnection.setDoOutput(this.f916a.getDoOutput());
            httpURLConnection.setIfModifiedSince(this.f916a.getIfModifiedSince());
            httpURLConnection.setReadTimeout(this.f916a.getReadTimeout());
            httpURLConnection.setUseCaches(this.f916a.getUseCaches());
            for (Map.Entry entry : this.b.entrySet()) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) it2.next());
                }
            }
        } catch (ProtocolException unused) {
            Single$$ExternalSyntheticBUOutline0.m$2("Connection has been already executed");
        }
    }

    public final String toString() {
        return this.f916a.toString();
    }

    public final HttpURLConnection a() {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) vb.a(this.f916a.getURL());
        } catch (IOException e) {
            Log.e(yf.a("HttpURLConnectionBuilder"), "IOException while cloning connection. Should not happen", e);
            httpURLConnection = null;
        }
        if (httpURLConnection == null) {
            return null;
        }
        a(httpURLConnection);
        com.amazon.identity.auth.device.framework.p.a(httpURLConnection.getURL());
        String requestMethod = httpURLConnection.getRequestMethod();
        if ("POST".equalsIgnoreCase(requestMethod) || "PUT".equalsIgnoreCase(requestMethod)) {
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(this.c.toByteArray());
                } catch (SecurityException e2) {
                    Log.e(yf.a("HttpURLConnectionBuilder"), "Got a security exception while trying to establish connection. Verify that your app has internet access permission android.permission.INTERNET." + e2.getMessage());
                    throw new IOException(e2.getMessage());
                }
            } finally {
                mo.a(outputStream);
            }
        }
        return httpURLConnection;
    }
}
