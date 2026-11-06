package com.amazon.alexa.redesign.domain.agentspace.greeting;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext;", "", "currentPid", "", "firstName", "calendar", "Ljava/util/Calendar;", "locale", "Ljava/util/Locale;", "variant", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext$Variant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Locale;Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext$Variant;)V", "getCurrentPid", "()Ljava/lang/String;", "getFirstName", "getCalendar", "()Ljava/util/Calendar;", "getLocale", "()Ljava/util/Locale;", "getVariant", "()Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext$Variant;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Variant", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GreetingSelectionContext {
    public static final int $stable = 8;

    @NotNull
    private final Calendar calendar;

    @Nullable
    private final String currentPid;

    @NotNull
    private final String firstName;

    @NotNull
    private final Locale locale;

    @NotNull
    private final Variant variant;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext$Variant;", "", "<init>", "(Ljava/lang/String;I)V", "FILLER", "STANDALONE", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Variant {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        public static final Variant FILLER = new Variant("FILLER", 0);
        public static final Variant STANDALONE = new Variant("STANDALONE", 1);

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{FILLER, STANDALONE};
        }

        static {
            Variant[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Variant(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Variant> getEntries() {
            return $ENTRIES;
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }

    public GreetingSelectionContext(@Nullable String str, @NotNull String str2, @NotNull Calendar calendar, @NotNull Locale locale, @NotNull Variant variant) {
        str2.getClass();
        calendar.getClass();
        locale.getClass();
        variant.getClass();
        this.currentPid = str;
        this.firstName = str2;
        this.calendar = calendar;
        this.locale = locale;
        this.variant = variant;
    }

    public static /* synthetic */ GreetingSelectionContext copy$default(GreetingSelectionContext greetingSelectionContext, String str, String str2, Calendar calendar, Locale locale, Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = greetingSelectionContext.currentPid;
        }
        if ((i & 2) != 0) {
            str2 = greetingSelectionContext.firstName;
        }
        if ((i & 4) != 0) {
            calendar = greetingSelectionContext.calendar;
        }
        if ((i & 8) != 0) {
            locale = greetingSelectionContext.locale;
        }
        if ((i & 16) != 0) {
            variant = greetingSelectionContext.variant;
        }
        Variant variant2 = variant;
        Calendar calendar2 = calendar;
        return greetingSelectionContext.copy(str, str2, calendar2, locale, variant2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCurrentPid() {
        return this.currentPid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Variant getVariant() {
        return this.variant;
    }

    @NotNull
    public final GreetingSelectionContext copy(@Nullable String currentPid, @NotNull String firstName, @NotNull Calendar calendar, @NotNull Locale locale, @NotNull Variant variant) {
        firstName.getClass();
        calendar.getClass();
        locale.getClass();
        variant.getClass();
        return new GreetingSelectionContext(currentPid, firstName, calendar, locale, variant);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreetingSelectionContext)) {
            return false;
        }
        GreetingSelectionContext greetingSelectionContext = (GreetingSelectionContext) other;
        return Intrinsics.areEqual(this.currentPid, greetingSelectionContext.currentPid) && Intrinsics.areEqual(this.firstName, greetingSelectionContext.firstName) && Intrinsics.areEqual(this.calendar, greetingSelectionContext.calendar) && Intrinsics.areEqual(this.locale, greetingSelectionContext.locale) && this.variant == greetingSelectionContext.variant;
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @Nullable
    public final String getCurrentPid() {
        return this.currentPid;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final Variant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        String str = this.currentPid;
        return this.variant.hashCode() + ((this.locale.hashCode() + ((this.calendar.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.firstName)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.currentPid;
        String str2 = this.firstName;
        Calendar calendar = this.calendar;
        Locale locale = this.locale;
        Variant variant = this.variant;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("GreetingSelectionContext(currentPid=", str, ", firstName=", str2, ", calendar=");
        m.append(calendar);
        m.append(", locale=");
        m.append(locale);
        m.append(", variant=");
        m.append(variant);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public /* synthetic */ GreetingSelectionContext(String str, String str2, Calendar calendar, Locale locale, Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? Calendar.getInstance() : calendar, (i & 8) != 0 ? Locale.getDefault() : locale, variant);
    }
}
