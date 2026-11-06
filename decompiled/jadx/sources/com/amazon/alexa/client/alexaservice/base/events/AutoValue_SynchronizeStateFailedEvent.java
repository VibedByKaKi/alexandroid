package com.amazon.alexa.client.alexaservice.base.events;

import androidx.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SynchronizeStateFailedEvent extends SynchronizeStateFailedEvent {
    private final Exception exception;
    private final boolean isEstablishingDownchannel;
    private final Integer responseCode;

    public AutoValue_SynchronizeStateFailedEvent(boolean z, @Nullable Integer num, @Nullable Exception exc) {
        this.isEstablishingDownchannel = z;
        this.responseCode = num;
        this.exception = exc;
    }

    public boolean equals(Object obj) {
        Integer num;
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SynchronizeStateFailedEvent) {
            SynchronizeStateFailedEvent synchronizeStateFailedEvent = (SynchronizeStateFailedEvent) obj;
            if (this.isEstablishingDownchannel == synchronizeStateFailedEvent.isEstablishingDownchannel() && ((num = this.responseCode) != null ? num.equals(synchronizeStateFailedEvent.responseCode()) : synchronizeStateFailedEvent.responseCode() == null) && ((exc = this.exception) != null ? exc.equals(synchronizeStateFailedEvent.exception()) : synchronizeStateFailedEvent.exception() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SynchronizeStateFailedEvent
    @Nullable
    public Exception exception() {
        return this.exception;
    }

    public int hashCode() {
        int i = ((this.isEstablishingDownchannel ? 1231 : 1237) ^ 1000003) * 1000003;
        Integer num = this.responseCode;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Exception exc = this.exception;
        return hashCode ^ (exc != null ? exc.hashCode() : 0);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SynchronizeStateFailedEvent
    public boolean isEstablishingDownchannel() {
        return this.isEstablishingDownchannel;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SynchronizeStateFailedEvent
    @Nullable
    public Integer responseCode() {
        return this.responseCode;
    }

    public String toString() {
        return "SynchronizeStateFailedEvent{isEstablishingDownchannel=" + this.isEstablishingDownchannel + ", responseCode=" + this.responseCode + ", exception=" + this.exception + StringSubstitutor.DEFAULT_VAR_END;
    }
}
