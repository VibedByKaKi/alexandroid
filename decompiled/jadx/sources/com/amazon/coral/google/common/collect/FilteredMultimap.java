package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Predicate;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    Predicate<? super Map.Entry<K, V>> entryPredicate();

    Multimap<K, V> unfiltered();
}
