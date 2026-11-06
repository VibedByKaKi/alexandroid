package com.mapbox.maps.geofencing;

import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "", "getUserConsent", "", "setUserConsent", "", "isConsentGiven", "callback", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "shouldShowConsent", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface MapGeofencingConsent {
    boolean getUserConsent();

    void setUserConsent(boolean isConsentGiven, @NotNull GeofencingUtilsUserConsentResponseCallback callback);

    boolean shouldShowConsent();
}
