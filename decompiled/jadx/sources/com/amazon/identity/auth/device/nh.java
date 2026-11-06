package com.amazon.identity.auth.device;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.alexa.biloba.utils.WebConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class nh {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f836a = new HashMap();

    public nh(String str) {
        try {
            String query = new URL(str).getQuery();
            if (TextUtils.isEmpty(query)) {
                return;
            }
            for (String str2 : query.split(WebConstants.UriConstants.AMPERSAND_KEY)) {
                String[] split = str2.split("=");
                if (split.length > 1) {
                    this.f836a.put(split[0], URLDecoder.decode(split[1]));
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Exception parsing Open ID redirect URL: " + e, e);
        }
    }

    public final String a() {
        if ("device_auth_access".equalsIgnoreCase(d())) {
            yf.a("OpenIdResponse");
            "user".equalsIgnoreCase(Build.TYPE);
            if (this.f836a.containsKey("openid.oa2.access_token")) {
                return (String) this.f836a.get("openid.oa2.access_token");
            }
        }
        return null;
    }

    public final String b() {
        if (!this.f836a.containsKey("openid.identity")) {
            return null;
        }
        String str = (String) this.f836a.get("openid.identity");
        return str.substring(str.lastIndexOf("/") + 1);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f836a;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                if (!TextUtils.equals(str, "openid.oa2.scope") && !TextUtils.equals(str, "openid.oa2.access_token")) {
                    bundle.putString(str, (String) this.f836a.get(str));
                }
            }
        }
        return bundle;
    }

    public final String d() {
        String str = this.f836a.containsKey("openid.oa2.scope") ? (String) this.f836a.get("openid.oa2.scope") : "openid.oa2.authorization_code";
        yf.a("OpenIdResponse");
        "user".equalsIgnoreCase(Build.TYPE);
        return str;
    }
}
