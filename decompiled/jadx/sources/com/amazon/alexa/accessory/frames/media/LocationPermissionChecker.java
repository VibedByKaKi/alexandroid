package com.amazon.alexa.accessory.frames.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/LocationPermissionChecker;", "", "<init>", "()V", Constants.LOG_TAG, "", "hasRequiredLocationPermissions", "", "context", "Landroid/content/Context;", "hasNearbyWifiDevicesPermission", "isLocationEnabled", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocationPermissionChecker {

    @NotNull
    public static final LocationPermissionChecker INSTANCE = new LocationPermissionChecker();

    @NotNull
    private static final String TAG = "LocationPermissionChecker";

    private LocationPermissionChecker() {
    }

    public final boolean hasNearbyWifiDevicesPermission(@NotNull Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(context, "android.permission.NEARBY_WIFI_DEVICES") == 0) {
            return true;
        }
        Log.e(TAG, "NEARBY_WIFI_DEVICES permission not granted. WiFi P2P on Android 13+ requires this permission.");
        return false;
    }

    public final boolean hasRequiredLocationPermissions(@NotNull Context context) {
        context.getClass();
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.e(TAG, "ACCESS_FINE_LOCATION permission not granted");
            return false;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return true;
        }
        Log.e(TAG, "ACCESS_BACKGROUND_LOCATION permission not granted. Background operations require 'Allow all the time' location permission.");
        return false;
    }

    public final boolean isLocationEnabled(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            Log.e(TAG, "LocationManager not available");
            return false;
        }
        boolean isLocationEnabled = locationManager.isLocationEnabled();
        if (!isLocationEnabled) {
            Log.e(TAG, "Location services are disabled.");
        }
        return isLocationEnabled;
    }
}
