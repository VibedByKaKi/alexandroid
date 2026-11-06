package org.apache.commons.text.similarity;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LongestCommonSubsequenceDistance implements EditDistance<Integer> {
    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Inputs must not be null");
            return null;
        }
        return Integer.valueOf((charSequence2.length() + charSequence.length()) - (LongestCommonSubsequence.INSTANCE.apply(charSequence, charSequence2).intValue() * 2));
    }
}
