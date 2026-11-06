package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerSection;", "", "cards", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerItem;", "<init>", "(Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "setCards", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CardDrawerSection {
    public static final int $stable = 8;

    @Nullable
    private List<CardDrawerItem> cards;

    public /* synthetic */ CardDrawerSection(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardDrawerSection copy$default(CardDrawerSection cardDrawerSection, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardDrawerSection.cards;
        }
        return cardDrawerSection.copy(list);
    }

    @Nullable
    public final List<CardDrawerItem> component1() {
        return this.cards;
    }

    @NotNull
    public final CardDrawerSection copy(@JsonProperty("cards") @Nullable List<CardDrawerItem> cards) {
        return new CardDrawerSection(cards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardDrawerSection) && Intrinsics.areEqual(this.cards, ((CardDrawerSection) other).cards);
    }

    @Nullable
    public final List<CardDrawerItem> getCards() {
        return this.cards;
    }

    public int hashCode() {
        List<CardDrawerItem> list = this.cards;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setCards(@Nullable List<CardDrawerItem> list) {
        this.cards = list;
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("CardDrawerSection(cards=", MarkdownConstants.RIGHT_PARENTHESIS, this.cards);
    }

    @JsonCreator
    public CardDrawerSection(@JsonProperty("cards") @Nullable List<CardDrawerItem> list) {
        this.cards = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public CardDrawerSection() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
