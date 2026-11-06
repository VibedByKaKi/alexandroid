package com.amazon.alexa.redesign.view.container;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.entity.agentforward.domain.DaypartEntry;
import com.amazon.alexa.redesign.entity.agentforward.domain.GenericEntry;
import com.amazon.alexa.redesign.entity.agentforward.domain.HolidayEntry;
import com.amazon.alexa.redesign.entity.agentforward.domain.PersonalizedEntry;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/BucketKey;", "", "locale", "", "personalized", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/PersonalizedEntry;", "holiday", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/HolidayEntry;", "daypart", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/DaypartEntry;", "generic", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/GenericEntry;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/amazon/alexa/redesign/entity/agentforward/domain/GenericEntry;)V", "getLocale", "()Ljava/lang/String;", "getPersonalized", "()Ljava/util/Map;", "getHoliday", "()Ljava/util/List;", "getDaypart", "getGeneric", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/GenericEntry;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes19.dex */
public final /* data */ class BucketKey {
    public static final int $stable = 8;

    @Nullable
    private final List<DaypartEntry> daypart;

    @Nullable
    private final GenericEntry generic;

    @Nullable
    private final List<HolidayEntry> holiday;

    @Nullable
    private final String locale;

    @Nullable
    private final Map<String, PersonalizedEntry> personalized;

    public BucketKey(@Nullable String str, @Nullable Map<String, PersonalizedEntry> map, @Nullable List<HolidayEntry> list, @Nullable List<DaypartEntry> list2, @Nullable GenericEntry genericEntry) {
        this.locale = str;
        this.personalized = map;
        this.holiday = list;
        this.daypart = list2;
        this.generic = genericEntry;
    }

    public static /* synthetic */ BucketKey copy$default(BucketKey bucketKey, String str, Map map, List list, List list2, GenericEntry genericEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bucketKey.locale;
        }
        if ((i & 2) != 0) {
            map = bucketKey.personalized;
        }
        if ((i & 4) != 0) {
            list = bucketKey.holiday;
        }
        if ((i & 8) != 0) {
            list2 = bucketKey.daypart;
        }
        if ((i & 16) != 0) {
            genericEntry = bucketKey.generic;
        }
        GenericEntry genericEntry2 = genericEntry;
        List list3 = list;
        return bucketKey.copy(str, map, list3, list2, genericEntry2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<String, PersonalizedEntry> component2() {
        return this.personalized;
    }

    @Nullable
    public final List<HolidayEntry> component3() {
        return this.holiday;
    }

    @Nullable
    public final List<DaypartEntry> component4() {
        return this.daypart;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final GenericEntry getGeneric() {
        return this.generic;
    }

    @NotNull
    public final BucketKey copy(@Nullable String locale, @Nullable Map<String, PersonalizedEntry> personalized, @Nullable List<HolidayEntry> holiday, @Nullable List<DaypartEntry> daypart, @Nullable GenericEntry generic) {
        return new BucketKey(locale, personalized, holiday, daypart, generic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BucketKey)) {
            return false;
        }
        BucketKey bucketKey = (BucketKey) other;
        return Intrinsics.areEqual(this.locale, bucketKey.locale) && Intrinsics.areEqual(this.personalized, bucketKey.personalized) && Intrinsics.areEqual(this.holiday, bucketKey.holiday) && Intrinsics.areEqual(this.daypart, bucketKey.daypart) && Intrinsics.areEqual(this.generic, bucketKey.generic);
    }

    @Nullable
    public final List<DaypartEntry> getDaypart() {
        return this.daypart;
    }

    @Nullable
    public final GenericEntry getGeneric() {
        return this.generic;
    }

    @Nullable
    public final List<HolidayEntry> getHoliday() {
        return this.holiday;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<String, PersonalizedEntry> getPersonalized() {
        return this.personalized;
    }

    public int hashCode() {
        String str = this.locale;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, PersonalizedEntry> map = this.personalized;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<HolidayEntry> list = this.holiday;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DaypartEntry> list2 = this.daypart;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GenericEntry genericEntry = this.generic;
        return hashCode4 + (genericEntry != null ? genericEntry.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BucketKey(locale=" + this.locale + ", personalized=" + this.personalized + ", holiday=" + this.holiday + ", daypart=" + this.daypart + ", generic=" + this.generic + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
