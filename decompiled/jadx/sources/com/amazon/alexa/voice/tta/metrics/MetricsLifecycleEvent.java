package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum MetricsLifecycleEvent implements TtaEvent {
    EVENT_SERVICE_START,
    EVENT_SERVICE_STOP;

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    @NonNull
    public String getName() {
        return name();
    }
}
