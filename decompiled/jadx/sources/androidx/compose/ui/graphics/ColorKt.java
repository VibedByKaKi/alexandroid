package androidx.compose.ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a5\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u00112\b\b\u0003\u0010\u000b\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0015\u001a)\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a1\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0082\b\u001a\u0013\u0010&\u001a\u00020'*\u00020\u0006H\u0003¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010*\u001a\u00020\b*\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020\u0011*\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010/\u001a\"\u00109\u001a\u00020\u0006*\u00020\u00062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060;H\u0086\b¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u00100\u001a\u000201*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u001f\u00106\u001a\u000201*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00103\u001a\u0004\b8\u00105¨\u0006>"}, d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "Color", "Landroidx/compose/ui/graphics/Color;", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "UncheckedColor", "color", "", "(I)J", "", "(J)J", "(IIII)J", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", AppStateModule.APP_STATE_BACKGROUND, "compositeOver--OWjLjI", "(JJ)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "toArgb", "toArgb-8_81llA", "(J)I", "isSpecified", "", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:986\n583#1:987\n583#1:988\n635#1:1003\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:708\n65#2,10:756\n65#2,10:804\n65#2,10:852\n65#2,10:976\n65#2,10:993\n34#3,4:700\n34#3,4:704\n34#3,4:989\n535#4,38:718\n535#4,38:766\n535#4,38:814\n535#4,38:862\n535#4,38:900\n535#4,38:938\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:986\n569#1:987\n570#1:988\n646#1:1003\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:708,10\n404#1:756,10\n405#1:804,10\n406#1:852,10\n537#1:976,10\n617#1:993,10\n394#1:700,4\n399#1:704,4\n607#1:989,4\n403#1:718,38\n404#1:766,38\n405#1:814,38\n441#1:862,38\n442#1:900,38\n443#1:938,38\n*E\n"})
/* loaded from: classes13.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4689compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m4641convertvNxB06k = Color.m4641convertvNxB06k(j, Color.m4648getColorSpaceimpl(j2));
        float m4646getAlphaimpl = Color.m4646getAlphaimpl(j2);
        float m4646getAlphaimpl2 = Color.m4646getAlphaimpl(m4641convertvNxB06k);
        float f3 = 1.0f - m4646getAlphaimpl2;
        float f4 = (m4646getAlphaimpl * f3) + m4646getAlphaimpl2;
        float m4650getRedimpl = Color.m4650getRedimpl(m4641convertvNxB06k);
        float m4650getRedimpl2 = Color.m4650getRedimpl(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((m4650getRedimpl2 * m4646getAlphaimpl) * f3) + (m4650getRedimpl * m4646getAlphaimpl2)) / f4;
        }
        float m4649getGreenimpl = Color.m4649getGreenimpl(m4641convertvNxB06k);
        float m4649getGreenimpl2 = Color.m4649getGreenimpl(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((m4649getGreenimpl2 * m4646getAlphaimpl) * f3) + (m4649getGreenimpl * m4646getAlphaimpl2)) / f4;
        }
        float m4647getBlueimpl = Color.m4647getBlueimpl(m4641convertvNxB06k);
        float m4647getBlueimpl2 = Color.m4647getBlueimpl(j2);
        if (f4 != 0.0f) {
            f5 = (((m4647getBlueimpl2 * m4646getAlphaimpl) * f3) + (m4647getBlueimpl * m4646getAlphaimpl2)) / f4;
        }
        return UncheckedColor(f, f2, f5, f4, Color.m4648getColorSpaceimpl(j2));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m4690getComponents8_81llA(long j) {
        return new float[]{Color.m4650getRedimpl(j), Color.m4649getGreenimpl(j), Color.m4647getBlueimpl(j), Color.m4646getAlphaimpl(j)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4691isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4693isUnspecified8_81llA(long j) {
        return j == 16;
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4695lerpjxsXWHM(long j, long j2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m4641convertvNxB06k = Color.m4641convertvNxB06k(j, oklab);
        long m4641convertvNxB06k2 = Color.m4641convertvNxB06k(j2, oklab);
        float m4646getAlphaimpl = Color.m4646getAlphaimpl(m4641convertvNxB06k);
        float m4650getRedimpl = Color.m4650getRedimpl(m4641convertvNxB06k);
        float m4649getGreenimpl = Color.m4649getGreenimpl(m4641convertvNxB06k);
        float m4647getBlueimpl = Color.m4647getBlueimpl(m4641convertvNxB06k);
        float m4646getAlphaimpl2 = Color.m4646getAlphaimpl(m4641convertvNxB06k2);
        float m4650getRedimpl2 = Color.m4650getRedimpl(m4641convertvNxB06k2);
        float m4649getGreenimpl2 = Color.m4649getGreenimpl(m4641convertvNxB06k2);
        float m4647getBlueimpl2 = Color.m4647getBlueimpl(m4641convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m4641convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m4650getRedimpl, m4650getRedimpl2, f), MathHelpersKt.lerp(m4649getGreenimpl, m4649getGreenimpl2, f), MathHelpersKt.lerp(m4647getBlueimpl, m4647getBlueimpl2, f), MathHelpersKt.lerp(m4646getAlphaimpl, m4646getAlphaimpl2, f), oklab), Color.m4648getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4696luminance8_81llA(long j) {
        ColorSpace m4648getColorSpaceimpl = Color.m4648getColorSpaceimpl(j);
        if (!ColorModel.m5069equalsimpl0(m4648getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m5076getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m5072toStringimpl(m4648getColorSpaceimpl.getModel())));
        }
        DoubleFunction eotfFunc = ((Rgb) m4648getColorSpaceimpl).getEotfFunc();
        double invoke = eotfFunc.invoke(Color.m4650getRedimpl(j));
        float invoke2 = (float) ((eotfFunc.invoke(Color.m4647getBlueimpl(j)) * 0.0722d) + (eotfFunc.invoke(Color.m4649getGreenimpl(j)) * 0.7152d) + (invoke * 0.2126d));
        if (invoke2 < 0.0f) {
            invoke2 = 0.0f;
        }
        if (invoke2 > 1.0f) {
            return 1.0f;
        }
        return invoke2;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4697takeOrElseDxMtmZc(long j, @NotNull Function0<Color> function0) {
        return j != 16 ? j : function0.invoke().m4654unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4698toArgb8_81llA(long j) {
        return (int) ULong.m25468constructorimpl(Color.m4641convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    @PublishedApi
    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4692isSpecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4694isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    public static final long Color(@ColorInt int i) {
        return Color.m4640constructorimpl(ULong.m25468constructorimpl(ULong.m25468constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m4640constructorimpl(ULong.m25468constructorimpl(j << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @IntRange(from = 0, to = 255) int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
