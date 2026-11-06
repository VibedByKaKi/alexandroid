package androidx.compose.ui.unit;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Stable;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.facebook.react.uimanager.ViewProps;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a-\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0082\b\u001a5\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010 \u001a\u0019\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010$\u001a\u00020(*\u00020\u001b2\u0006\u0010\u0019\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010'\u001a\u001b\u0010*\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010+\u001a\u00020\u0001H\u0007¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010.\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010/\u001a\u00020\u0001H\u0007¢\u0006\u0004\b0\u0010-\u001a\u001b\u00101\u001a\u000202*\u00020\u001b2\u0006\u0010\u0019\u001a\u00020(H\u0007¢\u0006\u0004\b3\u00104\u001a'\u00105\u001a\u00020\u001b*\u00020\u001b2\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u0001H\u0007¢\u0006\u0004\b8\u00109\u001a\u0019\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001H\u0082\b\u001a\u0011\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0082\b\u001a\u0011\u0010?\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u0001H\u0082\b\u001a\u0011\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u0001H\u0082\b\u001a\u0011\u0010C\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u0001H\u0082\b\u001a\u0011\u0010D\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u0001H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0010\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012¨\u0006E"}, d2 = {"Infinity", "", "FocusMask", "", "MinFocusBits", "MaxAllowedForMinFocusBits", "MinFocusMask", "MinNonFocusBits", "MaxAllowedForMinNonFocusBits", "MinNonFocusMask", "MaxFocusBits", "MaxAllowedForMaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxNonFocusMask", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V", "throwInvalidConstraintException", "", "widthVal", "heightVal", "throwInvalidConstraintsSizeException", "", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", ViewProps.MIN_WIDTH, "maxWidth", ViewProps.MIN_HEIGHT, "maxHeight", "(IIII)J", "bitsNeedForSizeUnchecked", "maxAllowedForSize", androidx.constraintlayout.widget.Constraints.TAG, "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainWidth", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainHeight", "height", "constrainHeight-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "addMaxWithMinimum", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "value", "indexToBitOffset", "index", "bitOffsetToIndex", "bits", "minHeightOffsets", "bitOffset", "widthMask", "heightMask", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,634:1\n621#1:635\n627#1:636\n552#1,4:732\n552#1,4:738\n38#2,4:637\n101#3,10:641\n101#3,10:651\n101#3,10:661\n101#3,10:671\n101#3,10:683\n101#3,10:695\n101#3,10:707\n101#3,10:717\n105#3:731\n105#3:736\n105#3:737\n105#3:742\n105#3:743\n54#4:681\n59#4:693\n54#4:727\n59#4:729\n85#5:682\n90#5:694\n80#5:706\n85#5:728\n90#5:730\n30#6:705\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n440#1:635\n442#1:636\n546#1:732,4\n548#1:738,4\n486#1:637,4\n514#1:641,10\n515#1:651,10\n516#1:661,10\n517#1:671,10\n525#1:683,10\n526#1:695,10\n530#1:707,10\n533#1:717,10\n545#1:731\n546#1:736\n547#1:737\n548#1:742\n555#1:743\n525#1:681\n526#1:693\n538#1:727\n538#1:729\n525#1:682\n526#1:694\n524#1:706\n538#1:728\n538#1:730\n524#1:705\n*E\n"})
/* loaded from: classes13.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < MaxFocusMask ? 18 : 255;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m7335constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int m7323getMinWidthimpl = Constraints.m7323getMinWidthimpl(j);
        int m7321getMaxWidthimpl = Constraints.m7321getMaxWidthimpl(j);
        if (i < m7323getMinWidthimpl) {
            i = m7323getMinWidthimpl;
        }
        if (i <= m7321getMaxWidthimpl) {
            m7321getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int m7322getMinHeightimpl = Constraints.m7322getMinHeightimpl(j);
        int m7320getMaxHeightimpl = Constraints.m7320getMaxHeightimpl(j);
        if (i2 < m7322getMinHeightimpl) {
            i2 = m7322getMinHeightimpl;
        }
        if (i2 <= m7320getMaxHeightimpl) {
            m7320getMaxHeightimpl = i2;
        }
        return IntSize.m7534constructorimpl((m7321getMaxWidthimpl << 32) | (m7320getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m7336constrainN9IONVI(long j, long j2) {
        int m7323getMinWidthimpl = Constraints.m7323getMinWidthimpl(j);
        int m7321getMaxWidthimpl = Constraints.m7321getMaxWidthimpl(j);
        int m7322getMinHeightimpl = Constraints.m7322getMinHeightimpl(j);
        int m7320getMaxHeightimpl = Constraints.m7320getMaxHeightimpl(j);
        int m7323getMinWidthimpl2 = Constraints.m7323getMinWidthimpl(j2);
        if (m7323getMinWidthimpl2 < m7323getMinWidthimpl) {
            m7323getMinWidthimpl2 = m7323getMinWidthimpl;
        }
        if (m7323getMinWidthimpl2 > m7321getMaxWidthimpl) {
            m7323getMinWidthimpl2 = m7321getMaxWidthimpl;
        }
        int m7321getMaxWidthimpl2 = Constraints.m7321getMaxWidthimpl(j2);
        if (m7321getMaxWidthimpl2 >= m7323getMinWidthimpl) {
            m7323getMinWidthimpl = m7321getMaxWidthimpl2;
        }
        if (m7323getMinWidthimpl <= m7321getMaxWidthimpl) {
            m7321getMaxWidthimpl = m7323getMinWidthimpl;
        }
        int m7322getMinHeightimpl2 = Constraints.m7322getMinHeightimpl(j2);
        if (m7322getMinHeightimpl2 < m7322getMinHeightimpl) {
            m7322getMinHeightimpl2 = m7322getMinHeightimpl;
        }
        if (m7322getMinHeightimpl2 > m7320getMaxHeightimpl) {
            m7322getMinHeightimpl2 = m7320getMaxHeightimpl;
        }
        int m7320getMaxHeightimpl2 = Constraints.m7320getMaxHeightimpl(j2);
        if (m7320getMaxHeightimpl2 >= m7322getMinHeightimpl) {
            m7322getMinHeightimpl = m7320getMaxHeightimpl2;
        }
        if (m7322getMinHeightimpl <= m7320getMaxHeightimpl) {
            m7320getMaxHeightimpl = m7322getMinHeightimpl;
        }
        return Constraints(m7323getMinWidthimpl2, m7321getMaxWidthimpl, m7322getMinHeightimpl2, m7320getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m7337constrainHeightK40F9xA(long j, int i) {
        int m7322getMinHeightimpl = Constraints.m7322getMinHeightimpl(j);
        int m7320getMaxHeightimpl = Constraints.m7320getMaxHeightimpl(j);
        if (i < m7322getMinHeightimpl) {
            i = m7322getMinHeightimpl;
        }
        return i > m7320getMaxHeightimpl ? m7320getMaxHeightimpl : i;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m7338constrainWidthK40F9xA(long j, int i) {
        int m7323getMinWidthimpl = Constraints.m7323getMinWidthimpl(j);
        int m7321getMaxWidthimpl = Constraints.m7321getMaxWidthimpl(j);
        if (i < m7323getMinWidthimpl) {
            i = m7323getMinWidthimpl;
        }
        return i > m7321getMaxWidthimpl ? m7321getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = bitsNeedForSizeUnchecked2 - 13;
        return Constraints.m7309constructorimpl(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (bitsNeedForSizeUnchecked2 + 2)) | ((i8 & (~(i8 >> 31))) << (bitsNeedForSizeUnchecked2 + 33)));
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return (((i & 2) >> 1) * 3) + ((i & 1) << 1);
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m7339isSatisfiedBy4WqzIAM(long j, long j2) {
        int m7323getMinWidthimpl = Constraints.m7323getMinWidthimpl(j);
        int m7321getMaxWidthimpl = Constraints.m7321getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (m7323getMinWidthimpl > i || i > m7321getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return Constraints.m7322getMinHeightimpl(j) <= i2 && i2 <= Constraints.m7320getMaxHeightimpl(j);
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return 65534;
        }
        if (i < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m7340offsetNN6EwU(long j, int i, int i2) {
        int m7323getMinWidthimpl = Constraints.m7323getMinWidthimpl(j) + i;
        if (m7323getMinWidthimpl < 0) {
            m7323getMinWidthimpl = 0;
        }
        int m7321getMaxWidthimpl = Constraints.m7321getMaxWidthimpl(j);
        if (m7321getMaxWidthimpl != Integer.MAX_VALUE && (m7321getMaxWidthimpl = m7321getMaxWidthimpl + i) < 0) {
            m7321getMaxWidthimpl = 0;
        }
        int m7322getMinHeightimpl = Constraints.m7322getMinHeightimpl(j) + i2;
        if (m7322getMinHeightimpl < 0) {
            m7322getMinHeightimpl = 0;
        }
        int m7320getMaxHeightimpl = Constraints.m7320getMaxHeightimpl(j);
        return Constraints(m7323getMinWidthimpl, m7321getMaxWidthimpl, m7322getMinHeightimpl, (m7320getMaxHeightimpl == Integer.MAX_VALUE || (m7320getMaxHeightimpl = m7320getMaxHeightimpl + i2) >= 0) ? m7320getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m7341offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7340offsetNN6EwU(j, i, i2);
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(a$$ExternalSyntheticOutline0.m(i, "Can't represent a size of ", " in Constraints"));
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }

    @PublishedApi
    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }
}
