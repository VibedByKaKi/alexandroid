package com.google.mlkit.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class MlKit {
    private MlKit() {
    }

    public static void initialize(@NonNull Context context) {
        MlKitContext.zza(context);
    }
}
