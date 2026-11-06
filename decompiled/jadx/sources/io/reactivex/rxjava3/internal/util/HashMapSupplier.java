package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum HashMapSupplier implements Supplier<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> Supplier<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
