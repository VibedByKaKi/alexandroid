package com.amazon.alexa.client.alexaservice.features.navigation.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NavigationMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FireOS2pLaunchFailureEvent extends NavigationMetricEvent {
        public static FireOS2pLaunchFailureEvent create(String str, String str2) {
            return new AutoValue_NavigationMetricEvent_FireOS2pLaunchFailureEvent(str, str2);
        }

        public abstract String getDirectiveName();

        public abstract String getErrorMessage();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FireOS2pLaunchSuccessfullEvent extends NavigationMetricEvent {
        public static FireOS2pLaunchSuccessfullEvent create(String str) {
            return new AutoValue_NavigationMetricEvent_FireOS2pLaunchSuccessfullEvent(str);
        }

        public abstract String getDirectiveName();
    }
}
