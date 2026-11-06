package com.amazon.alexa.redesign.entity.agentforward.network;

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
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/WelcomeCardDrawerItemDomain;", "", "style", "Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;", "agentCardGreetings", "Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentCardGreetingsDomain;", "content", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ProactiveContentDomain;", "agentSpaceGreetingBucket", "Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentSpaceGreetingBucketDomain;", "id", "", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentCardGreetingsDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/ProactiveContentDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentSpaceGreetingBucketDomain;Ljava/lang/String;)V", "getStyle", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;", "getAgentCardGreetings", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentCardGreetingsDomain;", "getContent", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ProactiveContentDomain;", "getAgentSpaceGreetingBucket", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentSpaceGreetingBucketDomain;", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class WelcomeCardDrawerItemDomain {
    public static final int $stable = 8;

    @Nullable
    private final AgentCardGreetingsDomain agentCardGreetings;

    @Nullable
    private final AgentSpaceGreetingBucketDomain agentSpaceGreetingBucket;

    @Nullable
    private final ProactiveContentDomain content;

    @Nullable
    private final String id;

    @Nullable
    private final StyleDomain style;

    public /* synthetic */ WelcomeCardDrawerItemDomain(StyleDomain styleDomain, AgentCardGreetingsDomain agentCardGreetingsDomain, ProactiveContentDomain proactiveContentDomain, AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : styleDomain, (i & 2) != 0 ? null : agentCardGreetingsDomain, (i & 4) != 0 ? null : proactiveContentDomain, (i & 8) != 0 ? null : agentSpaceGreetingBucketDomain, (i & 16) != 0 ? null : str);
    }

    public static /* synthetic */ WelcomeCardDrawerItemDomain copy$default(WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain, StyleDomain styleDomain, AgentCardGreetingsDomain agentCardGreetingsDomain, ProactiveContentDomain proactiveContentDomain, AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            styleDomain = welcomeCardDrawerItemDomain.style;
        }
        if ((i & 2) != 0) {
            agentCardGreetingsDomain = welcomeCardDrawerItemDomain.agentCardGreetings;
        }
        if ((i & 4) != 0) {
            proactiveContentDomain = welcomeCardDrawerItemDomain.content;
        }
        if ((i & 8) != 0) {
            agentSpaceGreetingBucketDomain = welcomeCardDrawerItemDomain.agentSpaceGreetingBucket;
        }
        if ((i & 16) != 0) {
            str = welcomeCardDrawerItemDomain.id;
        }
        String str2 = str;
        ProactiveContentDomain proactiveContentDomain2 = proactiveContentDomain;
        return welcomeCardDrawerItemDomain.copy(styleDomain, agentCardGreetingsDomain, proactiveContentDomain2, agentSpaceGreetingBucketDomain, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final StyleDomain getStyle() {
        return this.style;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AgentCardGreetingsDomain getAgentCardGreetings() {
        return this.agentCardGreetings;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ProactiveContentDomain getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final AgentSpaceGreetingBucketDomain getAgentSpaceGreetingBucket() {
        return this.agentSpaceGreetingBucket;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final WelcomeCardDrawerItemDomain copy(@Nullable StyleDomain style, @Nullable AgentCardGreetingsDomain agentCardGreetings, @Nullable ProactiveContentDomain content, @Nullable AgentSpaceGreetingBucketDomain agentSpaceGreetingBucket, @Nullable String id) {
        return new WelcomeCardDrawerItemDomain(style, agentCardGreetings, content, agentSpaceGreetingBucket, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeCardDrawerItemDomain)) {
            return false;
        }
        WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain = (WelcomeCardDrawerItemDomain) other;
        return Intrinsics.areEqual(this.style, welcomeCardDrawerItemDomain.style) && Intrinsics.areEqual(this.agentCardGreetings, welcomeCardDrawerItemDomain.agentCardGreetings) && Intrinsics.areEqual(this.content, welcomeCardDrawerItemDomain.content) && Intrinsics.areEqual(this.agentSpaceGreetingBucket, welcomeCardDrawerItemDomain.agentSpaceGreetingBucket) && Intrinsics.areEqual(this.id, welcomeCardDrawerItemDomain.id);
    }

    @Nullable
    public final AgentCardGreetingsDomain getAgentCardGreetings() {
        return this.agentCardGreetings;
    }

    @Nullable
    public final AgentSpaceGreetingBucketDomain getAgentSpaceGreetingBucket() {
        return this.agentSpaceGreetingBucket;
    }

    @Nullable
    public final ProactiveContentDomain getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final StyleDomain getStyle() {
        return this.style;
    }

    public int hashCode() {
        StyleDomain styleDomain = this.style;
        int hashCode = (styleDomain == null ? 0 : styleDomain.hashCode()) * 31;
        AgentCardGreetingsDomain agentCardGreetingsDomain = this.agentCardGreetings;
        int hashCode2 = (hashCode + (agentCardGreetingsDomain == null ? 0 : agentCardGreetingsDomain.hashCode())) * 31;
        ProactiveContentDomain proactiveContentDomain = this.content;
        int hashCode3 = (hashCode2 + (proactiveContentDomain == null ? 0 : proactiveContentDomain.hashCode())) * 31;
        AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain = this.agentSpaceGreetingBucket;
        int hashCode4 = (hashCode3 + (agentSpaceGreetingBucketDomain == null ? 0 : agentSpaceGreetingBucketDomain.hashCode())) * 31;
        String str = this.id;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StyleDomain styleDomain = this.style;
        AgentCardGreetingsDomain agentCardGreetingsDomain = this.agentCardGreetings;
        ProactiveContentDomain proactiveContentDomain = this.content;
        AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain = this.agentSpaceGreetingBucket;
        String str = this.id;
        StringBuilder sb = new StringBuilder("WelcomeCardDrawerItemDomain(style=");
        sb.append(styleDomain);
        sb.append(", agentCardGreetings=");
        sb.append(agentCardGreetingsDomain);
        sb.append(", content=");
        sb.append(proactiveContentDomain);
        sb.append(", agentSpaceGreetingBucket=");
        sb.append(agentSpaceGreetingBucketDomain);
        sb.append(", id=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public WelcomeCardDrawerItemDomain(@Nullable StyleDomain styleDomain, @Nullable AgentCardGreetingsDomain agentCardGreetingsDomain, @Nullable ProactiveContentDomain proactiveContentDomain, @Nullable AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain, @Nullable String str) {
        this.style = styleDomain;
        this.agentCardGreetings = agentCardGreetingsDomain;
        this.content = proactiveContentDomain;
        this.agentSpaceGreetingBucket = agentSpaceGreetingBucketDomain;
        this.id = str;
    }

    public WelcomeCardDrawerItemDomain() {
        this(null, null, null, null, null, 31, null);
    }
}
