package com.amazon.alexa.client.alexaservice.features.navigation.events;

import com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_NavigationMetricEvent_FireOS2pLaunchFailureEvent extends NavigationMetricEvent.FireOS2pLaunchFailureEvent {
    private final String directiveName;
    private final String errorMessage;

    public AutoValue_NavigationMetricEvent_FireOS2pLaunchFailureEvent(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveName");
            throw null;
        }
        this.directiveName = str;
        if (str2 != null) {
            this.errorMessage = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null errorMessage");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NavigationMetricEvent.FireOS2pLaunchFailureEvent) {
            NavigationMetricEvent.FireOS2pLaunchFailureEvent fireOS2pLaunchFailureEvent = (NavigationMetricEvent.FireOS2pLaunchFailureEvent) obj;
            if (this.directiveName.equals(fireOS2pLaunchFailureEvent.getDirectiveName()) && this.errorMessage.equals(fireOS2pLaunchFailureEvent.getErrorMessage())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent.FireOS2pLaunchFailureEvent
    public String getDirectiveName() {
        return this.directiveName;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent.FireOS2pLaunchFailureEvent
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() ^ ((this.directiveName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FireOS2pLaunchFailureEvent{directiveName=");
        sb.append(this.directiveName);
        sb.append(", errorMessage=");
        return a$$ExternalSyntheticOutline0.m(sb, this.errorMessage, StringSubstitutor.DEFAULT_VAR_END);
    }
}
