package com.amazon.alexa.growthcore.service.cache;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CacheServiceImpl<T> implements CacheService<T> {
    private final Map<String, CacheServiceImpl<T>.CacheObject> cacheMap = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CacheObject {
        long cachedStartTimeInMs;
        long ttlInMs;
        T value;

        public CacheObject(T t, long j) {
            this.value = t;
            this.ttlInMs = j;
        }
    }

    @Override // com.amazon.alexa.growthcore.service.cache.CacheService
    @Nullable
    public T get(String str) {
        synchronized (this.cacheMap) {
            try {
                CacheServiceImpl<T>.CacheObject cacheObject = this.cacheMap.get(str);
                if (cacheObject == null) {
                    return null;
                }
                if (System.currentTimeMillis() - cacheObject.cachedStartTimeInMs <= cacheObject.ttlInMs) {
                    return cacheObject.value;
                }
                this.cacheMap.remove(str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.growthcore.service.cache.CacheService
    public void put(String str, T t, long j) {
        synchronized (this.cacheMap) {
            CacheServiceImpl<T>.CacheObject cacheObject = new CacheObject(t, j);
            this.cacheMap.put(str, cacheObject);
            cacheObject.cachedStartTimeInMs = System.currentTimeMillis();
        }
    }
}
