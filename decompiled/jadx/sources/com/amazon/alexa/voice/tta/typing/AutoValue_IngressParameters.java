package com.amazon.alexa.voice.tta.typing;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.tta.metrics.EventTime;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValue_IngressParameters extends IngressParameters {
    private final String referrer;
    private final EventTime startTime;

    public AutoValue_IngressParameters(String str, EventTime eventTime) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null referrer");
            throw null;
        }
        this.referrer = str;
        if (eventTime != null) {
            this.startTime = eventTime;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null startTime");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IngressParameters) {
            IngressParameters ingressParameters = (IngressParameters) obj;
            if (this.referrer.equals(ingressParameters.getReferrer()) && this.startTime.equals(ingressParameters.getStartTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.tta.typing.IngressParameters
    @NonNull
    public String getReferrer() {
        return this.referrer;
    }

    @Override // com.amazon.alexa.voice.tta.typing.IngressParameters
    @NonNull
    public EventTime getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return this.startTime.hashCode() ^ ((this.referrer.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IngressParameters{referrer=" + this.referrer + ", startTime=" + this.startTime + StringSubstitutor.DEFAULT_VAR_END;
    }
}
