package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentForwardContentDomain;", "", "cardDrawer", "Lcom/amazon/alexa/redesign/entity/agentforward/network/CardDrawerSectionDomain;", "tags", "", "", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/CardDrawerSectionDomain;Ljava/util/Map;)V", "getCardDrawer", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/CardDrawerSectionDomain;", "getTags", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AgentForwardContentDomain {
    public static final int $stable = 8;

    @Nullable
    private final CardDrawerSectionDomain cardDrawer;

    @Nullable
    private final Map<String, String> tags;

    public /* synthetic */ AgentForwardContentDomain(CardDrawerSectionDomain cardDrawerSectionDomain, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cardDrawerSectionDomain, (i & 2) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentForwardContentDomain copy$default(AgentForwardContentDomain agentForwardContentDomain, CardDrawerSectionDomain cardDrawerSectionDomain, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            cardDrawerSectionDomain = agentForwardContentDomain.cardDrawer;
        }
        if ((i & 2) != 0) {
            map = agentForwardContentDomain.tags;
        }
        return agentForwardContentDomain.copy(cardDrawerSectionDomain, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CardDrawerSectionDomain getCardDrawer() {
        return this.cardDrawer;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.tags;
    }

    @NotNull
    public final AgentForwardContentDomain copy(@Nullable CardDrawerSectionDomain cardDrawer, @Nullable Map<String, String> tags) {
        return new AgentForwardContentDomain(cardDrawer, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentForwardContentDomain)) {
            return false;
        }
        AgentForwardContentDomain agentForwardContentDomain = (AgentForwardContentDomain) other;
        return Intrinsics.areEqual(this.cardDrawer, agentForwardContentDomain.cardDrawer) && Intrinsics.areEqual(this.tags, agentForwardContentDomain.tags);
    }

    @Nullable
    public final CardDrawerSectionDomain getCardDrawer() {
        return this.cardDrawer;
    }

    @Nullable
    public final Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        CardDrawerSectionDomain cardDrawerSectionDomain = this.cardDrawer;
        int hashCode = (cardDrawerSectionDomain == null ? 0 : cardDrawerSectionDomain.hashCode()) * 31;
        Map<String, String> map = this.tags;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AgentForwardContentDomain(cardDrawer=" + this.cardDrawer + ", tags=" + this.tags + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public AgentForwardContentDomain(@Nullable CardDrawerSectionDomain cardDrawerSectionDomain, @Nullable Map<String, String> map) {
        this.cardDrawer = cardDrawerSectionDomain;
        this.tags = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgentForwardContentDomain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
