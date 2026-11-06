package com.amazon.alexa.voice.tta.metrics;

import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum TtaInternalEvent implements TtaEvent {
    SCREEN_LAUNCHED,
    ACTIVITY_RESUMED,
    ACTIVITY_PAUSED;

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    public String getName() {
        return name();
    }
}
