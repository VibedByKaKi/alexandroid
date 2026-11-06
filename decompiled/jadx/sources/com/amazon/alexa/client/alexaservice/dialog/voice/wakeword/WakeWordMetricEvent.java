package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class WakeWordMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class LocaleMismatchEvent extends WakeWordMetricEvent {
        public static LocaleMismatchEvent create() {
            return new AutoValue_WakeWordMetricEvent_LocaleMismatchEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSuppressionArtifactDownloadFailureEvent extends WakeWordMetricEvent {
        public static MediaSuppressionArtifactDownloadFailureEvent create(String str, long j, String str2, String str3) {
            return new AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadFailureEvent(str, j, str2, str3);
        }

        public abstract String getArtifactID();

        public abstract String getArtifactName();

        public abstract String getFailureReason();

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSuppressionArtifactDownloadInterruptedEvent extends WakeWordMetricEvent {
        public static MediaSuppressionArtifactDownloadInterruptedEvent create(String str, long j) {
            return new AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadInterruptedEvent(str, j);
        }

        public abstract String getArtifactName();

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSuppressionArtifactDownloadSuccessEvent extends WakeWordMetricEvent {
        public static MediaSuppressionArtifactDownloadSuccessEvent create(String str, long j, String str2) {
            return new AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadSuccessEvent(str, j, str2);
        }

        public abstract String getArtifactID();

        public abstract String getArtifactName();

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSuppressionArtifactReadFailureEvent extends WakeWordMetricEvent {
        public static MediaSuppressionArtifactReadFailureEvent create(String str, String str2) {
            return new AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadFailureEvent(str, str2);
        }

        public abstract String getArtifactName();

        public abstract String getFailureReason();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSuppressionArtifactReadSuccessEvent extends WakeWordMetricEvent {
        public static MediaSuppressionArtifactReadSuccessEvent create(String str) {
            return new AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadSuccessEvent(str);
        }

        public abstract String getArtifactName();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PryonErrorEvent extends WakeWordMetricEvent {
        public static PryonErrorEvent create(int i) {
            return new AutoValue_WakeWordMetricEvent_PryonErrorEvent(i);
        }

        public abstract int getErrorCode();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PryonInitializationFailureEvent extends WakeWordMetricEvent {
        public static PryonInitializationFailureEvent create(int i, String str) {
            return new AutoValue_WakeWordMetricEvent_PryonInitializationFailureEvent(i, str);
        }

        public abstract int getErrorCode();

        public abstract String getModelMD5();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PryonInitializationSuccessEvent extends WakeWordMetricEvent {
        public static PryonInitializationSuccessEvent create(long j, String str) {
            return new AutoValue_WakeWordMetricEvent_PryonInitializationSuccessEvent(j, str);
        }

        public abstract String getModelMD5();

        public abstract long getPryonInitializationTime();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PryonResetEvent extends WakeWordMetricEvent {
        public static PryonResetEvent create(long j) {
            return new AutoValue_WakeWordMetricEvent_PryonResetEvent(j);
        }

        public abstract long getPryonResetTime();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ValidationLatencyEvent extends WakeWordMetricEvent {
        public static ValidationLatencyEvent create(long j, long j2) {
            return new AutoValue_WakeWordMetricEvent_ValidationLatencyEvent(j, j2);
        }

        public abstract long getLatency();

        public abstract long getStartTimestamp();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ValidationSpeechOffsetEvent extends WakeWordMetricEvent {
        public static ValidationSpeechOffsetEvent create(long j) {
            return new AutoValue_WakeWordMetricEvent_ValidationSpeechOffsetEvent(j);
        }

        public abstract long getSpeechOffset();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ValidationTimeoutEvent extends WakeWordMetricEvent {
        public static ValidationTimeoutEvent create() {
            return new AutoValue_WakeWordMetricEvent_ValidationTimeoutEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class WakeWordModelDownloadFailureEvent extends WakeWordMetricEvent {
        public static WakeWordModelDownloadFailureEvent create(long j, String str, String str2) {
            return new AutoValue_WakeWordMetricEvent_WakeWordModelDownloadFailureEvent(j, str, str2);
        }

        public abstract String getFailureReason();

        public abstract String getModelMD5();

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class WakeWordModelDownloadInterruptedEvent extends WakeWordMetricEvent {
        public static WakeWordModelDownloadInterruptedEvent create(long j) {
            return new AutoValue_WakeWordMetricEvent_WakeWordModelDownloadInterruptedEvent(j);
        }

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class WakeWordModelDownloadSuccessEvent extends WakeWordMetricEvent {
        public static WakeWordModelDownloadSuccessEvent create(long j, String str) {
            return new AutoValue_WakeWordMetricEvent_WakeWordModelDownloadSuccessEvent(j, str);
        }

        public abstract String getModelMD5();

        public abstract long getRequestDuration();
    }
}
