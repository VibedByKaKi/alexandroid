package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingInfo;", "", "greeting", "Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;", "greetingType", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingType;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingType;)V", "getGreeting", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;", "getGreetingType", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GreetingInfo {
    public static final int $stable = 8;

    @NotNull
    private final Greeting greeting;

    @NotNull
    private final GreetingType greetingType;

    public GreetingInfo(@NotNull Greeting greeting, @NotNull GreetingType greetingType) {
        greeting.getClass();
        greetingType.getClass();
        this.greeting = greeting;
        this.greetingType = greetingType;
    }

    public static /* synthetic */ GreetingInfo copy$default(GreetingInfo greetingInfo, Greeting greeting, GreetingType greetingType, int i, Object obj) {
        if ((i & 1) != 0) {
            greeting = greetingInfo.greeting;
        }
        if ((i & 2) != 0) {
            greetingType = greetingInfo.greetingType;
        }
        return greetingInfo.copy(greeting, greetingType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Greeting getGreeting() {
        return this.greeting;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final GreetingType getGreetingType() {
        return this.greetingType;
    }

    @NotNull
    public final GreetingInfo copy(@NotNull Greeting greeting, @NotNull GreetingType greetingType) {
        greeting.getClass();
        greetingType.getClass();
        return new GreetingInfo(greeting, greetingType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreetingInfo)) {
            return false;
        }
        GreetingInfo greetingInfo = (GreetingInfo) other;
        return Intrinsics.areEqual(this.greeting, greetingInfo.greeting) && this.greetingType == greetingInfo.greetingType;
    }

    @NotNull
    public final Greeting getGreeting() {
        return this.greeting;
    }

    @NotNull
    public final GreetingType getGreetingType() {
        return this.greetingType;
    }

    public int hashCode() {
        return this.greetingType.hashCode() + (this.greeting.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GreetingInfo(greeting=" + this.greeting + ", greetingType=" + this.greetingType + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
