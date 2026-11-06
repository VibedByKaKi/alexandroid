package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum ArrayListSupplier implements Supplier<List<Object>>, Function<Object, List<Object>> {
    INSTANCE;

    public static <T, O> Function<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> Supplier<List<T>> asSupplier() {
        return INSTANCE;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public List<Object> get() {
        return new ArrayList();
    }
}
