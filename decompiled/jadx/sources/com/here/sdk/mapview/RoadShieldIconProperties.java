package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.sdk.core.RouteType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RoadShieldIconProperties {

    @NonNull
    public String countryCode;

    @NonNull
    public String routeNumberName;

    @NonNull
    public RouteType routeType;

    @NonNull
    public String shieldText;

    @NonNull
    public String stateCode;

    public RoadShieldIconProperties(@NonNull RouteType routeType, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.routeType = routeType;
        this.countryCode = str;
        this.stateCode = str2;
        this.routeNumberName = str3;
        this.shieldText = str4;
    }
}
