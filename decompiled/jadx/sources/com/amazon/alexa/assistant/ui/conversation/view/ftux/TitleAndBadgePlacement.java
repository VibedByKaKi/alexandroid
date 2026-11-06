package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/TitleAndBadgePlacement;", "", "title", "Landroidx/compose/ui/unit/IntOffset;", "badge", "size", "Landroidx/compose/ui/unit/IntSize;", "<init>", "(JLandroidx/compose/ui/unit/IntOffset;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle-nOcc-ac", "()J", "J", "getBadge-JyOPPKE", "()Landroidx/compose/ui/unit/IntOffset;", "getSize-YbymL2g", "component1", "component1-nOcc-ac", "component2", "component2-JyOPPKE", "component3", "component3-YbymL2g", "copy", "copy-65flDsg", "(JLandroidx/compose/ui/unit/IntOffset;J)Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/TitleAndBadgePlacement;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TitleAndBadgePlacement {
    public static final int $stable = 0;

    @Nullable
    private final IntOffset badge;
    private final long size;
    private final long title;

    private TitleAndBadgePlacement(long j, IntOffset intOffset, long j2) {
        this.title = j;
        this.badge = intOffset;
        this.size = j2;
    }

    /* renamed from: copy-65flDsg$default, reason: not valid java name */
    public static /* synthetic */ TitleAndBadgePlacement m15229copy65flDsg$default(TitleAndBadgePlacement titleAndBadgePlacement, long j, IntOffset intOffset, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = titleAndBadgePlacement.title;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            intOffset = titleAndBadgePlacement.badge;
        }
        IntOffset intOffset2 = intOffset;
        if ((i & 4) != 0) {
            j2 = titleAndBadgePlacement.size;
        }
        return titleAndBadgePlacement.m15233copy65flDsg(j3, intOffset2, j2);
    }

    /* renamed from: component1-nOcc-ac, reason: not valid java name and from getter */
    public final long getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2-JyOPPKE, reason: not valid java name and from getter */
    public final IntOffset getBadge() {
        return this.badge;
    }

    /* renamed from: component3-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: copy-65flDsg, reason: not valid java name */
    public final TitleAndBadgePlacement m15233copy65flDsg(long title, @Nullable IntOffset badge, long size) {
        return new TitleAndBadgePlacement(title, badge, size, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleAndBadgePlacement)) {
            return false;
        }
        TitleAndBadgePlacement titleAndBadgePlacement = (TitleAndBadgePlacement) other;
        return IntOffset.m7495equalsimpl0(this.title, titleAndBadgePlacement.title) && Intrinsics.areEqual(this.badge, titleAndBadgePlacement.badge) && IntSize.m7537equalsimpl0(this.size, titleAndBadgePlacement.size);
    }

    @Nullable
    /* renamed from: getBadge-JyOPPKE, reason: not valid java name */
    public final IntOffset m15234getBadgeJyOPPKE() {
        return this.badge;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m15235getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getTitle-nOcc-ac, reason: not valid java name */
    public final long m15236getTitlenOccac() {
        return this.title;
    }

    public int hashCode() {
        int m7498hashCodeimpl = IntOffset.m7498hashCodeimpl(this.title) * 31;
        IntOffset intOffset = this.badge;
        return IntSize.m7540hashCodeimpl(this.size) + ((m7498hashCodeimpl + (intOffset == null ? 0 : IntOffset.m7498hashCodeimpl(intOffset.m7505unboximpl()))) * 31);
    }

    @NotNull
    public String toString() {
        String m7503toStringimpl = IntOffset.m7503toStringimpl(this.title);
        IntOffset intOffset = this.badge;
        String m7542toStringimpl = IntSize.m7542toStringimpl(this.size);
        StringBuilder sb = new StringBuilder("TitleAndBadgePlacement(title=");
        sb.append(m7503toStringimpl);
        sb.append(", badge=");
        sb.append(intOffset);
        sb.append(", size=");
        return a$$ExternalSyntheticOutline0.m(sb, m7542toStringimpl, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ TitleAndBadgePlacement(long j, IntOffset intOffset, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, intOffset, j2);
    }
}
