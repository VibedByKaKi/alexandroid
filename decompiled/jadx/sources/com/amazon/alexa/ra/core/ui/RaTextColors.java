package com.amazon.alexa.ra.core.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/RaTextColors;", "", "textPrimary", "Landroidx/compose/ui/graphics/Color;", "textSecondary", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextPrimary-0d7_KjU", "()J", "J", "getTextSecondary-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/amazon/alexa/ra/core/ui/RaTextColors;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RaTextColors {
    public static final int $stable = 0;
    private final long textPrimary;
    private final long textSecondary;

    private RaTextColors(long j, long j2) {
        this.textPrimary = j;
        this.textSecondary = j2;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ RaTextColors m18230copyOWjLjI$default(RaTextColors raTextColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = raTextColors.textPrimary;
        }
        if ((i & 2) != 0) {
            j2 = raTextColors.textSecondary;
        }
        return raTextColors.m18233copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPrimary() {
        return this.textPrimary;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextSecondary() {
        return this.textSecondary;
    }

    @NotNull
    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final RaTextColors m18233copyOWjLjI(long textPrimary, long textSecondary) {
        return new RaTextColors(textPrimary, textSecondary, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaTextColors)) {
            return false;
        }
        RaTextColors raTextColors = (RaTextColors) other;
        return Color.m4645equalsimpl0(this.textPrimary, raTextColors.textPrimary) && Color.m4645equalsimpl0(this.textSecondary, raTextColors.textSecondary);
    }

    /* renamed from: getTextPrimary-0d7_KjU, reason: not valid java name */
    public final long m18234getTextPrimary0d7_KjU() {
        return this.textPrimary;
    }

    /* renamed from: getTextSecondary-0d7_KjU, reason: not valid java name */
    public final long m18235getTextSecondary0d7_KjU() {
        return this.textSecondary;
    }

    public int hashCode() {
        return Color.m4651hashCodeimpl(this.textSecondary) + (Color.m4651hashCodeimpl(this.textPrimary) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("RaTextColors(textPrimary=", Color.m4652toStringimpl(this.textPrimary), ", textSecondary=", Color.m4652toStringimpl(this.textSecondary), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ RaTextColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
