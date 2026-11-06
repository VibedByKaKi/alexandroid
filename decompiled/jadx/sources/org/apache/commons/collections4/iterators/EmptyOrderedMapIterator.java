package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.ResettableIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class EmptyOrderedMapIterator<K, V> extends AbstractEmptyMapIterator<K, V> implements OrderedMapIterator<K, V>, ResettableIterator<K> {
    public static final OrderedMapIterator INSTANCE = new EmptyOrderedMapIterator();

    public static <K, V> OrderedMapIterator<K, V> emptyOrderedMapIterator() {
        return INSTANCE;
    }
}
