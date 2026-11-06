package com.amazon.alexa.location;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class AlexaLocationPermissionService implements LocationPermissionService {
    private static final String ACCESS_BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private Context context;

    public AlexaLocationPermissionService(Context context) {
        this.context = context;
    }

    @Override // com.amazon.alexa.location.LocationPermissionService
    public boolean hasAccessBackgroundLocationPermission() {
        return ContextCompat.checkSelfPermission(this.context, ACCESS_BACKGROUND_LOCATION_PERMISSION) == 0;
    }

    @Override // com.amazon.alexa.location.LocationPermissionService
    public boolean hasAccessFineLocationPermission() {
        return ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // com.amazon.alexa.location.LocationPermissionService
    public boolean hasFullLocationPermission() {
        return hasAccessFineLocationPermission() && hasAccessBackgroundLocationPermission();
    }
}
