package com.amazon.alexa.location.phase3.sensor.alexageofence;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.location.models.ALSGeofence;
import com.amazon.alexa.location.phase3.LocationSignal;
import com.amazon.alexa.location.phase3.sensor.nativelocation.NativeLocationInput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class AlexaGeofenceState extends LocationSignal {
    public static final String INPUT_ID_INITIAL = "INITIAL_STATE";
    public static final String STATE_IN_FENCE = "STATE_IN_FENCE";
    public static final String STATE_OUT_OF_FENCE = "STATE_OUT_OF_FENCE";
    public static final String STATE_UNDETERMINED = "STATE_UNDETERMINED";
    private static final String TYPE = "ESTIMATED_STATE_ALEXA_GEOFENCE";
    public final int estimatedScore;
    public final String geofenceId;
    public final String locationInputId;
    public final String state;

    public AlexaGeofenceState(@NonNull ALSGeofence aLSGeofence, @NonNull NativeLocationInput nativeLocationInput) {
        super(TYPE, -1, nativeLocationInput.timestamp);
        this.geofenceId = aLSGeofence.getId();
        int estimateScore = estimateScore(aLSGeofence, nativeLocationInput);
        this.estimatedScore = estimateScore;
        this.state = determineState(estimateScore);
        this.locationInputId = nativeLocationInput.id;
    }

    @VisibleForTesting
    public static String determineState(int i) {
        return i == 0 ? STATE_OUT_OF_FENCE : i == 100 ? STATE_IN_FENCE : STATE_UNDETERMINED;
    }

    @VisibleForTesting
    public static float distanceBetweenCenters(@NonNull ALSGeofence aLSGeofence, @NonNull NativeLocationInput nativeLocationInput) {
        Location location = new Location("CurrentLocation");
        location.setLatitude(nativeLocationInput.latitude);
        location.setLongitude(nativeLocationInput.longitude);
        Location location2 = new Location("Geofence");
        location2.setLatitude(aLSGeofence.getCircularRegion().getLatitudeInDegrees());
        location2.setLongitude(aLSGeofence.getCircularRegion().getLongitudeInDegrees());
        return location.distanceTo(location2);
    }

    @VisibleForTesting
    public static int estimateScore(@NonNull ALSGeofence aLSGeofence, @NonNull NativeLocationInput nativeLocationInput) {
        return ((double) distanceBetweenCenters(aLSGeofence, nativeLocationInput)) < aLSGeofence.getCircularRegion().getRadiusInMeters() ? 100 : 0;
    }

    @VisibleForTesting
    public AlexaGeofenceState(@NonNull ALSGeofence aLSGeofence, long j) {
        super(TYPE, -1, j);
        this.geofenceId = aLSGeofence.getId();
        this.estimatedScore = -1;
        this.state = STATE_UNDETERMINED;
        this.locationInputId = INPUT_ID_INITIAL;
    }
}
