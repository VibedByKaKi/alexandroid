package com.amazon.apl.android.metrics.impl;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.amazon.apl.android.thread.IHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricsHandler implements IHandler {
    private static Handler mHandler;
    private static MetricsHandler mInstance;

    private MetricsHandler() {
        HandlerThread handlerThread = new HandlerThread("MetricsHandler");
        handlerThread.start();
        mHandler = Handler.createAsync(handlerThread.getLooper());
    }

    public static MetricsHandler getInstance() {
        if (mInstance == null) {
            mInstance = new MetricsHandler();
        }
        return mInstance;
    }

    @Override // com.amazon.apl.android.thread.IHandler
    public boolean post(@NonNull Runnable runnable) {
        return mHandler.post(runnable);
    }
}
