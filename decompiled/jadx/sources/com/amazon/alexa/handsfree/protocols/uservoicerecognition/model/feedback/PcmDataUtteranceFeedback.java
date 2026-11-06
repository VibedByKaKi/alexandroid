package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.audio.ScaledVolumeProcessor;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class PcmDataUtteranceFeedback implements UtteranceFeedback {
    private final ShortBuffer mBuffer;
    private final ScaledVolumeProcessor mScaledVolumeProcessor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PcmDataUtteranceFeedback(short[] sArr) {
        this(ShortBuffer.wrap(sArr), new ScaledVolumeProcessor());
        Objects.requireNonNull(sArr, "Buffer must not be null.");
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback.UtteranceFeedback
    public float getScaledVolume() {
        return this.mScaledVolumeProcessor.computeScaledVolume(this.mBuffer);
    }

    public String toString() {
        return Objects.toString(this.mBuffer);
    }

    @VisibleForTesting
    public PcmDataUtteranceFeedback(@NonNull ShortBuffer shortBuffer, @NonNull ScaledVolumeProcessor scaledVolumeProcessor) {
        this.mBuffer = shortBuffer;
        this.mScaledVolumeProcessor = scaledVolumeProcessor;
    }
}
