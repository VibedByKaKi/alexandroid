package com.amazon.alexa.voice.pryon.asr;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.metrics.impl.MetricsRecorder$$ExternalSyntheticLambda0;
import com.amazon.apl.devtools.models.ViewTypeTarget$$ExternalSyntheticLambda4;
import com.amazon.pryon.android.asr.PryonLite2000;
import defpackage.a$$ExternalSyntheticOutline0;
import it.innove.Peripheral$$ExternalSyntheticLambda19;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PryonWakeWordDetector implements WakeWordDetector, PryonLite2000.Callbacks {
    private static final String TAG = "PryonWakeWordDetector";
    private PryonLite2000.Callbacks eventHandlers;
    private final Handler handler;
    private PryonTransferThread transferThread;
    private final boolean useAcousticEchoCanceler;
    private final boolean useLgecySDkSetting;
    private final boolean useNoiseSuppressor;
    private PryonLite2000 wakewordEngine;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class InitializeException extends IllegalStateException {
        private int errorCode;

        public InitializeException(String str, int i) {
            super(str);
            this.errorCode = i;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PryonTransferThread extends Thread {
        private volatile boolean running = true;
        private final boolean useAcousticEchoCanceler;
        private boolean useLegacySDKSetting;
        private final boolean useNoiseSuppressor;
        private final PryonLite2000 wakewordEngine;

        public PryonTransferThread(PryonLite2000 pryonLite2000, boolean z, boolean z2, boolean z3) {
            this.wakewordEngine = pryonLite2000;
            this.useAcousticEchoCanceler = z;
            this.useNoiseSuppressor = z2;
            this.useLegacySDKSetting = z3;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int pushAudio;
            Log.i(PryonWakeWordDetector.TAG, "Beginning transfer of audio buffer to Pryon native component.  useAEC: " + this.useAcousticEchoCanceler + " useNS: " + this.useNoiseSuppressor + " useLegacySetting: " + this.useLegacySDKSetting);
            AudioCapturer audioCapturer = new AudioCapturer(this.wakewordEngine.getSamplesPerFrame(), this.useAcousticEchoCanceler, this.useNoiseSuppressor, this.useLegacySDKSetting);
            do {
                try {
                    try {
                    } catch (IOException e) {
                        Log.e(PryonWakeWordDetector.TAG, "Failed to transfer audio to Wake Word engine.", e);
                    }
                    if (!this.running) {
                        Log.i(PryonWakeWordDetector.TAG, "Transfer of audio buffer to Pryon is ending.");
                        return;
                    }
                    pushAudio = this.wakewordEngine.pushAudio(audioCapturer.read());
                } finally {
                    audioCapturer.release();
                }
            } while (pushAudio == 0);
            throw new IOException("Failed to push audio samples to Pryon. Error code = " + pushAudio);
        }

        public void terminate() {
            this.running = false;
        }
    }

    public PryonWakeWordDetector(PryonLite2000.Config config, boolean z, boolean z2, boolean z3) throws UnsupportedOperationException {
        this.handler = new Handler(Looper.getMainLooper());
        this.useAcousticEchoCanceler = z;
        this.useNoiseSuppressor = z2;
        this.useLgecySDkSetting = z3;
        init(config);
    }

    private void init(PryonLite2000.Config config) throws UnsupportedOperationException {
        String str = TAG;
        Log.i(str, "init");
        if (!PryonLite2000.isAvailable()) {
            this.wakewordEngine = null;
            Buffer$$ExternalSyntheticBUOutline0.m$1("PryonLite wakeword engine is not available on this platform.");
            return;
        }
        this.wakewordEngine = new PryonLite2000(this);
        Log.i(str, "Calling PryonLite initialize() from PryonWakeWordDetector.init()...");
        int initialize = this.wakewordEngine.initialize(config);
        if (initialize == 0) {
            return;
        }
        Log.e(str, "PryonLite initialize() failed, error = " + initialize);
        release();
        throw new InitializeException(a$$ExternalSyntheticOutline0.m(initialize, "Failed to init PryonWakeWordDetector. ErrorCode "), initialize);
    }

    private boolean isPryonAvailable() {
        return PryonLite2000.isAvailable() && this.wakewordEngine != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$errorEvent$2(int i) {
        PryonLite2000.Callbacks callbacks = this.eventHandlers;
        if (callbacks == null) {
            return;
        }
        callbacks.errorEvent(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$vadStateChanged$1(int i, long j) {
        PryonLite2000.Callbacks callbacks = this.eventHandlers;
        if (callbacks == null) {
            return;
        }
        callbacks.vadStateChanged(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wakeWordDetected$0(String str, long j, long j2, byte[] bArr) {
        PryonLite2000.Callbacks callbacks = this.eventHandlers;
        if (callbacks == null) {
            return;
        }
        callbacks.wakeWordDetected(str, j, j2, bArr);
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void errorEvent(int i) {
        ErrorUtils$$ExternalSyntheticOutline0.m(i, "Error emitted by wakeword engine, error = ", TAG);
        this.handler.post(new Peripheral$$ExternalSyntheticLambda19(this, i, 5));
    }

    public PryonLite2000 getPryonLite() {
        return this.wakewordEngine;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public boolean isActive() {
        return this.transferThread != null;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void release() {
        stop();
        if (this.wakewordEngine == null) {
            return;
        }
        String str = TAG;
        Log.i(str, "Calling PryonLite destroy() from PryonWakeWordDetector.release()...");
        int destroy = this.wakewordEngine.destroy();
        this.wakewordEngine = null;
        if (destroy != 0) {
            ErrorUtils$$ExternalSyntheticOutline0.m(destroy, "PryonLite destroy() failed, error = ", str);
        }
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void removePryonLiteCallbacks() {
        this.eventHandlers = null;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void setPryonLiteCallbacks(PryonLite2000.Callbacks callbacks) {
        this.eventHandlers = callbacks;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public int setSensitivityThreshold(int i) {
        PryonLite2000 pryonLite2000;
        if (!PryonLite2000.isAvailable() || (pryonLite2000 = this.wakewordEngine) == null) {
            return -1;
        }
        return pryonLite2000.wakewordSetDetectionThreshold(i);
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void start() {
        if (!isPryonAvailable() || isActive()) {
            return;
        }
        PryonTransferThread pryonTransferThread = new PryonTransferThread(this.wakewordEngine, this.useAcousticEchoCanceler, this.useNoiseSuppressor, this.useLgecySDkSetting);
        this.transferThread = pryonTransferThread;
        pryonTransferThread.start();
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void stop() {
        if (isPryonAvailable() && isActive()) {
            this.transferThread.terminate();
            try {
                this.transferThread.join();
            } catch (InterruptedException unused) {
                this.transferThread.interrupt();
            } finally {
                this.transferThread = null;
            }
        }
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void vadStateChanged(int i, long j) {
        this.handler.post(new ViewTypeTarget$$ExternalSyntheticLambda4(this, i, 1, j));
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void wakeWordDetected(String str, long j, long j2, byte[] bArr) {
        this.handler.post(new MetricsRecorder$$ExternalSyntheticLambda0(this, str, j, j2, bArr));
    }

    public PryonWakeWordDetector(PryonLite2000.Config config, boolean z, boolean z2) throws UnsupportedOperationException {
        this(config, z, z2, false);
    }
}
