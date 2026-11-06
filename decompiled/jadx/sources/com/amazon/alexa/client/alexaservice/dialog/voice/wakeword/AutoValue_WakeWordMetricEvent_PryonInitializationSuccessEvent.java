package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_PryonInitializationSuccessEvent extends WakeWordMetricEvent.PryonInitializationSuccessEvent {
    private final String modelMD5;
    private final long pryonInitializationTime;

    public AutoValue_WakeWordMetricEvent_PryonInitializationSuccessEvent(long j, String str) {
        this.pryonInitializationTime = j;
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
        if (obj instanceof WakeWordMetricEvent.PryonInitializationSuccessEvent) {
            WakeWordMetricEvent.PryonInitializationSuccessEvent pryonInitializationSuccessEvent = (WakeWordMetricEvent.PryonInitializationSuccessEvent) obj;
            if (this.pryonInitializationTime == pryonInitializationSuccessEvent.getPryonInitializationTime() && this.modelMD5.equals(pryonInitializationSuccessEvent.getModelMD5())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.PryonInitializationSuccessEvent
    public String getModelMD5() {
        return this.modelMD5;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.PryonInitializationSuccessEvent
    public long getPryonInitializationTime() {
        return this.pryonInitializationTime;
    }

    public int hashCode() {
        long j = this.pryonInitializationTime;
        return this.modelMD5.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PryonInitializationSuccessEvent{pryonInitializationTime=");
        sb.append(this.pryonInitializationTime);
        sb.append(", modelMD5=");
        return a$$ExternalSyntheticOutline0.m(sb, this.modelMD5, StringSubstitutor.DEFAULT_VAR_END);
    }
}
