package com.amazon.alexa.location.phase3.sensor.alexageofence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.location.phase3.evaluator.GeofenceTriggerEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AlexaGeofenceTriggerEvent extends GeofenceTriggerEvent {
    private static final long DWELL_THRESHOLD_IN_MS = 7200000;
    static final String FENCE_ID_INVALID = "INVALID_GEOFENCE";
    private static final String TYPE = "ESTIMATED_EVENT_ALEXA_GEOFENCE";

    public AlexaGeofenceTriggerEvent(long j, int i, @NonNull String str) {
        super(TYPE, j, i, str);
    }

    @Nullable
    public static AlexaGeofenceTriggerEvent fromStates(@NonNull AlexaGeofenceState alexaGeofenceState, @NonNull AlexaGeofenceState alexaGeofenceState2) {
        int i;
        if (AlexaGeofenceState.STATE_UNDETERMINED.equals(alexaGeofenceState.state) || AlexaGeofenceState.STATE_UNDETERMINED.equals(alexaGeofenceState2.state)) {
            return null;
        }
        if (alexaGeofenceState.timestamp <= alexaGeofenceState2.timestamp) {
            alexaGeofenceState2 = alexaGeofenceState;
            alexaGeofenceState = alexaGeofenceState2;
        }
        long j = alexaGeofenceState.timestamp;
        String str = alexaGeofenceState2.geofenceId;
        if (!str.equals(alexaGeofenceState.geofenceId)) {
            return null;
        }
        boolean equals = alexaGeofenceState2.state.equals(alexaGeofenceState.state);
        String str2 = alexaGeofenceState.state;
        if (equals) {
            i = -1;
            if (AlexaGeofenceState.STATE_IN_FENCE.equals(str2) && j - alexaGeofenceState2.timestamp >= 7200000) {
                i = 2;
            }
        } else {
            i = !AlexaGeofenceState.STATE_IN_FENCE.equals(str2) ? 1 : 0;
        }
        return new AlexaGeofenceTriggerEvent(j, i, str);
    }
}
