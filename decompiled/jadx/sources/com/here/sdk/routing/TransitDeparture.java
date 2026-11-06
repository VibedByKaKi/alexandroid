package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitDeparture {

    @Nullable
    public Integer delay;

    @NonNull
    public RoutePlace place;

    @Nullable
    public TransitDepartureStatus status;

    @Nullable
    public Date time;

    public TransitDeparture(@NonNull RoutePlace routePlace, @Nullable Date date, @Nullable Integer num, @Nullable TransitDepartureStatus transitDepartureStatus) {
        this.place = routePlace;
        this.time = date;
        this.delay = num;
        this.status = transitDepartureStatus;
    }
}
