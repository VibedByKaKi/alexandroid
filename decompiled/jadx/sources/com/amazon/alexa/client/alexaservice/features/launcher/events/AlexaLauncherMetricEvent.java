package com.amazon.alexa.client.alexaservice.features.launcher.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.launcher.events.AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AlexaLauncherMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DirectiveProcessEvent extends AlexaLauncherMetricEvent {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract DirectiveProcessEvent build();

            public abstract Builder setDirectiveName(String str);

            public abstract Builder setProcessTimeMillis(long j);

            public abstract Builder setUserPerceivedLatency(long j);
        }

        public static Builder builder() {
            return new AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent.Builder();
        }

        public abstract String getDirectiveName();

        public abstract long getProcessTimeMillis();

        public abstract long getUserPerceivedLatency();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class UnlockDeviceRequestedEvent extends AlexaLauncherMetricEvent {
        public static UnlockDeviceRequestedEvent create() {
            return new AutoValue_AlexaLauncherMetricEvent_UnlockDeviceRequestedEvent();
        }
    }
}
