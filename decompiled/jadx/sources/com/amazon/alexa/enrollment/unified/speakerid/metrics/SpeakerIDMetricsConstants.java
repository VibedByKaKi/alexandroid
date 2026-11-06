package com.amazon.alexa.enrollment.unified.speakerid.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SpeakerIDMetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        SILENCE_RETRYABLE(1),
        SILENCE_NON_RETRYABLE(2),
        LOW_QUALITY_UTTERANCE_RETRYABLE(3),
        LOW_QUALITY_UTTERANCE_NON_RETRYABLE(4),
        NETWORK_UNAVAILABLE(5),
        UNKNOWN_EXCEPTION(6),
        USER_CANCELLED_EXCEPTION(7);

        private final int mErrorCode;

        ErrorType(int i) {
            this.mErrorCode = i;
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PageType {
        SPEAKER_ID_ENROLLMENT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SubPageType {
        START_ENROLLMENT,
        UTTERANCE_TRAINING
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VisualFocusType {
        START_VISUAL_FOCUS,
        STOP_VISUAL_FOCUS,
        TIMEOUT_VISUAL_FOCUS
    }
}
