package com.amazon.alexa.client.alexaservice.features.navigation.events;

import com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_NavigationMetricEvent_FireOS2pLaunchSuccessfullEvent extends NavigationMetricEvent.FireOS2pLaunchSuccessfullEvent {
    private final String directiveName;

    public AutoValue_NavigationMetricEvent_FireOS2pLaunchSuccessfullEvent(String str) {
        if (str != null) {
            this.directiveName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NavigationMetricEvent.FireOS2pLaunchSuccessfullEvent) {
            return this.directiveName.equals(((NavigationMetricEvent.FireOS2pLaunchSuccessfullEvent) obj).getDirectiveName());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent.FireOS2pLaunchSuccessfullEvent
    public String getDirectiveName() {
        return this.directiveName;
    }

    public int hashCode() {
        return this.directiveName.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("FireOS2pLaunchSuccessfullEvent{directiveName="), this.directiveName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
