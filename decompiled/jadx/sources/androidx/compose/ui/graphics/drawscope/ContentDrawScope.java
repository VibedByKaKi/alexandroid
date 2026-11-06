package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m5178drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap imageBitmap, long j, long j2, long j3, long j4, @FloatRange(from = 0.0d, to = 1.0d) float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i, int i2) {
            ContentDrawScope.super.mo5134drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5179getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo5231getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5180getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo5232getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m5181recordJVtK1S4(@NotNull ContentDrawScope contentDrawScope, @NotNull GraphicsLayer graphicsLayer, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo5233recordJVtK1S4(graphicsLayer, j, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5182roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo550roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5183roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo551roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5184toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo552toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5185toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo553toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5187toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo555toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5188toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo556toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5189toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo557toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5190toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo558toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5191toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo559toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5192toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo560toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5186toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo554toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5193toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo561toSpkPz2Gy4(i);
        }
    }
}
