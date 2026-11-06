package com.amazon.alexa.client.alexaservice.audio.core;

import androidx.annotation.RawRes;
import com.amazon.alexa.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum SoundName {
    WAKESOUND(R.raw.updated_ui_wakesound),
    WAKESOUND_TOUCH(R.raw.updated_ui_wakesound_touch),
    ENDPOINTING(R.raw.updated_ui_endpointing),
    ENDPOINTING_TOUCH(R.raw.updated_ui_endpointing_touch),
    MUTE_ON(R.raw.avs_med_state_privacy_mode_on),
    MUTE_OFF(R.raw.avs_med_state_privacy_mode_off);

    private final int resId;

    SoundName(@RawRes int i) {
        this.resId = i;
    }

    @RawRes
    public int getResourceId() {
        return this.resId;
    }
}
