package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class NoOpCacheErrorLogger implements CacheErrorLogger {

    @Nullable
    private static NoOpCacheErrorLogger sInstance;

    private NoOpCacheErrorLogger() {
    }

    public static synchronized NoOpCacheErrorLogger getInstance() {
        NoOpCacheErrorLogger noOpCacheErrorLogger;
        synchronized (NoOpCacheErrorLogger.class) {
            try {
                if (sInstance == null) {
                    sInstance = new NoOpCacheErrorLogger();
                }
                noOpCacheErrorLogger = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return noOpCacheErrorLogger;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void logError(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, @Nullable Throwable th) {
    }
}
