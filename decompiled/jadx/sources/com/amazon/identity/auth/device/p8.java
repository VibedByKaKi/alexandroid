package com.amazon.identity.auth.device;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f873a = new AtomicBoolean(false);
    public final List b;
    public String c;
    public final JSONObject d;

    public p8(List list) {
        if (list != null) {
            this.b = list;
        } else {
            this.b = new ArrayList();
        }
        this.d = new JSONObject();
    }

    public final void a() {
        String str;
        if (this.f873a.getAndSet(true)) {
            return;
        }
        for (n8 n8Var : this.b) {
            try {
                String str2 = n8Var.b;
                if (str2 != null) {
                    if (str2.startsWith("x-main")) {
                        try {
                            str = a(str2);
                        } catch (IllegalArgumentException e) {
                            Log.e(yf.a("CookieJar"), "Caught exception parsing the cookie value out of RegisterDeviceResponse" + e.getMessage());
                        }
                        if (str != null) {
                            this.c = str;
                        } else {
                            Log.e(yf.a("CookieJar"), "Found no x-main cookie in RegisterDeviceResponse");
                            str = null;
                            this.c = str;
                        }
                    }
                    if (str2.startsWith("x-main") || str2.startsWith("x-acb")) {
                        this.d.put("https://www" + n8Var.f827a, n8Var.b);
                    }
                }
            } catch (JSONException e2) {
                Log.e(yf.a("CookieJar"), "Adding JSON value failed", e2);
            }
        }
    }

    public static String a(String str) {
        String[] split = str.split(";");
        if (split.length < 1) {
            Log.e(yf.a("CookieJar"), "Cookie does not seem to be in a valid format");
            return null;
        }
        String[] split2 = split[0].split("=");
        if (split2.length != 2) {
            Log.e(yf.a("CookieJar"), "Cookie name/value pair does not seem to be in a valid format");
            return null;
        }
        return split2[1];
    }
}
