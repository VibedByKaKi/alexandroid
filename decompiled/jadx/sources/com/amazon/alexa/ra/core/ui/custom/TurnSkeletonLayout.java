package com.amazon.alexa.ra.core.ui.custom;

import androidx.annotation.DimenRes;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonLayout;", "", "bubbleStartInset", "Landroidx/compose/ui/unit/Dp;", "requestGap", "", "lines", "", "Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonLine;", "smartFragmentWidth", "Landroidx/compose/ui/Modifier;", "actionRowGap", "actionRowHeight", "<init>", "(FILjava/util/List;Landroidx/compose/ui/Modifier;IFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBubbleStartInset-D9Ej5fM", "()F", "F", "getRequestGap", "()I", "getLines", "()Ljava/util/List;", "getSmartFragmentWidth", "()Landroidx/compose/ui/Modifier;", "getActionRowGap", "getActionRowHeight-D9Ej5fM", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class TurnSkeletonLayout {
    private final int actionRowGap;
    private final float actionRowHeight;
    private final float bubbleStartInset;

    @NotNull
    private final List<TurnSkeletonLine> lines;
    private final int requestGap;

    @NotNull
    private final Modifier smartFragmentWidth;

    private TurnSkeletonLayout(float f, int i, List<TurnSkeletonLine> list, Modifier modifier, int i2, float f2) {
        list.getClass();
        modifier.getClass();
        this.bubbleStartInset = f;
        this.requestGap = i;
        this.lines = list;
        this.smartFragmentWidth = modifier;
        this.actionRowGap = i2;
        this.actionRowHeight = f2;
    }

    public final int getActionRowGap() {
        return this.actionRowGap;
    }

    /* renamed from: getActionRowHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getActionRowHeight() {
        return this.actionRowHeight;
    }

    /* renamed from: getBubbleStartInset-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBubbleStartInset() {
        return this.bubbleStartInset;
    }

    @NotNull
    public final List<TurnSkeletonLine> getLines() {
        return this.lines;
    }

    public final int getRequestGap() {
        return this.requestGap;
    }

    @NotNull
    public final Modifier getSmartFragmentWidth() {
        return this.smartFragmentWidth;
    }

    public /* synthetic */ TurnSkeletonLayout(float f, @DimenRes int i, List list, Modifier modifier, @DimenRes int i2, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, list, modifier, i2, f2);
    }
}
