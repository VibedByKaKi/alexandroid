package com.amazon.alexa.voice.ui.onedesign.bottomsheet.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetUiEventWithCount implements TtaEvent {
    private final BottomSheetUiEvent bottomSheetUiEvent;
    private final int count;

    public BottomSheetUiEventWithCount(BottomSheetUiEvent bottomSheetUiEvent, int i) {
        this.bottomSheetUiEvent = bottomSheetUiEvent;
        this.count = i;
    }

    public BottomSheetUiEvent getBottomSheetUiEvent() {
        return this.bottomSheetUiEvent;
    }

    public int getCount() {
        return this.count;
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    @NonNull
    public String getName() {
        return this.bottomSheetUiEvent.getName();
    }
}
