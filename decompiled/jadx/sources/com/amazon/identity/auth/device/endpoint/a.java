package com.amazon.identity.auth.device.endpoint;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.env.EnvironmentUtils;
import com.amazon.identity.auth.device.yf;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f606a;
    public final OpenIdRequest$REQUEST_TYPE b;
    public final Bundle c;
    public final String d;
    public final Uri.Builder e;
    public HashMap f;

    /* JADX WARN: Removed duplicated region for block: B:157:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r13, com.amazon.identity.auth.device.endpoint.OpenIdRequest$REQUEST_TYPE r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.endpoint.a.<init>(java.lang.String, com.amazon.identity.auth.device.endpoint.OpenIdRequest$REQUEST_TYPE, android.os.Bundle):void");
    }

    public static String a(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        String authPortalHostFromPartialDomain = EnvironmentUtils.getInstance().getAuthPortalHostFromPartialDomain(str);
        EnvironmentUtils.getInstance();
        if (EnvironmentUtils.isCurrentEnvironmentProd()) {
            builder.authority(authPortalHostFromPartialDomain);
        } else {
            builder.encodedAuthority(authPortalHostFromPartialDomain);
        }
        builder.path("/ap/mapcancel");
        return builder.build().toString();
    }

    public final String b() {
        Uri.Builder buildUpon = this.e.build().buildUpon();
        if (this.c.getBoolean(MAPAccountManager.KEY_IS_CALLBACK_FROM_3P_PARAM)) {
            buildUpon.encodedQuery(this.c.getString(MAPAccountManager.KEY_3P_CALLBACK_QUERY_PARAM));
        } else {
            HashMap hashMap = this.f;
            if (hashMap != null && hashMap.size() > 0) {
                this.f606a.putAll(this.f);
                this.f.clear();
            }
            Uri build = buildUpon.build();
            Set<String> queryParameterNames = build.getQueryParameterNames();
            HashMap hashMap2 = new HashMap(this.f606a);
            for (String str : queryParameterNames) {
                hashMap2.put(str, build.getQueryParameter(str));
            }
            buildUpon.clearQuery();
            for (Map.Entry entry : hashMap2.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri build2 = buildUpon.build();
        String queryParameter = build2.getQueryParameter("openid.oa2.code_challenge");
        String queryParameter2 = build2.getQueryParameter("openid.oa2.code_challenge_method");
        if (!TextUtils.equals(queryParameter, (CharSequence) this.f606a.get("openid.oa2.code_challenge")) || !TextUtils.equals(queryParameter2, (CharSequence) this.f606a.get("openid.oa2.code_challenge_method"))) {
            Set<String> queryParameterNames2 = build2.getQueryParameterNames();
            Uri.Builder clearQuery = build2.buildUpon().clearQuery();
            for (String str2 : queryParameterNames2) {
                if (TextUtils.equals(str2, "openid.oa2.code_challenge")) {
                    if (TextUtils.isEmpty((CharSequence) this.f606a.get("openid.oa2.code_challenge"))) {
                        yf.a("OpenIdRequest");
                        "user".equalsIgnoreCase(Build.TYPE);
                    } else {
                        clearQuery.appendQueryParameter(str2, (String) this.f606a.get("openid.oa2.code_challenge"));
                    }
                } else if (!TextUtils.equals(str2, "openid.oa2.code_challenge_method")) {
                    clearQuery.appendQueryParameter(str2, build2.getQueryParameter(str2));
                } else if (TextUtils.isEmpty((CharSequence) this.f606a.get("openid.oa2.code_challenge_method"))) {
                    yf.a("OpenIdRequest");
                    "user".equalsIgnoreCase(Build.TYPE);
                } else {
                    clearQuery.appendQueryParameter(str2, (String) this.f606a.get("openid.oa2.code_challenge_method"));
                }
            }
            build2 = clearQuery.build();
        }
        return build2.toString();
    }

    public final String a() {
        Uri build = this.e.build();
        String scheme = build.getScheme();
        String authority = build.getAuthority();
        Locale locale = Locale.US;
        return a$$ExternalSyntheticOutline0.m$1(scheme, "://", authority);
    }

    public static String a(String str, String str2) {
        return String.format("%x", new BigInteger(a$$ExternalSyntheticOutline0.m$1(str, "#", str2).getBytes()));
    }

    public static String b(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        String authPortalHostFromPartialDomain = EnvironmentUtils.getInstance().getAuthPortalHostFromPartialDomain(str);
        EnvironmentUtils.getInstance();
        if (EnvironmentUtils.isCurrentEnvironmentProd()) {
            builder.authority(authPortalHostFromPartialDomain);
        } else {
            builder.encodedAuthority(authPortalHostFromPartialDomain);
        }
        builder.path("/ap/maplanding");
        return builder.build().toString();
    }
}
