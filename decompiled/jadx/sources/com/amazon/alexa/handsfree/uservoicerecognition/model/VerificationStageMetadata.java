package com.amazon.alexa.handsfree.uservoicerecognition.model;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VerificationStageMetadata {
    private final long mStageEndTimestamp;
    private final long mStageStartTimestamp;

    public VerificationStageMetadata(long j, long j2) {
        this.mStageStartTimestamp = j;
        this.mStageEndTimestamp = j2;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            VerificationStageMetadata verificationStageMetadata = (VerificationStageMetadata) obj;
            if (this.mStageStartTimestamp == verificationStageMetadata.mStageStartTimestamp && this.mStageEndTimestamp == verificationStageMetadata.mStageEndTimestamp) {
                return true;
            }
        }
        return false;
    }

    public long getStageEndTimestamp() {
        return this.mStageEndTimestamp;
    }

    public long getStageStartTimestamp() {
        return this.mStageStartTimestamp;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mStageStartTimestamp), Long.valueOf(this.mStageEndTimestamp));
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[start = %d, end = %d]", Long.valueOf(this.mStageStartTimestamp), Long.valueOf(this.mStageEndTimestamp));
    }
}
