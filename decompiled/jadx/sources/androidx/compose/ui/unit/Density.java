package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0013\u0010\b\u001a\u00020\u0003*\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r*\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\f\u001a\u00020\r*\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\t*\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\rH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0003H\u0017¢\u0006\u0004\b\u0016\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\u0003H\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0017J\u0013\u0010\u001f\u001a\u00020 *\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020!*\u00020 H\u0017¢\u0006\u0004\b%\u0010#R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "toPx", "Landroidx/compose/ui/unit/Dp;", "toPx-0680j_4", "(F)F", "roundToPx", "", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "toPx--R2X_6o", "(J)F", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(I)F", "toSp", "toSp-kPz2Gy4", "(I)J", "(F)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toSize-XkaWNTQ", "(J)J", "toDpSize", "toDpSize-k-rfVVM", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,111:1\n26#2:112\n26#2:117\n22#2:128\n53#3,4:113\n123#4:118\n123#4:119\n363#4:120\n33#5:121\n136#5:125\n53#6,3:122\n60#6:127\n70#6:130\n57#7:126\n61#7:129\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n58#1:112\n73#1:117\n106#1:128\n68#1:113,4\n76#1:118\n82#1:119\n96#1:120\n97#1:121\n105#1:125\n97#1:122,3\n106#1:127\n106#1:130\n106#1:126\n106#1:129\n*E\n"})
/* loaded from: classes13.dex */
public interface Density extends FontScaling {
    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo550roundToPxR2X_6o(long j) {
        return Math.round(mo556toPxR2X_6o(j));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo551roundToPx0680j_4(float f) {
        float mo557toPx0680j_4 = mo557toPx0680j_4(f);
        if (Float.isInfinite(mo557toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo557toPx0680j_4);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo554toDpu2uoSUM(int i) {
        return Dp.m7368constructorimpl(i / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo555toDpSizekrfVVM(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m7390DpSizeYgX7TsA(mo553toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo553toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L)))) : DpSize.INSTANCE.m7475getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo556toPxR2X_6o(long j) {
        if (!TextUnitType.m7590equalsimpl0(TextUnit.m7561getTypeUIouoOA(j), TextUnitType.INSTANCE.m7595getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo557toPx0680j_4(mo552toDpGaN1DYA(j));
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo557toPx0680j_4(float f) {
        return getDensity() * f;
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect) {
        return new Rect(mo557toPx0680j_4(dpRect.m7451getLeftD9Ej5fM()), mo557toPx0680j_4(dpRect.m7453getTopD9Ej5fM()), mo557toPx0680j_4(dpRect.m7452getRightD9Ej5fM()), mo557toPx0680j_4(dpRect.m7450getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo558toSizeXkaWNTQ(long j) {
        if (j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m4477getUnspecifiedNHjbRc();
        }
        float mo557toPx0680j_4 = mo557toPx0680j_4(DpSize.m7466getWidthD9Ej5fM(j));
        float mo557toPx0680j_42 = mo557toPx0680j_4(DpSize.m7464getHeightD9Ej5fM(j));
        return Size.m4460constructorimpl((Float.floatToRawIntBits(mo557toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo557toPx0680j_42) & 4294967295L));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo561toSpkPz2Gy4(int i) {
        return mo559toSp0xMU5do(mo554toDpu2uoSUM(i));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7354roundToPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo550roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7355roundToPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo551roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7356toDpGaN1DYA(@NotNull Density density, long j) {
            return Density.super.mo552toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7358toDpu2uoSUM(@NotNull Density density, int i) {
            return Density.super.mo554toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7359toDpSizekrfVVM(@NotNull Density density, long j) {
            return Density.super.mo555toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7360toPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo556toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7361toPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo557toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7362toSizeXkaWNTQ(@NotNull Density density, long j) {
            return Density.super.mo558toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7363toSp0xMU5do(@NotNull Density density, float f) {
            return Density.super.mo559toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7365toSpkPz2Gy4(@NotNull Density density, int i) {
            return Density.super.mo561toSpkPz2Gy4(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7357toDpu2uoSUM(@NotNull Density density, float f) {
            return Density.super.mo553toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7364toSpkPz2Gy4(@NotNull Density density, float f) {
            return Density.super.mo560toSpkPz2Gy4(f);
        }

        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo560toSpkPz2Gy4(float f) {
        return mo559toSp0xMU5do(mo553toDpu2uoSUM(f));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo553toDpu2uoSUM(float f) {
        return Dp.m7368constructorimpl(f / getDensity());
    }
}
