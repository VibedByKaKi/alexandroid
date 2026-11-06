package com.amazon.coral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultHashFunctor<K> implements HashFunctor<K> {
    @Override // com.amazon.coral.util.HashFunctor
    public boolean equals(K k, K k2) {
        return k == k2 || k.equals(k2);
    }

    @Override // com.amazon.coral.util.HashFunctor
    public int hashCode(K k) {
        int hashCode = k.hashCode();
        return hashCode ^ ((((hashCode >>> 20) ^ (hashCode >>> 12)) ^ (hashCode >>> 7)) ^ (hashCode >>> 4));
    }
}
