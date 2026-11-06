package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.here.time.Duration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RouteStop {
    public int locationIndex;

    @NonNull
    public Duration stopDuration = Duration.ofSeconds(0);

    public RouteStop(int i) {
        this.locationIndex = i;
    }
}
