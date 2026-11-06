package com.amazon.alexa.stayorganized.data.models;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/models/CalendarItemModel;", "", "id", "", "title", "startTime", "", "endTime", "calendar", "allDayEvent", "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Z)V", "getAllDayEvent", "()Z", "getCalendar", "()Ljava/lang/String;", "getEndTime", "()J", "getId", "getStartTime", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CalendarItemModel {
    private final boolean allDayEvent;

    @NotNull
    private final String calendar;
    private final long endTime;

    @NotNull
    private final String id;
    private final long startTime;

    @NotNull
    private final String title;

    public /* synthetic */ CalendarItemModel(String str, String str2, long j, long j2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, str3, (i & 32) != 0 ? false : z);
    }

    public static /* synthetic */ CalendarItemModel copy$default(CalendarItemModel calendarItemModel, String str, String str2, long j, long j2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarItemModel.id;
        }
        if ((i & 2) != 0) {
            str2 = calendarItemModel.title;
        }
        if ((i & 4) != 0) {
            j = calendarItemModel.startTime;
        }
        if ((i & 8) != 0) {
            j2 = calendarItemModel.endTime;
        }
        if ((i & 16) != 0) {
            str3 = calendarItemModel.calendar;
        }
        if ((i & 32) != 0) {
            z = calendarItemModel.allDayEvent;
        }
        long j3 = j2;
        long j4 = j;
        return calendarItemModel.copy(str, str2, j4, j3, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCalendar() {
        return this.calendar;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAllDayEvent() {
        return this.allDayEvent;
    }

    @NotNull
    public final CalendarItemModel copy(@NotNull String id, @NotNull String title, long startTime, long endTime, @NotNull String calendar, boolean allDayEvent) {
        id.getClass();
        title.getClass();
        calendar.getClass();
        return new CalendarItemModel(id, title, startTime, endTime, calendar, allDayEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarItemModel)) {
            return false;
        }
        CalendarItemModel calendarItemModel = (CalendarItemModel) other;
        return Intrinsics.areEqual(this.id, calendarItemModel.id) && Intrinsics.areEqual(this.title, calendarItemModel.title) && this.startTime == calendarItemModel.startTime && this.endTime == calendarItemModel.endTime && Intrinsics.areEqual(this.calendar, calendarItemModel.calendar) && this.allDayEvent == calendarItemModel.allDayEvent;
    }

    public final boolean getAllDayEvent() {
        return this.allDayEvent;
    }

    @NotNull
    public final String getCalendar() {
        return this.calendar;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(BitVector$$ExternalSyntheticOutline0.m(this.endTime, BitVector$$ExternalSyntheticOutline0.m(this.startTime, ArcMode$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31), 31), 31, this.calendar);
        boolean z = this.allDayEvent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return m + i;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        long j = this.startTime;
        long j2 = this.endTime;
        String str3 = this.calendar;
        boolean z = this.allDayEvent;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CalendarItemModel(id=", str, ", title=", str2, ", startTime=");
        m.append(j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", endTime=", ", calendar=", m);
        m.append(str3);
        m.append(", allDayEvent=");
        m.append(z);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public CalendarItemModel(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, boolean z) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.startTime = j;
        this.endTime = j2;
        this.calendar = str3;
        this.allDayEvent = z;
    }
}
