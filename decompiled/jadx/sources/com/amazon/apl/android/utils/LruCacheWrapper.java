package com.amazon.apl.android.utils;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class LruCacheWrapper<K, V> implements ICache<K, V> {
    private final LruCache<K, V> mLruCacheInternal;

    public LruCacheWrapper(LruCache<K, V> lruCache) {
        this.mLruCacheInternal = lruCache;
    }

    @Override // com.amazon.apl.android.utils.ICache
    @Nullable
    public V get(@NonNull K k) {
        return this.mLruCacheInternal.get(k);
    }

    @Override // com.amazon.apl.android.utils.ICache
    public int getSize() {
        return this.mLruCacheInternal.size();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 15) {
            LruCache<K, V> lruCache = this.mLruCacheInternal;
            lruCache.trimToSize(lruCache.maxSize() / 2);
        } else if (i == 80) {
            this.mLruCacheInternal.evictAll();
        }
    }

    @Override // com.amazon.apl.android.utils.ICache
    public void put(@NonNull K k, @NonNull V v) {
        this.mLruCacheInternal.put(k, v);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
