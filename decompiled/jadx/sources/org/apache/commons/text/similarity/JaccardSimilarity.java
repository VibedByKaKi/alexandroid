package org.apache.commons.text.similarity;

import java.util.HashSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JaccardSimilarity implements SimilarityScore<Double> {
    static final JaccardSimilarity INSTANCE = new JaccardSimilarity();

    public <E> Double apply(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Input cannot be null");
            return null;
        }
        int length = similarityInput.length();
        int length2 = similarityInput2.length();
        if (length == 0 && length2 == 0) {
            return Double.valueOf(1.0d);
        }
        if (length == 0 || length2 == 0) {
            return Double.valueOf(0.0d);
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            hashSet.add(similarityInput.at(i));
        }
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < length2; i2++) {
            hashSet2.add(similarityInput2.at(i2));
        }
        new HashSet(hashSet).addAll(hashSet2);
        return Double.valueOf((((hashSet2.size() + hashSet.size()) - r8.size()) * 1.0d) / r8.size());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Double apply(CharSequence charSequence, CharSequence charSequence2) {
        return apply((SimilarityInput) SimilarityInput.input(charSequence), (SimilarityInput) SimilarityInput.input(charSequence2));
    }
}
