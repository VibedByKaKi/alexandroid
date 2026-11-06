package com.amazon.alexa.ra.cards.data;

import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/FullImageCardItem;", "", "text", "", "graphic", "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "style", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getStyle", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FullImageCardItem {
    public static final int $stable = 0;

    @Nullable
    private final ItemGraphic graphic;

    @NotNull
    private final String style;

    @Nullable
    private final String text;

    public /* synthetic */ FullImageCardItem(String str, ItemGraphic itemGraphic, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : itemGraphic, str2);
    }

    public static /* synthetic */ FullImageCardItem copy$default(FullImageCardItem fullImageCardItem, String str, ItemGraphic itemGraphic, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullImageCardItem.text;
        }
        if ((i & 2) != 0) {
            itemGraphic = fullImageCardItem.graphic;
        }
        if ((i & 4) != 0) {
            str2 = fullImageCardItem.style;
        }
        return fullImageCardItem.copy(str, itemGraphic, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final FullImageCardItem copy(@Nullable String text, @Nullable ItemGraphic graphic, @NotNull String style) {
        style.getClass();
        return new FullImageCardItem(text, graphic, style);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullImageCardItem)) {
            return false;
        }
        FullImageCardItem fullImageCardItem = (FullImageCardItem) other;
        return Intrinsics.areEqual(this.text, fullImageCardItem.text) && Intrinsics.areEqual(this.graphic, fullImageCardItem.graphic) && Intrinsics.areEqual(this.style, fullImageCardItem.style);
    }

    @Nullable
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ItemGraphic itemGraphic = this.graphic;
        return this.style.hashCode() + ((hashCode + (itemGraphic != null ? itemGraphic.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        ItemGraphic itemGraphic = this.graphic;
        String str2 = this.style;
        StringBuilder sb = new StringBuilder("FullImageCardItem(text=");
        sb.append(str);
        sb.append(", graphic=");
        sb.append(itemGraphic);
        sb.append(", style=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public FullImageCardItem(@Nullable String str, @Nullable ItemGraphic itemGraphic, @NotNull String str2) {
        str2.getClass();
        this.text = str;
        this.graphic = itemGraphic;
        this.style = str2;
    }
}
