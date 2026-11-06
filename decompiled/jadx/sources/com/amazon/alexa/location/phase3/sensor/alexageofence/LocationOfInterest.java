package com.amazon.alexa.location.phase3.sensor.alexageofence;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.location.models.ALSGeofence;
import com.amazon.alexa.location.phase3.LocationSignal;
import com.amazon.alexa.location.phase3.sensor.nativelocation.NativeLocationInput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class LocationOfInterest extends LocationSignal {
    private static final String KEY_FORMAT;
    private static final int PRECISION = 3;
    private static final double SCALE;

    @VisibleForTesting
    static final String SIGNAL_ID_PAST_SIGNALS = "past_signals";
    private static final String TYPE = "ESTIMATED_LOCATION_OF_INTEREST";

    @VisibleForTesting
    final Set<String> associatedFences;
    public final double centerLatitude;
    public final double centerLongitude;
    public final String key;

    @VisibleForTesting
    final Map<String, Long> supportingSignals;

    static {
        Locale locale = Locale.US;
        KEY_FORMAT = "locationKey_%.3f%c_%.3f%c";
        SCALE = Math.pow(10.0d, 3.0d);
    }

    private LocationOfInterest(double d, double d2, long j) {
        super(TYPE, 1, j);
        this.key = generateKey(d, d2);
        this.centerLatitude = d;
        this.centerLongitude = d2;
        this.associatedFences = new HashSet();
        HashMap hashMap = new HashMap();
        this.supportingSignals = hashMap;
        hashMap.put(SIGNAL_ID_PAST_SIGNALS, 0L);
    }

    public static LocationOfInterest fromLocationInput(@NonNull NativeLocationInput nativeLocationInput) {
        return new LocationOfInterest(round(nativeLocationInput.latitude), round(nativeLocationInput.longitude), nativeLocationInput.timestamp);
    }

    @VisibleForTesting
    public static String generateKey(double d, double d2) {
        return String.format(Locale.US, KEY_FORMAT, Double.valueOf(Math.abs(d)), Character.valueOf(d >= 0.0d ? 'N' : 'S'), Double.valueOf(Math.abs(d2)), Character.valueOf(d2 >= 0.0d ? 'E' : 'W'));
    }

    private static double round(double d) {
        return Math.round(d * r0) / SCALE;
    }

    public boolean associateWithFence(@NonNull ALSGeofence aLSGeofence) {
        if (this.associatedFences.contains(aLSGeofence.getId())) {
            return true;
        }
        Location location = new Location("Location");
        location.setLatitude(this.centerLatitude);
        location.setLongitude(this.centerLongitude);
        Location location2 = new Location("Fence");
        location2.setLatitude(aLSGeofence.getCircularRegion().getLatitudeInDegrees());
        location2.setLongitude(aLSGeofence.getCircularRegion().getLongitudeInDegrees());
        boolean z = ((double) location.distanceTo(location2)) < aLSGeofence.getCircularRegion().getRadiusInMeters();
        if (z) {
            this.associatedFences.add(aLSGeofence.getId());
        }
        return z;
    }

    public long getScore() {
        Iterator<Long> it2 = this.supportingSignals.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().longValue();
        }
        return j;
    }

    public void removeSupportingSignal(@NonNull LocationSignal locationSignal, boolean z) {
        Long l = this.supportingSignals.get(locationSignal.id);
        if (z && l != null) {
            Map<String, Long> map = this.supportingSignals;
            map.put(SIGNAL_ID_PAST_SIGNALS, Long.valueOf(l.longValue() + map.get(SIGNAL_ID_PAST_SIGNALS).longValue()));
        }
        this.supportingSignals.remove(locationSignal.id);
    }

    public void updateSupportingSignal(@NonNull LocationSignal locationSignal, long j) {
        this.supportingSignals.put(locationSignal.id, Long.valueOf(j));
    }

    public static String generateKey(@NonNull NativeLocationInput nativeLocationInput) {
        return generateKey(round(nativeLocationInput.latitude), round(nativeLocationInput.longitude));
    }
}
