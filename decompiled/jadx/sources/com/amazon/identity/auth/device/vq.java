package com.amazon.identity.auth.device;

import android.net.UrlQuerySanitizer;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vq extends UrlQuerySanitizer {

    /* renamed from: a, reason: collision with root package name */
    public final String f1036a = "UTF-8";

    @Override // android.net.UrlQuerySanitizer
    public final void addSanitizedEntry(String str, String str2) {
        if (str == null) {
            Log.w(yf.a("UrlUtils"), "ignoring <null> named parameter to a Sanitizer", new IllegalArgumentException());
            return;
        }
        if (str2 == null) {
            Log.w(yf.a("UrlUtils"), d0.a("ignoring <null> value to parameter '", str, "' to a Sanitizer"), new IllegalArgumentException());
            return;
        }
        String trim = str.trim();
        String trim2 = str2.trim();
        if (!trim.equals(str) || !trim2.equals(str2)) {
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Parameter or value was trimmed on the parameter ", trim, " (");
            m2m.append(trim.equals(str));
            m2m.append(", ");
            m2m.append(trim2.equals(str2));
            m2m.append("). MAP trims the query parameter keys and values in the URL, however auth portal does not accept non-trimmed parameters. Please consider fixing the auth portal parameters passed to MAP.");
            Log.i(yf.a("UrlUtils"), m2m.toString());
        }
        super.addSanitizedEntry(trim, trim2);
    }

    @Override // android.net.UrlQuerySanitizer
    public final String unescape(String str) {
        if (str == null) {
            Log.w(yf.a("UrlUtils"), "Unescaping <null> string");
            return null;
        }
        try {
            return URLDecoder.decode(str, this.f1036a);
        } catch (UnsupportedEncodingException e) {
            Log.e(yf.a("UrlUtils"), cg.a(new StringBuilder(), this.f1036a, " is not supported. Using decoder without encoding."), e);
            return super.unescape(str);
        }
    }
}
