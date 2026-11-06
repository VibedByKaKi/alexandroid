package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentSpaceGreetingBucketDomain;", "", "locale", "", "expiresAt", "personalized", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/PersonalizedEntryDomain;", "holiday", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/HolidayEntryDomain;", "daypart", "Lcom/amazon/alexa/redesign/entity/agentforward/network/DaypartEntryDomain;", "generic", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GenericEntryDomain;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/amazon/alexa/redesign/entity/agentforward/network/GenericEntryDomain;)V", "getLocale", "()Ljava/lang/String;", "getExpiresAt", "getPersonalized", "()Ljava/util/Map;", "getHoliday", "()Ljava/util/List;", "getDaypart", "getGeneric", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/GenericEntryDomain;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AgentSpaceGreetingBucketDomain {
    public static final int $stable = 8;

    @Nullable
    private final List<DaypartEntryDomain> daypart;

    @Nullable
    private final String expiresAt;

    @Nullable
    private final GenericEntryDomain generic;

    @Nullable
    private final List<HolidayEntryDomain> holiday;

    @Nullable
    private final String locale;

    @Nullable
    private final Map<String, PersonalizedEntryDomain> personalized;

    public /* synthetic */ AgentSpaceGreetingBucketDomain(String str, String str2, Map map, List list, List list2, GenericEntryDomain genericEntryDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : genericEntryDomain);
    }

    public static /* synthetic */ AgentSpaceGreetingBucketDomain copy$default(AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain, String str, String str2, Map map, List list, List list2, GenericEntryDomain genericEntryDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentSpaceGreetingBucketDomain.locale;
        }
        if ((i & 2) != 0) {
            str2 = agentSpaceGreetingBucketDomain.expiresAt;
        }
        if ((i & 4) != 0) {
            map = agentSpaceGreetingBucketDomain.personalized;
        }
        if ((i & 8) != 0) {
            list = agentSpaceGreetingBucketDomain.holiday;
        }
        if ((i & 16) != 0) {
            list2 = agentSpaceGreetingBucketDomain.daypart;
        }
        if ((i & 32) != 0) {
            genericEntryDomain = agentSpaceGreetingBucketDomain.generic;
        }
        List list3 = list2;
        GenericEntryDomain genericEntryDomain2 = genericEntryDomain;
        return agentSpaceGreetingBucketDomain.copy(str, str2, map, list, list3, genericEntryDomain2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final Map<String, PersonalizedEntryDomain> component3() {
        return this.personalized;
    }

    @Nullable
    public final List<HolidayEntryDomain> component4() {
        return this.holiday;
    }

    @Nullable
    public final List<DaypartEntryDomain> component5() {
        return this.daypart;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final GenericEntryDomain getGeneric() {
        return this.generic;
    }

    @NotNull
    public final AgentSpaceGreetingBucketDomain copy(@Nullable String locale, @Nullable String expiresAt, @Nullable Map<String, PersonalizedEntryDomain> personalized, @Nullable List<HolidayEntryDomain> holiday, @Nullable List<DaypartEntryDomain> daypart, @Nullable GenericEntryDomain generic) {
        return new AgentSpaceGreetingBucketDomain(locale, expiresAt, personalized, holiday, daypart, generic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentSpaceGreetingBucketDomain)) {
            return false;
        }
        AgentSpaceGreetingBucketDomain agentSpaceGreetingBucketDomain = (AgentSpaceGreetingBucketDomain) other;
        return Intrinsics.areEqual(this.locale, agentSpaceGreetingBucketDomain.locale) && Intrinsics.areEqual(this.expiresAt, agentSpaceGreetingBucketDomain.expiresAt) && Intrinsics.areEqual(this.personalized, agentSpaceGreetingBucketDomain.personalized) && Intrinsics.areEqual(this.holiday, agentSpaceGreetingBucketDomain.holiday) && Intrinsics.areEqual(this.daypart, agentSpaceGreetingBucketDomain.daypart) && Intrinsics.areEqual(this.generic, agentSpaceGreetingBucketDomain.generic);
    }

    @Nullable
    public final List<DaypartEntryDomain> getDaypart() {
        return this.daypart;
    }

    @Nullable
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final GenericEntryDomain getGeneric() {
        return this.generic;
    }

    @Nullable
    public final List<HolidayEntryDomain> getHoliday() {
        return this.holiday;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<String, PersonalizedEntryDomain> getPersonalized() {
        return this.personalized;
    }

    public int hashCode() {
        String str = this.locale;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiresAt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, PersonalizedEntryDomain> map = this.personalized;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<HolidayEntryDomain> list = this.holiday;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<DaypartEntryDomain> list2 = this.daypart;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GenericEntryDomain genericEntryDomain = this.generic;
        return hashCode5 + (genericEntryDomain != null ? genericEntryDomain.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.locale;
        String str2 = this.expiresAt;
        Map<String, PersonalizedEntryDomain> map = this.personalized;
        List<HolidayEntryDomain> list = this.holiday;
        List<DaypartEntryDomain> list2 = this.daypart;
        GenericEntryDomain genericEntryDomain = this.generic;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AgentSpaceGreetingBucketDomain(locale=", str, ", expiresAt=", str2, ", personalized=");
        m.append(map);
        m.append(", holiday=");
        m.append(list);
        m.append(", daypart=");
        m.append(list2);
        m.append(", generic=");
        m.append(genericEntryDomain);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public AgentSpaceGreetingBucketDomain(@Nullable String str, @Nullable String str2, @Nullable Map<String, PersonalizedEntryDomain> map, @Nullable List<HolidayEntryDomain> list, @Nullable List<DaypartEntryDomain> list2, @Nullable GenericEntryDomain genericEntryDomain) {
        this.locale = str;
        this.expiresAt = str2;
        this.personalized = map;
        this.holiday = list;
        this.daypart = list2;
        this.generic = genericEntryDomain;
    }

    public AgentSpaceGreetingBucketDomain() {
        this(null, null, null, null, null, null, 63, null);
    }
}
