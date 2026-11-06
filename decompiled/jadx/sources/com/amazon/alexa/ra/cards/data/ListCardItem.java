package com.amazon.alexa.ra.cards.data;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/ListCardItem;", "", "text", "", "subText", Content.THUMBNAIL, "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "thumbnailAltText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubText", "getThumbnail", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getThumbnailAltText", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ListCardItem {
    public static final int $stable = 0;

    @Nullable
    private final String subText;

    @NotNull
    private final String text;

    @Nullable
    private final ItemGraphic thumbnail;

    @Nullable
    private final String thumbnailAltText;

    public /* synthetic */ ListCardItem(String str, String str2, ItemGraphic itemGraphic, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : itemGraphic, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ ListCardItem copy$default(ListCardItem listCardItem, String str, String str2, ItemGraphic itemGraphic, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listCardItem.text;
        }
        if ((i & 2) != 0) {
            str2 = listCardItem.subText;
        }
        if ((i & 4) != 0) {
            itemGraphic = listCardItem.thumbnail;
        }
        if ((i & 8) != 0) {
            str3 = listCardItem.thumbnailAltText;
        }
        return listCardItem.copy(str, str2, itemGraphic, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ItemGraphic getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getThumbnailAltText() {
        return this.thumbnailAltText;
    }

    @NotNull
    public final ListCardItem copy(@NotNull String text, @Nullable String subText, @Nullable ItemGraphic thumbnail, @Nullable String thumbnailAltText) {
        text.getClass();
        return new ListCardItem(text, subText, thumbnail, thumbnailAltText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListCardItem)) {
            return false;
        }
        ListCardItem listCardItem = (ListCardItem) other;
        return Intrinsics.areEqual(this.text, listCardItem.text) && Intrinsics.areEqual(this.subText, listCardItem.subText) && Intrinsics.areEqual(this.thumbnail, listCardItem.thumbnail) && Intrinsics.areEqual(this.thumbnailAltText, listCardItem.thumbnailAltText);
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final ItemGraphic getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getThumbnailAltText() {
        return this.thumbnailAltText;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.subText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ItemGraphic itemGraphic = this.thumbnail;
        int hashCode3 = (hashCode2 + (itemGraphic == null ? 0 : itemGraphic.hashCode())) * 31;
        String str2 = this.thumbnailAltText;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.subText;
        ItemGraphic itemGraphic = this.thumbnail;
        String str3 = this.thumbnailAltText;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ListCardItem(text=", str, ", subText=", str2, ", thumbnail=");
        m.append(itemGraphic);
        m.append(", thumbnailAltText=");
        m.append(str3);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ListCardItem(@NotNull String str, @Nullable String str2, @Nullable ItemGraphic itemGraphic, @Nullable String str3) {
        str.getClass();
        this.text = str;
        this.subText = str2;
        this.thumbnail = itemGraphic;
        this.thumbnailAltText = str3;
    }
}
