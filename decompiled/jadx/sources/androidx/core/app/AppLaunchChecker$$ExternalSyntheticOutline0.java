package androidx.core.app;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract /* synthetic */ class AppLaunchChecker$$ExternalSyntheticOutline0 {
    public static String m(String str, String str2, String str3, boolean z, String str4) {
        return str + str2 + str3 + z + str4;
    }

    public static double m$2(double d, double d2, double d3, double d4) {
        return ((d - d2) * d3) + d4;
    }

    public static double m(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    public static float m(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static int m(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static double m$1(double d, double d2, double d3, double d4) {
        return (d * d2 * d3) + d4;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) / i4;
    }

    public static long m(Placeable.PlacementScope placementScope, Placeable placeable, Placeable placeable2, long j) {
        long j2;
        placementScope.handleMotionFrameOfReferencePlacement(placeable);
        j2 = placeable2.apparentToRealOffset;
        return IntOffset.m7500plusqkQi6aY(j, j2);
    }

    public static Object m(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String m(String str, int i, int i2, StringBuilder sb, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(String str, long j, String str2) {
        return str + j + str2;
    }

    public static char m(int i, String str) {
        return str.charAt(str.length() - i);
    }

    public static String m(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m7635m(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str);
        return sb;
    }

    public static StringBuilder m(String str, char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c);
        return sb;
    }

    public static KMutableProperty1 m(Class cls, String str, String str2, int i) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static void m(int i, DrawContext drawContext, long j, int i2) {
        InlineMarker.finallyStart(i);
        drawContext.getCanvas().restore();
        drawContext.mo5154setSizeuvyYCjk(j);
        InlineMarker.finallyEnd(i2);
    }

    public static void m(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void m(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public static void m(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void m(String str, String str2, String str3, String str4) {
        Log.e(str4, str + str2 + str3);
    }

    public static void m(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static StackTraceElement[] m() {
        return new Throwable().getStackTrace();
    }
}
