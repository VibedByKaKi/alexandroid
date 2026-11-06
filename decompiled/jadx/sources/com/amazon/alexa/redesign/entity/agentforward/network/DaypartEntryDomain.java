package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/DaypartEntryDomain;", "", "slot", "", "startHour", "", "endHour", "fillerGreetings", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "standaloneGreetings", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getSlot", "()Ljava/lang/String;", "getStartHour", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndHour", "getFillerGreetings", "()Ljava/util/List;", "getStandaloneGreetings", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/amazon/alexa/redesign/entity/agentforward/network/DaypartEntryDomain;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DaypartEntryDomain {
    public static final int $stable = 8;

    @Nullable
    private final Integer endHour;

    @Nullable
    private final List<GreetingItemDomain> fillerGreetings;

    @Nullable
    private final String slot;

    @Nullable
    private final List<GreetingItemDomain> standaloneGreetings;

    @Nullable
    private final Integer startHour;

    public /* synthetic */ DaypartEntryDomain(String str, Integer num, Integer num2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }

    public static /* synthetic */ DaypartEntryDomain copy$default(DaypartEntryDomain daypartEntryDomain, String str, Integer num, Integer num2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = daypartEntryDomain.slot;
        }
        if ((i & 2) != 0) {
            num = daypartEntryDomain.startHour;
        }
        if ((i & 4) != 0) {
            num2 = daypartEntryDomain.endHour;
        }
        if ((i & 8) != 0) {
            list = daypartEntryDomain.fillerGreetings;
        }
        if ((i & 16) != 0) {
            list2 = daypartEntryDomain.standaloneGreetings;
        }
        List list3 = list2;
        Integer num3 = num2;
        return daypartEntryDomain.copy(str, num, num3, list, list3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getSlot() {
        return this.slot;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getStartHour() {
        return this.startHour;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getEndHour() {
        return this.endHour;
    }

    @Nullable
    public final List<GreetingItemDomain> component4() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItemDomain> component5() {
        return this.standaloneGreetings;
    }

    @NotNull
    public final DaypartEntryDomain copy(@Nullable String slot, @Nullable Integer startHour, @Nullable Integer endHour, @Nullable List<GreetingItemDomain> fillerGreetings, @Nullable List<GreetingItemDomain> standaloneGreetings) {
        return new DaypartEntryDomain(slot, startHour, endHour, fillerGreetings, standaloneGreetings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DaypartEntryDomain)) {
            return false;
        }
        DaypartEntryDomain daypartEntryDomain = (DaypartEntryDomain) other;
        return Intrinsics.areEqual(this.slot, daypartEntryDomain.slot) && Intrinsics.areEqual(this.startHour, daypartEntryDomain.startHour) && Intrinsics.areEqual(this.endHour, daypartEntryDomain.endHour) && Intrinsics.areEqual(this.fillerGreetings, daypartEntryDomain.fillerGreetings) && Intrinsics.areEqual(this.standaloneGreetings, daypartEntryDomain.standaloneGreetings);
    }

    @Nullable
    public final Integer getEndHour() {
        return this.endHour;
    }

    @Nullable
    public final List<GreetingItemDomain> getFillerGreetings() {
        return this.fillerGreetings;
    }

    @Nullable
    public final String getSlot() {
        return this.slot;
    }

    @Nullable
    public final List<GreetingItemDomain> getStandaloneGreetings() {
        return this.standaloneGreetings;
    }

    @Nullable
    public final Integer getStartHour() {
        return this.startHour;
    }

    public int hashCode() {
        String str = this.slot;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.startHour;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endHour;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<GreetingItemDomain> list = this.fillerGreetings;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GreetingItemDomain> list2 = this.standaloneGreetings;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.slot;
        Integer num = this.startHour;
        Integer num2 = this.endHour;
        List<GreetingItemDomain> list = this.fillerGreetings;
        List<GreetingItemDomain> list2 = this.standaloneGreetings;
        StringBuilder sb = new StringBuilder("DaypartEntryDomain(slot=");
        sb.append(str);
        sb.append(", startHour=");
        sb.append(num);
        sb.append(", endHour=");
        sb.append(num2);
        sb.append(", fillerGreetings=");
        sb.append(list);
        sb.append(", standaloneGreetings=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list2, sb);
    }

    public DaypartEntryDomain(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<GreetingItemDomain> list, @Nullable List<GreetingItemDomain> list2) {
        this.slot = str;
        this.startHour = num;
        this.endHour = num2;
        this.fillerGreetings = list;
        this.standaloneGreetings = list2;
    }

    public DaypartEntryDomain() {
        this(null, null, null, null, null, 31, null);
    }
}
