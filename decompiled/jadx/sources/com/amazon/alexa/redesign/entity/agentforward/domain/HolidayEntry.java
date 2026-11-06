package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/HolidayEntry;", "", "eventDate", "", "fillerGreetings", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/GreetingItem;", "standaloneGreetings", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEventDate", "()Ljava/lang/String;", "setEventDate", "(Ljava/lang/String;)V", "getFillerGreetings", "()Ljava/util/List;", "setFillerGreetings", "(Ljava/util/List;)V", "getStandaloneGreetings", "setStandaloneGreetings", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class HolidayEntry {
    public static final int $stable = 8;

    @Nullable
    private String eventDate;

    @Nullable
    private List<GreetingItem> fillerGreetings;

    @Nullable
    private List<GreetingItem> standaloneGreetings;

    public /* synthetic */ HolidayEntry(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HolidayEntry copy$default(HolidayEntry holidayEntry, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holidayEntry.eventDate;
        }
        if ((i & 2) != 0) {
            list = holidayEntry.fillerGreetings;
        }
        if ((i & 4) != 0) {
            list2 = holidayEntry.standaloneGreetings;
        }
        return holidayEntry.copy(str, list, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getEventDate() {
        return this.eventDate;
    }

    @Nullable
    public final List<GreetingItem> component2() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItem> component3() {
        return this.standaloneGreetings;
    }

    @NotNull
    public final HolidayEntry copy(@JsonProperty("eventDate") @Nullable String eventDate, @JsonProperty("fillerGreetings") @Nullable List<GreetingItem> fillerGreetings, @JsonProperty("standaloneGreetings") @Nullable List<GreetingItem> standaloneGreetings) {
        return new HolidayEntry(eventDate, fillerGreetings, standaloneGreetings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEntry)) {
            return false;
        }
        HolidayEntry holidayEntry = (HolidayEntry) other;
        return Intrinsics.areEqual(this.eventDate, holidayEntry.eventDate) && Intrinsics.areEqual(this.fillerGreetings, holidayEntry.fillerGreetings) && Intrinsics.areEqual(this.standaloneGreetings, holidayEntry.standaloneGreetings);
    }

    @Nullable
    public final String getEventDate() {
        return this.eventDate;
    }

    @Nullable
    public final List<GreetingItem> getFillerGreetings() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItem> getStandaloneGreetings() {
        return this.standaloneGreetings;
    }

    public int hashCode() {
        String str = this.eventDate;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GreetingItem> list = this.fillerGreetings;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GreetingItem> list2 = this.standaloneGreetings;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setEventDate(@Nullable String str) {
        this.eventDate = str;
    }

    public final void setFillerGreetings(@Nullable List<GreetingItem> list) {
        this.fillerGreetings = list;
    }

    public final void setStandaloneGreetings(@Nullable List<GreetingItem> list) {
        this.standaloneGreetings = list;
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.standaloneGreetings, AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("HolidayEntry(eventDate=", this.eventDate, ", fillerGreetings=", (List) this.fillerGreetings, ", standaloneGreetings="));
    }

    @JsonCreator
    public HolidayEntry(@JsonProperty("eventDate") @Nullable String str, @JsonProperty("fillerGreetings") @Nullable List<GreetingItem> list, @JsonProperty("standaloneGreetings") @Nullable List<GreetingItem> list2) {
        this.eventDate = str;
        this.fillerGreetings = list;
        this.standaloneGreetings = list2;
    }

    @JsonCreator
    public HolidayEntry() {
        this(null, null, null, 7, null);
    }
}
