package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.RectF;
import com.amazon.alexa.presence.utils.MetricsUtil;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/style/BorderInsets;", "", "<init>", "()V", "edgeInsets", "", "", "[Ljava/lang/Float;", "setBorderWidth", "", "edge", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "width", "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", MetricsUtil.MetricsId.RESOLVE, "Landroid/graphics/RectF;", ViewProps.LAYOUT_DIRECTION, "", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BorderInsets {

    @NotNull
    private final Float[] edgeInsets = new Float[LogicalEdge.values().length];

    @NotNull
    public final RectF resolve(int layoutDirection, @NotNull Context context) {
        context.getClass();
        float f = 0.0f;
        if (layoutDirection == 0) {
            Float f2 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float floatValue = (f2 == null && (f2 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f2.floatValue();
            Float f3 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float floatValue2 = (f3 == null && (f3 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f3.floatValue();
            Float f4 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float floatValue3 = (f4 == null && (f4 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f4 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f4 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f4.floatValue();
            Float f5 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            if (f5 == null && (f5 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f5 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f5 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null) {
                Float f6 = this.edgeInsets[LogicalEdge.ALL.ordinal()];
                if (f6 != null) {
                    f = f6.floatValue();
                }
            } else {
                f = f5.floatValue();
            }
            return new RectF(floatValue, floatValue2, floatValue3, f);
        }
        if (layoutDirection != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("Expected resolved layout direction");
            return null;
        }
        if (I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context)) {
            Float f7 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float floatValue4 = (f7 == null && (f7 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f7.floatValue();
            Float f8 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float floatValue5 = (f8 == null && (f8 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f8 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f8 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f8 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f8.floatValue();
            Float f9 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float floatValue6 = (f9 == null && (f9 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f9 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f9 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f9.floatValue();
            Float f10 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            if (f10 == null && (f10 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null) {
                Float f11 = this.edgeInsets[LogicalEdge.ALL.ordinal()];
                if (f11 != null) {
                    f = f11.floatValue();
                }
            } else {
                f = f10.floatValue();
            }
            return new RectF(floatValue4, floatValue5, floatValue6, f);
        }
        Float f12 = this.edgeInsets[LogicalEdge.END.ordinal()];
        float floatValue7 = (f12 == null && (f12 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
        Float f13 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
        float floatValue8 = (f13 == null && (f13 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue();
        Float f14 = this.edgeInsets[LogicalEdge.START.ordinal()];
        float floatValue9 = (f14 == null && (f14 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue();
        Float f15 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
        if (f15 == null && (f15 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null) {
            Float f16 = this.edgeInsets[LogicalEdge.ALL.ordinal()];
            if (f16 != null) {
                f = f16.floatValue();
            }
        } else {
            f = f15.floatValue();
        }
        return new RectF(floatValue7, floatValue8, floatValue9, f);
    }

    public final void setBorderWidth(@NotNull LogicalEdge edge, @Nullable Float width) {
        edge.getClass();
        this.edgeInsets[edge.ordinal()] = width;
    }
}
