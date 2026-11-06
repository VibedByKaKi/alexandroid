package com.amazon.alexa.voice.ui.onedesign.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaUiEventWithCount implements TtaEvent {
    private final int count;
    private final TtaUiEvent ttaUiEvent;

    public TtaUiEventWithCount(@NonNull TtaUiEvent ttaUiEvent, int i) {
        this.ttaUiEvent = ttaUiEvent;
        this.count = i;
    }

    public int getCount() {
        return this.count;
    }

    public TtaUiEvent getEvent() {
        return this.ttaUiEvent;
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    @NonNull
    public String getName() {
        return this.ttaUiEvent.getName();
    }
}
