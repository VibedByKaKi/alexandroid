package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
interface FilteredSetMultimap<K, V> extends FilteredMultimap<K, V>, SetMultimap<K, V> {
    @Override // autovalue.shaded.com.google.common.collect.FilteredMultimap
    SetMultimap<K, V> unfiltered();
}
