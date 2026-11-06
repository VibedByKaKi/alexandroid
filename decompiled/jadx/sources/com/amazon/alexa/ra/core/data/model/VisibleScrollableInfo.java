package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VisibleScrollableInfo;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "scrollable", "Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;Ljava/util/List;)V", "getScrollable", "()Lcom/amazon/alexa/ra/core/data/model/DisplayScrollable;", "getElements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VisibleScrollableInfo implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName(AlexaMetricsConstants.MetricsComponents.ELEMENTS)
    @NotNull
    private final List<String> elements;

    @SerializedName("scrollable")
    @NotNull
    private final DisplayScrollable scrollable;

    public /* synthetic */ VisibleScrollableInfo(DisplayScrollable displayScrollable, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DisplayScrollable(null, false, false, 7, null) : displayScrollable, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisibleScrollableInfo copy$default(VisibleScrollableInfo visibleScrollableInfo, DisplayScrollable displayScrollable, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            displayScrollable = visibleScrollableInfo.scrollable;
        }
        if ((i & 2) != 0) {
            list = visibleScrollableInfo.elements;
        }
        return visibleScrollableInfo.copy(displayScrollable, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisplayScrollable getScrollable() {
        return this.scrollable;
    }

    @NotNull
    public final List<String> component2() {
        return this.elements;
    }

    @NotNull
    public final VisibleScrollableInfo copy(@NotNull DisplayScrollable scrollable, @NotNull List<String> elements) {
        scrollable.getClass();
        elements.getClass();
        return new VisibleScrollableInfo(scrollable, elements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisibleScrollableInfo)) {
            return false;
        }
        VisibleScrollableInfo visibleScrollableInfo = (VisibleScrollableInfo) other;
        return Intrinsics.areEqual(this.scrollable, visibleScrollableInfo.scrollable) && Intrinsics.areEqual(this.elements, visibleScrollableInfo.elements);
    }

    @NotNull
    public final List<String> getElements() {
        return this.elements;
    }

    @NotNull
    public final DisplayScrollable getScrollable() {
        return this.scrollable;
    }

    public int hashCode() {
        return this.elements.hashCode() + (this.scrollable.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VisibleScrollableInfo(scrollable=" + this.scrollable + ", elements=" + this.elements + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public VisibleScrollableInfo(@NotNull DisplayScrollable displayScrollable, @NotNull List<String> list) {
        displayScrollable.getClass();
        list.getClass();
        this.scrollable = displayScrollable;
        this.elements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisibleScrollableInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
