package com.amazon.identity.auth.device;

import android.net.Uri;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class wq {

    /* renamed from: a, reason: collision with root package name */
    public final Uri.Builder f1055a = new Uri.Builder();

    public final void a(String str, String str2) {
        if (str2 == null) {
            Log.w(yf.a("QueryStringBuilder"), d0.a("Parameter '", str, "' has <null> value, will not append parameter to query string."), new IllegalArgumentException());
        } else {
            try {
                this.f1055a.appendQueryParameter(URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                yf.a("QueryStringBuilder", "UTF-8 is not supported. This should not happen according to http://developer.android.com/reference/java/nio/charset/Charset.html", e);
            }
        }
    }
}
