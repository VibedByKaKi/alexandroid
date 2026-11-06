package com.here.sdk.core.engine;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AndroidCAresInitialiserBridge implements CAresInitialiserBridge {
    private static final String TAG = "AndroidOptionalModulesInitializer";

    private static native void initCAresWithConnectivityManager(@NonNull ConnectivityManager connectivityManager);

    @Override // com.here.sdk.core.engine.CAresInitialiserBridge
    public void extractConnectivityManager(@NonNull Context context) {
        initCAresWithConnectivityManager((ConnectivityManager) context.getSystemService("connectivity"));
    }
}
