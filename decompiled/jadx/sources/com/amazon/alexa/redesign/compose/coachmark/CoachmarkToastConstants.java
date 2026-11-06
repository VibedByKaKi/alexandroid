package com.amazon.alexa.redesign.compose.coachmark;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u000e\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\nR\u0013\u0010\u0010\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0011\u0010\nR\u0013\u0010\u0012\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\nR\u0013\u0010\u0014\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u0013\u0010\u0016\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/compose/coachmark/CoachmarkToastConstants;", "", "<init>", "()V", "TOUR_START_DELAY_MS", "", "TOAST_AUTO_DISMISS_DELAY_MS", "TOAST_OUTER_PADDING", "Landroidx/compose/ui/unit/Dp;", "getTOAST_OUTER_PADDING-D9Ej5fM", "()F", "F", "TOAST_TOP_PADDING", "getTOAST_TOP_PADDING-D9Ej5fM", "TOAST_HORIZONTAL_PADDING", "getTOAST_HORIZONTAL_PADDING-D9Ej5fM", "TOAST_INNER_PADDING", "getTOAST_INNER_PADDING-D9Ej5fM", "TOAST_SPACER_WIDTH", "getTOAST_SPACER_WIDTH-D9Ej5fM", "TOAST_CORNER_RADIUS", "getTOAST_CORNER_RADIUS-D9Ej5fM", "TOAST_ELEVATION", "getTOAST_ELEVATION-D9Ej5fM", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoachmarkConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachmarkConstants.kt\ncom/amazon/alexa/redesign/compose/coachmark/CoachmarkToastConstants\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,57:1\n113#2:58\n113#2:59\n113#2:60\n113#2:61\n113#2:62\n113#2:63\n113#2:64\n*S KotlinDebug\n*F\n+ 1 CoachmarkConstants.kt\ncom/amazon/alexa/redesign/compose/coachmark/CoachmarkToastConstants\n*L\n49#1:58\n50#1:59\n51#1:60\n52#1:61\n53#1:62\n54#1:63\n55#1:64\n*E\n"})
/* loaded from: classes19.dex */
public final class CoachmarkToastConstants {
    public static final int $stable = 0;
    public static final long TOAST_AUTO_DISMISS_DELAY_MS = 5000;
    private static final float TOAST_CORNER_RADIUS;
    private static final float TOAST_ELEVATION;
    private static final float TOAST_HORIZONTAL_PADDING;
    private static final float TOAST_INNER_PADDING;
    private static final float TOAST_OUTER_PADDING;
    private static final float TOAST_SPACER_WIDTH;
    public static final long TOUR_START_DELAY_MS = 5000;

    @NotNull
    public static final CoachmarkToastConstants INSTANCE = new CoachmarkToastConstants();
    private static final float TOAST_TOP_PADDING = Dp.m7368constructorimpl(56);

    static {
        float f = 16;
        TOAST_OUTER_PADDING = Dp.m7368constructorimpl(f);
        float f2 = 8;
        TOAST_HORIZONTAL_PADDING = Dp.m7368constructorimpl(f2);
        TOAST_INNER_PADDING = Dp.m7368constructorimpl(f);
        TOAST_SPACER_WIDTH = Dp.m7368constructorimpl(f2);
        TOAST_CORNER_RADIUS = Dp.m7368constructorimpl(f2);
        TOAST_ELEVATION = Dp.m7368constructorimpl(f2);
    }

    private CoachmarkToastConstants() {
    }

    /* renamed from: getTOAST_CORNER_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m19495getTOAST_CORNER_RADIUSD9Ej5fM() {
        return TOAST_CORNER_RADIUS;
    }

    /* renamed from: getTOAST_ELEVATION-D9Ej5fM, reason: not valid java name */
    public final float m19496getTOAST_ELEVATIOND9Ej5fM() {
        return TOAST_ELEVATION;
    }

    /* renamed from: getTOAST_HORIZONTAL_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m19497getTOAST_HORIZONTAL_PADDINGD9Ej5fM() {
        return TOAST_HORIZONTAL_PADDING;
    }

    /* renamed from: getTOAST_INNER_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m19498getTOAST_INNER_PADDINGD9Ej5fM() {
        return TOAST_INNER_PADDING;
    }

    /* renamed from: getTOAST_OUTER_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m19499getTOAST_OUTER_PADDINGD9Ej5fM() {
        return TOAST_OUTER_PADDING;
    }

    /* renamed from: getTOAST_SPACER_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m19500getTOAST_SPACER_WIDTHD9Ej5fM() {
        return TOAST_SPACER_WIDTH;
    }

    /* renamed from: getTOAST_TOP_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m19501getTOAST_TOP_PADDINGD9Ej5fM() {
        return TOAST_TOP_PADDING;
    }
}
