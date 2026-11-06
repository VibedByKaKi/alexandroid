package com.amazon.alexa.sensor.api.location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LocationConfiguration {
    public final boolean isCoarseLocationOn;
    public final boolean isFineLocationOn;
    public final int locationAccuracy;

    public LocationConfiguration(boolean z, boolean z2, int i) {
        this.isCoarseLocationOn = z;
        this.isFineLocationOn = z2;
        this.locationAccuracy = i;
    }
}
