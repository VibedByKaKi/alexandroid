package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LiveModeOnboardingVisibilityChangedEvent extends LiveModeOnboardingVisibilityChangedEvent {
    private final ExtendedClient client;
    private final boolean visible;

    public AutoValue_LiveModeOnboardingVisibilityChangedEvent(@Nullable ExtendedClient extendedClient, boolean z) {
        this.client = extendedClient;
        this.visible = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveModeOnboardingVisibilityChangedEvent) {
            LiveModeOnboardingVisibilityChangedEvent liveModeOnboardingVisibilityChangedEvent = (LiveModeOnboardingVisibilityChangedEvent) obj;
            ExtendedClient extendedClient = this.client;
            if (extendedClient != null ? extendedClient.equals(liveModeOnboardingVisibilityChangedEvent.getClient()) : liveModeOnboardingVisibilityChangedEvent.getClient() == null) {
                if (this.visible == liveModeOnboardingVisibilityChangedEvent.isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LiveModeOnboardingVisibilityChangedEvent
    @Nullable
    public ExtendedClient getClient() {
        return this.client;
    }

    public int hashCode() {
        ExtendedClient extendedClient = this.client;
        return (this.visible ? 1231 : 1237) ^ (((extendedClient == null ? 0 : extendedClient.hashCode()) ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LiveModeOnboardingVisibilityChangedEvent
    public boolean isVisible() {
        return this.visible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveModeOnboardingVisibilityChangedEvent{client=");
        sb.append(this.client);
        sb.append(", visible=");
        return a$$ExternalSyntheticOutline0.m(sb, this.visible, StringSubstitutor.DEFAULT_VAR_END);
    }
}
