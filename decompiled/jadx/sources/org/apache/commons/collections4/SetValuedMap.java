package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface SetValuedMap<K, V> extends MultiValuedMap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.MultiValuedMap
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((SetValuedMap<K, V>) obj);
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    Set<V> get(K k);

    @Override // org.apache.commons.collections4.MultiValuedMap
    Set<V> remove(Object obj);
}
