package androidx.compose.material3.internal;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.utils.Constants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dJ\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006&"}, d2 = {"Landroidx/compose/material3/internal/CalendarMonth;", "", TimeGroupBy.YEAR, "", TimeGroupBy.MONTH, "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "startUtcTimeMillis", "", "(IIIIJ)V", "getDaysFromStartOfWeekToFirstOfMonth", "()I", "endUtcTimeMillis", "getEndUtcTimeMillis", "()J", "getMonth", "getNumberOfDays", "getStartUtcTimeMillis", "getYear", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "format", "", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", Constants.SKELETON, "hashCode", "indexIn", "years", "Lkotlin/ranges/IntRange;", "toString", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.year = i;
        this.month = i2;
        this.numberOfDays = i3;
        this.daysFromStartOfWeekToFirstOfMonth = i4;
        this.startUtcTimeMillis = j;
        this.endUtcTimeMillis = ((i3 * 86400000) + j) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i, int i2, int i3, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = calendarMonth.year;
        }
        if ((i5 & 2) != 0) {
            i2 = calendarMonth.month;
        }
        if ((i5 & 4) != 0) {
            i3 = calendarMonth.numberOfDays;
        }
        if ((i5 & 8) != 0) {
            i4 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        if ((i5 & 16) != 0) {
            j = calendarMonth.startUtcTimeMillis;
        }
        long j2 = j;
        return calendarMonth.copy(i, i2, i3, i4, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    /* renamed from: component5, reason: from getter */
    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    @NotNull
    public final CalendarMonth copy(int year, int month, int numberOfDays, int daysFromStartOfWeekToFirstOfMonth, long startUtcTimeMillis) {
        return new CalendarMonth(year, month, numberOfDays, daysFromStartOfWeekToFirstOfMonth, startUtcTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) other;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel, @NotNull String skeleton) {
        return calendarModel.formatWithSkeleton(this, skeleton, calendarModel.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Long.hashCode(this.startUtcTimeMillis) + ArcMode$$ExternalSyntheticOutline0.m(this.daysFromStartOfWeekToFirstOfMonth, ArcMode$$ExternalSyntheticOutline0.m(this.numberOfDays, ArcMode$$ExternalSyntheticOutline0.m(this.month, Integer.hashCode(this.year) * 31, 31), 31), 31);
    }

    public final int indexIn(@NotNull IntRange years) {
        return (((this.year - years.getFirst()) * 12) + this.month) - 1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", numberOfDays=");
        sb.append(this.numberOfDays);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.daysFromStartOfWeekToFirstOfMonth);
        sb.append(", startUtcTimeMillis=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.startUtcTimeMillis, ')');
    }
}
