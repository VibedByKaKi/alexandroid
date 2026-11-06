package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010'\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItem;", "", "id", "", "agentCardGreetings", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentCardGreetings;", "content", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ProactiveContent;", "style", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;", "agentSpaceGreetingBucket", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceGreetingBucket;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentCardGreetings;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ProactiveContent;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceGreetingBucket;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getAgentCardGreetings", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentCardGreetings;", "setAgentCardGreetings", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentCardGreetings;)V", "getContent", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/ProactiveContent;", "setContent", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ProactiveContent;)V", "getStyle", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;", "setStyle", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;)V", "getAgentSpaceGreetingBucket", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceGreetingBucket;", "setAgentSpaceGreetingBucket", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceGreetingBucket;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class WelcomeCardDrawerItem {
    public static final int $stable = 8;

    @Nullable
    private AgentCardGreetings agentCardGreetings;

    @Nullable
    private AgentSpaceGreetingBucket agentSpaceGreetingBucket;

    @Nullable
    private ProactiveContent content;

    @Nullable
    private String id;

    @Nullable
    private Style style;

    public /* synthetic */ WelcomeCardDrawerItem(String str, AgentCardGreetings agentCardGreetings, ProactiveContent proactiveContent, Style style, AgentSpaceGreetingBucket agentSpaceGreetingBucket, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : agentCardGreetings, (i & 4) != 0 ? null : proactiveContent, (i & 8) != 0 ? null : style, (i & 16) != 0 ? null : agentSpaceGreetingBucket);
    }

    public static /* synthetic */ WelcomeCardDrawerItem copy$default(WelcomeCardDrawerItem welcomeCardDrawerItem, String str, AgentCardGreetings agentCardGreetings, ProactiveContent proactiveContent, Style style, AgentSpaceGreetingBucket agentSpaceGreetingBucket, int i, Object obj) {
        if ((i & 1) != 0) {
            str = welcomeCardDrawerItem.id;
        }
        if ((i & 2) != 0) {
            agentCardGreetings = welcomeCardDrawerItem.agentCardGreetings;
        }
        if ((i & 4) != 0) {
            proactiveContent = welcomeCardDrawerItem.content;
        }
        if ((i & 8) != 0) {
            style = welcomeCardDrawerItem.style;
        }
        if ((i & 16) != 0) {
            agentSpaceGreetingBucket = welcomeCardDrawerItem.agentSpaceGreetingBucket;
        }
        AgentSpaceGreetingBucket agentSpaceGreetingBucket2 = agentSpaceGreetingBucket;
        ProactiveContent proactiveContent2 = proactiveContent;
        return welcomeCardDrawerItem.copy(str, agentCardGreetings, proactiveContent2, style, agentSpaceGreetingBucket2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AgentCardGreetings getAgentCardGreetings() {
        return this.agentCardGreetings;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ProactiveContent getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AgentSpaceGreetingBucket getAgentSpaceGreetingBucket() {
        return this.agentSpaceGreetingBucket;
    }

    @NotNull
    public final WelcomeCardDrawerItem copy(@JsonProperty("id") @Nullable String id, @JsonProperty("greetings") @Nullable AgentCardGreetings agentCardGreetings, @JsonProperty("content") @Nullable ProactiveContent content, @JsonProperty("style") @Nullable Style style, @JsonProperty("agentSpaceGreetingBucket") @Nullable AgentSpaceGreetingBucket agentSpaceGreetingBucket) {
        return new WelcomeCardDrawerItem(id, agentCardGreetings, content, style, agentSpaceGreetingBucket);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeCardDrawerItem)) {
            return false;
        }
        WelcomeCardDrawerItem welcomeCardDrawerItem = (WelcomeCardDrawerItem) other;
        return Intrinsics.areEqual(this.id, welcomeCardDrawerItem.id) && Intrinsics.areEqual(this.agentCardGreetings, welcomeCardDrawerItem.agentCardGreetings) && Intrinsics.areEqual(this.content, welcomeCardDrawerItem.content) && Intrinsics.areEqual(this.style, welcomeCardDrawerItem.style) && Intrinsics.areEqual(this.agentSpaceGreetingBucket, welcomeCardDrawerItem.agentSpaceGreetingBucket);
    }

    @Nullable
    public final AgentCardGreetings getAgentCardGreetings() {
        return this.agentCardGreetings;
    }

    @Nullable
    public final AgentSpaceGreetingBucket getAgentSpaceGreetingBucket() {
        return this.agentSpaceGreetingBucket;
    }

    @Nullable
    public final ProactiveContent getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AgentCardGreetings agentCardGreetings = this.agentCardGreetings;
        int hashCode2 = (hashCode + (agentCardGreetings == null ? 0 : agentCardGreetings.hashCode())) * 31;
        ProactiveContent proactiveContent = this.content;
        int hashCode3 = (hashCode2 + (proactiveContent == null ? 0 : proactiveContent.hashCode())) * 31;
        Style style = this.style;
        int hashCode4 = (hashCode3 + (style == null ? 0 : style.hashCode())) * 31;
        AgentSpaceGreetingBucket agentSpaceGreetingBucket = this.agentSpaceGreetingBucket;
        return hashCode4 + (agentSpaceGreetingBucket != null ? agentSpaceGreetingBucket.hashCode() : 0);
    }

    public final void setAgentCardGreetings(@Nullable AgentCardGreetings agentCardGreetings) {
        this.agentCardGreetings = agentCardGreetings;
    }

    public final void setAgentSpaceGreetingBucket(@Nullable AgentSpaceGreetingBucket agentSpaceGreetingBucket) {
        this.agentSpaceGreetingBucket = agentSpaceGreetingBucket;
    }

    public final void setContent(@Nullable ProactiveContent proactiveContent) {
        this.content = proactiveContent;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setStyle(@Nullable Style style) {
        this.style = style;
    }

    @NotNull
    public String toString() {
        return "WelcomeCardDrawerItem(id=" + this.id + ", agentCardGreetings=" + this.agentCardGreetings + ", content=" + this.content + ", style=" + this.style + ", agentSpaceGreetingBucket=" + this.agentSpaceGreetingBucket + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public WelcomeCardDrawerItem(@JsonProperty("id") @Nullable String str, @JsonProperty("greetings") @Nullable AgentCardGreetings agentCardGreetings, @JsonProperty("content") @Nullable ProactiveContent proactiveContent, @JsonProperty("style") @Nullable Style style, @JsonProperty("agentSpaceGreetingBucket") @Nullable AgentSpaceGreetingBucket agentSpaceGreetingBucket) {
        this.id = str;
        this.agentCardGreetings = agentCardGreetings;
        this.content = proactiveContent;
        this.style = style;
        this.agentSpaceGreetingBucket = agentSpaceGreetingBucket;
    }

    @JsonCreator
    public WelcomeCardDrawerItem() {
        this(null, null, null, null, null, 31, null);
    }
}
