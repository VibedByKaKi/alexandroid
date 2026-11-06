package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Transformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class NOPTransformer<T> implements Transformer<T, T>, Serializable {
    public static final Transformer INSTANCE = new NOPTransformer();
    private static final long serialVersionUID = 2133891748318574490L;

    private NOPTransformer() {
    }

    public static <T> Transformer<T, T> nopTransformer() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.apache.commons.collections4.Transformer
    public T transform(T t) {
        return t;
    }
}
