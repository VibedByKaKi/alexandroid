package com.amazon.alexa.client.alexaservice.dialog.cache;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class UtteranceCacheManager {
    private static final long DEFAULT_CACHE_TIMEOUT_MS = 20000;
    private static final String TAG = "UtteranceCacheManager";
    private final long cacheTimeoutMs;

    @Nullable
    private CachedUtterance cachedUtterance;
    private final Handler timeoutHandler;

    @Nullable
    private Runnable timeoutRunnable;

    @VisibleForTesting
    public UtteranceCacheManager(long j) {
        this.cachedUtterance = null;
        this.timeoutRunnable = null;
        this.cacheTimeoutMs = j;
        this.timeoutHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCacheTimeout() {
        CachedUtterance cachedUtterance = this.cachedUtterance;
        if (cachedUtterance != null) {
            cachedUtterance.getDialogId();
            clearCache();
        }
    }

    public synchronized void cacheUtterance(@NonNull String str, @NonNull String str2) {
        clearCache();
        this.cachedUtterance = CachedUtterance.create(str, str2);
        TopContactProvider$$ExternalSyntheticLambda0 topContactProvider$$ExternalSyntheticLambda0 = new TopContactProvider$$ExternalSyntheticLambda0(this, 24);
        this.timeoutRunnable = topContactProvider$$ExternalSyntheticLambda0;
        this.timeoutHandler.postDelayed(topContactProvider$$ExternalSyntheticLambda0, this.cacheTimeoutMs);
    }

    public synchronized void clearCache() {
        try {
            CachedUtterance cachedUtterance = this.cachedUtterance;
            if (cachedUtterance != null) {
                cachedUtterance.getDialogId();
            }
            this.cachedUtterance = null;
            Runnable runnable = this.timeoutRunnable;
            if (runnable != null) {
                this.timeoutHandler.removeCallbacks(runnable);
                this.timeoutRunnable = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public long getCacheTimeoutMs() {
        return this.cacheTimeoutMs;
    }

    @Nullable
    public synchronized CachedUtterance getCachedUtterance() {
        CachedUtterance cachedUtterance = this.cachedUtterance;
        if (cachedUtterance == null || !cachedUtterance.isExpired(this.cacheTimeoutMs)) {
            return this.cachedUtterance;
        }
        this.cachedUtterance.getDialogId();
        clearCache();
        return null;
    }

    public synchronized boolean hasCachedUtterance() {
        return getCachedUtterance() != null;
    }

    @Inject
    public UtteranceCacheManager() {
        this(DEFAULT_CACHE_TIMEOUT_MS);
    }
}
