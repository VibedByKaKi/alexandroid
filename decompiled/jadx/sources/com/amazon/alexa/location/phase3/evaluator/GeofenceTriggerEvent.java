package com.amazon.alexa.location.phase3.evaluator;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public abstract class GeofenceTriggerEvent extends LocationEvent {
    public static final int DWELL = 2;
    public static final int ENTER = 0;
    public static final int EXIT = 1;
    public static final int NONE = -1;

    @NonNull
    public final String geofenceId;
    public final int transitionType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionType {
    }

    public GeofenceTriggerEvent(String str, long j, int i, @NonNull String str2) {
        super(str, 2, j);
        this.transitionType = i;
        this.geofenceId = str2;
    }
}
