package com.amazon.alexa.location.networking.als.networkModels;

import com.amazon.alexa.location.networking.als.models.ALSCircularRegion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CreateGeofenceRequestBody {
    private ALSCircularRegion circularRegion;

    public CreateGeofenceRequestBody(double d, double d2, double d3) {
        this.circularRegion = new ALSCircularRegion(d, d2, d3);
    }

    public ALSCircularRegion getCircularRegion() {
        return this.circularRegion;
    }
}
