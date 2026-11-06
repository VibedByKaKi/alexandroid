package com.here.sdk.traffic;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes8.dex */
public interface TrafficIncidentLookupCallback {
    void onTrafficIncidentFetched(@Nullable TrafficQueryError trafficQueryError, @Nullable TrafficIncident trafficIncident);
}
