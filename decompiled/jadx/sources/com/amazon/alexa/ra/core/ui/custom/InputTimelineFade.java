package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/InputTimelineFade;", "", "length", "Landroidx/compose/ui/unit/Dp;", "endInset", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLength-D9Ej5fM", "()F", "F", "getEndInset-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/amazon/alexa/ra/core/ui/custom/InputTimelineFade;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputTimelineFade {
    public static final int $stable = 0;
    private final float endInset;
    private final float length;

    private InputTimelineFade(float f, float f2) {
        this.length = f;
        this.endInset = f2;
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ InputTimelineFade m18694copyYgX7TsA$default(InputTimelineFade inputTimelineFade, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = inputTimelineFade.length;
        }
        if ((i & 2) != 0) {
            f2 = inputTimelineFade.endInset;
        }
        return inputTimelineFade.m18697copyYgX7TsA(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLength() {
        return this.length;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndInset() {
        return this.endInset;
    }

    @NotNull
    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final InputTimelineFade m18697copyYgX7TsA(float length, float endInset) {
        return new InputTimelineFade(length, endInset, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputTimelineFade)) {
            return false;
        }
        InputTimelineFade inputTimelineFade = (InputTimelineFade) other;
        return Dp.m7373equalsimpl0(this.length, inputTimelineFade.length) && Dp.m7373equalsimpl0(this.endInset, inputTimelineFade.endInset);
    }

    /* renamed from: getEndInset-D9Ej5fM, reason: not valid java name */
    public final float m18698getEndInsetD9Ej5fM() {
        return this.endInset;
    }

    /* renamed from: getLength-D9Ej5fM, reason: not valid java name */
    public final float m18699getLengthD9Ej5fM() {
        return this.length;
    }

    public int hashCode() {
        return Dp.m7374hashCodeimpl(this.endInset) + (Dp.m7374hashCodeimpl(this.length) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("InputTimelineFade(length=", Dp.m7379toStringimpl(this.length), ", endInset=", Dp.m7379toStringimpl(this.endInset), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ InputTimelineFade(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
