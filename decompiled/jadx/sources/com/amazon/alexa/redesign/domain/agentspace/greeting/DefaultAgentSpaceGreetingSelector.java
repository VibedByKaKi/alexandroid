package com.amazon.alexa.redesign.domain.agentspace.greeting;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.repo.NetworkManager$$ExternalSyntheticLambda0;
import com.amazon.alexa.redesign.domain.agentspace.greeting.GreetingSelectionContext;
import com.amazon.alexa.redesign.domain.agentspace.greeting.GreetingSelectionResult;
import com.amazon.alexa.redesign.entity.agentforward.network.AgentSpaceGreetingBucketDomain;
import com.amazon.alexa.redesign.entity.agentforward.network.DaypartEntryDomain;
import com.amazon.alexa.redesign.entity.agentforward.network.GenericEntryDomain;
import com.amazon.alexa.redesign.entity.agentforward.network.GreetingItemDomain;
import com.amazon.alexa.redesign.entity.agentforward.network.HolidayEntryDomain;
import com.amazon.alexa.redesign.entity.agentforward.network.PersonalizedEntryDomain;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J0\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J*\u0010\u0012\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J*\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J8\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0002J2\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\rH\u0002J\u001a\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002¨\u00062"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/DefaultAgentSpaceGreetingSelector;", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingSelector;", "<init>", "()V", "select", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionResult;", "bucket", "Lcom/amazon/alexa/redesign/entity/agentforward/network/AgentSpaceGreetingBucketDomain;", "context", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext;", "rotationManager", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingRotationManager;", "pickPersonalized", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "personalized", "", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/PersonalizedEntryDomain;", "pickHoliday", "holiday", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/HolidayEntryDomain;", "pickDaypart", "daypart", "Lcom/amazon/alexa/redesign/entity/agentforward/network/DaypartEntryDomain;", "pickGeneric", "generic", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GenericEntryDomain;", "localePrefix", "variantList", "variant", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext$Variant;", "fillerGreetings", "standaloneGreetings", "variantSuffix", "matchesHour", "", "entry", "currentHour", "", "advanceWithSkip", "listKey", "scopeKey", "list", "canResolveTokens", "item", "isBucketFresh", "expiresAt", "todayLocalDate", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Singleton
@SourceDebugExtension({"SMAP\nDefaultAgentSpaceGreetingSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAgentSpaceGreetingSelector.kt\ncom/amazon/alexa/redesign/domain/agentspace/greeting/DefaultAgentSpaceGreetingSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,2:305\n295#2,2:307\n1734#2,3:309\n1#3:312\n*S KotlinDebug\n*F\n+ 1 DefaultAgentSpaceGreetingSelector.kt\ncom/amazon/alexa/redesign/domain/agentspace/greeting/DefaultAgentSpaceGreetingSelector\n*L\n123#1:305,2\n145#1:307,2\n253#1:309,3\n*E\n"})
/* loaded from: classes19.dex */
public final class DefaultAgentSpaceGreetingSelector implements AgentSpaceGreetingSelector {
    public static final int $stable = 0;
    private static final char SCOPE_COMPOSITE_DELIM = '@';

    @NotNull
    public static final String TOKEN_FIRST_NAME = "firstName";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GreetingSelectionContext.Variant.values().length];
            try {
                iArr[GreetingSelectionContext.Variant.FILLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GreetingSelectionContext.Variant.STANDALONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultAgentSpaceGreetingSelector() {
    }

    private final GreetingItemDomain advanceWithSkip(String listKey, String scopeKey, List<GreetingItemDomain> list, AgentSpaceGreetingRotationManager rotationManager) {
        List<GreetingItemDomain> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return rotationManager.advance(listKey, scopeKey, list, new NetworkManager$$ExternalSyntheticLambda0(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean advanceWithSkip$lambda$6(DefaultAgentSpaceGreetingSelector defaultAgentSpaceGreetingSelector, GreetingItemDomain greetingItemDomain) {
        greetingItemDomain.getClass();
        return defaultAgentSpaceGreetingSelector.canResolveTokens(greetingItemDomain);
    }

    private final boolean canResolveTokens(GreetingItemDomain item) {
        List<String> templateKeys = item.getTemplateKeys();
        if (templateKeys == null) {
            templateKeys = CollectionsKt.emptyList();
        }
        if (templateKeys.isEmpty()) {
            return true;
        }
        List<String> list = templateKeys;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.areEqual((String) it2.next(), "firstName")) {
                return false;
            }
        }
        return true;
    }

    private final boolean isBucketFresh(String expiresAt, GreetingSelectionContext context) {
        Object m25294constructorimpl;
        if (expiresAt == null || expiresAt.length() == 0) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(Instant.parse(expiresAt));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m25300isFailureimpl(m25294constructorimpl)) {
            m25294constructorimpl = null;
        }
        Instant instant = (Instant) m25294constructorimpl;
        if (instant == null) {
            return true;
        }
        return Instant.ofEpochMilli(context.getCalendar().getTimeInMillis()).isBefore(instant);
    }

    private final String localePrefix(GreetingSelectionContext context) {
        String languageTag = context.getLocale().toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    private final boolean matchesHour(DaypartEntryDomain entry, int currentHour) {
        Integer startHour = entry.getStartHour();
        if (startHour != null) {
            int intValue = startHour.intValue();
            Integer endHour = entry.getEndHour();
            if (endHour != null) {
                int intValue2 = endHour.intValue();
                if (intValue >= 0 && intValue < 24 && intValue2 >= 0 && intValue2 < 24) {
                    if (intValue2 > intValue) {
                        return intValue <= currentHour && currentHour < intValue2;
                    }
                    if (intValue2 < intValue) {
                        return currentHour >= intValue || currentHour < intValue2;
                    }
                }
            }
        }
        return false;
    }

    private final GreetingItemDomain pickDaypart(List<DaypartEntryDomain> daypart, GreetingSelectionContext context, AgentSpaceGreetingRotationManager rotationManager) {
        Object obj;
        int i = context.getCalendar().get(11);
        if (daypart != null) {
            Iterator<T> it2 = daypart.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (matchesHour((DaypartEntryDomain) obj, i)) {
                    break;
                }
            }
            DaypartEntryDomain daypartEntryDomain = (DaypartEntryDomain) obj;
            if (daypartEntryDomain != null) {
                String slot = daypartEntryDomain.getSlot();
                if (slot == null) {
                    slot = "unknown";
                }
                return advanceWithSkip(ParcelCompat$$ExternalSyntheticOutline0.m(localePrefix(context), ".daypart.", slot, ".", variantSuffix(context.getVariant())), "", variantList(context.getVariant(), daypartEntryDomain.getFillerGreetings(), daypartEntryDomain.getStandaloneGreetings()), rotationManager);
            }
        }
        return null;
    }

    private final GreetingItemDomain pickGeneric(GenericEntryDomain generic, GreetingSelectionContext context, AgentSpaceGreetingRotationManager rotationManager) {
        if (generic == null) {
            return null;
        }
        return advanceWithSkip(a$$ExternalSyntheticOutline0.m$1(localePrefix(context), ".generic.", variantSuffix(context.getVariant())), "", variantList(context.getVariant(), generic.getFillerGreetings(), generic.getStandaloneGreetings()), rotationManager);
    }

    private final GreetingItemDomain pickHoliday(List<HolidayEntryDomain> holiday, GreetingSelectionContext context, AgentSpaceGreetingRotationManager rotationManager) {
        Object obj;
        String str = todayLocalDate(context);
        if (holiday != null) {
            Iterator<T> it2 = holiday.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((HolidayEntryDomain) obj).getEventDate(), str)) {
                    break;
                }
            }
            HolidayEntryDomain holidayEntryDomain = (HolidayEntryDomain) obj;
            if (holidayEntryDomain != null) {
                return advanceWithSkip(a$$ExternalSyntheticOutline0.m$1(localePrefix(context), ".holiday.", variantSuffix(context.getVariant())), str, variantList(context.getVariant(), holidayEntryDomain.getFillerGreetings(), holidayEntryDomain.getStandaloneGreetings()), rotationManager);
            }
        }
        return null;
    }

    private final GreetingItemDomain pickPersonalized(Map<String, PersonalizedEntryDomain> personalized, GreetingSelectionContext context, AgentSpaceGreetingRotationManager rotationManager) {
        PersonalizedEntryDomain personalizedEntryDomain;
        String eventDate;
        String currentPid = context.getCurrentPid();
        if (currentPid == null || personalized == null || (personalizedEntryDomain = personalized.get(currentPid)) == null || (eventDate = personalizedEntryDomain.getEventDate()) == null || !Intrinsics.areEqual(eventDate, todayLocalDate(context))) {
            return null;
        }
        return advanceWithSkip(a$$ExternalSyntheticOutline0.m$1(localePrefix(context), ".personalized.", variantSuffix(context.getVariant())), a$$ExternalSyntheticOutline0.m$1(currentPid, "@", eventDate), variantList(context.getVariant(), personalizedEntryDomain.getFillerGreetings(), personalizedEntryDomain.getStandaloneGreetings()), rotationManager);
    }

    private final String todayLocalDate(GreetingSelectionContext context) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(context.getCalendar().getTimeZone());
        gregorianCalendar.setTimeInMillis(context.getCalendar().getTimeInMillis());
        return String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5))}, 3));
    }

    private final List<GreetingItemDomain> variantList(GreetingSelectionContext.Variant variant, List<GreetingItemDomain> fillerGreetings, List<GreetingItemDomain> standaloneGreetings) {
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i == 1) {
            return fillerGreetings;
        }
        if (i == 2) {
            return standaloneGreetings;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private final String variantSuffix(GreetingSelectionContext.Variant variant) {
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i == 1) {
            return "filler";
        }
        if (i == 2) {
            return "standalone";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceGreetingSelector
    @NotNull
    public GreetingSelectionResult select(@Nullable AgentSpaceGreetingBucketDomain bucket, @NotNull GreetingSelectionContext context, @NotNull AgentSpaceGreetingRotationManager rotationManager) {
        context.getClass();
        rotationManager.getClass();
        if (bucket == null) {
            return new GreetingSelectionResult(null, GreetingSelectionResult.Source.FALLBACK);
        }
        if (!isBucketFresh(bucket.getExpiresAt(), context)) {
            return new GreetingSelectionResult(null, GreetingSelectionResult.Source.BUCKET_STALE);
        }
        GreetingItemDomain pickPersonalized = pickPersonalized(bucket.getPersonalized(), context, rotationManager);
        if (pickPersonalized != null) {
            return new GreetingSelectionResult(pickPersonalized, GreetingSelectionResult.Source.PERSONALIZED);
        }
        GreetingItemDomain pickHoliday = pickHoliday(bucket.getHoliday(), context, rotationManager);
        if (pickHoliday != null) {
            return new GreetingSelectionResult(pickHoliday, GreetingSelectionResult.Source.HOLIDAY);
        }
        GreetingItemDomain pickDaypart = pickDaypart(bucket.getDaypart(), context, rotationManager);
        if (pickDaypart != null) {
            return new GreetingSelectionResult(pickDaypart, GreetingSelectionResult.Source.DAYPART);
        }
        GreetingItemDomain pickGeneric = pickGeneric(bucket.getGeneric(), context, rotationManager);
        return pickGeneric != null ? new GreetingSelectionResult(pickGeneric, GreetingSelectionResult.Source.GENERIC) : new GreetingSelectionResult(null, GreetingSelectionResult.Source.FALLBACK);
    }
}
