package org.apache.commons.text.similarity;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JaroWinklerDistance implements EditDistance<Double> {

    @Deprecated
    public static final int INDEX_NOT_FOUND = -1;

    @Deprecated
    public static int[] matches(CharSequence charSequence, CharSequence charSequence2) {
        return JaroWinklerSimilarity.matches(charSequence, charSequence2);
    }

    public <E> Double apply(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        if (similarityInput != null && similarityInput2 != null) {
            return Double.valueOf(1.0d - JaroWinklerSimilarity.INSTANCE.apply((SimilarityInput) similarityInput, (SimilarityInput) similarityInput2).doubleValue());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
        return null;
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Double apply(CharSequence charSequence, CharSequence charSequence2) {
        return apply((SimilarityInput) SimilarityInput.input(charSequence), (SimilarityInput) SimilarityInput.input(charSequence2));
    }
}
