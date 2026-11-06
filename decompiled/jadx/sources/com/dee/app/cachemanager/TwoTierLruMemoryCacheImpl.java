package com.dee.app.cachemanager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dee.app.function.BiCallback;
import com.google.common.base.Preconditions;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TwoTierLruMemoryCacheImpl<T> implements TwoTierLruMemoryCache<T>, CacheStatistics {
    private static final float LOAD_FACTOR = 0.75f;
    private static final String LOG_TAG = "TwoTierLruMemoryCacheImpl";
    private static final int MAGNITUDE = 1000000;
    private final CacheStats cacheStats;
    private final int capacityBytes;
    private int size;
    private final LinkedHashMap<String, Entry<T>> tierOneMap;
    private final LinkedHashMap<String, Entry<T>> tierTwoMap;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Entry<T> {
        final int size;
        final T value;

        public Entry(T t, int i) {
            this.value = t;
            this.size = i;
        }
    }

    public TwoTierLruMemoryCacheImpl(int i) {
        Preconditions.checkArgument(i >= 0, "Memory cache capacity must be greater than 0.");
        this.capacityBytes = i * 1000000;
        this.tierOneMap = new LinkedHashMap<>(0, 0.75f, true);
        this.tierTwoMap = new LinkedHashMap<>(0, 0.75f, true);
        this.cacheStats = new CacheStats();
    }

    private static <T> int getSpaceUsed(String str, Entry<T> entry) {
        return Utils.estimateSizeOfString(str) + entry.size;
    }

    private void trimCache(int i) {
        int i2 = this.capacityBytes - this.size;
        if (i <= i2) {
            return;
        }
        int i3 = i - i2;
        while (this.capacityBytes - this.size < i3 && !this.tierOneMap.isEmpty()) {
            LinkedHashMap<String, Entry<T>> linkedHashMap = !this.tierTwoMap.isEmpty() ? this.tierTwoMap : this.tierOneMap;
            Map.Entry<String, Entry<T>> next = linkedHashMap.entrySet().iterator().next();
            String key = next.getKey();
            int spaceUsed = getSpaceUsed(key, next.getValue());
            linkedHashMap.remove(key);
            this.size -= spaceUsed;
            this.cacheStats.incrementEvictionCount();
        }
    }

    @Override // com.dee.app.cachemanager.TwoTierLruMemoryCache
    public void clear() {
        this.tierOneMap.clear();
        this.tierTwoMap.clear();
        this.size = 0;
        this.cacheStats.clearStats();
    }

    @Override // com.dee.app.cachemanager.TwoTierLruMemoryCache
    public void forEach(@NonNull BiCallback<String, T> biCallback) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.tierOneMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.tierTwoMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            biCallback.accept((String) entry.getKey(), ((Entry) entry.getValue()).value);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            biCallback.accept((String) entry2.getKey(), ((Entry) entry2.getValue()).value);
        }
    }

    @Override // com.dee.app.cachemanager.TwoTierLruMemoryCache
    @Nullable
    public synchronized T get(@NonNull String str) {
        Preconditions.checkNotNull(str, "Key should not be null.");
        Entry<T> entry = this.tierOneMap.get(str);
        if (entry != null) {
            this.cacheStats.incrementHitCount();
            return entry.value;
        }
        Entry<T> entry2 = this.tierTwoMap.get(str);
        CacheStats cacheStats = this.cacheStats;
        if (entry2 == null) {
            cacheStats.incrementMissCount();
            return null;
        }
        cacheStats.incrementHitCount();
        return entry2.value;
    }

    @Override // com.dee.app.cachemanager.CacheStatistics
    public int getErrorCount() {
        return this.cacheStats.getErrorCount();
    }

    @Override // com.dee.app.cachemanager.CacheStatistics
    public int getEvictionCount() {
        return this.cacheStats.getEvictionCount();
    }

    @Override // com.dee.app.cachemanager.CacheStatistics
    public int getHitCount() {
        return this.cacheStats.getHitCount();
    }

    @Override // com.dee.app.cachemanager.CacheStatistics
    public int getMissCount() {
        return this.cacheStats.getMissCount();
    }

    @Override // com.dee.app.cachemanager.CacheStatistics
    public int getPutCount() {
        return this.cacheStats.getPutCount();
    }

    @Override // com.dee.app.cachemanager.TwoTierLruMemoryCache
    public synchronized boolean put(@NonNull String str, @NonNull T t, int i, int i2) {
        Preconditions.checkNotNull(str, "Key should not be null.");
        Preconditions.checkNotNull(t, "Value should not be null.");
        Preconditions.checkArgument(i2 > 0, "Value must have a size");
        Entry<T> entry = new Entry<>(t, i2);
        int spaceUsed = getSpaceUsed(str, entry);
        if (spaceUsed > this.capacityBytes) {
            this.cacheStats.incrementErrorCount();
            Log.e(LOG_TAG, String.format("Value too large to store in cache with size %d bytes", Integer.valueOf(this.capacityBytes)));
            return false;
        }
        trimCache(spaceUsed);
        this.cacheStats.incrementPutCount();
        if (i == 0) {
            this.tierOneMap.put(str, entry);
        } else {
            this.tierTwoMap.put(str, entry);
        }
        this.size += spaceUsed;
        return true;
    }

    @Override // com.dee.app.cachemanager.TwoTierLruMemoryCache
    public synchronized boolean remove(@NonNull String str) {
        try {
            Preconditions.checkNotNull(str, "Key should not be null.");
            Entry<T> entry = this.tierOneMap.get(str);
            if (entry == null) {
                entry = this.tierTwoMap.get(str);
                if (entry == null) {
                    return false;
                }
                this.tierTwoMap.remove(str);
            } else {
                this.tierOneMap.remove(str);
            }
            int spaceUsed = this.size - getSpaceUsed(str, entry);
            this.size = spaceUsed;
            if (spaceUsed < 0) {
                this.cacheStats.incrementErrorCount();
                Log.e(LOG_TAG, "Memory cache size is out of sync.");
                clear();
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
