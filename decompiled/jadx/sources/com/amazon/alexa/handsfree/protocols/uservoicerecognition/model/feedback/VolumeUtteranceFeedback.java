package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback;

import com.amazon.alexa.handsfree.protocols.utils.Preconditions;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class VolumeUtteranceFeedback implements UtteranceFeedback {
    private final int mMaxVolume;
    private final int mMinVolume;
    private final int mVolume;

    public VolumeUtteranceFeedback(int i, int i2, int i3) {
        Preconditions.checkValidRange(i2, i3);
        Preconditions.checkInRange(i, i2, i3);
        this.mVolume = i;
        this.mMinVolume = i2;
        this.mMaxVolume = i3;
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback.UtteranceFeedback
    public float getScaledVolume() {
        int i = this.mVolume;
        int i2 = this.mMinVolume;
        return (i - i2) / (this.mMaxVolume - i2);
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[Volume = %d]", Integer.valueOf(this.mVolume));
    }
}
