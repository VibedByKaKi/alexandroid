package com.amazon.identity.auth.device.token;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.identity.auth.device.yf;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPCookie implements Serializable {
    private static final long serialVersionUID = 551200964665L;
    private final Map<String, String> mCookieData;
    private int[] mPorts;

    public MAPCookie(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        this.mCookieData = hashMap;
        hashMap.put("Name", str);
        hashMap.put("Value", str2);
        hashMap.put("Domain", str3);
        hashMap.put("Expires", str4);
        hashMap.put("Path", str5);
        hashMap.put("DirectedId", str6);
        hashMap.put("HttpOnly", Boolean.toString(z2));
        yf.a("Creating Cookie: %s , domain: %s , for id: %s from cookie data %s", c(), a(), (String) hashMap.get("DirectedId"), e());
    }

    public final void a(boolean z) {
        this.mCookieData.put("HttpOnly", Boolean.toString(z));
    }

    public final Date b() {
        String str = this.mCookieData.get("Expires");
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy kk:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
                return simpleDateFormat.parse(str);
            } catch (ParseException unused) {
                yf.a("MAPCookie");
                "user".equalsIgnoreCase(Build.TYPE);
            }
        }
        return null;
    }

    public final String c() {
        return this.mCookieData.get("Name");
    }

    public final String d() {
        StringBuilder sb = new StringBuilder(c().trim());
        sb.append("=");
        sb.append(e().trim());
        sb.append("; path=");
        String str = this.mCookieData.get("Path");
        if (TextUtils.isEmpty(str)) {
            sb.append("/");
        } else {
            sb.append(str);
        }
        sb.append("; domain=" + a().trim());
        if (Boolean.parseBoolean(this.mCookieData.get("Secure"))) {
            sb.append("; secure");
        }
        String str2 = this.mCookieData.get("HttpOnly");
        if (TextUtils.isEmpty(str2) ? false : Boolean.parseBoolean(str2)) {
            sb.append("; httponly");
        }
        Date b = b();
        if (b != null) {
            sb.append("; expires=");
            if (b.getTime() < System.currentTimeMillis()) {
                yf.a("Cookie %s expired : ", c(), b.toGMTString());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy kk:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
            sb.append(simpleDateFormat.format(b));
        }
        return sb.toString();
    }

    public final String e() {
        return this.mCookieData.get("Value");
    }

    public final void c(String str) {
        this.mCookieData.put("Path", str);
    }

    public final String a() {
        return this.mCookieData.get("Domain");
    }

    public final void a(String str) {
        this.mCookieData.put("Domain", str);
    }

    public final void b(String str) {
        this.mCookieData.put("Expires", str);
    }

    public MAPCookie(String str, String str2, String str3, String str4, boolean z) {
        HashMap hashMap = new HashMap();
        this.mCookieData = hashMap;
        hashMap.put("Name", str);
        hashMap.put("Value", str2);
        hashMap.put("DirectedId", str4);
        hashMap.put("Domain", str3);
        yf.a("Creating Cookie: %s , domain: %s , for id: %s from cookie data %s", c(), a(), (String) hashMap.get("DirectedId"), e());
    }
}
