package dagger.internal.codegen.base;

import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class Util {
    private Util() {
    }

    public static <K, V> V reentrantComputeIfAbsent(Map<K, V> map, K k, Function<? super K, ? extends V> function) {
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V apply = function.apply(k);
        if (apply != null) {
            map.put(k, apply);
        }
        return apply;
    }
}
