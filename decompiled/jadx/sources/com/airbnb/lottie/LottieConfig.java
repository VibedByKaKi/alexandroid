package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class LottieConfig {

    @Nullable
    final LottieNetworkCacheProvider cacheProvider;
    final AsyncUpdates defaultAsyncUpdates;
    final boolean disablePathInterpolatorCache;
    final boolean enableNetworkCache;
    final boolean enableSystraceMarkers;

    @Nullable
    final LottieNetworkFetcher networkFetcher;
    final ReducedMotionOption reducedMotionOption;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private LottieNetworkCacheProvider cacheProvider;

        @Nullable
        private LottieNetworkFetcher networkFetcher;
        private boolean enableSystraceMarkers = false;
        private boolean enableNetworkCache = true;
        private boolean disablePathInterpolatorCache = true;
        private AsyncUpdates defaultAsyncUpdates = AsyncUpdates.AUTOMATIC;
        private ReducedMotionOption reducedMotionOption = new SystemReducedMotionOption();

        @NonNull
        public LottieConfig build() {
            return new LottieConfig(this.networkFetcher, this.cacheProvider, this.enableSystraceMarkers, this.enableNetworkCache, this.disablePathInterpolatorCache, this.defaultAsyncUpdates, this.reducedMotionOption);
        }

        @NonNull
        public Builder setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
            this.defaultAsyncUpdates = asyncUpdates;
            return this;
        }

        @NonNull
        public Builder setDisablePathInterpolatorCache(boolean z) {
            this.disablePathInterpolatorCache = z;
            return this;
        }

        @NonNull
        public Builder setEnableNetworkCache(boolean z) {
            this.enableNetworkCache = z;
            return this;
        }

        @NonNull
        public Builder setEnableSystraceMarkers(boolean z) {
            this.enableSystraceMarkers = z;
            return this;
        }

        @NonNull
        public Builder setNetworkCacheDir(@NonNull final File file) {
            if (this.cacheProvider == null) {
                this.cacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.1
                    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                    @NonNull
                    public File getCacheDir() {
                        if (file.isDirectory()) {
                            return file;
                        }
                        Single$$ExternalSyntheticBUOutline0.m$3("cache file must be a directory");
                        return null;
                    }
                };
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("There is already a cache provider!");
            return null;
        }

        @NonNull
        public Builder setNetworkCacheProvider(@NonNull final LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.cacheProvider == null) {
                this.cacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.2
                    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                    @NonNull
                    public File getCacheDir() {
                        File cacheDir = lottieNetworkCacheProvider.getCacheDir();
                        if (cacheDir.isDirectory()) {
                            return cacheDir;
                        }
                        Single$$ExternalSyntheticBUOutline0.m$3("cache file must be a directory");
                        return null;
                    }
                };
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("There is already a cache provider!");
            return null;
        }

        @NonNull
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.networkFetcher = lottieNetworkFetcher;
            return this;
        }

        @NonNull
        public Builder setReducedMotionOption(ReducedMotionOption reducedMotionOption) {
            this.reducedMotionOption = reducedMotionOption;
            return this;
        }
    }

    private LottieConfig(@Nullable LottieNetworkFetcher lottieNetworkFetcher, @Nullable LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3, AsyncUpdates asyncUpdates, ReducedMotionOption reducedMotionOption) {
        this.networkFetcher = lottieNetworkFetcher;
        this.cacheProvider = lottieNetworkCacheProvider;
        this.enableSystraceMarkers = z;
        this.enableNetworkCache = z2;
        this.disablePathInterpolatorCache = z3;
        this.defaultAsyncUpdates = asyncUpdates;
        this.reducedMotionOption = reducedMotionOption;
    }
}
