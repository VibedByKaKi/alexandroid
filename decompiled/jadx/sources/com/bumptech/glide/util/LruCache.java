package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LruCache<T, Y> {
    private final Map<T, Entry<Y>> cache = new LinkedHashMap(100, 0.75f, true);
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Entry<Y> {
        final int size;
        final Y value;

        public Entry(Y y, int i) {
            this.value = y;
            this.size = i;
        }
    }

    public LruCache(long j) {
        this.initialMaxSize = j;
        this.maxSize = j;
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(@NonNull T t) {
        return this.cache.containsKey(t);
    }

    @Nullable
    public synchronized Y get(@NonNull T t) {
        Entry<Y> entry;
        entry = this.cache.get(t);
        return entry != null ? entry.value : null;
    }

    public synchronized int getCount() {
        return this.cache.size();
    }

    public synchronized long getCurrentSize() {
        return this.currentSize;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public int getSize(@Nullable Y y) {
        return 1;
    }

    @Nullable
    public synchronized Y put(@NonNull T t, @Nullable Y y) {
        int size = getSize(y);
        long j = size;
        if (j >= this.maxSize) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.currentSize += j;
        }
        Entry<Y> put = this.cache.put(t, y == null ? null : new Entry<>(y, size));
        if (put != null) {
            this.currentSize -= put.size;
            if (!put.value.equals(y)) {
                onItemEvicted(t, put.value);
            }
        }
        evict();
        return put != null ? put.value : null;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t) {
        Entry<Y> remove = this.cache.remove(t);
        if (remove == null) {
            return null;
        }
        this.currentSize -= remove.size;
        return remove.value;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.maxSize = Math.round(this.initialMaxSize * f);
        evict();
    }

    public synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            Iterator<Map.Entry<T, Entry<Y>>> it2 = this.cache.entrySet().iterator();
            Map.Entry<T, Entry<Y>> next = it2.next();
            Entry<Y> value = next.getValue();
            this.currentSize -= value.size;
            T key = next.getKey();
            it2.remove();
            onItemEvicted(key, value.value);
        }
    }

    public void onItemEvicted(@NonNull T t, @Nullable Y y) {
    }
}
