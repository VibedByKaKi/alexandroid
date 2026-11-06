package com.amazon.alexa.client.alexaservice.base.system;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_BackgroundSynchronizeStateEvent extends BackgroundSynchronizeStateEvent {
    private final int attempt;
    private final String downchannelId;
    private final long firstAttemptElapsedRealtimeMs;

    public AutoValue_BackgroundSynchronizeStateEvent(String str, int i, long j) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null downchannelId");
            throw null;
        }
        this.downchannelId = str;
        this.attempt = i;
        this.firstAttemptElapsedRealtimeMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackgroundSynchronizeStateEvent) {
            BackgroundSynchronizeStateEvent backgroundSynchronizeStateEvent = (BackgroundSynchronizeStateEvent) obj;
            if (this.downchannelId.equals(backgroundSynchronizeStateEvent.getDownchannelId()) && this.attempt == backgroundSynchronizeStateEvent.getAttempt() && this.firstAttemptElapsedRealtimeMs == backgroundSynchronizeStateEvent.getFirstAttemptElapsedRealtimeMs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.BackgroundSynchronizeStateEvent
    public int getAttempt() {
        return this.attempt;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.BackgroundSynchronizeStateEvent
    public String getDownchannelId() {
        return this.downchannelId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.BackgroundSynchronizeStateEvent
    public long getFirstAttemptElapsedRealtimeMs() {
        return this.firstAttemptElapsedRealtimeMs;
    }

    public int hashCode() {
        int hashCode = (((this.downchannelId.hashCode() ^ 1000003) * 1000003) ^ this.attempt) * 1000003;
        long j = this.firstAttemptElapsedRealtimeMs;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BackgroundSynchronizeStateEvent{downchannelId=");
        sb.append(this.downchannelId);
        sb.append(", attempt=");
        sb.append(this.attempt);
        sb.append(", firstAttemptElapsedRealtimeMs=");
        return a$$ExternalSyntheticOutline0.m(this.firstAttemptElapsedRealtimeMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
