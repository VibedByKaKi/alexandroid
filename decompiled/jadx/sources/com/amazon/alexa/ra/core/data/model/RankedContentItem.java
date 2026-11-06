package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/RankedContentItem;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "id", "", "metadata", "Lcom/amazon/alexa/ra/core/data/model/RankedContentItemMetadata;", "presentation", "Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentation;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/RankedContentItemMetadata;Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentation;)V", "getId", "()Ljava/lang/String;", "getMetadata", "()Lcom/amazon/alexa/ra/core/data/model/RankedContentItemMetadata;", "getPresentation", "()Lcom/amazon/alexa/ra/core/data/model/RankedContentItemPresentation;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RankedContentItem implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("metadata")
    @Nullable
    private final RankedContentItemMetadata metadata;

    @SerializedName("presentation")
    @NotNull
    private final RankedContentItemPresentation presentation;

    public RankedContentItem(@NotNull String str, @Nullable RankedContentItemMetadata rankedContentItemMetadata, @NotNull RankedContentItemPresentation rankedContentItemPresentation) {
        str.getClass();
        rankedContentItemPresentation.getClass();
        this.id = str;
        this.metadata = rankedContentItemMetadata;
        this.presentation = rankedContentItemPresentation;
    }

    public static /* synthetic */ RankedContentItem copy$default(RankedContentItem rankedContentItem, String str, RankedContentItemMetadata rankedContentItemMetadata, RankedContentItemPresentation rankedContentItemPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankedContentItem.id;
        }
        if ((i & 2) != 0) {
            rankedContentItemMetadata = rankedContentItem.metadata;
        }
        if ((i & 4) != 0) {
            rankedContentItemPresentation = rankedContentItem.presentation;
        }
        return rankedContentItem.copy(str, rankedContentItemMetadata, rankedContentItemPresentation);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RankedContentItemMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RankedContentItemPresentation getPresentation() {
        return this.presentation;
    }

    @NotNull
    public final RankedContentItem copy(@NotNull String id, @Nullable RankedContentItemMetadata metadata, @NotNull RankedContentItemPresentation presentation) {
        id.getClass();
        presentation.getClass();
        return new RankedContentItem(id, metadata, presentation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankedContentItem)) {
            return false;
        }
        RankedContentItem rankedContentItem = (RankedContentItem) other;
        return Intrinsics.areEqual(this.id, rankedContentItem.id) && Intrinsics.areEqual(this.metadata, rankedContentItem.metadata) && Intrinsics.areEqual(this.presentation, rankedContentItem.presentation);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final RankedContentItemMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final RankedContentItemPresentation getPresentation() {
        return this.presentation;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        RankedContentItemMetadata rankedContentItemMetadata = this.metadata;
        return this.presentation.hashCode() + ((hashCode + (rankedContentItemMetadata == null ? 0 : rankedContentItemMetadata.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "RankedContentItem(id=" + this.id + ", metadata=" + this.metadata + ", presentation=" + this.presentation + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
