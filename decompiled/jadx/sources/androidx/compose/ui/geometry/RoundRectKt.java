package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0003\"\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u001f\u001a\u00020\u000e*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b \u0010\u001e\"\u0015\u0010!\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b!\u0010#\"\u0015\u0010$\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b$\u0010#\"\u0015\u0010%\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0015\u0010&\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010#\"\u0015\u0010'\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b'\u0010#\"\u0015\u0010(\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010+\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b,\u0010*\"\u0015\u0010-\u001a\u00020\u0019*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\"*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b0\u0010#¨\u00065"}, d2 = {"RoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "left", "", "top", "right", "bottom", "radiusX", "radiusY", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "rect", "Landroidx/compose/ui/geometry/Rect;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "translate", "offset", "Landroidx/compose/ui/geometry/Offset;", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "boundingRect", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "safeInnerRect", "getSafeInnerRect", "isEmpty", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isFinite", "isRect", "isEllipse", "isCircle", "minDimension", "getMinDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "maxDimension", "getMaxDimension", "center", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isSimple", "lerp", "start", "stop", "fraction", "ui-geometry"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,423:1\n33#2:424\n53#3,3:425\n60#3:429\n70#3:432\n60#3:434\n70#3:437\n60#3:439\n70#3:442\n60#3:445\n70#3:448\n60#3:451\n70#3:454\n60#3:457\n70#3:460\n60#3:472\n70#3:475\n53#3,3:478\n48#4:428\n53#4:431\n48#4:433\n53#4:436\n48#4:450\n53#4:453\n48#4:456\n53#4:459\n79#4,2:463\n79#4,2:465\n79#4,2:467\n79#4,2:469\n48#4:471\n53#4:474\n86#4:481\n22#5:430\n22#5:435\n22#5:440\n22#5:443\n22#5:446\n22#5:449\n22#5:452\n22#5:455\n22#5:458\n22#5:461\n22#5:473\n22#5:476\n65#6:438\n69#6:441\n65#6:444\n69#6:447\n139#7:462\n30#8:477\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n*L\n235#1:424\n235#1:425,3\n253#1:429\n253#1:432\n273#1:434\n273#1:437\n302#1:439\n303#1:442\n304#1:445\n305#1:448\n325#1:451\n326#1:454\n327#1:457\n328#1:460\n361#1:472\n362#1:475\n383#1:478,3\n253#1:428\n253#1:431\n273#1:433\n273#1:436\n325#1:450\n326#1:453\n327#1:456\n328#1:459\n350#1:463,2\n351#1:465,2\n352#1:467,2\n353#1:469,2\n361#1:471\n362#1:474\n391#1:481\n253#1:430\n273#1:435\n302#1:440\n303#1:443\n304#1:446\n305#1:449\n325#1:452\n326#1:455\n327#1:458\n328#1:461\n361#1:473\n362#1:476\n302#1:438\n303#1:441\n304#1:444\n305#1:447\n345#1:462\n383#1:477\n*E\n"})
/* loaded from: classes13.dex */
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long m4354constructorimpl = CornerRadius.m4354constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        return new RoundRect(f, f2, f3, f4, m4354constructorimpl, m4354constructorimpl, m4354constructorimpl, m4354constructorimpl, null);
    }

    @NotNull
    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m4452RoundRectZAM2FJo(@NotNull Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    @NotNull
    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m4454RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @NotNull
    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m4455RoundRectsniSvfs(@NotNull Rect rect, long j) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        float width = (roundRect.getWidth() / 2.0f) + roundRect.getLeft();
        float height = (roundRect.getHeight() / 2.0f) + roundRect.getTop();
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        float max = Math.max(Float.intBitsToFloat((int) (roundRect.m4448getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4450getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float max2 = Math.max(Float.intBitsToFloat((int) (roundRect.m4450getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4451getTopRightCornerRadiuskKHJgLs() & 4294967295L)));
        return new Rect((max * 0.29289323f) + roundRect.getLeft(), (max2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m4451getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4449getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m4449getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4448getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        return roundRect.m4450getTopLeftCornerRadiuskKHJgLs() == roundRect.m4451getTopRightCornerRadiuskKHJgLs() && roundRect.m4451getTopRightCornerRadiuskKHJgLs() == roundRect.m4449getBottomRightCornerRadiuskKHJgLs() && roundRect.m4449getBottomRightCornerRadiuskKHJgLs() == roundRect.m4448getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4450getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4450getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(@NotNull RoundRect roundRect) {
        long m4450getTopLeftCornerRadiuskKHJgLs = roundRect.m4450getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m4450getTopLeftCornerRadiuskKHJgLs) & (m4450getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4451getTopRightCornerRadiuskKHJgLs = roundRect.m4451getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m4451getTopRightCornerRadiuskKHJgLs) & (m4451getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4448getBottomLeftCornerRadiuskKHJgLs = roundRect.m4448getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m4448getBottomLeftCornerRadiuskKHJgLs) & (m4448getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4449getBottomRightCornerRadiuskKHJgLs = roundRect.m4449getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~m4449getBottomRightCornerRadiuskKHJgLs) & (m4449getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        long m4450getTopLeftCornerRadiuskKHJgLs = roundRect.m4450getTopLeftCornerRadiuskKHJgLs();
        return (m4450getTopLeftCornerRadiuskKHJgLs >>> 32) == (m4450getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m4450getTopLeftCornerRadiuskKHJgLs() == roundRect.m4451getTopRightCornerRadiuskKHJgLs() && roundRect.m4450getTopLeftCornerRadiuskKHJgLs() == roundRect.m4449getBottomRightCornerRadiuskKHJgLs() && roundRect.m4450getTopLeftCornerRadiuskKHJgLs() == roundRect.m4448getBottomLeftCornerRadiuskKHJgLs();
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect roundRect, @NotNull RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m4373lerp3Ry4LBc(roundRect.m4450getTopLeftCornerRadiuskKHJgLs(), roundRect2.m4450getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4373lerp3Ry4LBc(roundRect.m4451getTopRightCornerRadiuskKHJgLs(), roundRect2.m4451getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4373lerp3Ry4LBc(roundRect.m4449getBottomRightCornerRadiuskKHJgLs(), roundRect2.m4449getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4373lerp3Ry4LBc(roundRect.m4448getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m4448getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    @NotNull
    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m4456translateUv8p0NA(@NotNull RoundRect roundRect, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getTop(), roundRect.getRight() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getBottom(), roundRect.m4450getTopLeftCornerRadiuskKHJgLs(), roundRect.m4451getTopRightCornerRadiuskKHJgLs(), roundRect.m4449getBottomRightCornerRadiuskKHJgLs(), roundRect.m4448getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
