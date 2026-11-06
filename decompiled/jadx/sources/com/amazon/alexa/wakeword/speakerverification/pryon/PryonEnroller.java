package com.amazon.alexa.wakeword.speakerverification.pryon;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.speakerverification.enrollment.EnrollmentUtterance;
import com.amazon.alexa.wakeword.speakerverification.metrics.PryonMetricsListener;
import com.amazon.alexa.wakeword.speakerverification.metrics.SpeakerVerificationMetricsListener;
import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PryonEnroller {

    @VisibleForTesting
    static final int PRYON_INITIALIZED = 1;

    @VisibleForTesting
    static final int PRYON_NOT_INITIALIZED = 0;

    @VisibleForTesting
    static final int PRYON_SUCCESS = 0;
    private static final String TAG = "PryonEnroller";
    private final PryonLite2000 mEngine;
    private final PryonMetricsListener mMetricsListener;
    private byte[] mProfileId;

    public PryonEnroller(@NonNull PryonLite2000.Callbacks callbacks, @NonNull SpeakerVerificationMetricsListener speakerVerificationMetricsListener) {
        this(new PryonLite2000(callbacks), speakerVerificationMetricsListener);
    }

    private boolean checkEngineResult(@NonNull PryonOperation pryonOperation, int i) {
        if (i == 0) {
            Log.e(TAG, "Pryon operation " + pryonOperation.name() + " succeeded");
            this.mMetricsListener.onPryonOperationSuccess(pryonOperation);
            return true;
        }
        Log.e(TAG, "Pryon operation " + pryonOperation.name() + " failed with code " + i);
        this.mMetricsListener.onPryonOperationFailure(pryonOperation, i);
        return false;
    }

    public boolean initialize(@NonNull byte[] bArr, @NonNull PryonLite2000.Config config) {
        return false;
    }

    @VisibleForTesting
    public boolean isPryonAvailable() {
        return PryonLite2000.isAvailable();
    }

    public boolean pushExample(@NonNull EnrollmentUtterance enrollmentUtterance) {
        return false;
    }

    public void release() {
        if (this.mEngine.isInitialized() == 1) {
            destroySpeakerVerificationEngine();
        }
        this.mProfileId = null;
    }

    @VisibleForTesting
    public PryonEnroller(@NonNull PryonLite2000 pryonLite2000, @NonNull SpeakerVerificationMetricsListener speakerVerificationMetricsListener) {
        this.mEngine = pryonLite2000;
        this.mMetricsListener = speakerVerificationMetricsListener;
    }

    private void destroySpeakerVerificationEngine() {
    }
}
