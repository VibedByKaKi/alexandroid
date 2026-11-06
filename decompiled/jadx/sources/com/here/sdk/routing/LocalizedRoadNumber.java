package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.CardinalDirection;
import com.here.sdk.core.LocalizedText;
import com.here.sdk.core.RouteType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocalizedRoadNumber {

    @Nullable
    public CardinalDirection direction = null;

    @NonNull
    public LocalizedText localizedNumber;

    @NonNull
    public RouteType routeType;

    public LocalizedRoadNumber(@NonNull LocalizedText localizedText, @NonNull RouteType routeType) {
        this.localizedNumber = localizedText;
        this.routeType = routeType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalizedRoadNumber)) {
            return false;
        }
        LocalizedRoadNumber localizedRoadNumber = (LocalizedRoadNumber) obj;
        return Objects.equals(this.localizedNumber, localizedRoadNumber.localizedNumber) && Objects.equals(this.direction, localizedRoadNumber.direction) && Objects.equals(this.routeType, localizedRoadNumber.routeType);
    }

    @NonNull
    public native String getTextWithDirection();

    public int hashCode() {
        LocalizedText localizedText = this.localizedNumber;
        int hashCode = (JfifUtil.MARKER_EOI + (localizedText != null ? localizedText.hashCode() : 0)) * 31;
        CardinalDirection cardinalDirection = this.direction;
        int hashCode2 = (hashCode + (cardinalDirection != null ? cardinalDirection.hashCode() : 0)) * 31;
        RouteType routeType = this.routeType;
        return hashCode2 + (routeType != null ? routeType.hashCode() : 0);
    }
}
