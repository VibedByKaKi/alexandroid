package com.amazon.alexa.voice.tta.typing;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.tta.metrics.EventTime;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class IngressParameters {
    public static final String UNKNOWN_REFERRER = "UNKNOWN";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Provider {
        @NonNull
        IngressParameters getIngressParameters();

        void update(@Nullable Intent intent);
    }

    @NonNull
    public static IngressParameters create(@NonNull String str, @NonNull EventTime eventTime) {
        return new AutoValue_IngressParameters(str, eventTime);
    }

    @NonNull
    public abstract String getReferrer();

    @NonNull
    public abstract EventTime getStartTime();
}
