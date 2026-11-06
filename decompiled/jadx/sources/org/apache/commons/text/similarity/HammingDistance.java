package org.apache.commons.text.similarity;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HammingDistance implements EditDistance<Integer> {
    public <E> Integer apply(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("SimilarityInput must not be null");
            return null;
        }
        if (similarityInput.length() != similarityInput2.length()) {
            Single$$ExternalSyntheticBUOutline0.m$3("SimilarityInput must have the same length");
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < similarityInput.length(); i2++) {
            if (!similarityInput.at(i2).equals(similarityInput2.at(i2))) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        return apply((SimilarityInput) SimilarityInput.input(charSequence), (SimilarityInput) SimilarityInput.input(charSequence2));
    }
}
