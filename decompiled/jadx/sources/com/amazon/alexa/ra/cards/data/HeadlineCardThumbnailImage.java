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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/HeadlineCardThumbnailImage;", "Lcom/amazon/alexa/ra/cards/data/HeadlineCardThumbnail;", "graphic", "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "imageStyling", "", "styling", "<init>", "(Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Ljava/lang/String;Ljava/lang/String;)V", "getGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getImageStyling", "()Ljava/lang/String;", "getStyling", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class HeadlineCardThumbnailImage implements HeadlineCardThumbnail {
    public static final int $stable = 0;

    @NotNull
    private final ItemGraphic graphic;

    @Nullable
    private final String imageStyling;

    @NotNull
    private final String styling;

    public HeadlineCardThumbnailImage(@NotNull ItemGraphic itemGraphic, @Nullable String str, @NotNull String str2) {
        itemGraphic.getClass();
        str2.getClass();
        this.graphic = itemGraphic;
        this.imageStyling = str;
        this.styling = str2;
    }

    public static /* synthetic */ HeadlineCardThumbnailImage copy$default(HeadlineCardThumbnailImage headlineCardThumbnailImage, ItemGraphic itemGraphic, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            itemGraphic = headlineCardThumbnailImage.graphic;
        }
        if ((i & 2) != 0) {
            str = headlineCardThumbnailImage.imageStyling;
        }
        if ((i & 4) != 0) {
            str2 = headlineCardThumbnailImage.styling;
        }
        return headlineCardThumbnailImage.copy(itemGraphic, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getImageStyling() {
        return this.imageStyling;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStyling() {
        return this.styling;
    }

    @NotNull
    public final HeadlineCardThumbnailImage copy(@NotNull ItemGraphic graphic, @Nullable String imageStyling, @NotNull String styling) {
        graphic.getClass();
        styling.getClass();
        return new HeadlineCardThumbnailImage(graphic, imageStyling, styling);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadlineCardThumbnailImage)) {
            return false;
        }
        HeadlineCardThumbnailImage headlineCardThumbnailImage = (HeadlineCardThumbnailImage) other;
        return Intrinsics.areEqual(this.graphic, headlineCardThumbnailImage.graphic) && Intrinsics.areEqual(this.imageStyling, headlineCardThumbnailImage.imageStyling) && Intrinsics.areEqual(this.styling, headlineCardThumbnailImage.styling);
    }

    @NotNull
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    public final String getImageStyling() {
        return this.imageStyling;
    }

    @Override // com.amazon.alexa.ra.cards.data.HeadlineCardThumbnail
    @NotNull
    public String getStyling() {
        return this.styling;
    }

    public int hashCode() {
        int hashCode = this.graphic.hashCode() * 31;
        String str = this.imageStyling;
        return this.styling.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        ItemGraphic itemGraphic = this.graphic;
        String str = this.imageStyling;
        String str2 = this.styling;
        StringBuilder sb = new StringBuilder("HeadlineCardThumbnailImage(graphic=");
        sb.append(itemGraphic);
        sb.append(", imageStyling=");
        sb.append(str);
        sb.append(", styling=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ HeadlineCardThumbnailImage(ItemGraphic itemGraphic, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemGraphic, (i & 2) != 0 ? "object-best-fit" : str, (i & 4) != 0 ? "aspect-ratio-4-1" : str2);
    }
}
