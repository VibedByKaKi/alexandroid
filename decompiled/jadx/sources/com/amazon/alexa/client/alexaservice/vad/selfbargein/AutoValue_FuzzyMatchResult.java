package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FuzzyMatchResult extends FuzzyMatchResult {
    private final int contiguousMatchedWordCount;
    private final double score;
    private final int totalMatchedWordCount;

    public AutoValue_FuzzyMatchResult(double d, int i, int i2) {
        this.score = d;
        this.totalMatchedWordCount = i;
        this.contiguousMatchedWordCount = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FuzzyMatchResult) {
            FuzzyMatchResult fuzzyMatchResult = (FuzzyMatchResult) obj;
            if (Double.doubleToLongBits(this.score) == Double.doubleToLongBits(fuzzyMatchResult.getScore()) && this.totalMatchedWordCount == fuzzyMatchResult.getTotalMatchedWordCount() && this.contiguousMatchedWordCount == fuzzyMatchResult.getContiguousMatchedWordCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.FuzzyMatchResult
    public int getContiguousMatchedWordCount() {
        return this.contiguousMatchedWordCount;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.FuzzyMatchResult
    public double getScore() {
        return this.score;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.FuzzyMatchResult
    public int getTotalMatchedWordCount() {
        return this.totalMatchedWordCount;
    }

    public int hashCode() {
        return this.contiguousMatchedWordCount ^ ((((((int) ((Double.doubleToLongBits(this.score) >>> 32) ^ Double.doubleToLongBits(this.score))) ^ 1000003) * 1000003) ^ this.totalMatchedWordCount) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FuzzyMatchResult{score=");
        sb.append(this.score);
        sb.append(", totalMatchedWordCount=");
        sb.append(this.totalMatchedWordCount);
        sb.append(", contiguousMatchedWordCount=");
        return a$$ExternalSyntheticOutline0.m(sb, this.contiguousMatchedWordCount, StringSubstitutor.DEFAULT_VAR_END);
    }
}
