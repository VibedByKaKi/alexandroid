package com.amazon.alexa.ra.cards.data;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/EventCardData;", "", Content.HERO_GRAPHIC, "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "imageStyle", "", "items", "", "Lcom/amazon/alexa/ra/cards/data/CardItem;", "<init>", "(Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Ljava/lang/String;Ljava/util/List;)V", "getHeroGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getImageStyle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class EventCardData {
    public static final int $stable = 8;

    @Nullable
    private final ItemGraphic heroGraphic;

    @Nullable
    private final String imageStyle;

    @NotNull
    private final List<CardItem> items;

    public EventCardData(@Nullable ItemGraphic itemGraphic, @Nullable String str, @NotNull List<CardItem> list) {
        list.getClass();
        this.heroGraphic = itemGraphic;
        this.imageStyle = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventCardData copy$default(EventCardData eventCardData, ItemGraphic itemGraphic, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            itemGraphic = eventCardData.heroGraphic;
        }
        if ((i & 2) != 0) {
            str = eventCardData.imageStyle;
        }
        if ((i & 4) != 0) {
            list = eventCardData.items;
        }
        return eventCardData.copy(itemGraphic, str, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ItemGraphic getHeroGraphic() {
        return this.heroGraphic;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getImageStyle() {
        return this.imageStyle;
    }

    @NotNull
    public final List<CardItem> component3() {
        return this.items;
    }

    @NotNull
    public final EventCardData copy(@Nullable ItemGraphic heroGraphic, @Nullable String imageStyle, @NotNull List<CardItem> items) {
        items.getClass();
        return new EventCardData(heroGraphic, imageStyle, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCardData)) {
            return false;
        }
        EventCardData eventCardData = (EventCardData) other;
        return Intrinsics.areEqual(this.heroGraphic, eventCardData.heroGraphic) && Intrinsics.areEqual(this.imageStyle, eventCardData.imageStyle) && Intrinsics.areEqual(this.items, eventCardData.items);
    }

    @Nullable
    public final ItemGraphic getHeroGraphic() {
        return this.heroGraphic;
    }

    @Nullable
    public final String getImageStyle() {
        return this.imageStyle;
    }

    @NotNull
    public final List<CardItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        ItemGraphic itemGraphic = this.heroGraphic;
        int hashCode = (itemGraphic == null ? 0 : itemGraphic.hashCode()) * 31;
        String str = this.imageStyle;
        return this.items.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ItemGraphic itemGraphic = this.heroGraphic;
        String str = this.imageStyle;
        List<CardItem> list = this.items;
        StringBuilder sb = new StringBuilder("EventCardData(heroGraphic=");
        sb.append(itemGraphic);
        sb.append(", imageStyle=");
        sb.append(str);
        sb.append(", items=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    public /* synthetic */ EventCardData(ItemGraphic itemGraphic, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemGraphic, (i & 2) != 0 ? null : str, list);
    }
}
