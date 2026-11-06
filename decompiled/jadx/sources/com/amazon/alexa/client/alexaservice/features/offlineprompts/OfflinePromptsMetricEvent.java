package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class OfflinePromptsMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class OfflinePromptDownloadFailureEvent extends OfflinePromptsMetricEvent {
        public static OfflinePromptDownloadFailureEvent create(long j, String str, String str2) {
            return new AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadFailureEvent(j, str, str2);
        }

        public abstract String getFailureReason();

        public abstract String getModelMD5();

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class OfflinePromptDownloadInterruptedEvent extends OfflinePromptsMetricEvent {
        public static OfflinePromptDownloadInterruptedEvent create(long j) {
            return new AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadInterruptedEvent(j);
        }

        public abstract long getRequestDuration();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class OfflinePromptDownloadSuccessEvent extends OfflinePromptsMetricEvent {
        public static OfflinePromptDownloadSuccessEvent create(long j, String str) {
            return new AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadSuccessEvent(j, str);
        }

        public abstract String getModelMD5();

        public abstract long getRequestDuration();
    }
}
