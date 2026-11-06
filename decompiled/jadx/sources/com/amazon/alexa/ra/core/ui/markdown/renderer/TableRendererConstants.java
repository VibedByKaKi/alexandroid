package com.amazon.alexa.ra.core.ui.markdown.renderer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u000f\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0011\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/TableRendererConstants;", "", "<init>", "()V", "TABLE_ROW_ANIMATION_DURATION_MILLIS", "", "TABLE_ROW_SLIDE_OFFSET_FRACTION", "", "MIN_COLUMN_WIDTH", "Landroidx/compose/ui/unit/Dp;", "getMIN_COLUMN_WIDTH-D9Ej5fM", "()F", "F", "MAX_COLUMN_WIDTH", "getMAX_COLUMN_WIDTH-D9Ej5fM", "CELL_PADDING", "getCELL_PADDING-D9Ej5fM", "SAFETY_MARGIN", "getSAFETY_MARGIN-D9Ej5fM", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableRenderer.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/TableRendererConstants\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,617:1\n149#2:618\n149#2:619\n149#2:620\n149#2:621\n*S KotlinDebug\n*F\n+ 1 TableRenderer.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/TableRendererConstants\n*L\n70#1:618\n73#1:619\n76#1:620\n79#1:621\n*E\n"})
/* loaded from: classes18.dex */
public final class TableRendererConstants {
    public static final int $stable = 0;
    public static final int TABLE_ROW_ANIMATION_DURATION_MILLIS = 800;
    public static final float TABLE_ROW_SLIDE_OFFSET_FRACTION = 0.25f;

    @NotNull
    public static final TableRendererConstants INSTANCE = new TableRendererConstants();
    private static final float MIN_COLUMN_WIDTH = Dp.m7368constructorimpl(60);
    private static final float MAX_COLUMN_WIDTH = Dp.m7368constructorimpl(180);
    private static final float CELL_PADDING = Dp.m7368constructorimpl(16);
    private static final float SAFETY_MARGIN = Dp.m7368constructorimpl(12);

    private TableRendererConstants() {
    }

    /* renamed from: getCELL_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m19163getCELL_PADDINGD9Ej5fM() {
        return CELL_PADDING;
    }

    /* renamed from: getMAX_COLUMN_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m19164getMAX_COLUMN_WIDTHD9Ej5fM() {
        return MAX_COLUMN_WIDTH;
    }

    /* renamed from: getMIN_COLUMN_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m19165getMIN_COLUMN_WIDTHD9Ej5fM() {
        return MIN_COLUMN_WIDTH;
    }

    /* renamed from: getSAFETY_MARGIN-D9Ej5fM, reason: not valid java name */
    public final float m19166getSAFETY_MARGIND9Ej5fM() {
        return SAFETY_MARGIN;
    }
}
