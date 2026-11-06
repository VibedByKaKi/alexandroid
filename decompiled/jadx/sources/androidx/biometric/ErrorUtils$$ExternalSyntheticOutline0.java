package androidx.biometric;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ErrorUtils$$ExternalSyntheticOutline0 {
    public static String m(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static float m(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static IntentFilter m(String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static Uri.Builder m28m(String str) {
        return new Uri.Builder().scheme(str);
    }

    public static Bundle m(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static Bundle m(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        return bundle;
    }

    public static SurfaceCombination m(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    public static SurfaceCombination m(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static CompositionScopedCoroutineScopeCanceller m(CoroutineScope coroutineScope, Composer composer) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
        return compositionScopedCoroutineScopeCanceller;
    }

    public static Object m(List list, int i) {
        return list.get(list.size() - i);
    }

    public static String m(float f, String str, String str2) {
        return str + f + str2;
    }

    public static double m(double d, double d2, double d3) {
        return (Math.sin(d) * d2) + d3;
    }

    public static String m(Uri uri, String str) {
        return str + uri;
    }

    public static String m(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String m(String str, Exception exc) {
        return str + exc;
    }

    public static String m(String str, List list, StringBuilder sb) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, float f) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, Object obj) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m29m(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static List m(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void m(int i, String str, String str2) {
        Log.e(str2, str + i);
    }

    public static void m(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }

    public static void m(String str, String str2, String str3, Exception exc) {
        Log.w(str3, str + str2, exc);
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }
}
