package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.identity.auth.device.api.AuthenticationType;
import com.amazon.identity.kcpsdk.common.HttpVerb;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class fr {
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean j;
    public AuthenticationType k;
    public String c = "http";
    public HttpVerb h = HttpVerb.HttpVerbGet;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f625a = new HashMap();
    public final ArrayList b = new ArrayList();
    public byte[] i = new byte[0];

    public final void a(String str, String str2) {
        if (str == null || "".equals(str) || str2 == null) {
            Log.e(yf.a("WebRequest"), "addQueryParameter: could not add query parameter because the supplied arguments are invalid (null or empty name or null value).");
            return;
        }
        if (this.g != null) {
            this.g = cg.a(new StringBuilder(), this.g, WebConstants.UriConstants.AMPERSAND_KEY);
        } else {
            this.g = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.g);
            sb.append(URLEncoder.encode(str, "UTF-8") + "=" + URLEncoder.encode(str2, "UTF-8"));
            this.g = sb.toString();
        } catch (UnsupportedEncodingException e) {
            Log.e(yf.a("WebRequest"), "addQueryParameter: Could not add query parameter because of UnsupportedEncodingException: " + e.getMessage());
        }
    }

    public final void b(String str) {
        if (!str.equals("") && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        try {
            this.f = new URI("http", "www.amazon.com", str, null).getRawPath();
        } catch (URISyntaxException e) {
            Log.e(yf.a("WebRequest"), "setPath: Could not set path because of URISyntaxException: " + e.getMessage());
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
        }
    }

    public final boolean c(String str) {
        if (str != null && !str.equals("")) {
            try {
                URI uri = new URI(str);
                this.c = uri.getScheme();
                this.d = uri.getHost();
                int port = uri.getPort();
                if (port != -1) {
                    this.e = Integer.toString(port);
                } else {
                    this.e = null;
                }
                String rawPath = uri.getRawPath();
                this.f = rawPath;
                if (rawPath != null && !"".equals(rawPath) && !this.f.startsWith("/")) {
                    this.f = "/" + this.f;
                }
                this.g = uri.getRawQuery();
                return true;
            } catch (URISyntaxException e) {
                Log.e(yf.a("WebRequest"), "tryToParseUrl: URL is malformed: " + e.getMessage());
            }
        }
        return false;
    }

    public final void b(String str, String str2) {
        if (str == null || "".equals(str)) {
            Log.w(yf.a("WebRequest"), "setHeader: failed because the given header name was null or empty.");
            return;
        }
        if (str2 == null) {
            this.b.remove(str);
            this.f625a.remove(str.toLowerCase(Locale.US));
        } else {
            String replace = str2.replace("\n", "\n ");
            this.b.add(str);
            this.f625a.put(str.toLowerCase(Locale.US), replace);
        }
    }

    public final String a(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (String) this.b.get(i);
        }
        Log.e(yf.a("WebRequest"), "getHeader: index is out of range");
        return null;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("://");
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        if (this.e != null) {
            sb.append(":" + this.e);
        }
        String str4 = this.f;
        if (str4 == null) {
            str4 = "";
        }
        if (this.g != null) {
            str2 = "?" + this.g;
        }
        sb.append(str4.concat(str2));
        return sb.toString();
    }

    public final void a(String str) {
        try {
            this.i = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(yf.a("WebRequest"), "setBody: UnsupportedEncodingException error: " + e.getMessage());
        }
    }
}
