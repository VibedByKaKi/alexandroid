package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface LottieNetworkFetcher {
    @NonNull
    @WorkerThread
    LottieFetchResult fetchSync(@NonNull String str) throws IOException;
}
