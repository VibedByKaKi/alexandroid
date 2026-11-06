package com.amazon.alexa.client.alexaservice.base.events;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ForegroundServiceStartDeniedMetricEvent extends ForegroundServiceStartDeniedMetricEvent {
    private final String startAction;

    public AutoValue_ForegroundServiceStartDeniedMetricEvent(@Nullable String str) {
        this.startAction = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ForegroundServiceStartDeniedMetricEvent)) {
            return false;
        }
        ForegroundServiceStartDeniedMetricEvent foregroundServiceStartDeniedMetricEvent = (ForegroundServiceStartDeniedMetricEvent) obj;
        String str = this.startAction;
        return str == null ? foregroundServiceStartDeniedMetricEvent.getStartAction() == null : str.equals(foregroundServiceStartDeniedMetricEvent.getStartAction());
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ForegroundServiceStartDeniedMetricEvent
    @Nullable
    public String getStartAction() {
        return this.startAction;
    }

    public int hashCode() {
        String str = this.startAction;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ForegroundServiceStartDeniedMetricEvent{startAction="), this.startAction, StringSubstitutor.DEFAULT_VAR_END);
    }
}
