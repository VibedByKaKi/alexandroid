package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SensorMetricEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", TransferTable.COLUMN_SPEED, "", "impliedSpeed", "horizontalAccuracy", "rejected", "", "<init>", "(DDDLjava/lang/Boolean;)V", "getSpeed", "()D", "getImpliedSpeed", "getHorizontalAccuracy", "getRejected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SensorMetricEvent extends SessionMetric {

    @SerializedName("horizontal_accuracy")
    private final double horizontalAccuracy;

    @SerializedName("implied_speed")
    private final double impliedSpeed;

    @SerializedName("rejected")
    @Nullable
    private final Boolean rejected;

    @SerializedName(TransferTable.COLUMN_SPEED)
    private final double speed;

    public /* synthetic */ SensorMetricEvent(double d, double d2, double d3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? null : bool);
    }

    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final double getImpliedSpeed() {
        return this.impliedSpeed;
    }

    @Nullable
    public final Boolean getRejected() {
        return this.rejected;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public SensorMetricEvent() {
        this(0.0d, 0.0d, 0.0d, null, 15, null);
    }

    public SensorMetricEvent(double d, double d2, double d3, @Nullable Boolean bool) {
        super(SessionMetricType.SENSOR_METRIC);
        this.speed = d;
        this.impliedSpeed = d2;
        this.horizontalAccuracy = d3;
        this.rejected = bool;
    }
}
