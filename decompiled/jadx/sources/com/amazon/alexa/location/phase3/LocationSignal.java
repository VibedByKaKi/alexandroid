package com.amazon.alexa.location.phase3;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocationSignal {
    public static final int SENSITIVITY_LOCAL_RESTRICTED = 2;
    public static final int SENSITIVITY_NOT_RESTRICTED = 0;
    public static final int SENSITIVITY_REMOTE_RESTRICTED = 1;
    public static final int SENSITIVITY_TO_BE_DETERMINED = -1;
    public final int dataSensitivity;
    public final String id = UUID.randomUUID().toString();
    public final long timestamp;
    public final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Sensitivity {
    }

    public LocationSignal(@NonNull String str, int i, long j) {
        this.type = str;
        this.dataSensitivity = i;
        this.timestamp = j;
    }
}
