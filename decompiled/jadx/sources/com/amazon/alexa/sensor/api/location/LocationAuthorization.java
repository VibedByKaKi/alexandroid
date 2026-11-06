package com.amazon.alexa.sensor.api.location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LocationAuthorization {
    public final boolean isFeatureAuthorized;
    public final boolean isLocationAccessAuthorized;
    public final boolean isPreciseLocationAuthorized;

    public LocationAuthorization(boolean z, boolean z2, boolean z3) {
        this.isFeatureAuthorized = z;
        this.isLocationAccessAuthorized = z2;
        this.isPreciseLocationAuthorized = z3;
    }
}
