package com.amazon.alexa.client.alexaservice.base.metrics.tracking;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.lang.Thread;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VisualResponseTrackerTimeoutHandlerProvider {
    private static final String TAG = "VisualResponseTrackerTimeoutHandlerProvider";
    private static final String TIMEOUT_HANDLER_THREAD_NAME = "VisualRenderTimeoutHandlerThread";
    private Handler timeoutHandler;
    private HandlerThread timeoutHandlerThread;

    @Inject
    public VisualResponseTrackerTimeoutHandlerProvider() {
        initializeHandlerThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void initializeHandlerThread() {
        HandlerThread handlerThread = new HandlerThread(TIMEOUT_HANDLER_THREAD_NAME);
        this.timeoutHandlerThread = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.amazon.alexa.client.alexaservice.base.metrics.tracking.VisualResponseTrackerTimeoutHandlerProvider.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                Log.e(VisualResponseTrackerTimeoutHandlerProvider.TAG, "Timeout thread crashed, attempting restart", th);
                try {
                    if (VisualResponseTrackerTimeoutHandlerProvider.this.timeoutHandlerThread != null) {
                        VisualResponseTrackerTimeoutHandlerProvider.this.timeoutHandlerThread.quit();
                    }
                    VisualResponseTrackerTimeoutHandlerProvider.this.initializeHandlerThread();
                    Log.i(VisualResponseTrackerTimeoutHandlerProvider.TAG, "Timeout thread successfully restarted");
                } catch (Exception e) {
                    Log.e(VisualResponseTrackerTimeoutHandlerProvider.TAG, "Failed to restart timeout thread", e);
                }
            }
        });
        this.timeoutHandlerThread.start();
        this.timeoutHandler = new Handler(this.timeoutHandlerThread.getLooper());
    }

    public Handler getTimeoutHandler() {
        return this.timeoutHandler;
    }
}
