package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceFallbackTemplates;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentCardGreetingsDomain;", "", AgentSpaceFallbackTemplates.SLOT_MORNING, "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;", AgentSpaceFallbackTemplates.SLOT_AFTERNOON, AgentSpaceFallbackTemplates.SLOT_EVENING, "fallback", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;)V", "getMorning", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingDomain;", "getAfternoon", "getEvening", "getFallback", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AgentCardGreetingsDomain {
    public static final int $stable = 0;

    @Nullable
    private final GreetingDomain afternoon;

    @Nullable
    private final GreetingDomain evening;

    @Nullable
    private final GreetingDomain fallback;

    @Nullable
    private final GreetingDomain morning;

    public /* synthetic */ AgentCardGreetingsDomain(GreetingDomain greetingDomain, GreetingDomain greetingDomain2, GreetingDomain greetingDomain3, GreetingDomain greetingDomain4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : greetingDomain, (i & 2) != 0 ? null : greetingDomain2, (i & 4) != 0 ? null : greetingDomain3, (i & 8) != 0 ? null : greetingDomain4);
    }

    public static /* synthetic */ AgentCardGreetingsDomain copy$default(AgentCardGreetingsDomain agentCardGreetingsDomain, GreetingDomain greetingDomain, GreetingDomain greetingDomain2, GreetingDomain greetingDomain3, GreetingDomain greetingDomain4, int i, Object obj) {
        if ((i & 1) != 0) {
            greetingDomain = agentCardGreetingsDomain.morning;
        }
        if ((i & 2) != 0) {
            greetingDomain2 = agentCardGreetingsDomain.afternoon;
        }
        if ((i & 4) != 0) {
            greetingDomain3 = agentCardGreetingsDomain.evening;
        }
        if ((i & 8) != 0) {
            greetingDomain4 = agentCardGreetingsDomain.fallback;
        }
        return agentCardGreetingsDomain.copy(greetingDomain, greetingDomain2, greetingDomain3, greetingDomain4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final GreetingDomain getMorning() {
        return this.morning;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final GreetingDomain getAfternoon() {
        return this.afternoon;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final GreetingDomain getEvening() {
        return this.evening;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final GreetingDomain getFallback() {
        return this.fallback;
    }

    @NotNull
    public final AgentCardGreetingsDomain copy(@Nullable GreetingDomain morning, @Nullable GreetingDomain afternoon, @Nullable GreetingDomain evening, @Nullable GreetingDomain fallback) {
        return new AgentCardGreetingsDomain(morning, afternoon, evening, fallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentCardGreetingsDomain)) {
            return false;
        }
        AgentCardGreetingsDomain agentCardGreetingsDomain = (AgentCardGreetingsDomain) other;
        return Intrinsics.areEqual(this.morning, agentCardGreetingsDomain.morning) && Intrinsics.areEqual(this.afternoon, agentCardGreetingsDomain.afternoon) && Intrinsics.areEqual(this.evening, agentCardGreetingsDomain.evening) && Intrinsics.areEqual(this.fallback, agentCardGreetingsDomain.fallback);
    }

    @Nullable
    public final GreetingDomain getAfternoon() {
        return this.afternoon;
    }

    @Nullable
    public final GreetingDomain getEvening() {
        return this.evening;
    }

    @Nullable
    public final GreetingDomain getFallback() {
        return this.fallback;
    }

    @Nullable
    public final GreetingDomain getMorning() {
        return this.morning;
    }

    public int hashCode() {
        GreetingDomain greetingDomain = this.morning;
        int hashCode = (greetingDomain == null ? 0 : greetingDomain.hashCode()) * 31;
        GreetingDomain greetingDomain2 = this.afternoon;
        int hashCode2 = (hashCode + (greetingDomain2 == null ? 0 : greetingDomain2.hashCode())) * 31;
        GreetingDomain greetingDomain3 = this.evening;
        int hashCode3 = (hashCode2 + (greetingDomain3 == null ? 0 : greetingDomain3.hashCode())) * 31;
        GreetingDomain greetingDomain4 = this.fallback;
        return hashCode3 + (greetingDomain4 != null ? greetingDomain4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AgentCardGreetingsDomain(morning=" + this.morning + ", afternoon=" + this.afternoon + ", evening=" + this.evening + ", fallback=" + this.fallback + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public AgentCardGreetingsDomain(@Nullable GreetingDomain greetingDomain, @Nullable GreetingDomain greetingDomain2, @Nullable GreetingDomain greetingDomain3, @Nullable GreetingDomain greetingDomain4) {
        this.morning = greetingDomain;
        this.afternoon = greetingDomain2;
        this.evening = greetingDomain3;
        this.fallback = greetingDomain4;
    }

    public AgentCardGreetingsDomain() {
        this(null, null, null, null, 15, null);
    }
}
