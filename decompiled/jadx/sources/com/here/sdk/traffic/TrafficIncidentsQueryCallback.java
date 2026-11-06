package com.here.sdk.traffic;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes8.dex */
public interface TrafficIncidentsQueryCallback {
    void onTrafficIncidentsFetched(@Nullable TrafficQueryError trafficQueryError, @Nullable List<TrafficIncident> list);
}
