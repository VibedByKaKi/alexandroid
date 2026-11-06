package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakewordDetectionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.wakeword.pryon.PryonCallbacksWrapper;
import java.io.EOFException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ValidationCallbacksWrapper extends PryonCallbacksWrapper {
    private static final long LPCM16_SAMPLE_RATE = 16000;
    private static final String TAG = "ValidationCallbacksWrapper";
    private final WakeWordValidationCallbacks callbacks;
    private Long detectionStartTime;
    private final AlexaClientEventBus eventBus;
    private volatile boolean isDetected;
    private final TimeProvider timeProvider;

    public ValidationCallbacksWrapper(WakeWordValidationCallbacks wakeWordValidationCallbacks, TimeProvider timeProvider, AlexaClientEventBus alexaClientEventBus, WakeWordMetricsListener wakeWordMetricsListener) {
        super(wakeWordValidationCallbacks, wakeWordMetricsListener);
        this.callbacks = wakeWordValidationCallbacks;
        this.timeProvider = timeProvider;
        this.eventBus = alexaClientEventBus;
    }

    private long calculateSpeechOffset(long j) {
        return TimeUnit.SECONDS.toMillis(j / 16000);
    }

    private void reportSpeechOffset(long j) {
        this.eventBus.post(WakeWordMetricEvent.ValidationSpeechOffsetEvent.create(calculateSpeechOffset(j)));
    }

    private void reportSuccess(Long l) {
        this.eventBus.post(WakeWordMetricEvent.ValidationLatencyEvent.create(this.timeProvider.currentTimeMillis() - l.longValue(), l.longValue()));
    }

    public boolean isWakeWordDetected() {
        return this.isDetected;
    }

    @Override // com.amazon.alexa.wakeword.pryon.PryonCallbacksWrapper, com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void wakeWordDetected(String str, long j, long j2, byte[] bArr) {
        super.wakeWordDetected(str, j, j2, bArr);
        this.isDetected = true;
        this.eventBus.post(WakewordDetectionEvent.ExternalWakeWordVerifiedEvent.create());
        Long l = this.detectionStartTime;
        if (l != null) {
            reportSuccess(l);
            reportSpeechOffset(j2);
        }
    }

    public void wakeWordDetectionStarted() {
        this.detectionStartTime = Long.valueOf(this.timeProvider.currentTimeMillis());
    }

    public void wakeWordDetectionStopped(final Throwable th) {
        Log.i(TAG, "wakeWordDetectionStopped");
        if (this.isDetected) {
            return;
        }
        try {
            getCallbackExecutor().execute(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.ValidationCallbacksWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Throwable th2 = th;
                    if (th2 == null) {
                        ValidationCallbacksWrapper.this.callbacks.onWakeWordDetectionFailure(new IllegalStateException("wake word not found"));
                    } else if (th2 instanceof EOFException) {
                        ValidationCallbacksWrapper.this.callbacks.onWakeWordInputAudioFailure(new IllegalStateException("audio input stream closed early"));
                    } else {
                        ValidationCallbacksWrapper.this.callbacks.onWakeWordDetectionFailure(new IllegalStateException("failed to detect a wake word", th2));
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            Log.w(TAG, "Could not execute failure callback", e);
        }
    }

    @VisibleForTesting
    public ValidationCallbacksWrapper(WakeWordValidationCallbacks wakeWordValidationCallbacks, ExecutorService executorService, TimeProvider timeProvider, AlexaClientEventBus alexaClientEventBus, WakeWordMetricsListener wakeWordMetricsListener) {
        super(wakeWordValidationCallbacks, executorService, wakeWordMetricsListener);
        this.callbacks = wakeWordValidationCallbacks;
        this.timeProvider = timeProvider;
        this.eventBus = alexaClientEventBus;
    }
}
