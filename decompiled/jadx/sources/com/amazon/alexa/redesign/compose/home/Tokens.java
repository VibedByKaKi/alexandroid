package com.amazon.alexa.redesign.compose.home;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.amazon.alexa.voice.tta.permissions.PermissionsUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007R\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b \u0010\u0007R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b$\u0010\u0007R\u0013\u0010%\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b&\u0010\u0007R\u0013\u0010'\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b(\u0010\u0007R\u0013\u0010)\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b*\u0010\u0007R\u0013\u0010+\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b,\u0010\u0007R\u0013\u0010-\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b.\u0010\u0007R\u0013\u0010/\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b0\u0010\u0007R\u0013\u00101\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b2\u0010\u0007¨\u00063"}, d2 = {"Lcom/amazon/alexa/redesign/compose/home/Tokens;", "", "<init>", "()V", "focusCardWidth", "Landroidx/compose/ui/unit/Dp;", "getFocusCardWidth-D9Ej5fM", "()F", "F", "focusCardCornerRadius", "getFocusCardCornerRadius-D9Ej5fM", "secondCardWidth", "getSecondCardWidth-D9Ej5fM", "secondCardHeight", "getSecondCardHeight-D9Ej5fM", "secondCardCornerRadius", "getSecondCardCornerRadius-D9Ej5fM", "thirdCardWidth", "getThirdCardWidth-D9Ej5fM", "thirdCardHeight", "getThirdCardHeight-D9Ej5fM", "thirdCardCornerRadius", "getThirdCardCornerRadius-D9Ej5fM", "collapsedGap", "getCollapsedGap-D9Ej5fM", "topPadding", "getTopPadding-D9Ej5fM", "agentSpaceToCardsGap", "getAgentSpaceToCardsGap-D9Ej5fM", "contentHorizontalPadding", "getContentHorizontalPadding-D9Ej5fM", "greetingHorizontalPadding", "getGreetingHorizontalPadding-D9Ej5fM", "contentBottomPadding", "getContentBottomPadding-D9Ej5fM", "greetingFirstLineWidth", "getGreetingFirstLineWidth-D9Ej5fM", "greetingSecondLineWidth", "getGreetingSecondLineWidth-D9Ej5fM", "greetingLineHeight", "getGreetingLineHeight-D9Ej5fM", "greetingLineSpacing", "getGreetingLineSpacing-D9Ej5fM", "focusCardHeight", "getFocusCardHeight-D9Ej5fM", "largeScreenBlockCornerRadius", "getLargeScreenBlockCornerRadius-D9Ej5fM", "largeScreenGreetingLineHeight", "getLargeScreenGreetingLineHeight-D9Ej5fM", "largeScreenGreetingPillInset", "getLargeScreenGreetingPillInset-D9Ej5fM", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@VisibleForTesting
@SourceDebugExtension({"SMAP\nCardStudioLoadingSkeleton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardStudioLoadingSkeleton.kt\ncom/amazon/alexa/redesign/compose/home/Tokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,347:1\n113#2:348\n113#2:349\n113#2:350\n113#2:351\n113#2:352\n113#2:353\n113#2:354\n113#2:355\n113#2:356\n113#2:357\n113#2:358\n113#2:359\n113#2:360\n113#2:361\n113#2:362\n113#2:363\n113#2:364\n113#2:365\n113#2:366\n113#2:367\n118#2:368\n113#2:369\n*S KotlinDebug\n*F\n+ 1 CardStudioLoadingSkeleton.kt\ncom/amazon/alexa/redesign/compose/home/Tokens\n*L\n312#1:348\n313#1:349\n314#1:350\n315#1:351\n316#1:352\n317#1:353\n318#1:354\n319#1:355\n320#1:356\n324#1:357\n327#1:358\n328#1:359\n331#1:360\n332#1:361\n335#1:362\n336#1:363\n337#1:364\n338#1:365\n340#1:366\n343#1:367\n344#1:368\n345#1:369\n*E\n"})
/* loaded from: classes19.dex */
public final class Tokens {
    public static final int $stable = 0;
    private static final float agentSpaceToCardsGap;
    private static final float collapsedGap;
    private static final float contentBottomPadding;
    private static final float contentHorizontalPadding;
    private static final float focusCardCornerRadius;
    private static final float focusCardHeight;
    private static final float greetingFirstLineWidth;
    private static final float greetingHorizontalPadding;
    private static final float greetingLineHeight;
    private static final float greetingLineSpacing;
    private static final float greetingSecondLineWidth;
    private static final float largeScreenBlockCornerRadius;
    private static final float largeScreenGreetingLineHeight;
    private static final float largeScreenGreetingPillInset;
    private static final float secondCardCornerRadius;
    private static final float secondCardHeight;
    private static final float secondCardWidth;
    private static final float thirdCardCornerRadius;
    private static final float thirdCardHeight;
    private static final float thirdCardWidth;
    private static final float topPadding;

    @NotNull
    public static final Tokens INSTANCE = new Tokens();
    private static final float focusCardWidth = Dp.m7368constructorimpl(345);

    static {
        float f = 36;
        focusCardCornerRadius = Dp.m7368constructorimpl(f);
        float f2 = PermissionsUtil.LOCATION_PERMISSION_REQUEST_CODE;
        secondCardWidth = Dp.m7368constructorimpl(f2);
        secondCardHeight = Dp.m7368constructorimpl(80);
        float f3 = 40;
        secondCardCornerRadius = Dp.m7368constructorimpl(f3);
        thirdCardWidth = Dp.m7368constructorimpl(297);
        thirdCardHeight = Dp.m7368constructorimpl(76);
        thirdCardCornerRadius = Dp.m7368constructorimpl(38);
        float f4 = 8;
        collapsedGap = Dp.m7368constructorimpl(f4);
        topPadding = Dp.m7368constructorimpl(92);
        agentSpaceToCardsGap = Dp.m7368constructorimpl(61);
        contentHorizontalPadding = Dp.m7368constructorimpl(24);
        greetingHorizontalPadding = Dp.m7368constructorimpl(f);
        contentBottomPadding = Dp.m7368constructorimpl(32);
        greetingFirstLineWidth = Dp.m7368constructorimpl(171);
        greetingSecondLineWidth = Dp.m7368constructorimpl(f2);
        greetingLineHeight = Dp.m7368constructorimpl(f3);
        greetingLineSpacing = Dp.m7368constructorimpl(f4);
        focusCardHeight = Dp.m7368constructorimpl(210);
        largeScreenBlockCornerRadius = Dp.m7368constructorimpl(16);
        largeScreenGreetingLineHeight = Dp.m7368constructorimpl((float) 38.4d);
        largeScreenGreetingPillInset = Dp.m7368constructorimpl(5);
    }

    private Tokens() {
    }

    /* renamed from: getAgentSpaceToCardsGap-D9Ej5fM, reason: not valid java name */
    public final float m19624getAgentSpaceToCardsGapD9Ej5fM() {
        return agentSpaceToCardsGap;
    }

    /* renamed from: getCollapsedGap-D9Ej5fM, reason: not valid java name */
    public final float m19625getCollapsedGapD9Ej5fM() {
        return collapsedGap;
    }

    /* renamed from: getContentBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float m19626getContentBottomPaddingD9Ej5fM() {
        return contentBottomPadding;
    }

    /* renamed from: getContentHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m19627getContentHorizontalPaddingD9Ej5fM() {
        return contentHorizontalPadding;
    }

    /* renamed from: getFocusCardCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m19628getFocusCardCornerRadiusD9Ej5fM() {
        return focusCardCornerRadius;
    }

    /* renamed from: getFocusCardHeight-D9Ej5fM, reason: not valid java name */
    public final float m19629getFocusCardHeightD9Ej5fM() {
        return focusCardHeight;
    }

    /* renamed from: getFocusCardWidth-D9Ej5fM, reason: not valid java name */
    public final float m19630getFocusCardWidthD9Ej5fM() {
        return focusCardWidth;
    }

    /* renamed from: getGreetingFirstLineWidth-D9Ej5fM, reason: not valid java name */
    public final float m19631getGreetingFirstLineWidthD9Ej5fM() {
        return greetingFirstLineWidth;
    }

    /* renamed from: getGreetingHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m19632getGreetingHorizontalPaddingD9Ej5fM() {
        return greetingHorizontalPadding;
    }

    /* renamed from: getGreetingLineHeight-D9Ej5fM, reason: not valid java name */
    public final float m19633getGreetingLineHeightD9Ej5fM() {
        return greetingLineHeight;
    }

    /* renamed from: getGreetingLineSpacing-D9Ej5fM, reason: not valid java name */
    public final float m19634getGreetingLineSpacingD9Ej5fM() {
        return greetingLineSpacing;
    }

    /* renamed from: getGreetingSecondLineWidth-D9Ej5fM, reason: not valid java name */
    public final float m19635getGreetingSecondLineWidthD9Ej5fM() {
        return greetingSecondLineWidth;
    }

    /* renamed from: getLargeScreenBlockCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m19636getLargeScreenBlockCornerRadiusD9Ej5fM() {
        return largeScreenBlockCornerRadius;
    }

    /* renamed from: getLargeScreenGreetingLineHeight-D9Ej5fM, reason: not valid java name */
    public final float m19637getLargeScreenGreetingLineHeightD9Ej5fM() {
        return largeScreenGreetingLineHeight;
    }

    /* renamed from: getLargeScreenGreetingPillInset-D9Ej5fM, reason: not valid java name */
    public final float m19638getLargeScreenGreetingPillInsetD9Ej5fM() {
        return largeScreenGreetingPillInset;
    }

    /* renamed from: getSecondCardCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m19639getSecondCardCornerRadiusD9Ej5fM() {
        return secondCardCornerRadius;
    }

    /* renamed from: getSecondCardHeight-D9Ej5fM, reason: not valid java name */
    public final float m19640getSecondCardHeightD9Ej5fM() {
        return secondCardHeight;
    }

    /* renamed from: getSecondCardWidth-D9Ej5fM, reason: not valid java name */
    public final float m19641getSecondCardWidthD9Ej5fM() {
        return secondCardWidth;
    }

    /* renamed from: getThirdCardCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m19642getThirdCardCornerRadiusD9Ej5fM() {
        return thirdCardCornerRadius;
    }

    /* renamed from: getThirdCardHeight-D9Ej5fM, reason: not valid java name */
    public final float m19643getThirdCardHeightD9Ej5fM() {
        return thirdCardHeight;
    }

    /* renamed from: getThirdCardWidth-D9Ej5fM, reason: not valid java name */
    public final float m19644getThirdCardWidthD9Ej5fM() {
        return thirdCardWidth;
    }

    /* renamed from: getTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m19645getTopPaddingD9Ej5fM() {
        return topPadding;
    }
}
