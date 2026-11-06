package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/BeginSessionEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "batteryLevel", "", "sensorMetricEventFrequency", "", "originalRouteDistance", "<init>", "(DII)V", "getBatteryLevel", "()D", "getSensorMetricEventFrequency", "()I", "getOriginalRouteDistance", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BeginSessionEvent extends SessionMetric {

    @SerializedName("battery_level")
    private final double batteryLevel;

    @SerializedName("original_route_distance")
    private final int originalRouteDistance;

    @SerializedName("sensor_event_frequency")
    private final int sensorMetricEventFrequency;

    public /* synthetic */ BeginSessionEvent(double d, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0d : d, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final int getOriginalRouteDistance() {
        return this.originalRouteDistance;
    }

    public final int getSensorMetricEventFrequency() {
        return this.sensorMetricEventFrequency;
    }

    public BeginSessionEvent() {
        this(0.0d, 0, 0, 7, null);
    }

    public BeginSessionEvent(double d, int i, int i2) {
        super("BEGIN_SESSION");
        this.batteryLevel = d;
        this.sensorMetricEventFrequency = i;
        this.originalRouteDistance = i2;
    }
}
