package com.amazon.coral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceHashMap<V> extends FastHashMap<CharSequence, V> {
    public CharSequenceHashMap(int i) {
        super(CharSequenceHashFunctor.CASE_SENSITIVE, i, 1.25f, false);
    }

    public CharSequenceHashMap() {
        this(CharSequenceHashFunctor.CASE_SENSITIVE);
    }

    public CharSequenceHashMap(HashFunctor<CharSequence> hashFunctor) {
        super(hashFunctor);
    }
}
