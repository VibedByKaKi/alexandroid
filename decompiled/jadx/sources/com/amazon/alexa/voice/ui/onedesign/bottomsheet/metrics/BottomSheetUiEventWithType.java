package com.amazon.alexa.voice.ui.onedesign.bottomsheet.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetUiEventWithType implements TtaEvent {
    private final BottomSheetUiEvent event;
    private final String type;

    public BottomSheetUiEventWithType(@NonNull BottomSheetUiEvent bottomSheetUiEvent, @NonNull String str) {
        this.event = bottomSheetUiEvent;
        this.type = str;
    }

    public BottomSheetUiEvent getEvent() {
        return this.event;
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    @NonNull
    public String getName() {
        return this.event.getName() + ":" + this.type;
    }

    public String getType() {
        return this.type;
    }

    @NonNull
    public String toString() {
        return this.event.getName() + ":" + this.type;
    }
}
