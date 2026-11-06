package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceFallbackTemplates;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0013\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/DayPartGreetings;", "", AgentSpaceFallbackTemplates.SLOT_MORNING, "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/DayPartGreetingItem;", AgentSpaceFallbackTemplates.SLOT_AFTERNOON, AgentSpaceFallbackTemplates.SLOT_EVENING, "generic", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMorning", "()Ljava/util/List;", "getAfternoon", "getEvening", "getGeneric", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DayPartGreetings {
    public static final int $stable = 8;

    @Nullable
    private final List<DayPartGreetingItem> afternoon;

    @Nullable
    private final List<DayPartGreetingItem> evening;

    @Nullable
    private final List<DayPartGreetingItem> generic;

    @Nullable
    private final List<DayPartGreetingItem> morning;

    public /* synthetic */ DayPartGreetings(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayPartGreetings copy$default(DayPartGreetings dayPartGreetings, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dayPartGreetings.morning;
        }
        if ((i & 2) != 0) {
            list2 = dayPartGreetings.afternoon;
        }
        if ((i & 4) != 0) {
            list3 = dayPartGreetings.evening;
        }
        if ((i & 8) != 0) {
            list4 = dayPartGreetings.generic;
        }
        return dayPartGreetings.copy(list, list2, list3, list4);
    }

    @Nullable
    public final List<DayPartGreetingItem> component1() {
        return this.morning;
    }

    @Nullable
    public final List<DayPartGreetingItem> component2() {
        return this.afternoon;
    }

    @Nullable
    public final List<DayPartGreetingItem> component3() {
        return this.evening;
    }

    @Nullable
    public final List<DayPartGreetingItem> component4() {
        return this.generic;
    }

    @NotNull
    public final DayPartGreetings copy(@JsonProperty("morning") @Nullable List<DayPartGreetingItem> morning, @JsonProperty("afternoon") @Nullable List<DayPartGreetingItem> afternoon, @JsonProperty("evening") @Nullable List<DayPartGreetingItem> evening, @JsonProperty("generic") @Nullable List<DayPartGreetingItem> generic) {
        return new DayPartGreetings(morning, afternoon, evening, generic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayPartGreetings)) {
            return false;
        }
        DayPartGreetings dayPartGreetings = (DayPartGreetings) other;
        return Intrinsics.areEqual(this.morning, dayPartGreetings.morning) && Intrinsics.areEqual(this.afternoon, dayPartGreetings.afternoon) && Intrinsics.areEqual(this.evening, dayPartGreetings.evening) && Intrinsics.areEqual(this.generic, dayPartGreetings.generic);
    }

    @Nullable
    public final List<DayPartGreetingItem> getAfternoon() {
        return this.afternoon;
    }

    @Nullable
    public final List<DayPartGreetingItem> getEvening() {
        return this.evening;
    }

    @Nullable
    public final List<DayPartGreetingItem> getGeneric() {
        return this.generic;
    }

    @Nullable
    public final List<DayPartGreetingItem> getMorning() {
        return this.morning;
    }

    public int hashCode() {
        List<DayPartGreetingItem> list = this.morning;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DayPartGreetingItem> list2 = this.afternoon;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DayPartGreetingItem> list3 = this.evening;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DayPartGreetingItem> list4 = this.generic;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DayPartGreetings(morning=" + this.morning + ", afternoon=" + this.afternoon + ", evening=" + this.evening + ", generic=" + this.generic + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public DayPartGreetings(@JsonProperty("morning") @Nullable List<DayPartGreetingItem> list, @JsonProperty("afternoon") @Nullable List<DayPartGreetingItem> list2, @JsonProperty("evening") @Nullable List<DayPartGreetingItem> list3, @JsonProperty("generic") @Nullable List<DayPartGreetingItem> list4) {
        this.morning = list;
        this.afternoon = list2;
        this.evening = list3;
        this.generic = list4;
    }

    @JsonCreator
    public DayPartGreetings() {
        this(null, null, null, null, 15, null);
    }
}
