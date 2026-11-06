package com.amazon.alexa.wakeword.pryon;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaWakeWord;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.pryon.android.asr.PryonLite2000;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PryonCallbacksWrapper implements PryonLite2000.Callbacks {
    private static final String TAG = "PryonCallbacksWrapper";
    private final ExecutorService callbackExecutorService;
    private final WakeWordDetectionCallbacks callbacks;
    private final WakeWordDetectionMetricsListener metricsListener;

    @VisibleForTesting
    public PryonCallbacksWrapper(WakeWordDetectionCallbacks wakeWordDetectionCallbacks, ExecutorService executorService, WakeWordDetectionMetricsListener wakeWordDetectionMetricsListener) {
        Preconditions.notNull(wakeWordDetectionCallbacks, "Callbacks is null");
        Preconditions.notNull(executorService, "Executor is null");
        this.callbacks = wakeWordDetectionCallbacks;
        this.callbackExecutorService = executorService;
        this.metricsListener = wakeWordDetectionMetricsListener;
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void errorEvent(int i) {
        ErrorUtils$$ExternalSyntheticOutline0.m(i, "Error emitted by wakeword engine, error = ", TAG);
        this.metricsListener.onPryonErrorEvent(i);
    }

    public ExecutorService getCallbackExecutor() {
        return this.callbackExecutorService;
    }

    public void release() {
        this.callbackExecutorService.shutdown();
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void wakeWordDetected(final String str, final long j, final long j2, final byte[] bArr) {
        Log.i(TAG, "wakeWordDetected");
        this.callbackExecutorService.execute(new Runnable() { // from class: com.amazon.alexa.wakeword.pryon.PryonCallbacksWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                PryonCallbacksWrapper.this.callbacks.onWakeWordDetected(new AlexaWakeWord(str, j, j2, SystemClock.elapsedRealtime()), bArr);
            }
        });
    }

    public PryonCallbacksWrapper(WakeWordDetectionCallbacks wakeWordDetectionCallbacks, WakeWordDetectionMetricsListener wakeWordDetectionMetricsListener) {
        this(wakeWordDetectionCallbacks, Executors.newSingleThreadExecutor(), wakeWordDetectionMetricsListener);
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void vadStateChanged(int i, long j) {
    }
}
