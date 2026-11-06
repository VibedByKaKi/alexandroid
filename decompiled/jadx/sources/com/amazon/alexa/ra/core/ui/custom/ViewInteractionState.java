package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/ViewInteractionState;", "", ModelTransformer.KEY_BATTERY_SCALE, "", "offset", "Landroidx/compose/ui/geometry/Offset;", "<init>", "(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getScale", "()F", "getOffset-F1C5BW0", "()J", "J", "component1", "component2", "component2-F1C5BW0", "copy", "copy-Uv8p0NA", "(FJ)Lcom/amazon/alexa/ra/core/ui/custom/ViewInteractionState;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ViewInteractionState {
    public static final int $stable = 0;
    private final long offset;
    private final float scale;

    public /* synthetic */ ViewInteractionState(float f, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? Offset.INSTANCE.m4416getZeroF1C5BW0() : j, null);
    }

    /* renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ ViewInteractionState m18872copyUv8p0NA$default(ViewInteractionState viewInteractionState, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = viewInteractionState.scale;
        }
        if ((i & 2) != 0) {
            j = viewInteractionState.offset;
        }
        return viewInteractionState.m18874copyUv8p0NA(f, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    @NotNull
    /* renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final ViewInteractionState m18874copyUv8p0NA(float scale, long offset) {
        return new ViewInteractionState(scale, offset, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewInteractionState)) {
            return false;
        }
        ViewInteractionState viewInteractionState = (ViewInteractionState) other;
        return Float.compare(this.scale, viewInteractionState.scale) == 0 && Offset.m4397equalsimpl0(this.offset, viewInteractionState.offset);
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m18875getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getScale() {
        return this.scale;
    }

    public int hashCode() {
        return Offset.m4402hashCodeimpl(this.offset) + (Float.hashCode(this.scale) * 31);
    }

    @NotNull
    public String toString() {
        return "ViewInteractionState(scale=" + this.scale + ", offset=" + Offset.m4408toStringimpl(this.offset) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    private ViewInteractionState(float f, long j) {
        this.scale = f;
        this.offset = j;
    }

    public /* synthetic */ ViewInteractionState(float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j);
    }
}
