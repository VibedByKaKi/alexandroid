package com.amazon.alexa.audiopersonalization.components;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TonePlayer {
    private static final String TAG = "TonePlayer";
    private Future<?> mCurrentToneFuture;
    private final ExecutorService mToneExecutor;

    public TonePlayer(ExecutorService executorService) {
        this.mToneExecutor = executorService;
    }

    public synchronized void play(Tone tone) {
        try {
            String str = tone.requestId;
            Future<?> future = this.mCurrentToneFuture;
            if (future != null) {
                future.cancel(true);
            }
            this.mCurrentToneFuture = this.mToneExecutor.submit(new ToneTask(tone));
        } catch (Throwable th) {
            throw th;
        }
    }

    public void shutdown() {
        this.mToneExecutor.shutdownNow();
    }

    public synchronized void stop() {
        Future<?> future = this.mCurrentToneFuture;
        if (future != null) {
            future.cancel(true);
            this.mCurrentToneFuture = null;
        }
    }
}
