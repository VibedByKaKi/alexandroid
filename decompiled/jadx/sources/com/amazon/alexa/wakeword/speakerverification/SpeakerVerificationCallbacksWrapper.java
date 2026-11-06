package com.amazon.alexa.wakeword.speakerverification;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.speakerverification.metrics.PryonMetricsListener;
import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationCallbacksWrapper implements PryonLite2000.Callbacks {
    private static final String TAG = "SpeakerVerificationCallbacksWrapper";
    private final PryonMetricsListener mMetricsListener;
    private final SpeakerVerificationEngineCallbacks mSpeakerVerificationEngineCallbacks;

    public SpeakerVerificationCallbacksWrapper(@NonNull SpeakerVerificationEngineCallbacks speakerVerificationEngineCallbacks, @NonNull PryonMetricsListener pryonMetricsListener) {
        this.mSpeakerVerificationEngineCallbacks = speakerVerificationEngineCallbacks;
        this.mMetricsListener = pryonMetricsListener;
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void errorEvent(int i) {
        Log.e(TAG, "Error emitted by speaker verification engine, error = " + i);
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void vadStateChanged(int i, long j) {
    }

    @Override // com.amazon.pryon.android.asr.PryonLite2000.Callbacks
    public void wakeWordDetected(@NonNull String str, long j, long j2, @NonNull byte[] bArr) {
    }
}
