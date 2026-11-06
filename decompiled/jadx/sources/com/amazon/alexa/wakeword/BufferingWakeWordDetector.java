package com.amazon.alexa.wakeword;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.audiocapturer.MetricsListener;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.alexa.wakeword.WakeWordDetector;
import com.amazon.pryon.android.asr.PryonLite2000;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BufferingWakeWordDetector {
    private static final int BUFFER_CAPACITY_IN_SECONDS = 3;

    @VisibleForTesting
    static final int CAPACITY = 48000;
    private static final int SAMPLE_RATE = 16000;
    private static final String TAG = "BufferingWakeWordDetector";
    private final WakeWordDetector.AudioCaptureListener audioCaptureListener;
    private final ExecutorService executor;
    private final MetricsListener metricsListener;
    private PryonLite2000 pryon;
    private PryonRecordingRunnable recordingRunnable;
    private final ShortRingBuffer ringBuffer;

    @VisibleForTesting
    public BufferingWakeWordDetector(@Nullable PryonLite2000 pryonLite2000, @Nullable WakeWordDetector.AudioCaptureListener audioCaptureListener, @Nullable MetricsListener metricsListener, ExecutorService executorService) {
        Preconditions.notNull(executorService, "executor is null");
        this.executor = executorService;
        this.ringBuffer = new ShortRingBuffer(48000);
        this.metricsListener = metricsListener;
        this.pryon = pryonLite2000;
        this.audioCaptureListener = audioCaptureListener;
    }

    private void release() {
        Log.i(TAG, "release");
        if (this.pryon == null) {
            return;
        }
        this.pryon = null;
        this.recordingRunnable = null;
        this.executor.shutdown();
    }

    @VisibleForTesting
    public PryonRecordingRunnable createRecordingRunnable(boolean z, boolean z2) {
        return new PryonRecordingRunnable(this.pryon, this.ringBuffer, this.audioCaptureListener, this.metricsListener, z, z2);
    }

    public ShortRingBuffer getRingBuffer() {
        return this.ringBuffer;
    }

    public long getSamplesPushedToPryon() {
        PryonRecordingRunnable pryonRecordingRunnable = this.recordingRunnable;
        if (pryonRecordingRunnable != null) {
            return pryonRecordingRunnable.getSamplesPushedToPryon();
        }
        return 0L;
    }

    @VisibleForTesting
    public boolean hasPryon() {
        PryonLite2000 pryonLite2000;
        return PryonLite2000.isAvailable() && (pryonLite2000 = this.pryon) != null && pryonLite2000.isInitialized() == 1;
    }

    public boolean isCapturing() {
        PryonRecordingRunnable pryonRecordingRunnable = this.recordingRunnable;
        return pryonRecordingRunnable != null && pryonRecordingRunnable.isCapturing();
    }

    public boolean isDetectingWakeWord() {
        PryonRecordingRunnable pryonRecordingRunnable = this.recordingRunnable;
        return pryonRecordingRunnable != null && pryonRecordingRunnable.isDetectingWakeWord();
    }

    public void pauseDetectingWakeWord() {
        if (hasPryon() && isDetectingWakeWord()) {
            this.recordingRunnable.setWakeWordDetectionPaused(true);
        }
    }

    public void resumeDetectingWakeWord() {
        if (hasPryon() && isDetectingWakeWord()) {
            this.recordingRunnable.setWakeWordDetectionPaused(false);
        }
    }

    public boolean startDetectingWakeWord(boolean z, boolean z2) {
        if (hasPryon() && !isCapturing()) {
            PryonRecordingRunnable createRecordingRunnable = createRecordingRunnable(z, z2);
            this.recordingRunnable = createRecordingRunnable;
            this.executor.execute(createRecordingRunnable);
            return true;
        }
        Log.w(TAG, "can't start detecting. pryon initialized: " + hasPryon() + " already running: " + isCapturing());
        return false;
    }

    public void stopCapturing() {
        if (hasPryon() && isCapturing()) {
            this.recordingRunnable.stopCapturing();
            release();
        }
    }

    public void stopDetectingWakeWord() {
        if (hasPryon() && isDetectingWakeWord()) {
            this.recordingRunnable.stopDetectingWakeWord();
        }
    }

    public BufferingWakeWordDetector(PryonLite2000 pryonLite2000, @Nullable WakeWordDetector.AudioCaptureListener audioCaptureListener, @Nullable MetricsListener metricsListener) {
        this(pryonLite2000, audioCaptureListener, metricsListener, ExecutorFactory.newSingleThreadExecutor("WakeWordDetector"));
    }

    public boolean startDetectingWakeWord() {
        return startDetectingWakeWord(false, false);
    }
}
