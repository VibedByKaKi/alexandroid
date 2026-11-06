package com.amazon.common.storage;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WeakCache<K, V> {
    private final Map<K, WeakReference<V>> mCache = new HashMap();

    private void sweepCache() {
        Iterator<Map.Entry<K, WeakReference<V>>> it2 = this.mCache.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, WeakReference<V>> next = it2.next();
            if (next.getValue() != null && next.getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public void clear() {
        this.mCache.clear();
    }

    @Nullable
    public V get(K k) {
        WeakReference<V> weakReference = this.mCache.get(k);
        if (weakReference == null) {
            return null;
        }
        V v = weakReference.get();
        if (v != null) {
            return v;
        }
        this.mCache.remove(k);
        return null;
    }

    public void put(K k, WeakReference<V> weakReference) {
        sweepCache();
        this.mCache.put(k, weakReference);
    }

    public void remove(K k) {
        this.mCache.remove(k);
    }

    public int size() {
        return this.mCache.size();
    }
}
