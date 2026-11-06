package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Preconditions;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UtteranceTrainingMetadata {

    @VisibleForTesting
    static final int MAX_SOUND_TO_NOISE_RATIO = 100;

    @VisibleForTesting
    static final int MAX_UTTERANCE_CONFIDENCE = 100;

    @VisibleForTesting
    static final int MIN_SOUND_TO_NOISE_RATIO = 0;

    @VisibleForTesting
    static final int MIN_UTTERANCE_CONFIDENCE = 0;
    private final int mSoundToNoiseRatio;
    private final int mUtteranceConfidence;

    public UtteranceTrainingMetadata(int i, int i2) {
        boolean z = false;
        Preconditions.checkArgument(i >= 0 && i <= 100, String.format(Locale.getDefault(), "Sound to noise ratio should be between %d and %d.", 0, 100));
        if (i2 >= 0 && i2 <= 100) {
            z = true;
        }
        Preconditions.checkArgument(z, String.format(Locale.getDefault(), "Utterance confidence should be between %d and %d.", 0, 100));
        this.mSoundToNoiseRatio = i;
        this.mUtteranceConfidence = i2;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == UtteranceTrainingMetadata.class) {
            UtteranceTrainingMetadata utteranceTrainingMetadata = (UtteranceTrainingMetadata) obj;
            if (this.mSoundToNoiseRatio == utteranceTrainingMetadata.mSoundToNoiseRatio && this.mUtteranceConfidence == utteranceTrainingMetadata.mUtteranceConfidence) {
                return true;
            }
        }
        return false;
    }

    public int getSoundToNoiseRatio() {
        return this.mSoundToNoiseRatio;
    }

    public int getUtteranceConfidence() {
        return this.mUtteranceConfidence;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSoundToNoiseRatio), Integer.valueOf(this.mUtteranceConfidence));
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[SNR = %d, Utterance confidence = %d]", Integer.valueOf(this.mSoundToNoiseRatio), Integer.valueOf(this.mUtteranceConfidence));
    }
}
