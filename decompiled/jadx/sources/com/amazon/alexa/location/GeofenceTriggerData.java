package com.amazon.alexa.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Data;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GeofenceTriggerData {
    private static final String KEY_DETECTED_TIME = "detected_time";
    private static final String KEY_ERROR_CODE = "error_code";
    private static final String KEY_EVENT_NULL = "event_null";
    private static final String KEY_FENCE_IDS = "fence_ids";
    private static final String KEY_HAS_ERROR = "has_error";
    private static final String KEY_HAS_LOCATION_TIME = "has_location_time";
    private static final String KEY_LOCATION_TIME = "location_time";
    private static final String KEY_TRANSITION = "transition";
    private final long detectedTime;
    private final int errorCode;
    private final boolean eventNull;
    private final String[] fenceIds;
    private final int geofenceTransition;
    private final boolean hasError;
    private final boolean hasLocationTime;
    private final long locationTime;

    private GeofenceTriggerData(Builder builder) {
        this.eventNull = builder.eventNull;
        this.hasError = builder.hasError;
        this.errorCode = builder.errorCode;
        this.geofenceTransition = builder.geofenceTransition;
        this.fenceIds = (String[]) builder.fenceIds.clone();
        this.locationTime = builder.locationTime;
        this.hasLocationTime = builder.hasLocationTime;
        this.detectedTime = builder.detectedTime;
    }

    @NonNull
    public static GeofenceTriggerData fromData(@NonNull Data data) {
        String[] stringArray = data.getStringArray(KEY_FENCE_IDS);
        Builder builder = new Builder(0);
        builder.eventNull = data.getBoolean(KEY_EVENT_NULL, false);
        builder.hasError = data.getBoolean(KEY_HAS_ERROR, false);
        builder.errorCode = data.getInt(KEY_ERROR_CODE, 0);
        builder.geofenceTransition = data.getInt(KEY_TRANSITION, 0);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        builder.fenceIds = stringArray;
        builder.locationTime = data.getLong(KEY_LOCATION_TIME, 0L);
        builder.hasLocationTime = data.getBoolean(KEY_HAS_LOCATION_TIME, false);
        builder.detectedTime = data.getLong(KEY_DETECTED_TIME, 0L);
        return new GeofenceTriggerData(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static GeofenceTriggerData fromGeofencingEvent(@Nullable GeofencingEvent geofencingEvent, long j) {
        Builder builder = new Builder(0 == true ? 1 : 0);
        builder.detectedTime = j;
        if (geofencingEvent == null) {
            builder.eventNull = true;
            return new GeofenceTriggerData(builder);
        }
        if (geofencingEvent.hasError()) {
            builder.hasError = true;
            builder.errorCode = geofencingEvent.getErrorCode();
            return new GeofenceTriggerData(builder);
        }
        ArrayList arrayList = new ArrayList();
        if (geofencingEvent.getTriggeringGeofences() != null) {
            Iterator<Geofence> it2 = geofencingEvent.getTriggeringGeofences().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getRequestId());
            }
        }
        builder.geofenceTransition = geofencingEvent.getGeofenceTransition();
        builder.fenceIds = (String[]) arrayList.toArray(new String[0]);
        builder.hasLocationTime = geofencingEvent.getTriggeringLocation() != null;
        builder.locationTime = builder.hasLocationTime ? geofencingEvent.getTriggeringLocation().getTime() : 0L;
        return new GeofenceTriggerData(builder);
    }

    public long getDetectedTime() {
        return this.detectedTime;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @NonNull
    public String[] getFenceIds() {
        return (String[]) this.fenceIds.clone();
    }

    public int getGeofenceTransition() {
        return this.geofenceTransition;
    }

    public long getLocationTime() {
        return this.locationTime;
    }

    public boolean hasError() {
        return this.hasError;
    }

    public boolean hasLocationTime() {
        return this.hasLocationTime;
    }

    public boolean isEventNull() {
        return this.eventNull;
    }

    @NonNull
    public Data toData() {
        return new Data.Builder().putBoolean(KEY_EVENT_NULL, this.eventNull).putBoolean(KEY_HAS_ERROR, this.hasError).putInt(KEY_ERROR_CODE, this.errorCode).putInt(KEY_TRANSITION, this.geofenceTransition).putStringArray(KEY_FENCE_IDS, this.fenceIds).putLong(KEY_LOCATION_TIME, this.locationTime).putBoolean(KEY_HAS_LOCATION_TIME, this.hasLocationTime).putLong(KEY_DETECTED_TIME, this.detectedTime).build();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private long detectedTime;
        private int errorCode;
        private boolean eventNull;
        private String[] fenceIds;
        private int geofenceTransition;
        private boolean hasError;
        private boolean hasLocationTime;
        private long locationTime;

        private Builder() {
            this.fenceIds = new String[0];
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }
}
