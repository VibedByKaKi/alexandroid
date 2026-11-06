package com.amazon.alexa.wakeword;

import com.amazon.alexa.audiocapturer.MetricsListener;
import com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface WakeWordDetector {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AudioCaptureListener {
        void onAudioCaptured(short[] sArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DetectingStatus {
        STARTED,
        FAILED_TO_START
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WakeWordDetectionListener {
        void onClassificationEvent(ClassificationData classificationData);

        void onEnrollmentExampleEvent(EnrollmentData enrollmentData);

        void onWakewordDetected(WakeWordData wakeWordData);
    }

    boolean isDetectingWakeWord();

    void pauseDetectingWakeWord();

    void resumeDetectingWakeWord();

    void setWakeWordDetectionListener(WakeWordDetectionListener wakeWordDetectionListener);

    DetectingStatus startDetectingWakeWord(MetricsListener metricsListener, WakeWordDetectionMetricsListener wakeWordDetectionMetricsListener) throws IOException;

    DetectingStatus startDetectingWakeWord(WakeWordDetectionMetricsListener wakeWordDetectionMetricsListener) throws IOException;

    void stopCapturing();

    void stopDetectingWakeWord();
}
