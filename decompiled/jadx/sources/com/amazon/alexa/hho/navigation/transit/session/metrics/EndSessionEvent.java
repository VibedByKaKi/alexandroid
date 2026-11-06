package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.amazon.alexa.hho.navigation.transit.event.SessionEndReason;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/EndSessionEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "reason", "Lcom/amazon/alexa/hho/navigation/transit/event/SessionEndReason;", "distanceTravelled", "", "batteryLevel", "actualRouteDistance", "", "distanceFromDestination", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/event/SessionEndReason;DDID)V", "getDistanceTravelled", "()D", "getBatteryLevel", "getActualRouteDistance", "()I", "getDistanceFromDestination", "", "getReason", "()Ljava/lang/String;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EndSessionEvent extends SessionMetric {

    @SerializedName("actual_route_distance")
    private final int actualRouteDistance;

    @SerializedName("battery_level")
    private final double batteryLevel;

    @SerializedName("distance_from_destination")
    private final double distanceFromDestination;

    @SerializedName("distance_travelled")
    private final double distanceTravelled;

    @SerializedName("reason")
    @NotNull
    private final String reason;

    public /* synthetic */ EndSessionEvent(SessionEndReason sessionEndReason, double d, double d2, int i, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionEndReason, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0.0d : d3);
    }

    public final int getActualRouteDistance() {
        return this.actualRouteDistance;
    }

    public final double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final double getDistanceFromDestination() {
        return this.distanceFromDestination;
    }

    public final double getDistanceTravelled() {
        return this.distanceTravelled;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndSessionEvent(@NotNull SessionEndReason sessionEndReason, double d, double d2, int i, double d3) {
        super("END_SESSION");
        sessionEndReason.getClass();
        this.distanceTravelled = d;
        this.batteryLevel = d2;
        this.actualRouteDistance = i;
        this.distanceFromDestination = d3;
        this.reason = sessionEndReason.name();
    }
}
