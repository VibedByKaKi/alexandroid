package com.amazon.mobile.heremapsexplore.Utilities;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.here.sdk.core.GeoCoordinates;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ReactResponses {
    private ReactResponses() {
    }

    public static WritableMap forCoordinate(GeoCoordinates geoCoordinates) {
        if (geoCoordinates == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Coordinates for callback response was null");
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putDouble("latitude", geoCoordinates.latitude);
        createMap.putDouble("longitude", geoCoordinates.longitude);
        createMap2.putMap("coordinate", createMap);
        return createMap2;
    }

    public static WritableMap forCoordinateAndRadius(GeoCoordinates geoCoordinates, double d) {
        WritableMap forCoordinate = forCoordinate(geoCoordinates);
        forCoordinate.putDouble("radius", d);
        return forCoordinate;
    }
}
