package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EventMetadata {
    private String requestId;
    private long timestamp;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String requestId;
        private long timestamp;

        public EventMetadata build() {
            return new EventMetadata(this.timestamp, this.requestId);
        }

        public Builder requestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder timestamp(long j) {
            this.timestamp = j;
            return this;
        }
    }

    public EventMetadata(long j, String str) {
        this.timestamp = j;
        this.requestId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EventMetadata eventMetadata = (EventMetadata) obj;
            if (this.timestamp == eventMetadata.timestamp && Objects.equals(this.requestId, eventMetadata.requestId)) {
                return true;
            }
        }
        return false;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestamp), this.requestId);
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
