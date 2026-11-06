package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Transformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class StringValueTransformer<T> implements Transformer<T, String>, Serializable {
    private static final Transformer<Object, String> INSTANCE = new StringValueTransformer();
    private static final long serialVersionUID = 7511110693171758606L;

    private StringValueTransformer() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Transformer<T, String> stringValueTransformer() {
        return (Transformer<T, String>) INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.Transformer
    public /* bridge */ /* synthetic */ String transform(Object obj) {
        return transform2((StringValueTransformer<T>) obj);
    }

    @Override // org.apache.commons.collections4.Transformer
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public String transform2(T t) {
        return String.valueOf(t);
    }
}
