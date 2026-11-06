package org.apache.commons.text.similarity;

import java.util.function.BiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ObjectSimilarityScore<T, R> extends BiFunction<T, T, R> {
    @Override // java.util.function.BiFunction
    R apply(T t, T t2);
}
