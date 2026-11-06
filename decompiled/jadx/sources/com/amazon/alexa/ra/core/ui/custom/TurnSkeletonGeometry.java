package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007R\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b \u0010\u0007R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b$\u0010\u0007R\u0013\u0010%\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b&\u0010\u0007R\u0013\u0010'\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b(\u0010\u0007R\u0013\u0010)\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b*\u0010\u0007R\u000e\u0010+\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonGeometry;", "", "<init>", "()V", "BUBBLE_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getBUBBLE_HEIGHT-D9Ej5fM", "()F", "F", "BUBBLE_START_INSET", "getBUBBLE_START_INSET-D9Ej5fM", "BUBBLE_MAX_WIDTH", "getBUBBLE_MAX_WIDTH-D9Ej5fM", "LINE_HEIGHT", "getLINE_HEIGHT-D9Ej5fM", "FIRST_LINE_END_INSET", "getFIRST_LINE_END_INSET-D9Ej5fM", "SECOND_LINE_END_INSET", "getSECOND_LINE_END_INSET-D9Ej5fM", "SMART_FRAGMENT_HEIGHT", "getSMART_FRAGMENT_HEIGHT-D9Ej5fM", "PILL_WIDTH", "getPILL_WIDTH-D9Ej5fM", "PILL_HEIGHT", "getPILL_HEIGHT-D9Ej5fM", "CIRCLE_SIZE", "getCIRCLE_SIZE-D9Ej5fM", "ACTION_ROW_HEIGHT", "getACTION_ROW_HEIGHT-D9Ej5fM", "ACTION_ROW_CIRCLE_INSET", "getACTION_ROW_CIRCLE_INSET-D9Ej5fM", "TABLET_COLUMN_MAX_WIDTH", "getTABLET_COLUMN_MAX_WIDTH-D9Ej5fM", "TABLET_BUBBLE_START_INSET", "getTABLET_BUBBLE_START_INSET-D9Ej5fM", "TABLET_FIRST_LINE_END_INSET", "getTABLET_FIRST_LINE_END_INSET-D9Ej5fM", "TABLET_SECOND_LINE_END_INSET", "getTABLET_SECOND_LINE_END_INSET-D9Ej5fM", "TABLET_THIRD_LINE_END_INSET", "getTABLET_THIRD_LINE_END_INSET-D9Ej5fM", "TABLET_SMART_FRAGMENT_MAX_WIDTH", "getTABLET_SMART_FRAGMENT_MAX_WIDTH-D9Ej5fM", "PILL_COUNT", "", "CIRCLE_COUNT", "TABLET_TURN_COUNT", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShimmerEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShimmerEffect.kt\ncom/amazon/alexa/ra/core/ui/custom/TurnSkeletonGeometry\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,774:1\n149#2:775\n149#2:776\n149#2:777\n149#2:778\n149#2:779\n149#2:780\n149#2:781\n149#2:782\n149#2:783\n149#2:784\n149#2:785\n149#2:788\n149#2:789\n149#2:790\n149#2:791\n149#2:792\n149#2:793\n57#3:786\n72#3:787\n*S KotlinDebug\n*F\n+ 1 ShimmerEffect.kt\ncom/amazon/alexa/ra/core/ui/custom/TurnSkeletonGeometry\n*L\n650#1:775\n651#1:776\n652#1:777\n653#1:778\n654#1:779\n655#1:780\n656#1:781\n657#1:782\n658#1:783\n659#1:784\n660#1:785\n662#1:788\n663#1:789\n664#1:790\n665#1:791\n666#1:792\n667#1:793\n661#1:786\n661#1:787\n*E\n"})
/* loaded from: classes18.dex */
final class TurnSkeletonGeometry {
    private static final float ACTION_ROW_CIRCLE_INSET;
    private static final float ACTION_ROW_HEIGHT;
    private static final float BUBBLE_START_INSET;
    public static final int CIRCLE_COUNT = 5;
    private static final float CIRCLE_SIZE;
    public static final int PILL_COUNT = 2;
    private static final float SECOND_LINE_END_INSET;
    private static final float TABLET_BUBBLE_START_INSET;
    private static final float TABLET_COLUMN_MAX_WIDTH;
    private static final float TABLET_FIRST_LINE_END_INSET;
    private static final float TABLET_SECOND_LINE_END_INSET;
    private static final float TABLET_SMART_FRAGMENT_MAX_WIDTH;
    private static final float TABLET_THIRD_LINE_END_INSET;
    public static final int TABLET_TURN_COUNT = 2;

    @NotNull
    public static final TurnSkeletonGeometry INSTANCE = new TurnSkeletonGeometry();
    private static final float BUBBLE_HEIGHT = Dp.m7368constructorimpl(96);
    private static final float BUBBLE_MAX_WIDTH = Dp.m7368constructorimpl(540);
    private static final float LINE_HEIGHT = Dp.m7368constructorimpl(28);
    private static final float FIRST_LINE_END_INSET = Dp.m7368constructorimpl(100);
    private static final float SMART_FRAGMENT_HEIGHT = Dp.m7368constructorimpl(224);
    private static final float PILL_WIDTH = Dp.m7368constructorimpl(202);
    private static final float PILL_HEIGHT = Dp.m7368constructorimpl(44);

    static {
        float f = 32;
        BUBBLE_START_INSET = Dp.m7368constructorimpl(f);
        SECOND_LINE_END_INSET = Dp.m7368constructorimpl(f);
        float m7368constructorimpl = Dp.m7368constructorimpl(30);
        CIRCLE_SIZE = m7368constructorimpl;
        float m7368constructorimpl2 = Dp.m7368constructorimpl(42);
        ACTION_ROW_HEIGHT = m7368constructorimpl2;
        ACTION_ROW_CIRCLE_INSET = Dp.m7368constructorimpl(Dp.m7368constructorimpl(m7368constructorimpl2 - m7368constructorimpl) / 2);
        TABLET_COLUMN_MAX_WIDTH = Dp.m7368constructorimpl(TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
        TABLET_BUBBLE_START_INSET = Dp.m7368constructorimpl(56);
        float f2 = 200;
        TABLET_FIRST_LINE_END_INSET = Dp.m7368constructorimpl(f2);
        TABLET_SECOND_LINE_END_INSET = Dp.m7368constructorimpl(f2);
        TABLET_THIRD_LINE_END_INSET = Dp.m7368constructorimpl(250);
        TABLET_SMART_FRAGMENT_MAX_WIDTH = Dp.m7368constructorimpl(345);
    }

    private TurnSkeletonGeometry() {
    }

    /* renamed from: getACTION_ROW_CIRCLE_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18844getACTION_ROW_CIRCLE_INSETD9Ej5fM() {
        return ACTION_ROW_CIRCLE_INSET;
    }

    /* renamed from: getACTION_ROW_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m18845getACTION_ROW_HEIGHTD9Ej5fM() {
        return ACTION_ROW_HEIGHT;
    }

    /* renamed from: getBUBBLE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m18846getBUBBLE_HEIGHTD9Ej5fM() {
        return BUBBLE_HEIGHT;
    }

    /* renamed from: getBUBBLE_MAX_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m18847getBUBBLE_MAX_WIDTHD9Ej5fM() {
        return BUBBLE_MAX_WIDTH;
    }

    /* renamed from: getBUBBLE_START_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18848getBUBBLE_START_INSETD9Ej5fM() {
        return BUBBLE_START_INSET;
    }

    /* renamed from: getCIRCLE_SIZE-D9Ej5fM, reason: not valid java name */
    public final float m18849getCIRCLE_SIZED9Ej5fM() {
        return CIRCLE_SIZE;
    }

    /* renamed from: getFIRST_LINE_END_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18850getFIRST_LINE_END_INSETD9Ej5fM() {
        return FIRST_LINE_END_INSET;
    }

    /* renamed from: getLINE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m18851getLINE_HEIGHTD9Ej5fM() {
        return LINE_HEIGHT;
    }

    /* renamed from: getPILL_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m18852getPILL_HEIGHTD9Ej5fM() {
        return PILL_HEIGHT;
    }

    /* renamed from: getPILL_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m18853getPILL_WIDTHD9Ej5fM() {
        return PILL_WIDTH;
    }

    /* renamed from: getSECOND_LINE_END_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18854getSECOND_LINE_END_INSETD9Ej5fM() {
        return SECOND_LINE_END_INSET;
    }

    /* renamed from: getSMART_FRAGMENT_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m18855getSMART_FRAGMENT_HEIGHTD9Ej5fM() {
        return SMART_FRAGMENT_HEIGHT;
    }

    /* renamed from: getTABLET_BUBBLE_START_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18856getTABLET_BUBBLE_START_INSETD9Ej5fM() {
        return TABLET_BUBBLE_START_INSET;
    }

    /* renamed from: getTABLET_COLUMN_MAX_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m18857getTABLET_COLUMN_MAX_WIDTHD9Ej5fM() {
        return TABLET_COLUMN_MAX_WIDTH;
    }

    /* renamed from: getTABLET_FIRST_LINE_END_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18858getTABLET_FIRST_LINE_END_INSETD9Ej5fM() {
        return TABLET_FIRST_LINE_END_INSET;
    }

    /* renamed from: getTABLET_SECOND_LINE_END_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18859getTABLET_SECOND_LINE_END_INSETD9Ej5fM() {
        return TABLET_SECOND_LINE_END_INSET;
    }

    /* renamed from: getTABLET_SMART_FRAGMENT_MAX_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m18860getTABLET_SMART_FRAGMENT_MAX_WIDTHD9Ej5fM() {
        return TABLET_SMART_FRAGMENT_MAX_WIDTH;
    }

    /* renamed from: getTABLET_THIRD_LINE_END_INSET-D9Ej5fM, reason: not valid java name */
    public final float m18861getTABLET_THIRD_LINE_END_INSETD9Ej5fM() {
        return TABLET_THIRD_LINE_END_INSET;
    }
}
