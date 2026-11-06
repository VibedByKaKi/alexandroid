package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes15.dex */
final class Platform {
    private Platform() {
    }

    public static <T> T[] copy(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static <E extends Enum<E>> Class<E> getDeclaringClassOrObjectForJ2cl(E e) {
        return e.getDeclaringClass();
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return ConcurrentHashMap.newKeySet();
    }

    public static <K, V> Map<K, V> newHashMapWithExpectedSize(int i) {
        return Maps.newHashMapWithExpectedSize(i);
    }

    public static <E> Set<E> newHashSetWithExpectedSize(int i) {
        return Sets.newHashSetWithExpectedSize(i);
    }

    public static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return Maps.newLinkedHashMapWithExpectedSize(i);
    }

    public static <E> Set<E> newLinkedHashSetWithExpectedSize(int i) {
        return Sets.newLinkedHashSetWithExpectedSize(i);
    }

    public static <E> Set<E> preservesInsertionOrderOnAddsSet() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
        return Maps.newLinkedHashMap();
    }

    @J2ktIncompatible
    public static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }

    public static int reduceExponentIfGwt(int i) {
        return i;
    }

    public static int reduceIterationsIfGwt(int i) {
        return i;
    }
}
