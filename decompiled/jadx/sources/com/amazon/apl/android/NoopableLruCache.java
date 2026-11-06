package com.amazon.apl.android;

import androidx.collection.LruCache;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoopableLruCache<K, V> {
    private final LruCache<K, V> cache;

    public NoopableLruCache(int i) {
        this.cache = i > 0 ? new LruCache<>(i) : null;
    }

    public void evictAll() {
        LruCache<K, V> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public V get(K k) {
        LruCache<K, V> lruCache = this.cache;
        if (lruCache != null) {
            return lruCache.get(k);
        }
        return null;
    }

    public int maxSize() {
        LruCache<K, V> lruCache = this.cache;
        if (lruCache != null) {
            return lruCache.maxSize();
        }
        return 0;
    }

    public V put(K k, V v) {
        LruCache<K, V> lruCache = this.cache;
        if (lruCache != null) {
            return lruCache.put(k, v);
        }
        return null;
    }

    public int size() {
        LruCache<K, V> lruCache = this.cache;
        if (lruCache != null) {
            return lruCache.size();
        }
        return 0;
    }
}
