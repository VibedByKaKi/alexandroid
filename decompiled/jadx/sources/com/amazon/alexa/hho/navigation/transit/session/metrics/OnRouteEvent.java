package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/OnRouteEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "progressionType", "", "perpendicularDistance", "", "<init>", "(Ljava/lang/String;D)V", "getProgressionType", "()Ljava/lang/String;", "getPerpendicularDistance", "()D", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnRouteEvent extends SessionMetric {

    @SerializedName("perpendicular_distance")
    private final double perpendicularDistance;

    @SerializedName("progression_type")
    @NotNull
    private final String progressionType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnRouteEvent(@NotNull String str, double d) {
        super(SessionMetricType.ON_ROUTE);
        str.getClass();
        this.progressionType = str;
        this.perpendicularDistance = d;
    }

    public final double getPerpendicularDistance() {
        return this.perpendicularDistance;
    }

    @NotNull
    public final String getProgressionType() {
        return this.progressionType;
    }

    public /* synthetic */ OnRouteEvent(String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0.0d : d);
    }
}
