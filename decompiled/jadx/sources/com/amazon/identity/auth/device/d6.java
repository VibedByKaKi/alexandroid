package com.amazon.identity.auth.device;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f573a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d6(String str, String str2, String str3, String str4, String str5) {
        String str6;
        this.f573a = str;
        this.c = str3;
        try {
            str6 = new URL(str2).toString();
        } catch (MalformedURLException unused) {
            Log.w(yf.a("AuthenticationChallenge"), s0.a(" Malformed URL received: ", str2));
            str6 = null;
        }
        this.b = str6;
        this.d = str4;
        this.e = str5;
    }
}
