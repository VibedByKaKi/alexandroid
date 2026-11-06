package com.amazon.alexa.stayorganized.data.models;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/models/CalendarTopModel;", "", "deepLinkBaseUri", "", "addCalendarRoute", "calendarListRoute", "activeItemCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getActiveItemCount", "()I", "getAddCalendarRoute", "()Ljava/lang/String;", "getCalendarListRoute", "getDeepLinkBaseUri", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CalendarTopModel {
    private final int activeItemCount;

    @NotNull
    private final String addCalendarRoute;

    @NotNull
    private final String calendarListRoute;

    @NotNull
    private final String deepLinkBaseUri;

    public CalendarTopModel(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.deepLinkBaseUri = str;
        this.addCalendarRoute = str2;
        this.calendarListRoute = str3;
        this.activeItemCount = i;
    }

    public static /* synthetic */ CalendarTopModel copy$default(CalendarTopModel calendarTopModel, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = calendarTopModel.deepLinkBaseUri;
        }
        if ((i2 & 2) != 0) {
            str2 = calendarTopModel.addCalendarRoute;
        }
        if ((i2 & 4) != 0) {
            str3 = calendarTopModel.calendarListRoute;
        }
        if ((i2 & 8) != 0) {
            i = calendarTopModel.activeItemCount;
        }
        return calendarTopModel.copy(str, str2, str3, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeepLinkBaseUri() {
        return this.deepLinkBaseUri;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAddCalendarRoute() {
        return this.addCalendarRoute;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCalendarListRoute() {
        return this.calendarListRoute;
    }

    /* renamed from: component4, reason: from getter */
    public final int getActiveItemCount() {
        return this.activeItemCount;
    }

    @NotNull
    public final CalendarTopModel copy(@NotNull String deepLinkBaseUri, @NotNull String addCalendarRoute, @NotNull String calendarListRoute, int activeItemCount) {
        deepLinkBaseUri.getClass();
        addCalendarRoute.getClass();
        calendarListRoute.getClass();
        return new CalendarTopModel(deepLinkBaseUri, addCalendarRoute, calendarListRoute, activeItemCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarTopModel)) {
            return false;
        }
        CalendarTopModel calendarTopModel = (CalendarTopModel) other;
        return Intrinsics.areEqual(this.deepLinkBaseUri, calendarTopModel.deepLinkBaseUri) && Intrinsics.areEqual(this.addCalendarRoute, calendarTopModel.addCalendarRoute) && Intrinsics.areEqual(this.calendarListRoute, calendarTopModel.calendarListRoute) && this.activeItemCount == calendarTopModel.activeItemCount;
    }

    public final int getActiveItemCount() {
        return this.activeItemCount;
    }

    @NotNull
    public final String getAddCalendarRoute() {
        return this.addCalendarRoute;
    }

    @NotNull
    public final String getCalendarListRoute() {
        return this.calendarListRoute;
    }

    @NotNull
    public final String getDeepLinkBaseUri() {
        return this.deepLinkBaseUri;
    }

    public int hashCode() {
        return Integer.hashCode(this.activeItemCount) + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.deepLinkBaseUri.hashCode() * 31, 31, this.addCalendarRoute), 31, this.calendarListRoute);
    }

    @NotNull
    public String toString() {
        String str = this.deepLinkBaseUri;
        String str2 = this.addCalendarRoute;
        String str3 = this.calendarListRoute;
        int i = this.activeItemCount;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CalendarTopModel(deepLinkBaseUri=", str, ", addCalendarRoute=", str2, ", calendarListRoute=");
        m.append(str3);
        m.append(", activeItemCount=");
        m.append(i);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
