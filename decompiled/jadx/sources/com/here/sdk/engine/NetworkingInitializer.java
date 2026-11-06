package com.here.sdk.engine;

import android.content.Context;
import androidx.annotation.NonNull;
import com.here.sdk.core.utilities.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class NetworkingInitializer {
    private NetworkingInitializer() {
    }

    private static native void initNative(@NonNull Context context);

    public static void initialize(@NonNull Context context) {
        initNative((Context) Preconditions.checkNotNull(context));
    }
}
