package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
enum zzh implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Handler handler;
        handler = MLTaskExecutor.getInstance().zzc;
        handler.post(runnable);
    }
}
