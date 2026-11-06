package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0001H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0016H\u0007¨\u0006\u0018"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "topLeft", "bottomRight", "IntRect-E1MhUcY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "toRect", "Landroidx/compose/ui/geometry/Rect;", "roundToIntRect", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,277:1\n54#2:278\n59#2:280\n85#3:279\n90#3:281\n26#4:282\n26#4:283\n26#4:284\n26#4:285\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n210#1:278\n211#1:280\n210#1:279\n211#1:281\n272#1:282\n273#1:283\n274#1:284\n275#1:285\n*E\n"})
/* loaded from: classes13.dex */
public final class IntRectKt {
    @Stable
    @NotNull
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m7528IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m7496getXimpl(j), IntOffset.m7497getYimpl(j), IntOffset.m7496getXimpl(j2), IntOffset.m7497getYimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m7529IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m7496getXimpl(j), IntOffset.m7497getYimpl(j), IntOffset.m7496getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m7497getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m7530IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m7496getXimpl(j) - i, IntOffset.m7497getYimpl(j) - i, IntOffset.m7496getXimpl(j) + i, IntOffset.m7497getYimpl(j) + i);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect intRect, @NotNull IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    @Stable
    @NotNull
    public static final IntRect roundToIntRect(@NotNull Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    @Stable
    @NotNull
    public static final Rect toRect(@NotNull IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
