package org.apache.commons.text.similarity;

import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface SimilarityInput<E> {
    static <T> SimilarityInput<T> input(Object obj) {
        if (obj instanceof SimilarityInput) {
            return (SimilarityInput) obj;
        }
        if (obj instanceof CharSequence) {
            return (SimilarityInput<T>) input((CharSequence) obj);
        }
        Objects.requireNonNull(obj, "input");
        Single$$ExternalSyntheticBUOutline0.m$3(obj.getClass().getName());
        return null;
    }

    E at(int i);

    int length();

    static SimilarityInput<Character> input(CharSequence charSequence) {
        return new SimilarityCharacterInput(charSequence);
    }
}
