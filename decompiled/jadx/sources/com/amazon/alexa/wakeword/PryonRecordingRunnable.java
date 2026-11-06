package com.amazon.alexa.wakeword;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.audiocapturer.MetricsListener;
import com.amazon.alexa.utils.LazyTimeProvider;
import com.amazon.alexa.voice.pryon.asr.AudioCapturer;
import com.amazon.alexa.voice.pryon.asr.AudioRecordException;
import com.amazon.alexa.wakeword.WakeWordDetector;
import com.amazon.pryon.android.asr.PryonLite2000;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class PryonRecordingRunnable implements Runnable {
    private static final long SHUTDOWN_TIMEOUT_MS = 1000;
    private static final String TAG = "PryonRecordingRunnable";
    private final WakeWordDetector.AudioCaptureListener audioCaptureListener;
    private volatile boolean capturing;
    private volatile boolean detectingWakeWord;
    private final LazyTimeProvider lazyTimeProvider;
    private final MetricsListener metricsListener;
    private final PryonLite2000 pryon;
    private final ShortRingBuffer ringBuffer;
    private AtomicLong samplesPushedToPryon;
    private final ConditionVariable shutdownCondition;
    private final boolean useAcousticEchoCanceler;
    private final boolean useLegacySDKSettingForPryon;
    private volatile boolean wakeWordDetectionPaused;

    public PryonRecordingRunnable(PryonLite2000 pryonLite2000, ShortRingBuffer shortRingBuffer, @Nullable WakeWordDetector.AudioCaptureListener audioCaptureListener, @Nullable MetricsListener metricsListener, boolean z, boolean z2) {
        this.pryon = pryonLite2000;
        this.ringBuffer = shortRingBuffer;
        this.audioCaptureListener = audioCaptureListener;
        this.metricsListener = metricsListener;
        this.useLegacySDKSettingForPryon = z;
        this.useAcousticEchoCanceler = z2;
        this.capturing = true;
        this.detectingWakeWord = true;
        this.samplesPushedToPryon = new AtomicLong(0L);
        this.lazyTimeProvider = new LazyTimeProvider();
        this.shutdownCondition = new ConditionVariable();
    }

    private long getCurrentTime() {
        if (isReportingMetric()) {
            return this.lazyTimeProvider.get().elapsedRealTime();
        }
        return 0L;
    }

    private boolean isReportingMetric() {
        return this.metricsListener != null;
    }

    private void transferAudio(AudioCapturer audioCapturer) {
        Log.i(TAG, "Beginning transfer of audio buffer to Pryon native component.");
        while (this.capturing) {
            try {
                try {
                    short[] read = audioCapturer.read();
                    this.ringBuffer.write(read, read.length);
                    if (this.detectingWakeWord && !isWakeWordDetectionPaused()) {
                        WakeWordDetector.AudioCaptureListener audioCaptureListener = this.audioCaptureListener;
                        if (audioCaptureListener != null) {
                            audioCaptureListener.onAudioCaptured(read);
                        }
                        int pushAudio = this.pryon.pushAudio(read);
                        this.samplesPushedToPryon.getAndAdd(read.length);
                        if (pushAudio != 0) {
                            throw new IOException("Failed to push audio samples to Pryon. Error code = " + pushAudio);
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Failed to transfer audio to Wake Word engine.", e);
                    this.capturing = false;
                    this.detectingWakeWord = false;
                }
            } catch (Throwable th) {
                audioCapturer.release();
                this.shutdownCondition.open();
                throw th;
            }
        }
        audioCapturer.release();
        this.shutdownCondition.open();
        Log.i(TAG, "Transfer of audio buffer to Pryon is ending.");
    }

    @VisibleForTesting
    public AudioCapturer createAudioCapturer() throws AudioRecordException {
        int samplesPerFrame = this.pryon.getSamplesPerFrame();
        if (samplesPerFrame != -37) {
            return new AudioCapturer(samplesPerFrame, this.useAcousticEchoCanceler, false, this.useLegacySDKSettingForPryon);
        }
        throw new AudioRecordException("getSamplesPerFrame is returning -37");
    }

    public long getSamplesPushedToPryon() {
        return this.samplesPushedToPryon.get();
    }

    public boolean isCapturing() {
        return this.capturing;
    }

    public boolean isDetectingWakeWord() {
        return this.capturing && this.detectingWakeWord;
    }

    @VisibleForTesting
    public boolean isWakeWordDetectionPaused() {
        return this.wakeWordDetectionPaused;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.pryon.getSamplesPerFrame() == -37) {
                throw new AudioRecordException("getSamplesPerFrame is returning -37");
            }
            long currentTime = getCurrentTime();
            AudioCapturer createAudioCapturer = createAudioCapturer();
            if (isReportingMetric()) {
                this.metricsListener.onMicInitializationSuccess(getCurrentTime() - currentTime);
            }
            transferAudio(createAudioCapturer);
        } catch (AudioRecordException e) {
            Log.e(TAG, "Failed to initialize AudioCapturer.", e);
            if (isReportingMetric()) {
                this.metricsListener.onMicInitializationFailure();
            }
        }
    }

    public void setWakeWordDetectionPaused(boolean z) {
        this.wakeWordDetectionPaused = z;
    }

    public void stopCapturing() {
        String str = TAG;
        Log.i(str, "stopCapturing");
        if (isDetectingWakeWord()) {
            stopDetectingWakeWord();
        }
        this.shutdownCondition.close();
        this.capturing = false;
        if (this.shutdownCondition.block(1000L)) {
            return;
        }
        Log.e(str, "Failed to stop.");
    }

    public void stopDetectingWakeWord() {
        Log.i(TAG, "stopDetectingWakeWord");
        this.detectingWakeWord = false;
    }

    public PryonRecordingRunnable(PryonLite2000 pryonLite2000, ShortRingBuffer shortRingBuffer, @Nullable WakeWordDetector.AudioCaptureListener audioCaptureListener, @Nullable MetricsListener metricsListener) {
        this(pryonLite2000, shortRingBuffer, audioCaptureListener, metricsListener, false, false);
    }
}
