package com.amazon.alexa.ra.cards.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/CardItem;", "", "text", "", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "graphic", "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/cards/data/ItemGraphic;)V", "getText", "()Ljava/lang/String;", "getStyle", "value", "getGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CardItem {
    public static final int $stable = 8;

    @Nullable
    private ItemGraphic graphic;

    @NotNull
    private final String style;

    @NotNull
    private final String text;

    public CardItem(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.style = str2;
    }

    public static /* synthetic */ CardItem copy$default(CardItem cardItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardItem.text;
        }
        if ((i & 2) != 0) {
            str2 = cardItem.style;
        }
        return cardItem.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final CardItem copy(@NotNull String text, @NotNull String style) {
        text.getClass();
        style.getClass();
        return new CardItem(text, style);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardItem)) {
            return false;
        }
        CardItem cardItem = (CardItem) other;
        return Intrinsics.areEqual(this.text, cardItem.text) && Intrinsics.areEqual(this.style, cardItem.style);
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
        return this.style.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CardItem(text=", this.text, ", style=", this.style, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardItem(@NotNull String str, @NotNull String str2, @Nullable ItemGraphic itemGraphic) {
        this(str, str2);
        str.getClass();
        str2.getClass();
        this.graphic = itemGraphic;
    }
}
