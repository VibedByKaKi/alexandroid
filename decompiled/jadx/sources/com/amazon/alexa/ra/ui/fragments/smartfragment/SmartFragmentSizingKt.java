package com.amazon.alexa.ra.ui.fragments.smartfragment;

import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u001e\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u001e\u0010\f\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"MOBILE_HEIGHT_RATIO", "", "getMOBILE_HEIGHT_RATIO$annotations", "()V", "TABLET_HIGH_DENSITY_HEIGHT_RATIO", "getTABLET_HIGH_DENSITY_HEIGHT_RATIO$annotations", "TABLET_LOW_DENSITY_WIDTH", "Landroidx/compose/ui/unit/Dp;", "getTABLET_LOW_DENSITY_WIDTH$annotations", "getTABLET_LOW_DENSITY_WIDTH", "()F", "F", "TABLET_LOW_DENSITY_HEIGHT", "getTABLET_LOW_DENSITY_HEIGHT$annotations", "getTABLET_LOW_DENSITY_HEIGHT", "smartFragmentSize", "Lcom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSize;", "availableWidth", "isLargeScreenDevice", "", "density", "Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ContentDensity;", "smartFragmentSize-8Feqmps", "(FZLcom/amazon/alexa/ra/ui/fragments/smartfragment/ContentDensity;)Lcom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSize;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSmartFragmentSizing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartFragmentSizing.kt\ncom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSizingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,84:1\n113#2:85\n113#2:86\n113#2:87\n113#2:88\n*S KotlinDebug\n*F\n+ 1 SmartFragmentSizing.kt\ncom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSizingKt\n*L\n68#1:85\n81#1:86\n36#1:87\n40#1:88\n*E\n"})
/* loaded from: classes19.dex */
public final class SmartFragmentSizingKt {
    public static final float MOBILE_HEIGHT_RATIO = 0.6512f;
    public static final float TABLET_HIGH_DENSITY_HEIGHT_RATIO = 0.4886f;
    private static final float TABLET_LOW_DENSITY_WIDTH = Dp.m7368constructorimpl(344);
    private static final float TABLET_LOW_DENSITY_HEIGHT = Dp.m7368constructorimpl(224);

    public static final float getTABLET_LOW_DENSITY_HEIGHT() {
        return TABLET_LOW_DENSITY_HEIGHT;
    }

    public static final float getTABLET_LOW_DENSITY_WIDTH() {
        return TABLET_LOW_DENSITY_WIDTH;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: smartFragmentSize-8Feqmps, reason: not valid java name */
    public static final SmartFragmentSize m19438smartFragmentSize8Feqmps(float f, boolean z, @NotNull ContentDensity contentDensity) {
        contentDensity.getClass();
        return !z ? new SmartFragmentSize(f, Dp.m7368constructorimpl(MathKt.roundToInt(0.6512f * f)), null) : contentDensity == ContentDensity.LOW ? new SmartFragmentSize(TABLET_LOW_DENSITY_WIDTH, TABLET_LOW_DENSITY_HEIGHT, null) : new SmartFragmentSize(f, Dp.m7368constructorimpl(MathKt.roundToInt(0.4886f * f)), null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMOBILE_HEIGHT_RATIO$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTABLET_HIGH_DENSITY_HEIGHT_RATIO$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTABLET_LOW_DENSITY_HEIGHT$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTABLET_LOW_DENSITY_WIDTH$annotations() {
    }
}
