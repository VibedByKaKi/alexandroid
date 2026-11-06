package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/LiveModeButtonGroupShapes;", "", "leading", "Landroidx/compose/ui/graphics/Shape;", "middle", "trailing", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;)V", "getLeading", "()Landroidx/compose/ui/graphics/Shape;", "getMiddle", "getTrailing", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class LiveModeButtonGroupShapes {
    public static final int $stable = 0;

    @NotNull
    private final Shape leading;

    @NotNull
    private final Shape middle;

    @NotNull
    private final Shape trailing;

    public LiveModeButtonGroupShapes(@NotNull Shape shape, @NotNull Shape shape2, @NotNull Shape shape3) {
        shape.getClass();
        shape2.getClass();
        shape3.getClass();
        this.leading = shape;
        this.middle = shape2;
        this.trailing = shape3;
    }

    public static /* synthetic */ LiveModeButtonGroupShapes copy$default(LiveModeButtonGroupShapes liveModeButtonGroupShapes, Shape shape, Shape shape2, Shape shape3, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = liveModeButtonGroupShapes.leading;
        }
        if ((i & 2) != 0) {
            shape2 = liveModeButtonGroupShapes.middle;
        }
        if ((i & 4) != 0) {
            shape3 = liveModeButtonGroupShapes.trailing;
        }
        return liveModeButtonGroupShapes.copy(shape, shape2, shape3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Shape getLeading() {
        return this.leading;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Shape getMiddle() {
        return this.middle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Shape getTrailing() {
        return this.trailing;
    }

    @NotNull
    public final LiveModeButtonGroupShapes copy(@NotNull Shape leading, @NotNull Shape middle, @NotNull Shape trailing) {
        leading.getClass();
        middle.getClass();
        trailing.getClass();
        return new LiveModeButtonGroupShapes(leading, middle, trailing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveModeButtonGroupShapes)) {
            return false;
        }
        LiveModeButtonGroupShapes liveModeButtonGroupShapes = (LiveModeButtonGroupShapes) other;
        return Intrinsics.areEqual(this.leading, liveModeButtonGroupShapes.leading) && Intrinsics.areEqual(this.middle, liveModeButtonGroupShapes.middle) && Intrinsics.areEqual(this.trailing, liveModeButtonGroupShapes.trailing);
    }

    @NotNull
    public final Shape getLeading() {
        return this.leading;
    }

    @NotNull
    public final Shape getMiddle() {
        return this.middle;
    }

    @NotNull
    public final Shape getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return this.trailing.hashCode() + ((this.middle.hashCode() + (this.leading.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LiveModeButtonGroupShapes(leading=" + this.leading + ", middle=" + this.middle + ", trailing=" + this.trailing + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
