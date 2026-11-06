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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/HeadlineCardThumbnailText;", "Lcom/amazon/alexa/ra/cards/data/HeadlineCardThumbnail;", "thumbnailText", "", "styling", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getThumbnailText", "()Ljava/lang/String;", "getStyling", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class HeadlineCardThumbnailText implements HeadlineCardThumbnail {
    public static final int $stable = 0;

    @NotNull
    private final String styling;

    @NotNull
    private final String thumbnailText;

    public HeadlineCardThumbnailText(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.thumbnailText = str;
        this.styling = str2;
    }

    public static /* synthetic */ HeadlineCardThumbnailText copy$default(HeadlineCardThumbnailText headlineCardThumbnailText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headlineCardThumbnailText.thumbnailText;
        }
        if ((i & 2) != 0) {
            str2 = headlineCardThumbnailText.styling;
        }
        return headlineCardThumbnailText.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStyling() {
        return this.styling;
    }

    @NotNull
    public final HeadlineCardThumbnailText copy(@NotNull String thumbnailText, @NotNull String styling) {
        thumbnailText.getClass();
        styling.getClass();
        return new HeadlineCardThumbnailText(thumbnailText, styling);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadlineCardThumbnailText)) {
            return false;
        }
        HeadlineCardThumbnailText headlineCardThumbnailText = (HeadlineCardThumbnailText) other;
        return Intrinsics.areEqual(this.thumbnailText, headlineCardThumbnailText.thumbnailText) && Intrinsics.areEqual(this.styling, headlineCardThumbnailText.styling);
    }

    @Override // com.amazon.alexa.ra.cards.data.HeadlineCardThumbnail
    @NotNull
    public String getStyling() {
        return this.styling;
    }

    @NotNull
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    public int hashCode() {
        return this.styling.hashCode() + (this.thumbnailText.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("HeadlineCardThumbnailText(thumbnailText=", this.thumbnailText, ", styling=", this.styling, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ HeadlineCardThumbnailText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "text-style-provider" : str2);
    }
}
