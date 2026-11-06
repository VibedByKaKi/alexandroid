package com.amazon.alexa.sensor.api.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.sensor.api.location.ErrorCodes;
import com.amazon.alexa.sensor.api.metrics.events.CounterEvent;
import com.amazon.alexa.sensor.api.metrics.events.TimerEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface SensorAccessMetricsRecorder {
    void recordCounter(CounterEvent counterEvent);

    void recordEvent(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void recordOccurrence(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z);

    void recordTimer(TimerEvent timerEvent);

    default void recordTypedOutcome(@NonNull String str, @NonNull String str2, int i) {
        recordEvent(str, str2, ErrorCodes.schemaString(i));
    }
}
