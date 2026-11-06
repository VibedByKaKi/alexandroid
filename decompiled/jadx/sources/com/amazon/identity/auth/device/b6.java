package com.amazon.identity.auth.device;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class b6 {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f528a;

    public b6(HttpURLConnection httpURLConnection) {
        this.f528a = httpURLConnection;
    }

    public abstract byte[] getBody();

    public String getHeader(String str) {
        return this.f528a.getRequestProperty(str);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f528a.getRequestProperties();
    }

    public String getHttpVerb() {
        return this.f528a.getRequestMethod();
    }

    public Uri getUri() {
        return Uri.parse(this.f528a.getURL().toString());
    }

    public HttpURLConnection getUrlConnection() {
        return this.f528a;
    }

    public void setHeader(String str, String str2) {
        this.f528a.setRequestProperty(str, str2);
    }
}
