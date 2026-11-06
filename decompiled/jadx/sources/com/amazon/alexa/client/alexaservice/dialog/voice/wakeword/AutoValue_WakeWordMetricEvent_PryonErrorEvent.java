package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_PryonErrorEvent extends WakeWordMetricEvent.PryonErrorEvent {
    private final int errorCode;

    public AutoValue_WakeWordMetricEvent_PryonErrorEvent(int i) {
        this.errorCode = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WakeWordMetricEvent.PryonErrorEvent) && this.errorCode == ((WakeWordMetricEvent.PryonErrorEvent) obj).getErrorCode();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.PryonErrorEvent
    public int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return this.errorCode ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PryonErrorEvent{errorCode="), this.errorCode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
