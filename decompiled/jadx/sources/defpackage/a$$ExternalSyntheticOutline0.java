package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract /* synthetic */ class a$$ExternalSyntheticOutline0 {
    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m$1(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String m(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    public static String m(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, int i, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static String m(String str, Class cls) {
        return str + cls;
    }

    public static String m(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(char c, String str, String str2) {
        return str + c + str2;
    }

    public static String m(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m0m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m1m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m2m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Set m() {
        return Collections.synchronizedSet(new HashSet());
    }

    public static KProperty1 m(Class cls, String str, String str2, int i) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m3m(String str, String str2, String str3) {
        Log.i(str3, str + str2);
    }

    public static void m(String str, String str2, String str3, Exception exc) {
        Log.e(str3, str + str2, exc);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m4m(String str, String str2, String str3, String str4, String str5) {
        Log.e(str5, str + str2 + str3 + str4);
    }

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        Log.w(str3, sb.toString());
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m5m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        Log.i(str, sb.toString());
    }
}
