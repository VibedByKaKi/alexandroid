package com.amazon.alexa.voice.tta.utils;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AsyncWorker implements Worker {
    Handler handler;

    @NonNull
    final HandlerThread handlerThread = new HandlerThread("AsyncWorker", 10);

    private AsyncWorker() {
    }

    @NonNull
    public static AsyncWorker spawn() {
        AsyncWorker asyncWorker = new AsyncWorker();
        asyncWorker.handlerThread.start();
        asyncWorker.handler = new Handler(asyncWorker.handlerThread.getLooper());
        return asyncWorker;
    }

    @Override // com.amazon.alexa.voice.tta.utils.Worker
    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    @Override // com.amazon.alexa.voice.tta.utils.Worker
    public void quit() {
        this.handlerThread.quit();
    }
}
