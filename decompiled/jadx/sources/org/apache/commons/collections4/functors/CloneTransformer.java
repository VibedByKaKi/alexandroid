package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Transformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CloneTransformer<T> implements Transformer<T, T> {
    public static final Transformer INSTANCE = new CloneTransformer();

    private CloneTransformer() {
    }

    public static <T> Transformer<T, T> cloneTransformer() {
        return INSTANCE;
    }

    @Override // org.apache.commons.collections4.Transformer
    public T transform(T t) {
        if (t == null) {
            return null;
        }
        return (T) PrototypeFactory.prototypeFactory(t).create();
    }
}
