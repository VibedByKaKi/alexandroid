package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.AutoValue_RuntimeConfig;
import com.amazon.apl.android.bitmap.IBitmapCache;
import com.amazon.apl.android.bitmap.IBitmapPool;
import com.amazon.apl.android.bitmap.NoOpBitmapCache;
import com.amazon.apl.android.bitmap.NoOpBitmapPool;
import com.amazon.apl.android.dependencies.IPackageCache;
import com.amazon.apl.android.font.CompatFontResolver;
import com.amazon.apl.android.font.IFontResolver;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class RuntimeConfig {
    private static final int DEFAULT_TEXT_LAYOUT_CACHE_SIZE = 256;
    private static final int DEFAULT_TEXT_PAINT_CACHE_SIZE = 256;
    private static final int DEFAULT_TEXT_WIDTH_CACHE_SIZE = 512;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder bitmapCache(IBitmapCache iBitmapCache);

        public abstract Builder bitmapPool(IBitmapPool iBitmapPool);

        public abstract RuntimeConfig build();

        public abstract Builder clearViewsOnFinish(boolean z);

        public abstract Builder embeddedFontResolverEnabled(boolean z);

        public abstract Builder enableHardwareAccelerationForAVG(boolean z);

        public abstract Builder fontResolver(@NonNull IFontResolver iFontResolver);

        public abstract Builder packageCache(@NonNull IPackageCache iPackageCache);

        public abstract Builder preloadingFontsEnabled(boolean z);

        public abstract Builder simulateMeasureAndLayoutEnabled(boolean z);

        public abstract Builder textLayoutCacheSize(int i);

        public abstract Builder textPaintCacheSize(int i);

        public abstract Builder textWidthCacheSize(int i);
    }

    public static Builder builder() {
        NoOpBitmapCache noOpBitmapCache = new NoOpBitmapCache();
        return new AutoValue_RuntimeConfig.Builder().fontResolver(new CompatFontResolver()).simulateMeasureAndLayoutEnabled(false).preloadingFontsEnabled(true).enableHardwareAccelerationForAVG(false).bitmapCache(noOpBitmapCache).bitmapPool(new NoOpBitmapPool()).embeddedFontResolverEnabled(true).clearViewsOnFinish(true).textLayoutCacheSize(256).textPaintCacheSize(256).textWidthCacheSize(512);
    }

    public abstract IBitmapCache getBitmapCache();

    public abstract IBitmapPool getBitmapPool();

    public abstract IFontResolver getFontResolver();

    @Nullable
    public abstract IPackageCache getPackageCache();

    public abstract int getTextLayoutCacheSize();

    public abstract int getTextPaintCacheSize();

    public abstract int getTextWidthCacheSize();

    public abstract boolean isClearViewsOnFinish();

    public abstract boolean isEmbeddedFontResolverEnabled();

    public abstract boolean isEnableHardwareAccelerationForAVG();

    public abstract boolean isPreloadingFontsEnabled();

    public abstract boolean isSimulateMeasureAndLayoutEnabled();
}
