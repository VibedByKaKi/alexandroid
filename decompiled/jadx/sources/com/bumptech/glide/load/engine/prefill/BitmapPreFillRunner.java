package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
final class BitmapPreFillRunner implements Runnable {
    static final int BACKOFF_RATIO = 4;
    static final long INITIAL_BACKOFF_MS = 40;
    static final long MAX_DURATION_MS = 32;

    @VisibleForTesting
    static final String TAG = "PreFillRunner";
    private final BitmapPool bitmapPool;
    private final Clock clock;
    private long currentDelay;
    private final Handler handler;
    private boolean isCancelled;
    private final MemoryCache memoryCache;
    private final Set<PreFillType> seenTypes;
    private final PreFillQueue toPrefill;
    private static final Clock DEFAULT_CLOCK = new Clock();
    static final long MAX_BACKOFF_MS = 1000;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class Clock {
        public long now() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UniqueKey implements Key {
        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    @VisibleForTesting
    public BitmapPreFillRunner(BitmapPool bitmapPool, MemoryCache memoryCache, PreFillQueue preFillQueue, Clock clock, Handler handler) {
        this.seenTypes = new HashSet();
        this.currentDelay = INITIAL_BACKOFF_MS;
        this.bitmapPool = bitmapPool;
        this.memoryCache = memoryCache;
        this.toPrefill = preFillQueue;
        this.clock = clock;
        this.handler = handler;
    }

    private long getFreeMemoryCacheBytes() {
        return this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize();
    }

    private long getNextDelay() {
        long j = this.currentDelay;
        this.currentDelay = Math.min(4 * j, MAX_BACKOFF_MS);
        return j;
    }

    private boolean isGcDetected(long j) {
        return this.clock.now() - j >= 32;
    }

    @VisibleForTesting
    public boolean allocate() {
        Bitmap createBitmap;
        long now = this.clock.now();
        while (!this.toPrefill.isEmpty() && !isGcDetected(now)) {
            PreFillType remove = this.toPrefill.remove();
            if (this.seenTypes.contains(remove)) {
                createBitmap = Bitmap.createBitmap(remove.getWidth(), remove.getHeight(), remove.getConfig());
            } else {
                this.seenTypes.add(remove);
                createBitmap = this.bitmapPool.getDirty(remove.getWidth(), remove.getHeight(), remove.getConfig());
            }
            if (getFreeMemoryCacheBytes() >= Util.getBitmapByteSize(createBitmap)) {
                this.memoryCache.put(new UniqueKey(), BitmapResource.obtain(createBitmap, this.bitmapPool));
            } else {
                this.bitmapPool.put(createBitmap);
            }
            if (Log.isLoggable(TAG, 3)) {
                remove.getWidth();
                remove.getHeight();
                Objects.toString(remove.getConfig());
            }
        }
        return (this.isCancelled || this.toPrefill.isEmpty()) ? false : true;
    }

    public void cancel() {
        this.isCancelled = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (allocate()) {
            this.handler.postDelayed(this, getNextDelay());
        }
    }

    public BitmapPreFillRunner(BitmapPool bitmapPool, MemoryCache memoryCache, PreFillQueue preFillQueue) {
        this(bitmapPool, memoryCache, preFillQueue, DEFAULT_CLOCK, new Handler(Looper.getMainLooper()));
    }
}
