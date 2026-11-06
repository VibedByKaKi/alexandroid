package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class FuzzyMatchResult {
    public static final FuzzyMatchResult EMPTY = create(0.0d, 0, 0);

    public static FuzzyMatchResult create(double d, int i, int i2) {
        return new AutoValue_FuzzyMatchResult(d, i, i2);
    }

    public abstract int getContiguousMatchedWordCount();

    public abstract double getScore();

    public abstract int getTotalMatchedWordCount();
}
