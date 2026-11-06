package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes7.dex */
public abstract class CreationContext {
    private static final String DEFAULT_BACKEND_NAME = "cct";

    public static CreationContext create(Context context, Clock clock, Clock clock2) {
        return new AutoValue_CreationContext(context, clock, clock2, DEFAULT_BACKEND_NAME);
    }

    public abstract Context getApplicationContext();

    @NonNull
    public abstract String getBackendName();

    public abstract Clock getMonotonicClock();

    public abstract Clock getWallClock();

    public static CreationContext create(Context context, Clock clock, Clock clock2, String str) {
        return new AutoValue_CreationContext(context, clock, clock2, str);
    }
}
