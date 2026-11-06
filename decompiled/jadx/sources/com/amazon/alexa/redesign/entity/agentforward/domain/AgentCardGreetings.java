package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceFallbackTemplates;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentCardGreetings;", "", AgentSpaceFallbackTemplates.SLOT_MORNING, "Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;", AgentSpaceFallbackTemplates.SLOT_AFTERNOON, AgentSpaceFallbackTemplates.SLOT_EVENING, "fallback", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;)V", "getMorning", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;", "setMorning", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;)V", "getAfternoon", "setAfternoon", "getEvening", "setEvening", "getFallback", "setFallback", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AgentCardGreetings {
    public static final int $stable = 8;

    @Nullable
    private Greeting afternoon;

    @Nullable
    private Greeting evening;

    @Nullable
    private Greeting fallback;

    @Nullable
    private Greeting morning;

    public /* synthetic */ AgentCardGreetings(Greeting greeting, Greeting greeting2, Greeting greeting3, Greeting greeting4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : greeting, (i & 2) != 0 ? null : greeting2, (i & 4) != 0 ? null : greeting3, (i & 8) != 0 ? null : greeting4);
    }

    public static /* synthetic */ AgentCardGreetings copy$default(AgentCardGreetings agentCardGreetings, Greeting greeting, Greeting greeting2, Greeting greeting3, Greeting greeting4, int i, Object obj) {
        if ((i & 1) != 0) {
            greeting = agentCardGreetings.morning;
        }
        if ((i & 2) != 0) {
            greeting2 = agentCardGreetings.afternoon;
        }
        if ((i & 4) != 0) {
            greeting3 = agentCardGreetings.evening;
        }
        if ((i & 8) != 0) {
            greeting4 = agentCardGreetings.fallback;
        }
        return agentCardGreetings.copy(greeting, greeting2, greeting3, greeting4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Greeting getMorning() {
        return this.morning;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Greeting getAfternoon() {
        return this.afternoon;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Greeting getEvening() {
        return this.evening;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Greeting getFallback() {
        return this.fallback;
    }

    @NotNull
    public final AgentCardGreetings copy(@JsonProperty("morning") @Nullable Greeting morning, @JsonProperty("afternoon") @Nullable Greeting afternoon, @JsonProperty("evening") @Nullable Greeting evening, @JsonProperty("fallback") @Nullable Greeting fallback) {
        return new AgentCardGreetings(morning, afternoon, evening, fallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentCardGreetings)) {
            return false;
        }
        AgentCardGreetings agentCardGreetings = (AgentCardGreetings) other;
        return Intrinsics.areEqual(this.morning, agentCardGreetings.morning) && Intrinsics.areEqual(this.afternoon, agentCardGreetings.afternoon) && Intrinsics.areEqual(this.evening, agentCardGreetings.evening) && Intrinsics.areEqual(this.fallback, agentCardGreetings.fallback);
    }

    @Nullable
    public final Greeting getAfternoon() {
        return this.afternoon;
    }

    @Nullable
    public final Greeting getEvening() {
        return this.evening;
    }

    @Nullable
    public final Greeting getFallback() {
        return this.fallback;
    }

    @Nullable
    public final Greeting getMorning() {
        return this.morning;
    }

    public int hashCode() {
        Greeting greeting = this.morning;
        int hashCode = (greeting == null ? 0 : greeting.hashCode()) * 31;
        Greeting greeting2 = this.afternoon;
        int hashCode2 = (hashCode + (greeting2 == null ? 0 : greeting2.hashCode())) * 31;
        Greeting greeting3 = this.evening;
        int hashCode3 = (hashCode2 + (greeting3 == null ? 0 : greeting3.hashCode())) * 31;
        Greeting greeting4 = this.fallback;
        return hashCode3 + (greeting4 != null ? greeting4.hashCode() : 0);
    }

    public final void setAfternoon(@Nullable Greeting greeting) {
        this.afternoon = greeting;
    }

    public final void setEvening(@Nullable Greeting greeting) {
        this.evening = greeting;
    }

    public final void setFallback(@Nullable Greeting greeting) {
        this.fallback = greeting;
    }

    public final void setMorning(@Nullable Greeting greeting) {
        this.morning = greeting;
    }

    @NotNull
    public String toString() {
        return "AgentCardGreetings(morning=" + this.morning + ", afternoon=" + this.afternoon + ", evening=" + this.evening + ", fallback=" + this.fallback + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public AgentCardGreetings(@JsonProperty("morning") @Nullable Greeting greeting, @JsonProperty("afternoon") @Nullable Greeting greeting2, @JsonProperty("evening") @Nullable Greeting greeting3, @JsonProperty("fallback") @Nullable Greeting greeting4) {
        this.morning = greeting;
        this.afternoon = greeting2;
        this.evening = greeting3;
        this.fallback = greeting4;
    }

    @JsonCreator
    public AgentCardGreetings() {
        this(null, null, null, null, 15, null);
    }
}
