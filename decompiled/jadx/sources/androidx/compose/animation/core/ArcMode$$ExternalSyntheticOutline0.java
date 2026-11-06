package androidx.compose.animation.core;

import android.util.Log;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ArcMode$$ExternalSyntheticOutline0 {
    public static int m(TextFieldPreparedSelection textFieldPreparedSelection, TextFieldPreparedSelection textFieldPreparedSelection2) {
        textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        return textFieldPreparedSelection2.text.length();
    }

    public static PathBuilder m$1(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        return pathBuilder;
    }

    public static int m$1(Placeable placeable, int i, int i2) {
        return (i - placeable.getHeight()) / i2;
    }

    public static boolean m$1(Composer composer, int i, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i));
        return ComposerKt.isTraceInProgress();
    }

    public static int m(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int m(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int m(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int m(long j, int i, int i2) {
        return (Color.m4651hashCodeimpl(j) + i) * i2;
    }

    public static int m(float f, int i, int i2) {
        return (Dp.m7374hashCodeimpl(f) + i) * i2;
    }

    public static int m(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation_release().length();
    }

    public static int m(Placeable placeable, int i, int i2) {
        return (i - placeable.getWidth()) / i2;
    }

    public static int m(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static PathBuilder m(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        return pathBuilder;
    }

    public static PathBuilder m(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.moveToRelative(f3, f4);
        return pathBuilder;
    }

    public static ValueElementSequence m(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m7366boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static ValueElementSequence m(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static String m(char c, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String m(String str, float f) {
        return str + f;
    }

    public static String m(String str, int i, char c) {
        return str + i + c;
    }

    public static List m(PathBuilder pathBuilder, float f) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static Ref.ObjectRef m(Object obj) {
        ResultKt.throwOnFailure(obj);
        return new Ref.ObjectRef();
    }

    public static void m(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void m(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void m(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m4652toStringimpl(j));
        sb.append(str);
    }

    public static void m(Composer composer, int i, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.endNode();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void m(StringBuilder sb, String str, float f) {
        sb.append((Object) Dp.m7379toStringimpl(f));
        sb.append(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static boolean m333m(Composer composer, int i, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }
}
