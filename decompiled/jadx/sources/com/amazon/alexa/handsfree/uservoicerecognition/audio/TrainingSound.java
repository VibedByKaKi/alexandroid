package com.amazon.alexa.handsfree.uservoicerecognition.audio;

import androidx.annotation.RawRes;
import com.amazon.alexa.handsfree.uservoicerecognition.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum TrainingSound {
    NEW_UTTERANCE(R.raw.avs_med_ui_wakesound_touch),
    UTTERANCE_COMPLETED(R.raw.avs_med_ui_endpointing_touch_500ms),
    UTTERANCE_ERROR(R.raw.med_ui_error_generic_2);

    private final int mResId;

    TrainingSound(@RawRes int i) {
        this.mResId = i;
    }

    @RawRes
    public int getResourceId() {
        return this.mResId;
    }
}
