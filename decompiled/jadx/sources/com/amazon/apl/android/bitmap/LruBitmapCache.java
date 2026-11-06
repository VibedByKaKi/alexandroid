package com.amazon.apl.android.bitmap;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LruBitmapCache implements IBitmapCache, ComponentCallbacks2 {
    private static final int MEMORY_ALLOCATION = (int) (Runtime.getRuntime().maxMemory() / 16);
    private static final String TAG = "LruBitmapCache";
    private final LruCache<BitmapKey, Bitmap> mMemoryCache;

    public LruBitmapCache(int i) {
        this.mMemoryCache = new LruCache<BitmapKey, Bitmap>(i) { // from class: com.amazon.apl.android.bitmap.LruBitmapCache.1
            @Override // android.util.LruCache
            public int sizeOf(BitmapKey bitmapKey, Bitmap bitmap) {
                return bitmap.getByteCount();
            }

            @Override // android.util.LruCache
            public void entryRemoved(boolean z, BitmapKey bitmapKey, Bitmap bitmap, Bitmap bitmap2) {
            }
        };
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void clear() {
        this.mMemoryCache.evictAll();
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    @Nullable
    public Bitmap getBitmap(BitmapKey bitmapKey) {
        return this.mMemoryCache.get(bitmapKey);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public int getSize() {
        return this.mMemoryCache.size();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i >= 15) {
            clear();
        }
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void putBitmap(BitmapKey bitmapKey, Bitmap bitmap) {
        if (this.mMemoryCache.get(bitmapKey) == null) {
            this.mMemoryCache.put(bitmapKey, bitmap);
        }
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void removeBitmapFromCache(BitmapKey bitmapKey) {
        this.mMemoryCache.remove(bitmapKey);
    }

    public LruBitmapCache() {
        this(MEMORY_ALLOCATION);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
