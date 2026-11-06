package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PersonalizedContentData;", "", "rankedContentItems", "", "Lcom/amazon/alexa/ra/core/data/model/RankedContentItem;", "<init>", "(Ljava/util/List;)V", "getRankedContentItems", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PersonalizedContentData {
    public static final int $stable = 8;

    @NotNull
    private final List<RankedContentItem> rankedContentItems;

    public PersonalizedContentData(@NotNull List<RankedContentItem> list) {
        list.getClass();
        this.rankedContentItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalizedContentData copy$default(PersonalizedContentData personalizedContentData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = personalizedContentData.rankedContentItems;
        }
        return personalizedContentData.copy(list);
    }

    @NotNull
    public final List<RankedContentItem> component1() {
        return this.rankedContentItems;
    }

    @NotNull
    public final PersonalizedContentData copy(@NotNull List<RankedContentItem> rankedContentItems) {
        rankedContentItems.getClass();
        return new PersonalizedContentData(rankedContentItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersonalizedContentData) && Intrinsics.areEqual(this.rankedContentItems, ((PersonalizedContentData) other).rankedContentItems);
    }

    @NotNull
    public final List<RankedContentItem> getRankedContentItems() {
        return this.rankedContentItems;
    }

    public int hashCode() {
        return this.rankedContentItems.hashCode();
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("PersonalizedContentData(rankedContentItems=", MarkdownConstants.RIGHT_PARENTHESIS, this.rankedContentItems);
    }
}
