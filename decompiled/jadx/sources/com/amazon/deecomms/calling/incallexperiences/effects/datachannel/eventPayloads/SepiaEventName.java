package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.NonNull;
import com.google.common.base.Enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SepiaEventName {
    APPLY_EFFECT("apply_effect"),
    REMOVE_EFFECT("remove_effect"),
    ACK_STATUS("ack_status"),
    CURRENT_STATUS("current_status"),
    BEGIN_EFFECTS_SESSION("begin_effects_session"),
    SCREEN_TOUCH("screen_touch"),
    SEPIA_METRICS("sepia_metrics"),
    TAP_EFFECT_BUTTON("effect_button_tap"),
    TAP_REACTION_BUTTON("reaction_button_tap"),
    TAP_CAPTION_BUTTON("caption_button_tap"),
    REMOVE_CAPTION("remove_caption");

    private String value;

    SepiaEventName(String str) {
        this.value = str;
    }

    public static SepiaEventName lookupByEventName(String str) {
        return (SepiaEventName) Enums.getIfPresent(SepiaEventName.class, str.toUpperCase()).orNull();
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.value;
    }
}
