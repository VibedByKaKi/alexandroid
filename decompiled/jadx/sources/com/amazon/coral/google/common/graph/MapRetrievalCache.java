package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    @CheckForNull
    private volatile transient CacheEntry<K, V> cacheEntry1;

    @CheckForNull
    private volatile transient CacheEntry<K, V> cacheEntry2;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CacheEntry<K, V> {
        final K key;
        final V value;

        public CacheEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }

    public MapRetrievalCache(Map<K, V> map) {
        super(map);
    }

    private void addToCache(K k, V v) {
        addToCache(new CacheEntry<>(k, v));
    }

    @Override // com.amazon.coral.google.common.graph.MapIteratorCache
    public void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.MapIteratorCache
    @CheckForNull
    public V get(Object obj) {
        Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(obj);
        if (withoutCaching != null) {
            addToCache(obj, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.amazon.coral.google.common.graph.MapIteratorCache
    @CheckForNull
    public V getIfCached(@CheckForNull Object obj) {
        V v = (V) super.getIfCached(obj);
        if (v != null) {
            return v;
        }
        CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 == null || cacheEntry2.key != obj) {
            return null;
        }
        addToCache(cacheEntry2);
        return cacheEntry2.value;
    }

    private void addToCache(CacheEntry<K, V> cacheEntry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = cacheEntry;
    }
}
