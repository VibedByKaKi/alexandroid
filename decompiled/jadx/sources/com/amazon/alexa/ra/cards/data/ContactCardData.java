package com.amazon.alexa.ra.cards.data;

import androidx.compose.foundation.gestures.Orientation;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/cards/data/ContactCardData;", "", Content.HERO_GRAPHIC, "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "cardOrientation", "Landroidx/compose/foundation/gestures/Orientation;", "imageStyle", "", "items", "", "Lcom/amazon/alexa/ra/cards/data/CardItem;", "<init>", "(Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Landroidx/compose/foundation/gestures/Orientation;Ljava/lang/String;Ljava/util/List;)V", "getHeroGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getCardOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getImageStyle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ContactCardData {
    public static final int $stable = 8;

    @Nullable
    private final Orientation cardOrientation;

    @Nullable
    private final ItemGraphic heroGraphic;

    @Nullable
    private final String imageStyle;

    @NotNull
    private final List<CardItem> items;

    public ContactCardData(@Nullable ItemGraphic itemGraphic, @Nullable Orientation orientation, @Nullable String str, @NotNull List<CardItem> list) {
        list.getClass();
        this.heroGraphic = itemGraphic;
        this.cardOrientation = orientation;
        this.imageStyle = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactCardData copy$default(ContactCardData contactCardData, ItemGraphic itemGraphic, Orientation orientation, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            itemGraphic = contactCardData.heroGraphic;
        }
        if ((i & 2) != 0) {
            orientation = contactCardData.cardOrientation;
        }
        if ((i & 4) != 0) {
            str = contactCardData.imageStyle;
        }
        if ((i & 8) != 0) {
            list = contactCardData.items;
        }
        return contactCardData.copy(itemGraphic, orientation, str, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ItemGraphic getHeroGraphic() {
        return this.heroGraphic;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Orientation getCardOrientation() {
        return this.cardOrientation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageStyle() {
        return this.imageStyle;
    }

    @NotNull
    public final List<CardItem> component4() {
        return this.items;
    }

    @NotNull
    public final ContactCardData copy(@Nullable ItemGraphic heroGraphic, @Nullable Orientation cardOrientation, @Nullable String imageStyle, @NotNull List<CardItem> items) {
        items.getClass();
        return new ContactCardData(heroGraphic, cardOrientation, imageStyle, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactCardData)) {
            return false;
        }
        ContactCardData contactCardData = (ContactCardData) other;
        return Intrinsics.areEqual(this.heroGraphic, contactCardData.heroGraphic) && this.cardOrientation == contactCardData.cardOrientation && Intrinsics.areEqual(this.imageStyle, contactCardData.imageStyle) && Intrinsics.areEqual(this.items, contactCardData.items);
    }

    @Nullable
    public final Orientation getCardOrientation() {
        return this.cardOrientation;
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
        Orientation orientation = this.cardOrientation;
        int hashCode2 = (hashCode + (orientation == null ? 0 : orientation.hashCode())) * 31;
        String str = this.imageStyle;
        return this.items.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ContactCardData(heroGraphic=" + this.heroGraphic + ", cardOrientation=" + this.cardOrientation + ", imageStyle=" + this.imageStyle + ", items=" + this.items + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ ContactCardData(ItemGraphic itemGraphic, Orientation orientation, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemGraphic, (i & 2) != 0 ? Orientation.Horizontal : orientation, (i & 4) != 0 ? null : str, list);
    }
}
