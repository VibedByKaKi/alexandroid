package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract /* synthetic */ class BitVector$$ExternalSyntheticOutline0 {
    public static PathBuilder m(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static void m$1(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void m$2(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void m$3(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void m$4(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void m$5(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static void m$6(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void m$7(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void m$8(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static int m(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int m(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    public static int m(Iterable iterable, int i, int i2) {
        return RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, i)), i2);
    }

    public static Modifier.Node m(int i, String str, Function1 function1, Modifier.Node node, MutableVector mutableVector) {
        Intrinsics.reifiedOperationMarker(i, str);
        function1.invoke(node);
        return DelegatableNodeKt.pop(mutableVector);
    }

    public static float m(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static Object m(MutableVector mutableVector, int i) {
        return mutableVector.removeAt(mutableVector.getSize() - i);
    }

    public static String m(Object obj, String str) {
        return (str + obj).toString();
    }

    public static String m(String str, char c) {
        return str + c;
    }

    public static String m(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String m(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m3869m(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static KotlinNothingValueException m() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static KotlinNothingValueException m3870m(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void m(StringBuilder sb, String str, String str2, int i, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void m(CancellableContinuation cancellableContinuation, Throwable th) {
        cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(th)));
    }

    public static boolean m(Composer composer) {
        composer.endNode();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }
}
