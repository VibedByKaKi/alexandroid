package com.amazon.apl.android;

import androidx.annotation.Nullable;
import com.amazon.apl.android.RuntimeConfig;
import com.amazon.apl.android.bitmap.IBitmapCache;
import com.amazon.apl.android.bitmap.IBitmapPool;
import com.amazon.apl.android.dependencies.IPackageCache;
import com.amazon.apl.android.font.IFontResolver;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_RuntimeConfig extends RuntimeConfig {
    private final IBitmapCache bitmapCache;
    private final IBitmapPool bitmapPool;
    private final boolean clearViewsOnFinish;
    private final boolean embeddedFontResolverEnabled;
    private final boolean enableHardwareAccelerationForAVG;
    private final IFontResolver fontResolver;
    private final IPackageCache packageCache;
    private final boolean preloadingFontsEnabled;
    private final boolean simulateMeasureAndLayoutEnabled;
    private final int textLayoutCacheSize;
    private final int textPaintCacheSize;
    private final int textWidthCacheSize;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends RuntimeConfig.Builder {
        private IBitmapCache bitmapCache;
        private IBitmapPool bitmapPool;
        private Boolean clearViewsOnFinish;
        private Boolean embeddedFontResolverEnabled;
        private Boolean enableHardwareAccelerationForAVG;
        private IFontResolver fontResolver;
        private IPackageCache packageCache;
        private Boolean preloadingFontsEnabled;
        private Boolean simulateMeasureAndLayoutEnabled;
        private Integer textLayoutCacheSize;
        private Integer textPaintCacheSize;
        private Integer textWidthCacheSize;

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder bitmapCache(IBitmapCache iBitmapCache) {
            if (iBitmapCache != null) {
                this.bitmapCache = iBitmapCache;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null bitmapCache");
            return null;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder bitmapPool(IBitmapPool iBitmapPool) {
            if (iBitmapPool != null) {
                this.bitmapPool = iBitmapPool;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null bitmapPool");
            return null;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig build() {
            String str = this.fontResolver == null ? " fontResolver" : "";
            if (this.simulateMeasureAndLayoutEnabled == null) {
                str = str.concat(" simulateMeasureAndLayoutEnabled");
            }
            if (this.preloadingFontsEnabled == null) {
                str = str.concat(" preloadingFontsEnabled");
            }
            if (this.enableHardwareAccelerationForAVG == null) {
                str = str.concat(" enableHardwareAccelerationForAVG");
            }
            if (this.bitmapPool == null) {
                str = str.concat(" bitmapPool");
            }
            if (this.bitmapCache == null) {
                str = str.concat(" bitmapCache");
            }
            if (this.clearViewsOnFinish == null) {
                str = str.concat(" clearViewsOnFinish");
            }
            if (this.embeddedFontResolverEnabled == null) {
                str = str.concat(" embeddedFontResolverEnabled");
            }
            if (this.textLayoutCacheSize == null) {
                str = str.concat(" textLayoutCacheSize");
            }
            if (this.textPaintCacheSize == null) {
                str = str.concat(" textPaintCacheSize");
            }
            if (this.textWidthCacheSize == null) {
                str = str.concat(" textWidthCacheSize");
            }
            if (str.isEmpty()) {
                return new AutoValue_RuntimeConfig(this.fontResolver, this.simulateMeasureAndLayoutEnabled.booleanValue(), this.preloadingFontsEnabled.booleanValue(), this.enableHardwareAccelerationForAVG.booleanValue(), this.bitmapPool, this.bitmapCache, this.packageCache, this.clearViewsOnFinish.booleanValue(), this.embeddedFontResolverEnabled.booleanValue(), this.textLayoutCacheSize.intValue(), this.textPaintCacheSize.intValue(), this.textWidthCacheSize.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder clearViewsOnFinish(boolean z) {
            this.clearViewsOnFinish = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder embeddedFontResolverEnabled(boolean z) {
            this.embeddedFontResolverEnabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder enableHardwareAccelerationForAVG(boolean z) {
            this.enableHardwareAccelerationForAVG = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder fontResolver(IFontResolver iFontResolver) {
            if (iFontResolver != null) {
                this.fontResolver = iFontResolver;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null fontResolver");
            return null;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder packageCache(IPackageCache iPackageCache) {
            this.packageCache = iPackageCache;
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder preloadingFontsEnabled(boolean z) {
            this.preloadingFontsEnabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder simulateMeasureAndLayoutEnabled(boolean z) {
            this.simulateMeasureAndLayoutEnabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder textLayoutCacheSize(int i) {
            this.textLayoutCacheSize = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder textPaintCacheSize(int i) {
            this.textPaintCacheSize = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.RuntimeConfig.Builder
        public RuntimeConfig.Builder textWidthCacheSize(int i) {
            this.textWidthCacheSize = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_RuntimeConfig(IFontResolver iFontResolver, boolean z, boolean z2, boolean z3, IBitmapPool iBitmapPool, IBitmapCache iBitmapCache, @Nullable IPackageCache iPackageCache, boolean z4, boolean z5, int i, int i2, int i3) {
        this.fontResolver = iFontResolver;
        this.simulateMeasureAndLayoutEnabled = z;
        this.preloadingFontsEnabled = z2;
        this.enableHardwareAccelerationForAVG = z3;
        this.bitmapPool = iBitmapPool;
        this.bitmapCache = iBitmapCache;
        this.packageCache = iPackageCache;
        this.clearViewsOnFinish = z4;
        this.embeddedFontResolverEnabled = z5;
        this.textLayoutCacheSize = i;
        this.textPaintCacheSize = i2;
        this.textWidthCacheSize = i3;
    }

    public boolean equals(Object obj) {
        IPackageCache iPackageCache;
        if (obj == this) {
            return true;
        }
        if (obj instanceof RuntimeConfig) {
            RuntimeConfig runtimeConfig = (RuntimeConfig) obj;
            if (this.fontResolver.equals(runtimeConfig.getFontResolver()) && this.simulateMeasureAndLayoutEnabled == runtimeConfig.isSimulateMeasureAndLayoutEnabled() && this.preloadingFontsEnabled == runtimeConfig.isPreloadingFontsEnabled() && this.enableHardwareAccelerationForAVG == runtimeConfig.isEnableHardwareAccelerationForAVG() && this.bitmapPool.equals(runtimeConfig.getBitmapPool()) && this.bitmapCache.equals(runtimeConfig.getBitmapCache()) && ((iPackageCache = this.packageCache) != null ? iPackageCache.equals(runtimeConfig.getPackageCache()) : runtimeConfig.getPackageCache() == null) && this.clearViewsOnFinish == runtimeConfig.isClearViewsOnFinish() && this.embeddedFontResolverEnabled == runtimeConfig.isEmbeddedFontResolverEnabled() && this.textLayoutCacheSize == runtimeConfig.getTextLayoutCacheSize() && this.textPaintCacheSize == runtimeConfig.getTextPaintCacheSize() && this.textWidthCacheSize == runtimeConfig.getTextWidthCacheSize()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public IBitmapCache getBitmapCache() {
        return this.bitmapCache;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public IBitmapPool getBitmapPool() {
        return this.bitmapPool;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public IFontResolver getFontResolver() {
        return this.fontResolver;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    @Nullable
    public IPackageCache getPackageCache() {
        return this.packageCache;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public int getTextLayoutCacheSize() {
        return this.textLayoutCacheSize;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public int getTextPaintCacheSize() {
        return this.textPaintCacheSize;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public int getTextWidthCacheSize() {
        return this.textWidthCacheSize;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.fontResolver.hashCode() ^ 1000003) * 1000003) ^ (this.simulateMeasureAndLayoutEnabled ? 1231 : 1237)) * 1000003) ^ (this.preloadingFontsEnabled ? 1231 : 1237)) * 1000003) ^ (this.enableHardwareAccelerationForAVG ? 1231 : 1237)) * 1000003) ^ this.bitmapPool.hashCode()) * 1000003) ^ this.bitmapCache.hashCode()) * 1000003;
        IPackageCache iPackageCache = this.packageCache;
        return this.textWidthCacheSize ^ ((((((((((hashCode ^ (iPackageCache == null ? 0 : iPackageCache.hashCode())) * 1000003) ^ (this.clearViewsOnFinish ? 1231 : 1237)) * 1000003) ^ (this.embeddedFontResolverEnabled ? 1231 : 1237)) * 1000003) ^ this.textLayoutCacheSize) * 1000003) ^ this.textPaintCacheSize) * 1000003);
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public boolean isClearViewsOnFinish() {
        return this.clearViewsOnFinish;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public boolean isEmbeddedFontResolverEnabled() {
        return this.embeddedFontResolverEnabled;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public boolean isEnableHardwareAccelerationForAVG() {
        return this.enableHardwareAccelerationForAVG;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public boolean isPreloadingFontsEnabled() {
        return this.preloadingFontsEnabled;
    }

    @Override // com.amazon.apl.android.RuntimeConfig
    public boolean isSimulateMeasureAndLayoutEnabled() {
        return this.simulateMeasureAndLayoutEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RuntimeConfig{fontResolver=");
        sb.append(this.fontResolver);
        sb.append(", simulateMeasureAndLayoutEnabled=");
        sb.append(this.simulateMeasureAndLayoutEnabled);
        sb.append(", preloadingFontsEnabled=");
        sb.append(this.preloadingFontsEnabled);
        sb.append(", enableHardwareAccelerationForAVG=");
        sb.append(this.enableHardwareAccelerationForAVG);
        sb.append(", bitmapPool=");
        sb.append(this.bitmapPool);
        sb.append(", bitmapCache=");
        sb.append(this.bitmapCache);
        sb.append(", packageCache=");
        sb.append(this.packageCache);
        sb.append(", clearViewsOnFinish=");
        sb.append(this.clearViewsOnFinish);
        sb.append(", embeddedFontResolverEnabled=");
        sb.append(this.embeddedFontResolverEnabled);
        sb.append(", textLayoutCacheSize=");
        sb.append(this.textLayoutCacheSize);
        sb.append(", textPaintCacheSize=");
        sb.append(this.textPaintCacheSize);
        sb.append(", textWidthCacheSize=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textWidthCacheSize, StringSubstitutor.DEFAULT_VAR_END);
    }
}
