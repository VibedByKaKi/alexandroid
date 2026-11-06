package com.amazon.alexa.ra.core.data.fragments;

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
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardItem;", "", "style", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "graphic", "Lcom/amazon/alexa/ra/core/data/fragments/ItemGraphic;", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/ItemGraphic;)V", "getStyle", "()Ljava/lang/String;", "getText", "value", "getGraphic", "()Lcom/amazon/alexa/ra/core/data/fragments/ItemGraphic;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CardItem {

    @NotNull
    public static final String GRAPHIC = "graphic";

    @NotNull
    public static final String STYLE = "style";

    @NotNull
    public static final String TEXT = "text";

    @Nullable
    private ItemGraphic graphic;

    @NotNull
    private final String style;

    @NotNull
    private final String text;
    public static final int $stable = 8;

    public CardItem(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.style = str;
        this.text = str2;
    }

    public static /* synthetic */ CardItem copy$default(CardItem cardItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardItem.style;
        }
        if ((i & 2) != 0) {
            str2 = cardItem.text;
        }
        return cardItem.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final CardItem copy(@NotNull String style, @NotNull String text) {
        style.getClass();
        text.getClass();
        return new CardItem(style, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardItem)) {
            return false;
        }
        CardItem cardItem = (CardItem) other;
        return Intrinsics.areEqual(this.style, cardItem.style) && Intrinsics.areEqual(this.text, cardItem.text);
    }

    @Nullable
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.style.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CardItem(style=", this.style, ", text=", this.text, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ CardItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardItem(@NotNull String str, @NotNull String str2, @Nullable ItemGraphic itemGraphic) {
        this(str, str2);
        str.getClass();
        str2.getClass();
        this.graphic = itemGraphic;
    }
}
