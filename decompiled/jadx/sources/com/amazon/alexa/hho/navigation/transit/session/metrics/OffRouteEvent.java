package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.amazon.alexa.hho.navigation.transit.model.NavigationAction;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\t\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/OffRouteEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "action", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;", "nextAction", "perpendicularDistance", "", "eventType", "", "isSilentReroute", "", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;DLjava/lang/String;Ljava/lang/Boolean;)V", "getPerpendicularDistance", "()D", "getEventType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "getNextAction", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OffRouteEvent extends SessionMetric {

    @SerializedName("action")
    @NotNull
    private final String action;

    @SerializedName("event_type")
    @NotNull
    private final String eventType;

    @SerializedName("is_silent_reroute")
    @Nullable
    private final Boolean isSilentReroute;

    @SerializedName("next_action")
    @NotNull
    private final String nextAction;

    @SerializedName("perpendicular_distance")
    private final double perpendicularDistance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffRouteEvent(@NotNull NavigationAction navigationAction, @NotNull NavigationAction navigationAction2, double d, @NotNull String str, @Nullable Boolean bool) {
        super(SessionMetricType.OFF_ROUTE);
        navigationAction.getClass();
        navigationAction2.getClass();
        str.getClass();
        this.perpendicularDistance = d;
        this.eventType = str;
        this.isSilentReroute = bool;
        this.action = navigationAction.name();
        this.nextAction = navigationAction2.name();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getNextAction() {
        return this.nextAction;
    }

    public final double getPerpendicularDistance() {
        return this.perpendicularDistance;
    }

    @Nullable
    /* renamed from: isSilentReroute, reason: from getter */
    public final Boolean getIsSilentReroute() {
        return this.isSilentReroute;
    }

    public /* synthetic */ OffRouteEvent(NavigationAction navigationAction, NavigationAction navigationAction2, double d, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationAction, navigationAction2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : bool);
    }
}
