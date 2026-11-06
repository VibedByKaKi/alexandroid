package com.amazon.alexa.handsfree.uservoicerecognition.model;

import com.amazon.alexa.handsfree.protocols.utils.Preconditions;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UVRComponentMetadata {
    private static final int MAX_CONFIDENCE_THRESHOLD = 100;
    private static final int MIN_CONFIDENCE_THRESHOLD = 0;
    private final int mConfidence;
    private final boolean mIsSuccessful;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MetadataKey {
        CONFIDENCE,
        SUCCESS
    }

    public UVRComponentMetadata(boolean z, int i) {
        Preconditions.checkArgument(i >= 0 && i <= 100, String.format(Locale.getDefault(), "Confidence should be between %d and %d.", 0, 100));
        this.mIsSuccessful = z;
        this.mConfidence = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            UVRComponentMetadata uVRComponentMetadata = (UVRComponentMetadata) obj;
            if (this.mIsSuccessful == uVRComponentMetadata.mIsSuccessful && this.mConfidence == uVRComponentMetadata.mConfidence) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.mConfidence;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsSuccessful), Integer.valueOf(this.mConfidence));
    }

    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[isSuccessful = %b, confidence = %d]", Boolean.valueOf(this.mIsSuccessful), Integer.valueOf(this.mConfidence));
    }
}
