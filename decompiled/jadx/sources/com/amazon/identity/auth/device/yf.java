package com.amazon.identity.auth.device;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class yf {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f1091a = "Unknown";

    public static void a(String str, String str2, Set set) {
        StringBuilder sb = new StringBuilder("Account not registered: ");
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append("***");
            sb.append(str2.substring(str2.length() - Math.min(2, str2.length())));
        }
        if (set != null) {
            sb.append(". Registered accounts are:");
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                sb.append(" ***");
                sb.append(str3.substring(str3.length() - Math.min(2, str3.length())));
            }
        }
        Log.e(a(str), sb.toString(), new IllegalArgumentException());
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "No directedId" : "***".concat(str.substring(str.length() - Math.min(2, str.length())));
    }

    public static void c(String str, String str2, String str3) {
        Log.w(a(str), str2);
        jg.a(str3);
    }

    public static void b(String str, String str2, Object... objArr) {
        Log.w(a(str), String.format(str2, objArr));
    }

    public static void b(String str, String str2, String str3) {
        Log.i(a(str), str2);
        jg.a(str3);
    }

    public static void a(String str, String str2, Object... objArr) {
        Log.i(a(str), String.format(str2, objArr));
    }

    public static void a(nq nqVar, String str, String str2, String str3) {
        Log.e(a(str), str2);
        if (nqVar != null) {
            nqVar.a(str3);
        } else {
            jg.a(str3);
        }
    }

    public static void a(String str, String str2, String str3) {
        Log.e(a(str), str2);
        jg.a(str3);
    }

    public static void a(String str, String str2, Exception exc, String str3) {
        Log.e(a(str), str2, exc);
        jg.a(str3);
    }

    public static void a(String str, String str2, Throwable th) {
        Log.wtf(a(str), str2, th);
    }

    public static void a(String str, Object... objArr) {
        String format = String.format(str, objArr);
        int i = 0;
        while (i < format.length()) {
            int i2 = i + 1000;
            format.substring(i, i2 > format.length() ? format.length() : i2);
            "user".equalsIgnoreCase(Build.TYPE);
            i = i2;
        }
    }

    public static String a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "EmptyData";
        }
        if (str.length() < i) {
            Log.w(a("MAPLog"), "Not masking data as length to keep is longer than the original data.");
            return str;
        }
        return str.substring(0, i).concat("***");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return cg.a(new StringBuilder(), f1091a, "");
        }
        return f1091a + '/' + str + "";
    }
}
