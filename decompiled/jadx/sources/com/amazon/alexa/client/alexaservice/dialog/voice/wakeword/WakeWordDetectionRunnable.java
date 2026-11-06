package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import android.util.Log;
import com.amazon.alexa.voice.pryon.asr.PryonWakeWordDetectorCompat;
import com.amazon.pryon.android.asr.PryonLite2000;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class WakeWordDetectionRunnable implements Runnable {
    private static final String TAG = "WakeWordDetectionRunnable";
    static final int WAKE_WORD_WAITING_LIMIT = 300;
    private final ValidationCallbacksWrapper callbacks;
    private final WakeWordAudioCapturer wakeWordAudioCapturer;
    private final AtomicBoolean wakeWordDetectionStoppedCallbackCalled = new AtomicBoolean(false);
    private final PryonWakeWordDetectorCompat wakeWordDetector;

    public WakeWordDetectionRunnable(PryonWakeWordDetectorCompat pryonWakeWordDetectorCompat, ValidationCallbacksWrapper validationCallbacksWrapper, WakeWordAudioCapturer wakeWordAudioCapturer) {
        this.wakeWordDetector = pryonWakeWordDetectorCompat;
        this.callbacks = validationCallbacksWrapper;
        this.wakeWordAudioCapturer = wakeWordAudioCapturer;
    }

    public static WakeWordDetectionRunnable create(PryonWakeWordDetectorCompat pryonWakeWordDetectorCompat, InputStream inputStream, OutputStream outputStream, int i, ValidationCallbacksWrapper validationCallbacksWrapper) {
        return new WakeWordDetectionRunnable(pryonWakeWordDetectorCompat, validationCallbacksWrapper, new WakeWordAudioCapturer(inputStream, outputStream, i));
    }

    @Override // java.lang.Runnable
    public void run() {
        PryonLite2000 pryonLite;
        Log.i(TAG, "Beginning transfer of audio buffer to Pryon native component.");
        this.callbacks.wakeWordDetectionStarted();
        try {
            this.wakeWordDetector.setPryonLiteCallbacks(this.callbacks);
            pryonLite = this.wakeWordDetector.getPryonLite();
        } catch (Throwable th) {
            try {
                String str = TAG;
                Log.e(str, "Failed to transfer audio to Wake Word engine.", th);
                if (this.wakeWordDetectionStoppedCallbackCalled.compareAndSet(false, true)) {
                    this.callbacks.wakeWordDetectionStopped(th);
                }
                this.wakeWordDetector.removePryonLiteCallbacks();
                this.wakeWordAudioCapturer.release();
                Log.i(str, "audio capturer released");
            } finally {
                this.wakeWordDetector.removePryonLiteCallbacks();
                this.wakeWordAudioCapturer.release();
                Log.i(TAG, "audio capturer released");
            }
        }
        if (pryonLite == null) {
            throw new IllegalStateException("Pryon initialization failed");
        }
        int i = 0;
        while (i < 300 && this.wakeWordAudioCapturer.canRead()) {
            boolean isWakeWordDetected = this.callbacks.isWakeWordDetected();
            WakeWordAudioCapturer wakeWordAudioCapturer = this.wakeWordAudioCapturer;
            if (isWakeWordDetected) {
                wakeWordAudioCapturer.transferData();
            } else {
                i++;
                int pushAudio = pryonLite.pushAudio(wakeWordAudioCapturer.read());
                if (pushAudio != 0) {
                    throw new IOException("Failed to push audio samples to Pryon. Error code = " + pushAudio);
                }
            }
        }
        if (this.wakeWordDetectionStoppedCallbackCalled.compareAndSet(false, true)) {
            this.callbacks.wakeWordDetectionStopped(null);
        }
        Log.i(TAG, "Transfer of audio buffer to Pryon is ending.");
    }

    public void stopProcessing() {
        this.wakeWordAudioCapturer.stopProcessing();
        if (this.wakeWordDetectionStoppedCallbackCalled.compareAndSet(false, true)) {
            this.callbacks.wakeWordDetectionStopped(null);
        }
    }
}
