package com.amazon.alexa.sensor.api.location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface LocationSensorAccess {
    LocationAuthorization authorizationStatus(String str);

    LocationConfiguration currentConfiguration(String str);

    boolean isSubscribedForLocationUpdates(String str, int i);

    void locationForFeatureId(String str, LocationEventHandler locationEventHandler);

    Error subscribeForLocationUpdates(String str, LocationConfigurationRequest locationConfigurationRequest, LocationEventHandler locationEventHandler);

    void unsubscribeFromLocationUpdates(String str, int i);
}
