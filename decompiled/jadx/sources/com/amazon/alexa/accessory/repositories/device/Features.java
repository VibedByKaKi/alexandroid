package com.amazon.alexa.accessory.repositories.device;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum Features {
    DISPLAY_CAPTION_FEATURE(15),
    DISPLAY_CARD_FEATURE(16),
    SUPPRESSING_SPEECH_RESPONSE_FEATURE(22);

    private final int featureId;

    Features(int i) {
        this.featureId = i;
    }

    public static Features fromValue(int i) throws IllegalArgumentException {
        if (i == 15) {
            return DISPLAY_CAPTION_FEATURE;
        }
        if (i == 16) {
            return DISPLAY_CARD_FEATURE;
        }
        if (i == 22) {
            return SUPPRESSING_SPEECH_RESPONSE_FEATURE;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Could not find feature for feature id: "));
        return null;
    }

    public int value() {
        return this.featureId;
    }
}
