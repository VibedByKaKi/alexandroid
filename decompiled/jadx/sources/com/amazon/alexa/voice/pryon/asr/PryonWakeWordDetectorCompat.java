package com.amazon.alexa.voice.pryon.asr;

import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.pryon.asr.PryonWakeWordDetector;
import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PryonWakeWordDetectorCompat implements WakeWordDetector {
    public static final int PRYON_UNAVAILABLE_ERROR_CODE = 251;
    private static final String TAG = "PryonWakeWordDetectorCompat";
    private int errorCode;
    private final PryonWakeWordDetector pryonDetector;

    public PryonWakeWordDetectorCompat(PryonLite2000.Config config, boolean z, boolean z2, boolean z3) {
        Automotive$$ExternalSyntheticOutline0.m8396m("PryonWakeWordDetectorCompat use legacySDKSetting : ", TAG, z3);
        PryonWakeWordDetector pryonWakeWordDetector = null;
        try {
            this.errorCode = 0;
            pryonWakeWordDetector = new PryonWakeWordDetector(config, z, z2, z3);
        } catch (PryonWakeWordDetector.InitializeException e) {
            Log.e(TAG, "Pryon initialization failed", e);
            this.errorCode = e.getErrorCode();
        } catch (UnsupportedOperationException unused) {
            Log.e(TAG, "Pryon unavailable on platform " + System.getProperty("ro.product.cpu.abi", "unknown"));
            this.errorCode = 251;
        }
        this.pryonDetector = pryonWakeWordDetector;
    }

    public int getPryonErrorCode() {
        return this.errorCode;
    }

    public PryonLite2000 getPryonLite() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            return pryonWakeWordDetector.getPryonLite();
        }
        Log.i(TAG, "Ignoring call to get PryonLite.");
        return null;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public boolean isActive() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            return pryonWakeWordDetector.isActive();
        }
        Log.i(TAG, "Ignoring call to isActive on wake word detector.");
        return false;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void release() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            pryonWakeWordDetector.release();
        } else {
            Log.i(TAG, "Ignoring call to release wake word detector.");
        }
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void removePryonLiteCallbacks() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector == null) {
            Log.i(TAG, "Ignoring call to removePryonLiteCallbacks in wake word detector.");
        } else {
            pryonWakeWordDetector.removePryonLiteCallbacks();
        }
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void setPryonLiteCallbacks(PryonLite2000.Callbacks callbacks) {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector == null) {
            Log.i(TAG, "Ignoring call to setPryonLiteCallbacks in wake word detector.");
        } else {
            pryonWakeWordDetector.setPryonLiteCallbacks(callbacks);
        }
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public int setSensitivityThreshold(int i) {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            return pryonWakeWordDetector.setSensitivityThreshold(i);
        }
        Log.i(TAG, "Ignoring call to setSensitivityThreshold in wake word detector.");
        return -1;
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void start() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            pryonWakeWordDetector.start();
        } else {
            Log.i(TAG, "Ignoring call to start wake word detector.");
        }
    }

    @Override // com.amazon.alexa.voice.pryon.asr.WakeWordDetector
    public void stop() {
        PryonWakeWordDetector pryonWakeWordDetector = this.pryonDetector;
        if (pryonWakeWordDetector != null) {
            pryonWakeWordDetector.stop();
        } else {
            Log.i(TAG, "Ignoring call to stop wake word detector.");
        }
    }

    public PryonWakeWordDetectorCompat(PryonLite2000.Config config, boolean z, boolean z2) {
        this(config, z, z2, false);
    }

    public PryonWakeWordDetectorCompat() {
        this(null, false, false);
    }
}
