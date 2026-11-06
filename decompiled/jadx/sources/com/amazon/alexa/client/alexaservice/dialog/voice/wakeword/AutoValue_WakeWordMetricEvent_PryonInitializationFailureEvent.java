package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_PryonInitializationFailureEvent extends WakeWordMetricEvent.PryonInitializationFailureEvent {
    private final int errorCode;
    private final String modelMD5;

    public AutoValue_WakeWordMetricEvent_PryonInitializationFailureEvent(int i, String str) {
        this.errorCode = i;
        if (str != null) {
            this.modelMD5 = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null modelMD5");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordMetricEvent.PryonInitializationFailureEvent) {
            WakeWordMetricEvent.PryonInitializationFailureEvent pryonInitializationFailureEvent = (WakeWordMetricEvent.PryonInitializationFailureEvent) obj;
            if (this.errorCode == pryonInitializationFailureEvent.getErrorCode() && this.modelMD5.equals(pryonInitializationFailureEvent.getModelMD5())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.PryonInitializationFailureEvent
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.PryonInitializationFailureEvent
    public String getModelMD5() {
        return this.modelMD5;
    }

    public int hashCode() {
        return this.modelMD5.hashCode() ^ ((this.errorCode ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PryonInitializationFailureEvent{errorCode=");
        sb.append(this.errorCode);
        sb.append(", modelMD5=");
        return a$$ExternalSyntheticOutline0.m(sb, this.modelMD5, StringSubstitutor.DEFAULT_VAR_END);
    }
}
