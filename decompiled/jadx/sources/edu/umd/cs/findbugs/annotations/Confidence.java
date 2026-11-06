package edu.umd.cs.findbugs.annotations;

import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum Confidence {
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    IGNORE(5);

    private final int confidenceValue;

    Confidence(int i) {
        this.confidenceValue = i;
    }

    @Nonnull
    public static Confidence getConfidence(int i) {
        for (Confidence confidence : values()) {
            if (i <= confidence.confidenceValue) {
                return confidence;
            }
        }
        return IGNORE;
    }

    public int getConfidenceValue() {
        return this.confidenceValue;
    }
}
