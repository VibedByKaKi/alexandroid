package org.apache.commons.text.similarity;

import org.apache.commons.lang3.Validate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SimilarityScoreFrom<R> {
    private final CharSequence left;
    private final SimilarityScore<R> similarityScore;

    public SimilarityScoreFrom(SimilarityScore<R> similarityScore, CharSequence charSequence) {
        Validate.isTrue(similarityScore != null, "The edit distance may not be null.", new Object[0]);
        this.similarityScore = similarityScore;
        this.left = charSequence;
    }

    public R apply(CharSequence charSequence) {
        return this.similarityScore.apply(this.left, charSequence);
    }

    public CharSequence getLeft() {
        return this.left;
    }

    public SimilarityScore<R> getSimilarityScore() {
        return this.similarityScore;
    }
}
