package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.CompatibleWith;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface Multimap<K, V> {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$forEach$0(BiConsumer biConsumer, Map.Entry entry) {
        biConsumer.accept(entry.getKey(), entry.getValue());
    }

    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    boolean containsKey(@CheckForNull @CompatibleWith("K") Object obj);

    boolean containsValue(@CheckForNull @CompatibleWith("V") Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@CheckForNull Object obj);

    default void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        entries().forEach(new Streams$$ExternalSyntheticLambda10(biConsumer, 2));
    }

    Collection<V> get(@ParametricNullness K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    Multiset<K> keys();

    @CanIgnoreReturnValue
    boolean put(@ParametricNullness K k, @ParametricNullness V v);

    @CanIgnoreReturnValue
    boolean putAll(Multimap<? extends K, ? extends V> multimap);

    @CanIgnoreReturnValue
    boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable);

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@CheckForNull @CompatibleWith("K") Object obj);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
