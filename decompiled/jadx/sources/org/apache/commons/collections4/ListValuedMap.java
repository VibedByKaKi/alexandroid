package org.apache.commons.collections4;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ListValuedMap<K, V> extends MultiValuedMap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.MultiValuedMap
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((ListValuedMap<K, V>) obj);
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    List<V> get(K k);

    @Override // org.apache.commons.collections4.MultiValuedMap
    List<V> remove(Object obj);
}
