package com.amazon.alexa.redesign.dependency;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.redesign.cache.HomeCacheService;
import com.dee.app.cachemanager.AppDataCacheEntry;
import com.dee.app.cachemanager.Cache;
import com.dee.app.cachemanager.DefaultObjectCache;
import com.dee.app.cachemanager.DiskLruByteCache;
import com.dee.app.cachemanager.Encryptor;
import com.dee.app.cachemanager.MarshmallowPlusAESEncryptor;
import com.dee.app.cachemanager.TwoTierLruMemoryCacheImpl;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Singleton;
import rx.Scheduler;
import rx.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class CacheModule {
    public static final String HOME_CACHE = "HomeCache";
    public static final String HOME_DISK_IO = "HomeDiskIO";

    @NonNull
    private static Encryptor getEncryptor(Context context) {
        return new MarshmallowPlusAESEncryptor(context, HOME_CACHE);
    }

    @Provides
    @Singleton
    public Cache<AppDataCacheEntry> provideHomeCache(Context context, ExecutorService executorService, Scheduler scheduler) {
        return new DefaultObjectCache(AppDataCacheEntry.class, new TwoTierLruMemoryCacheImpl(1), new DiskLruByteCache(context, HOME_CACHE, 1, 1, executorService), getEncryptor(context), executorService, scheduler);
    }

    @Provides
    @Singleton
    public HomeCacheService provideHomeCacheService(Cache<AppDataCacheEntry> cache) {
        return new HomeCacheService(cache);
    }

    @Provides
    @Singleton
    public Scheduler provideHomeDiskScheduler() {
        return Schedulers.from(Executors.newFixedThreadPool(2, new ThreadFactoryBuilder().setNameFormat(HOME_DISK_IO).build()));
    }
}
