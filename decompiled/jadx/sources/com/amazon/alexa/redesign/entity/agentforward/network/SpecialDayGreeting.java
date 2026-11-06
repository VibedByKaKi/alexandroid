package com.amazon.alexa.redesign.entity.agentforward.network;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/SpecialDayGreeting;", "", "date", "", "greeting", "Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;)V", "getDate", "()Ljava/lang/String;", "getGreeting", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/Greeting;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SpecialDayGreeting {
    public static final int $stable = 8;

    @Nullable
    private final String date;

    @Nullable
    private final Greeting greeting;

    public /* synthetic */ SpecialDayGreeting(String str, Greeting greeting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : greeting);
    }

    public static /* synthetic */ SpecialDayGreeting copy$default(SpecialDayGreeting specialDayGreeting, String str, Greeting greeting, int i, Object obj) {
        if ((i & 1) != 0) {
            str = specialDayGreeting.date;
        }
        if ((i & 2) != 0) {
            greeting = specialDayGreeting.greeting;
        }
        return specialDayGreeting.copy(str, greeting);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Greeting getGreeting() {
        return this.greeting;
    }

    @NotNull
    public final SpecialDayGreeting copy(@JsonProperty("date") @Nullable String date, @JsonProperty("greeting") @Nullable Greeting greeting) {
        return new SpecialDayGreeting(date, greeting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialDayGreeting)) {
            return false;
        }
        SpecialDayGreeting specialDayGreeting = (SpecialDayGreeting) other;
        return Intrinsics.areEqual(this.date, specialDayGreeting.date) && Intrinsics.areEqual(this.greeting, specialDayGreeting.greeting);
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final Greeting getGreeting() {
        return this.greeting;
    }

    public int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Greeting greeting = this.greeting;
        return hashCode + (greeting != null ? greeting.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpecialDayGreeting(date=" + this.date + ", greeting=" + this.greeting + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public SpecialDayGreeting(@JsonProperty("date") @Nullable String str, @JsonProperty("greeting") @Nullable Greeting greeting) {
        this.date = str;
        this.greeting = greeting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public SpecialDayGreeting() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
