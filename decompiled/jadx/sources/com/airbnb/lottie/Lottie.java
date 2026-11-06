package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class Lottie {
    private Lottie() {
    }

    public static void initialize(@NonNull LottieConfig lottieConfig) {
        L.setFetcher(lottieConfig.networkFetcher);
        L.setCacheProvider(lottieConfig.cacheProvider);
        L.setTraceEnabled(lottieConfig.enableSystraceMarkers);
        L.setNetworkCacheEnabled(lottieConfig.enableNetworkCache);
        L.setDisablePathInterpolatorCache(lottieConfig.disablePathInterpolatorCache);
        L.setDefaultAsyncUpdates(lottieConfig.defaultAsyncUpdates);
        L.setReducedMotionOption(lottieConfig.reducedMotionOption);
    }
}
