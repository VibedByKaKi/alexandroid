package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.ResettableIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class EmptyMapIterator<K, V> extends AbstractEmptyMapIterator<K, V> implements MapIterator<K, V>, ResettableIterator<K> {
    public static final MapIterator INSTANCE = new EmptyMapIterator();

    public static <K, V> MapIterator<K, V> emptyMapIterator() {
        return INSTANCE;
    }
}
