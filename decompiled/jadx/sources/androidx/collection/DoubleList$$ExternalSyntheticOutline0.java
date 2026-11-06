package androidx.collection;

import android.os.HandlerThread;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class DoubleList$$ExternalSyntheticOutline0 {
    public static String m(String str, int i, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static int m(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int m(int i, int i2, Function0 function0) {
        return (function0.hashCode() + i) * i2;
    }

    public static int m(int i, int i2, Function1 function1) {
        return (function1.hashCode() + i) * i2;
    }

    public static int m(int i, ArrayList arrayList, int i2, int i3) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static int m(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.mo6071measureBRTryo0(j));
        return i + i2;
    }

    public static int m(boolean z, int i, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static long m(long j, long j2) {
        return ULong.m25468constructorimpl(ULong.m25468constructorimpl(j) * j2);
    }

    public static HandlerThread m(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }

    public static Object m(Object[] objArr, int i) {
        return Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static String m(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String m(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static float m(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static String m(String str, String str2, String str3, int i, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String m(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence5);
        return sb;
    }

    public static StringBuilder m(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function2 function2) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        function2.getClass();
        return new StringBuilder();
    }

    public static StringBuilder m(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2 function2, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence4);
        return sb;
    }

    public static StringBuilder m(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        return sb;
    }

    public static Function2 m(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m3969setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3969setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static void m(DrawContext drawContext, long j) {
        drawContext.getCanvas().restore();
        drawContext.mo5154setSizeuvyYCjk(j);
    }

    public static void m(ComposeUiNode.Companion companion, Composer composer, Modifier modifier, Composer composer2, int i) {
        Updater.m3969setimpl(composer, modifier, companion.getSetModifier());
        composer2.startReplaceGroup(i);
    }

    public static void m(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
    }

    public static void m(Function2 function2, int i, Composer composer, int i2) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i2), function2);
    }

    public static boolean m(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m191m(int i, int i2, Function1 function1) {
        function1.invoke(Integer.valueOf(i + i2));
    }
}
