package org.apache.commons.text.similarity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CosineDistance implements EditDistance<Double> {
    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Double apply(CharSequence charSequence, CharSequence charSequence2) {
        RegexTokenizer regexTokenizer = RegexTokenizer.INSTANCE;
        CharSequence[] apply = regexTokenizer.apply(charSequence);
        CharSequence[] apply2 = regexTokenizer.apply(charSequence2);
        return Double.valueOf(1.0d - CosineSimilarity.INSTANCE.cosineSimilarity(Counter.of(apply), Counter.of(apply2)).doubleValue());
    }
}
