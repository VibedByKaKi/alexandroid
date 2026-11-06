package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;", "", "cardDrawer", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerSection;", "tags", "", "", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerSection;Ljava/util/Map;)V", "getCardDrawer", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerSection;", "setCardDrawer", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerSection;)V", "getTags", "()Ljava/util/Map;", "setTags", "(Ljava/util/Map;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AgentForwardContent {
    public static final int $stable = 8;

    @Nullable
    private CardDrawerSection cardDrawer;

    @Nullable
    private Map<String, String> tags;

    public /* synthetic */ AgentForwardContent(CardDrawerSection cardDrawerSection, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cardDrawerSection, (i & 2) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentForwardContent copy$default(AgentForwardContent agentForwardContent, CardDrawerSection cardDrawerSection, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            cardDrawerSection = agentForwardContent.cardDrawer;
        }
        if ((i & 2) != 0) {
            map = agentForwardContent.tags;
        }
        return agentForwardContent.copy(cardDrawerSection, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CardDrawerSection getCardDrawer() {
        return this.cardDrawer;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.tags;
    }

    @NotNull
    public final AgentForwardContent copy(@JsonProperty("cardStack") @Nullable CardDrawerSection cardDrawer, @JsonProperty("tags") @Nullable Map<String, String> tags) {
        return new AgentForwardContent(cardDrawer, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentForwardContent)) {
            return false;
        }
        AgentForwardContent agentForwardContent = (AgentForwardContent) other;
        return Intrinsics.areEqual(this.cardDrawer, agentForwardContent.cardDrawer) && Intrinsics.areEqual(this.tags, agentForwardContent.tags);
    }

    @Nullable
    public final CardDrawerSection getCardDrawer() {
        return this.cardDrawer;
    }

    @Nullable
    public final Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        CardDrawerSection cardDrawerSection = this.cardDrawer;
        int hashCode = (cardDrawerSection == null ? 0 : cardDrawerSection.hashCode()) * 31;
        Map<String, String> map = this.tags;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final void setCardDrawer(@Nullable CardDrawerSection cardDrawerSection) {
        this.cardDrawer = cardDrawerSection;
    }

    public final void setTags(@Nullable Map<String, String> map) {
        this.tags = map;
    }

    @NotNull
    public String toString() {
        return "AgentForwardContent(cardDrawer=" + this.cardDrawer + ", tags=" + this.tags + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public AgentForwardContent(@JsonProperty("cardStack") @Nullable CardDrawerSection cardDrawerSection, @JsonProperty("tags") @Nullable Map<String, String> map) {
        this.cardDrawer = cardDrawerSection;
        this.tags = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public AgentForwardContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
